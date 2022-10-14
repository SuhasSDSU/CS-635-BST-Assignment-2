package edu.sdsu.iterator;


import edu.sdsu.node.Node;
import java.util.Objects;
import java.util.function.Consumer;

public class BSTIterator<E>{
   private Node currentNode;
   public BSTIterator(Node head){
      this.currentNode = head;
   }

   public void forEach(Consumer<? super E> action){
      Objects.requireNonNull(action);
      accept(this.currentNode);
   }

   public void accept(Node collection){
      inOrderTraversal(collection);
   }

   public void inOrderTraversal(Object collection){
      inorderRec((Node) collection);

   }
   private void inorderRec(Node node){
      //perform recursion till we reach the leaf node
      if (!node.isNull()) {
         inorderRec(node.getLeft());
         System.out.println(node.getValue());
         inorderRec(node.getRight());
      }
   }

}
