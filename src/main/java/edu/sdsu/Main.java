/**
 * @author: Suhas Pindiproli
 * @REDID: 824816168
 * @Problem-Statment: Implement BST with:-
 * 1) Null Object Pattern -- Done
 * 2) Internal Iterator Pattern -- Done
 * 3) Strategy Pattern -- shift the logic from BST to Strategy Pattern
 * 4) Visitor Pattern -- check
 */

package edu.sdsu;


import edu.sdsu.iterator.BSTIterator;
import edu.sdsu.tree.BinarySearchTree;


public class Main {
   public static void main(String[] args) {

      BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
      binarySearchTree.add(10);
      binarySearchTree.add(8);
      binarySearchTree.add(6);
      binarySearchTree.add(9);
      binarySearchTree.add(12);
      binarySearchTree.add(11);
      binarySearchTree.add(13);


      /*
       *   10
       *   /\
       *  8  12
       *  /\ / \
       * 6 9 11 13
       * */

      /*
      To get BST of Student we need to extend or implement Comparable in Student class

      object.add(new Student("Aakash","Joshi", (float) 4.0, 824815161));
      object.add(new Student("Suhas","Pindiproli", (float) 3.83, 824815158));
      object.add(new Student("Sashank","Pindiproli", (float) 4.0, 824815162));
      object.add(new Student("Arun","Chaganti", (float) 3.73, 824815170));
      object.add(new Student("Aman","Bafna", (float) 2.83, 824815168));
      object.add(new Student("Dhruv","Makati", (float) 3.93, 824815173));

      */

      // check the iterator

     BSTIterator bstIterator = binarySearchTree.createIterator();
     bstIterator.forEach(tree -> bstIterator.inOrderTraversal(tree));
   }
}