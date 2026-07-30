package nestedInterface;

// 내부에 멤버 인터페이스 설정 후 구현객체는 독립 클래스로 구현
public class Button {
  OnClickListener listener; // 인터페이스 타입 참조   

  public void setListener(OnClickListener listener) { // Button 객체 통해 인터페이스 구현객체 전달
    this.listener = listener;
  }

  // 버튼 이벤트가 발생하면 호출하는 메소드 
  void touch() {
    // 인터페이스를 통해 구현 객체의 메소드 호출 
    listener.onClick();

  }

  
  // 중첩인터페이스 : 클래스 내부에 구성 
  // 바깥 클래스와 밀접한 관계가 있고 클래스 외부에서는 사용하지 않고 Button에서만 사용할 용도로
  // 중첩 인터페이스 선택
  interface OnClickListener {
    void onClick();
  }



}
