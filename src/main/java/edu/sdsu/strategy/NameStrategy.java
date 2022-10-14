package edu.sdsu.strategy;

import edu.sdsu.node.Node;
import edu.sdsu.tree.BinarySearchTree;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class NameStrategy implements IStrategy {
   Node context;
   @Override
   public Node add(Object val, Node context) {
      return recursiveInsert(val, context);
//      return true;

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

   public int compare(Object o1, Object o2) {
      return 0;
   }
}
