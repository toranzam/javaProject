package nestedInterface;

public class Button2 {
  OnClickListener listener;

  // 구현 객체 따로 만들지 않고
  // 클래스 내부에서 직접 익명 객체 대입해서 이벤트 처리하는 경우가 더 많다
  public void setListener(OnClickListener listener) {
    this.listener = listener;
  }

  // 버튼 이벤트가 발생하면 호출하는 메소드
  void touch() {
    // 인터페이스를 통해 구현 객체의 메소드 호출
    listener.onClick();

  }

  interface OnClickListener {
    void onClick();
  }
}
