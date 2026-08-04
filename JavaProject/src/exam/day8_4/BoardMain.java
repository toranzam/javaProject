package exam.day8_4;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
  public static void main(String[] args) {
    List<Board> boardList = new ArrayList<>();

    boardList.add(new Board("제목1", "내용1", "홍길동"));
    boardList.add(new Board("제목2", "내용2", "이길동"));
    boardList.add(new Board("제목3", "내용3", "민길동"));

    for (Board board : boardList) {
      System.out.println(board.toString());
    }

  }

}
