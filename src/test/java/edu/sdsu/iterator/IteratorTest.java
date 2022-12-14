package edu.sdsu.iterator;

import edu.sdsu.node.Node;
import edu.sdsu.strategy.GPAStrategy;
import edu.sdsu.student.Student;
import edu.sdsu.tree.BinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorTest {
   BinarySearchTree<Student> binarySearchTree;

   @BeforeEach
   public void init() {
      binarySearchTree = new BinarySearchTree<>(new GPAStrategy());
      binarySearchTree.add(new Student("Sashank", "Pindiproli", (float) 3.5, 824815162));
      binarySearchTree.add(new Student("Arun", "Chaganti", (float) 3.63, 824815170));
      binarySearchTree.add(new Student("Aakash", "Joshi", (float) 3.5, 824815161));
      binarySearchTree.add(new Student("Suhas", "Pindiproli", (float) 3.5, 824815158));
      binarySearchTree.add(new Student("Aman", "Bafna", (float) 2.83, 824815168));
      binarySearchTree.add(new Student("Dhruv", "Makati", (float) 3.93, 824815173));
      binarySearchTree.add(new Student("Kshitij", "Poojari", (float) 3.4, 824815173));
   }
   @Test
   @DisplayName("Test if internal iterator prints the values")
   public void displayTree(){
      String result = "{\"redId\":824815158, \"first-name\":Suhas, \"last-name\":Pindiproli, \"gpa\":3.50}"+
            "{\"redId\":824815161, \"first-name\":Aakash, \"last-name\":Joshi, \"gpa\":3.50}"+
            "{\"redId\":824815162, \"first-name\":Sashank, \"last-name\":Pindiproli, \"gpa\":3.50}"+
            "{\"redId\":824815168, \"first-name\":Aman, \"last-name\":Bafna, \"gpa\":2.83}"+
            "{\"redId\":824815170, \"first-name\":Arun, \"last-name\":Chaganti, \"gpa\":3.63}"+
            "{\"redId\":824815172, \"first-name\":Dhruv, \"last-name\":Makati, \"gpa\":3.93}"+
            "{\"redId\":824815173, \"first-name\":Kshitij, \"last-name\":Poojari, \"gpa\":3.40}"+
            "{\"redId\":824815174, \"first-name\":Anuj, \"last-name\":Kawane, \"gpa\":4.00}";
//      assertEquals(binarySearchTree.forEach(student -> student.getValue()), result);
   }
}
