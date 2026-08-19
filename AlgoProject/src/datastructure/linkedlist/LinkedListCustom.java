package datastructure.linkedlist;

// exam ParkingProgram 용도
public class LinkedListCustom {
  private ListNodeCustom head; // linked list를 참조하는 참조변수, linked list의 첫번째 node를 참조함
  private int size;
  private final int maxSize;

  // 생성자
  public LinkedListCustom(int maxSize) {
    head = null;
    // 최대 주차 댓수
    this.maxSize = maxSize;
  }

  // Node 삽입(마지막에 삽입)
  public void insertNode(String data) {
    if (size >= maxSize) {
      System.out.println("더 이상 주차할 수 없습니다");
      return;
    }

    // 새로운 노드 생성
    ListNodeCustom newNode = new ListNodeCustom(data);

    if (head == null) { // List에 노드가 없는 경우
      this.head = newNode;
    } else { // List에 노드가 1개 이상 없는 경우 - 마지막 노드를 찾아서 연결
      // 시작노드 주소인 head의 참조주소를 임시변수에 저장
      ListNodeCustom tempNode = head;
      while (tempNode.link != null) {
        tempNode = tempNode.link;
      }

      // 마지막 노드 찾았으면 link에 새로운 노드 참조하도록 연결
      tempNode.link = newNode;
    }

    size++;
  }

  public void insertNode(int position, String data) {
    if (position >= 1 && position <= size) {
      System.out.println(position + "번 위치는 이미 주차 중입니다.");
      return;
    }
    if (isFull() || position < 1 || position > size + 1) {
      return;
    }
    ListNodeCustom newNode = new ListNodeCustom(data);
    if (position == 1) {
      newNode.link = head;
      head = newNode;
    } else {
      ListNodeCustom preNode = head;
      for (int i = 2; i < position; i++) {
        preNode = preNode.link;
      }
      newNode.link = preNode.link;
      preNode.link = newNode;
    }
    size++;
  }

  ////////////////////////////////////
  /// Node 삭제

  // 1. 중간 노드 삭제(전달된 data와 값이 동일한 node 삭제)
  // 전달된 data와 값이 동일한 node중 첫번째 node 삭제
  public void deleteNode(String data) {
    ListNodeCustom preNode = head; // head참조하는 첫번째 노드의 주소
    ListNodeCustom tempNode = head.link; // 첫번째 노드의 link필드의 값이 두번째 node

    // 찾는 data가 첫번째 노드에서 찾아지는 경우
    if (data.equals(preNode.getData())) {
      head = preNode.link; // head는 두번째 node 참조
      preNode.link = null;
      size--;
    } else {
      // 두번째(tempNode) 노드부터 data가 찾아질 떄 까지 node 이동
      while (tempNode != null) {
        if (data.equals(tempNode.getData())) {
          // 데이터가 일치하는 node를 찾은 경우
          if (tempNode.link == null) { // 마지막 노드에서 데이터가 일치한 경우
            preNode.link = null; // preNode는 tempNode 이전 node
          } else { // 찾은 노드가 마지막 노드가 아니면
            // preNode : 삭제 노드의 이전 노드, tempNode : 삭제할 노드
            preNode.link = tempNode.link;
            tempNode.link = null;
          }
          size--;
          break;
        } else { // 데이터가 일치하지 않은 경우
          preNode = tempNode;
          tempNode = tempNode.link;
        }
      }
    }
  }

  // 마지막 노드 삭제(data 상관 없이 무조건 마지막 노드 삭제)
  public void deleteNode() {
    ListNodeCustom preNode; // 마지막 노드 이전 노드
    ListNodeCustom tempNode; // 마지막 노드

    // 노드가 없음
    if (head == null) {
      return;
    }

    // 노드가 1개인 경우
    if (head.link == null) {
      head = null;
    } else { // 두개 이상인 경우 마지막 노드를 찾아야 함 (마지막 노드의 링크는 null)
      preNode = head;
      tempNode = head.link;

      while (tempNode.link != null) {
        preNode = tempNode;
        tempNode = tempNode.link;
      }
      // 반복이 종료되면 마지막노드는 tempNode가 참조 마지막 이전 노드는 preNode가 참조
      // preNode.link를 null로 설정해서 tempNode가 참조하는 노드의 연결을 끊는다
      preNode.link = null;
    }
  }

  // node 검색 : data를 전달해 해당 data가 linkedList에 있는지 확인 후 있으면 해당 노드의 참조를 반환
  public ListNodeCustom searchNode(String data) {
    ListNodeCustom tempNode = this.head; // 첫번째 노드 할당

    while (tempNode != null) { // 다음 노드가 있는 동안 반복
      if (data.equals(tempNode.getData())) {
        // data 탐색되면 탐색된 node의 참조 주소가 반환됨
        return tempNode;
      } else {
        tempNode = tempNode.link;
      }
    }
    return tempNode; // 안찾아지면 최종 tempNode 반환(이때 반환되는 값은 null)
  }

  // 연결 리스트의 모든 노드의 data 출력
  public void printList() {
    ListNodeCustom tempNode = this.head;

    // head부터 시작하여 마지막 노드까지 순회하면서 출력
    while (tempNode != null) {
      System.out.print(tempNode.getData() + " ");
      tempNode = tempNode.link;
    }
    System.out.println();

  }

  // 연결 리스트를 역순으로 재배치(원본변경)
  public void reverseList() {
    ListNodeCustom nextNode = head; // head가 참조하는 첫번째 node 할당
    ListNodeCustom currentNode = null;
    ListNodeCustom preNode = null;

    while (nextNode != null) {
      preNode = currentNode;
      currentNode = nextNode;
      nextNode = nextNode.link;
      currentNode.link = preNode;
    }
    head = currentNode; // 반복문을 벗어나면 currentNode는 마지막 node를 참조하게 됨

  }

  public boolean isFull() {
    return size >= maxSize;
  }

  public void checkSize() {
    if (isFull()) {
      System.out.println("만차상태입니다");
    } else {
      System.out.println(maxSize - size + "대 주차 가능합니다");
    }

  }

  public int searchPosition(String data) {
    ListNodeCustom tempNode = head;
    int position = 1;

    while (tempNode != null) {
      if (data.equals(tempNode.getData())) {
        return position;
      }
      tempNode = tempNode.link;
      position++;
    }
    return -1; // 차량 못찾음
  }

  public int getMaxSize() {
    return maxSize;
  }

} // class 종료
