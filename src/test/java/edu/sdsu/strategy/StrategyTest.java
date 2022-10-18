package edu.sdsu.strategy;
import edu.sdsu.node.Node;
import edu.sdsu.student.Student;
import edu.sdsu.tree.BinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {
   BinarySearchTree<Student> binarySearchTree;
   @BeforeEach
   public void init() {
      binarySearchTree = new BinarySearchTree<>(new GPAStrategy());
      binarySearchTree.add(new Student("Sashank","Pindiproli", (float) 3.5, 824815162));
      binarySearchTree.add(new Student("Arun","Chaganti", (float) 3.63, 824815170));
      binarySearchTree.add(new Student("Aakash","Joshi", (float) 3.5, 824815161));
      binarySearchTree.add(new Student("Suhas","Pindiproli", (float) 3.5, 824815158));
      binarySearchTree.add(new Student("Aman","Bafna", (float) 2.83, 824815168));
      binarySearchTree.add(new Student("Dhruv","Makati", (float) 3.93, 824815173));
      binarySearchTree.add(new Student("Kshitij","Poojari", (float) 3.4, 824815173));
      binarySearchTree.add(new Student("Anuj","Kawane", (float) 4.0, 824815173));
   }

   @Test
   @DisplayName("Check the working of iterator and if sorting takes place using Name")
   public void printName() {
      binarySearchTree.forEach(element -> element.getValue());
   }


   @Test
   @DisplayName("The first element should be the lowest element as per the passed strategy")
   public void firstStudentShouldBeSashank() {
      Student firstNode = (Student) binarySearchTree.getRoot().getValue();
      assertEquals(firstNode.getFirstName(), "Sashank");
   }

   @Test
   @DisplayName("The Last element should be Anuj as he has 4 pointer")
   public void lastStudentShouldBeAnuj(){
      Node lastNode= binarySearchTree.getRoot().getRight().getRight().getRight();
      Student Anuj = (Student)lastNode.getValue();
      assertEquals(Anuj.getFirstName(), "Anuj");
   }
}
