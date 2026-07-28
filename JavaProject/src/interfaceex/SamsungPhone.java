package interfaceex;

public class SamsungPhone implements ISmartPhone { // 인터페이스의 구현 클래스 


  String name;

  public SamsungPhone(String name) {
    this.name = name;
  }


  @Override
  public void sendCall() {
    System.out.println(name + "으로 전화를 겁니다");
  }

  @Override
  public void sendSMS() {
    // TODO Auto-generated method stub
  } 

  @Override
  public void receiveCall() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void receiveSMS() {
    // TODO Auto-generated method stub
    
  }




  
  
}
