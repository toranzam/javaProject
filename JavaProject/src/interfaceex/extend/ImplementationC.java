package interfaceex.extend;

// InterfaceC는 두개의 인터페이스 상속받음
// 상위인터페이스의 추상메서드와 하위인터페이스 추상메서드 까지 모두 구현해야함(필수)
public class ImplementationC implements InterfaceC{

  @Override
  public void methodC() {
    System.out.println("CImpleClass의 methodC()실행");
    
  }

  @Override
  public void methodA() {
    System.out.println("CImpleClass의 methodA()실행");
    
  }

  @Override
  public void methodB() {
    System.out.println("CImpleClass의 methodB()실행");
  }


  
  
}
