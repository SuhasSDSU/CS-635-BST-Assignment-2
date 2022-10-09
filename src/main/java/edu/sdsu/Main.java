package edu.sdsu;


import edu.sdsu.tree.BinarySearchTree;

public class Main {
   public static void main(String[] args) {
      BinarySearchTree object = new BinarySearchTree();
      object.add(10);
      object.add(8);
      object.add(13);
      object.add(6);
      object.add(11);
      object.add(15);

      object.inorder();
   }
}