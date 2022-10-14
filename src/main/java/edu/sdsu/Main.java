/**
 * @author: Suhas Pindiproli
 * @REDID: 824816168
 * @Problem-Statment: Implement BST with:-
 * 1) Null Object Pattern -- Done
 * 2) Internal Iterator Pattern -- Done -- Dicey, need to check once more
 * 3) Strategy Pattern -- shift the logic from BST to Strategy Pattern
 * 4) Visitor Pattern -- 
 */

package edu.sdsu;


import edu.sdsu.iterator.BSTIterator;
import edu.sdsu.tree.BinarySearchTree;

import java.util.List;
import edu.sdsu.node.Node;
public class Main {
   public static void main(String[] args) {

      // init
      BinarySearchTree<String> object = new BinarySearchTree<>();
      object.add("10");
      object.add("08");
      object.add("06");
      object.add("09");
      object.add("12");
      object.add("11");
      object.add("13");

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
     BSTIterator bstIterator = object.createIterator();

     // check if the list is sorted
     List<Node> listOfNodes = bstIterator.getListOfNodes();
     listOfNodes.forEach( element -> System.out.println(element.getValue()));
   }
}