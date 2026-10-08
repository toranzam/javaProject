package com.spring_boot.miniproject.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring_boot.miniproject.member.dto.MemberDto;
import com.spring_boot.miniproject.member.dto.MemberJoinDto;
import com.spring_boot.miniproject.member.dto.MemberLoginDto;
import com.spring_boot.miniproject.member.service.MemberService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {

	private final MemberService service;

	@GetMapping("/login")
	public String login() {
		return "member/login";

	}

	@GetMapping("/join")
	public String signUp() {
		return "member/join";
	}

	@PostMapping("/login")
	public String doLogin(MemberLoginDto memberLoginDto, HttpServletRequest request, HttpSession session, Model model) {

		MemberDto loginMember = service.login(memberLoginDto);

		if (loginMember == null) {
			model.addAttribute("errorMessage", "아이디 또는 비밀번호가 옳바르지 않습니다.");
			return "member/login";
		}

		request.changeSessionId();

		session.setAttribute("loginMemberId", loginMember.getMemberId());
		session.setAttribute("loginMemberName", loginMember.getMemberName());
		session.setAttribute("loginMemberRole", loginMember.getMemberRole());

		return "redirect:/";
	}

	@PostMapping("/join")
	public String doJoin(MemberJoinDto memberJoinDto, Model model) {

		String password = memberJoinDto.getPassword();

		if (password == null || password.isBlank()) {
			model.addAttribute("errorMessage", "비밀번호를 입력해주세요.");
			return "member/join";
		}

		if (!memberJoinDto.getPassword().equals(memberJoinDto.getPasswordCheck())) {
			model.addAttribute("errorMessage", "비밀번호와 비밀번호 확인이 일치하지 않습니다.");
			return "member/join";
		}

		boolean joined = service.join(memberJoinDto);

		if (!joined) {
			model.addAttribute("errorMessage", "이미 사용 중인 아이디입니다.");
			return "member/join";
		}

		return "redirect:/login";
	}
	
	@PostMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			session.invalidate();
		}
		
		return "redirect:/login";
	}

}
