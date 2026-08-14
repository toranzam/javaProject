package datastructure.queue.generic;

public class MyQueueMoveGenericMain {
  public static void main(String[] args) {
    MyQueueMoveGeneric<String> queue = new MyQueueMoveGeneric<>(5);

    queue.enqueue("홍길동");
    queue.enqueue("이몽룡");
    queue.enqueue("성춘향");

    queue.showQueue();

    System.out.println("첫번째 들어온 데이터: " + queue.peek());
    System.out.println("이몽룡 위치: " + queue.contains("이몽룡"));

    String item = queue.dequeue();
    System.out.println("삭제된 데이터: " + item);

    System.out.println("현재 데이터 수: " + queue.size());
    queue.showQueue();
  }
}
