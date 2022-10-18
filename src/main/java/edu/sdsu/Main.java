/**
 * @author: Suhas Pindiproli
 * @REDID: 824816168
 * @Problem-Statment: Implement BST with:-
 * 1) Null Object Pattern
 * 2) Internal Iterator Pattern
 * 3) Strategy Pattern
 * 4) Visitor Pattern
 */

package edu.sdsu;

import edu.sdsu.strategy.RedIdStrategy;
import edu.sdsu.student.Student;
import edu.sdsu.tree.BinarySearchTree;
import edu.sdsu.visitor.*;


public class Main {
   public static void main(String[] args) {
      BinarySearchTree<Student> binarySearchTree = new BinarySearchTree<>(new RedIdStrategy());
      binarySearchTree.add(new Student("Sashank","Pindiproli", (float) 3.5, 824815162));
      binarySearchTree.add(new Student("Arun","Chaganti", (float) 3.63, 824815170));
      binarySearchTree.add(new Student("Aakash","Joshi", (float) 3.5, 824815161));
      binarySearchTree.add(new Student("Suhas","Pindiproli", (float) 3.5, 824815158));
      binarySearchTree.add(new Student("Aman","Bafna", (float) 2.83, 824815168));
      binarySearchTree.add(new Student("Dhruv","Makati", (float) 3.93, 824815172));
      binarySearchTree.add(new Student("Kshitij","Poojari", (float) 3.4, 824815173));
      binarySearchTree.add(new Student("Anuj","Kawane", (float) 4.0, 824815174));

      binarySearchTree.forEach(element -> System.out.println(element.getValue()));
      IVisitor treeVisitor = new TreeVisitor(binarySearchTree.getRoot());
      IVisitable longestPathVisitable = new LongestPathVisitable();
      int result = longestPathVisitable.accept(treeVisitor);

   }
}