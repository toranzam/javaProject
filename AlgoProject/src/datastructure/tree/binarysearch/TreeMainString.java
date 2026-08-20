package datastructure.tree.binarysearch;

public class TreeMainString {
  public static void main(String[] args) {
    BinarySearchTree<String> tree = new BinarySearchTree<String>();

    tree.add("banana");
    tree.add("orange");
    tree.add("kiwi");
    tree.add("mango");
    tree.add("apple");
    tree.add("warter melon");
    tree.add("purun");
    tree.add("peach");
    tree.add("peer");
    tree.add("persimmon");

    System.out.println("전위 순회 : ");
    tree.preorder();
    System.out.println();

    tree.remove("apple");
    System.out.println("중위 순회 : ");
    tree.inorder();
    System.out.println();

    System.out.println("후위 순회 : ");
    tree.postorder();
    System.out.println();

  }
}
