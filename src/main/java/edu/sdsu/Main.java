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

import edu.sdsu.node.Node;
import edu.sdsu.strategy.GPAStrategy;
import edu.sdsu.strategy.NameStrategy;
import edu.sdsu.strategy.RedIdStrategy;
import edu.sdsu.student.Student;
import edu.sdsu.tree.BinarySearchTree;
import edu.sdsu.visitor.LongestPathVisitable;
import edu.sdsu.visitor.TreeVisitor;


public class Main {
   public static void main(String[] args) {

      BinarySearchTree<Student> binarySearchTree = new BinarySearchTree<>(new NameStrategy());
      binarySearchTree.add(new Student("Sashank","Pindiproli", (float) 3.5, 824815162));
      binarySearchTree.add(new Student("Arun","Chaganti", (float) 3.73, 824815170));
      binarySearchTree.add(new Student("Aakash","Joshi", (float) 3.5, 824815161));
      binarySearchTree.add(new Student("Suhas","Pindiproli", (float) 3.83, 824815158));
      binarySearchTree.add(new Student("Aman","Bafna", (float) 2.83, 824815168));
      binarySearchTree.add(new Student("Dhruv","Makati", (float) 3.93, 824815173));

      binarySearchTree.forEach(element -> System.out.println(element.getValue()));

//      LongestPathVisitable visitable = new LongestPathVisitable(binarySearchTree.getRoot());
//      visitable.accpet(new TreeVisitor());
   }
}