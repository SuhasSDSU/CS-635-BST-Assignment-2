/**
 * @author: Suhas Pindiproli
 * @REDID: 824816168
 * @Problem-Statment: Implement BST with:-
 * 1) Null Object Pattern -- Done
 * 2) Internal Iterator Pattern -- Done
 * 3) Strategy Pattern -- Done
 * 4) Visitor Pattern -- check
 */

package edu.sdsu;


import edu.sdsu.iterator.BSTIterator;
import edu.sdsu.node.Node;

import edu.sdsu.strategy.GPAStrategy;
import edu.sdsu.strategy.RedIdStrategy;
import edu.sdsu.student.Student;
import edu.sdsu.tree.BinarySearchTree;


public class Main {
   public static void main(String[] args) {
      /*
      BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>(new RedIdStrategy());
      binarySearchTree.add(10);
      binarySearchTree.add(8);
      binarySearchTree.add(6);
      binarySearchTree.add(9);
      binarySearchTree.add(12);
      binarySearchTree.add(11);
      binarySearchTree.add(13);
      */


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
      BinarySearchTree<Student> binarySearchTree = new BinarySearchTree<>(new RedIdStrategy());
      binarySearchTree.add(new Student("Arun","Chaganti", (float) 3.73, 824815170));
      binarySearchTree.add(new Student("Sashank","Pindiproli", (float) 3.5, 824815162));
      binarySearchTree.add(new Student("Aakash","Joshi", (float) 3.80, 824815161));
      binarySearchTree.add(new Student("Suhas","Pindiproli", (float) 3.83, 824815158));
      binarySearchTree.add(new Student("Aman","Bafna", (float) 2.83, 824815168));
      binarySearchTree.add(new Student("Dhruv","Makati", (float) 3.93, 824815173));


      binarySearchTree.forEach(element -> System.out.println(element.getValue()));

   }
}