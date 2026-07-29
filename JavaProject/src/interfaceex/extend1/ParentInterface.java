package interfaceex.extend1;

public interface ParentInterface {
  public void method1(); // 추상 메소드 
  public default void method2() {
    System.out.println("P-m2()");
  }
  
}
