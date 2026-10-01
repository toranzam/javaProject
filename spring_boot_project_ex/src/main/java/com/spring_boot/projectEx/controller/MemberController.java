package com.spring_boot.projectEx.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_boot.projectEx.dto.MemberDTO;
import com.spring_boot.projectEx.service.IMemberService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {

	@Autowired
	@Qualifier("MemberService")
	IMemberService memService;

	// 로그인 폼 요청
	@GetMapping("/member/loginForm")
	public String loginForm() {
		return "member/loginForm";
	}

	// 로그인 처리
	@ResponseBody
	@PostMapping("/member/login")
	public String loginCheck(@RequestParam HashMap<String, Object> param, HttpSession session) {
		String result = memService.loginCheck(param);
		// 로그인 성공시 session 속성 추가 -> 로그인 유지
		if (result.equals("success")) {
			session.setAttribute("sid", param.get("id"));
		}
		return result;
	}

	@GetMapping("/member/logout")
	public String userLogout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	// 회원가입 폼 요청
	@GetMapping("/member/joinForm")
	public String joinForm() {
		return "member/joinForm";
	}

	// ID 중복체크 메소드 완성
	@ResponseBody
	@GetMapping("/member/idCheck")
	public int idCheck(@RequestParam("id") String id) {
		String id_res = memService.idCheck(id);

		int result = 1;

		if (id_res == null) {
			result = 0;
		}
		return result;
	}

	// 회원가입
	@PostMapping("/member/join")
	public String join(MemberDTO dto, @RequestParam("memHp1") String memHp1, @RequestParam("memHp2") String memHp2,
			@RequestParam("memHp3") String memHp3) {
		String memHp = memHp1 + "-" + memHp2 + "-" + memHp3;
		dto.setMemHp(memHp);
		memService.insertMember(dto); // 회원가입 완료 후
		return "redirect:/member/loginForm"; // 로그인 폼 요청
	}

	@GetMapping("/member/updateForm")
	public String updateForm(HttpSession session, Model model) {

		if (session.getAttribute("sid") == null) {
			return "redirect:/member/loginForm";
		}
		String memid = (String) session.getAttribute("sid");

		MemberDTO member = memService.memberInfo(memid);

		model.addAttribute("member", member);

		return "member/updateForm";
	}

	@PostMapping("/member/update")
	public String update(MemberDTO dto, @RequestParam("memHp1") String memHp1, @RequestParam("memHp2") String memHp2,
			@RequestParam("memHp3") String memHp3) {
		String memHp = memHp1 + "-" + memHp2 + "-" + memHp3;
		dto.setMemHp(memHp);
		memService.updateMember(dto);
		return "redirect:/member/myPage";
	}

	@GetMapping("/member/myPage")
	public String myPage(HttpSession session, Model model) {

		if (session.getAttribute("sid") == null) {
			return "redirect:/member/loginForm";
		}
		String memid = (String) session.getAttribute("sid");

		MemberDTO member = memService.memberInfo(memid);

		model.addAttribute("member", member);

		return "member/myPage";
	}
	
	
	


}
