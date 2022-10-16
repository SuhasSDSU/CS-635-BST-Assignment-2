package edu.sdsu.strategy;

import edu.sdsu.node.Node;
import edu.sdsu.node.NullNode;
import edu.sdsu.student.Student;

public class GPAStrategy implements IStrategy{

   @Override
   public Node add(Object val, Node head) {
      head = recursiveInsert(val, head);
      if(head.isNull()){
         throw new NullPointerException();
      }
      return head;
   }

   private Node recursiveInsert(Object value, Node node){
      if(node.isNull()){
         node = new Node((Comparable) value);
      } else if (compare((Student) value, (Student) node.getValue()) < 0){
         // if REDID is less than root go to left subtree
         node.setLeft(recursiveInsert(value, node.getLeft()) );
      } else {
         node.setRight(recursiveInsert(value, node.getRight()));
      }
      return node;
   }

   public int compare(Student student1, Student student2) {
      return Math.round(Float.compare(student1.getGpa() ,student2.getGpa())) == 0 ? new RedIdStrategy().compare(student1,student2) : Math.round(Float.compare(student1.getGpa() ,student2.getGpa()));
   }
}
