package exam;

public class Member {
	String id;
	String name;
	int age;
	String phoneNumber;
	String location;
	
	Member(String id, String name, int age, String phoneNumber, String location) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.location = location;	
	}
	
	void showMember() {
		System.out.println("----회원 정보 출력----");
		System.out.println("ID : " + this.id);
	}
	

	public static void main(String[] args) {
		
		new Member("hkd", "홍길동", 30, "010-1234-5678", "서울시 강남구 대치동");
		
		

	}

}
