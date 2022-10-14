package edu.sdsu.strategy;

import edu.sdsu.node.Node;

public class RedIdStrategy implements IStrategy {
   @Override
   public boolean add(Object val, Node head) {
      recursiveInsert(val, head);
      return true;
   }

   private Node recursiveInsert(Object value, Node node){
      if(node.isNull()){
         node = new Node((Comparable) value);
         return node;
      } else if (node.getValue().compareTo(value) > 0){
         node.setLeft(  recursiveInsert(value, node.getLeft()) );
      } else {
         node.setRight(recursiveInsert(value, node.getRight()));
      }
      return node;
   }
}
