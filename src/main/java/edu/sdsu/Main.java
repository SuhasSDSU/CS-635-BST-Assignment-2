/**
 * @author: Suhas Pindiproli
 * @REDID: 824816168
 * @Problem-Statment: Implement BST with:-
 * 1) Null Object Pattern -- Done
 * 2) Internal Iterator Pattern -- Done
 * 3) Strategy Pattern -- shift the logic from BST to Strategy Pattern
 * 4) Visitor Pattern -- 
 */

package edu.sdsu;


import edu.sdsu.tree.BSTIterator;
import edu.sdsu.tree.BinarySearchTree;

import java.util.List;
import edu.sdsu.node.Node;
public class Main {
   public static void main(String[] args) {
      BinarySearchTree<Integer> object = new BinarySearchTree<>();
      object.add(10);
      object.add(8);
      object.add(6);
      object.add(9);
      object.add(12);
      object.add(11);
      object.add(13);

      /*
       *   10
       *   /\
       *  8  12
       *  /\ / \
       * 6 9 11 13
       * */

      /*
      To get BST of Student we need to extend or implement Comparable in Student class

      object.add(new Student("Suhas","Pindiproli", (float) 3.83, 824815158));
      object.add(new Student("Sashank","Pindiproli", (float) 4.0, 824815159));
      object.add(new Student("Arun","Chaganti", (float) 3.73, 824815160));
      object.add(new Student("Aakash","Joshi", (float) 4.0, 824815161));
      object.add(new Student("Aman","Bafna", (float) 2.83, 824815162));
      object.add(new Student("Dhruv","Makati", (float) 3.93, 824815163));
      object.add(new Student("Rishab","Parekh", (float) 3.93, 8248151 64));

      */
     BSTIterator bstIterator = object.createIterator();

     List<Node> list = bstIterator.traverse();
     list.forEach(el -> System.out.println(el));
   }
}