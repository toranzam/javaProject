package exam.day8_4.memberex;

import java.util.List;
import java.util.Scanner;

public class MemberMain {
  public static void main(String[] args) {
    // 회원 가입 위한 정보 입력 받기
    String id, pass, name, phone, address;

    // 회원 정보 참조 객체 변수
    MemberDTO memDto = null;
    IMemberDAO dao = new MemberDAO();

    int menu;
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("**** 1.회원정보 입력 | 2. 회원정보 삭제 | 3. 전체 회원 조회 | 4.회원 조회 | 5. 회원 정보 수정 | 6. 종료***");

      System.out.println("메뉴를 선택하세요 : ");
      menu = sc.nextInt();

      switch (menu) {
        case 1:
          System.out.println("회원정보를 입력합니다");
          System.out.print("id 입력 : ");
          id = sc.next();

          System.out.print("pass 입력 : ");
          pass = sc.next();

          System.out.print("이름 입력 : ");
          name = sc.next();

          System.out.print("전화번호 입력 : ");
          phone = sc.next();
          sc.nextLine();
          System.out.print("주소 입력 : ");
          address = sc.nextLine(); // 주소는 공백 포함하도록

          // 1명 회원 참조
          memDto = new MemberDTO(id, pass, name, phone, address);

          dao.insertMember(memDto);

          break;
        case 2:
          System.out.println("회원정보를 삭제합니다");
          System.out.println("id 입력 : ");
          dao.deleteMember(sc.next());

          break;

        case 3:
          System.out.println("전체 회원 정보를 조회합니다");

          dao.getAllMember().forEach(dto -> System.out.println(dto));

          break;

        case 4:
          System.out.println("회원정보를 조회합니다");
          System.out.println("id 입력 : ");
          id = sc.next();
          memDto = dao.searchMember(id);
          if (memDto != null) {
            System.out.println(memDto);
          } else {
            System.out.println("해당 id 정보가 없습니다");
          }
          break;

        case 5:
          System.out.println("회원정보를 수정합니다");
          System.out.println("수정 회원 id 입력 : ");
          id = sc.next();
          memDto = dao.searchMember(id);

          if (memDto == null) {
            System.out.println("해당 id 정보가 없습니다");
            break;
          }

          System.out.println("기존 정보 출력");
          System.out.println(memDto.toString());

          System.out.print("pass 입력 : ");
          pass = sc.next();

          System.out.print("이름 입력 : ");
          name = sc.next();

          System.out.print("전화번호 입력 : ");
          phone = sc.next();
          sc.nextLine();
          System.out.print("주소 입력 : ");
          address = sc.nextLine(); // 주소는 공백 포함하도록

          memDto = new MemberDTO(id, pass, name, phone, address);
          dao.updateMember(memDto);

          break;
        case 6:
          System.out.println("회원 관리 프로그램을 종료 합니다");
          return;

        default:
          break;
      }

    }

  }

}
