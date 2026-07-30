package nestedInterface;

public class MessageListner implements Button.OnClickListener {

  @Override
  public void onClick() {
    System.out.println("메시지 보냅니다");
  }
  
  
}
