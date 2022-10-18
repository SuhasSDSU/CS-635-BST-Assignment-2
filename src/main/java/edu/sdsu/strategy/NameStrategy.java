package edu.sdsu.strategy;

import edu.sdsu.node.Node;
import edu.sdsu.student.Student;

public class NameStrategy implements IStrategy {
   @Override
   public Node add(Object val, Node context) {
      return recursiveInsert(val, context);
   }

   private Node recursiveInsert(Object value, Node node){
      if(node.isNull()){
         node = new Node((Comparable) value);
         return node;
      } else if (this.compare((Student) node.getValue(), (Student) value) > 0){
         node.setLeft(  recursiveInsert(value, node.getLeft()) );
      } else {
         node.setRight(recursiveInsert(value, node.getRight()));
      }
      return node;
   }

   public int compare(Student student1, Student student2) {
      int LastNameComparison = student1.getLastName().toLowerCase().compareTo(student2.getLastName().toLowerCase());

      int firstNameComparison = student1.getFirstName().toLowerCase().compareTo(student2.getFirstName().toLowerCase());
      return LastNameComparison == 0 ? firstNameComparison : LastNameComparison;

   }
}
