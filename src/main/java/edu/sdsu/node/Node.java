package edu.sdsu.node;

import java.util.function.Consumer;

public class Node<E extends Comparable <E>> implements INode{
   private E value;
   private Node left;
   private Node right;

   public Node(){
      super();
   }

   /**
    *
    * @param value
    */
   public Node(E value){
      this.value = value;
      this.left = NullNode.getInstance();
      this.right = NullNode.getInstance();
   }

   /**
    *
    * @return
    */
   public boolean isNull(){
      return false;
   }
   public E getValue() {
      return value;
   }

   /**
    *
    * @param value
    */
   public void setValue(E value) {
      this.value = value;
   }

   /**
    *
    * @return
    */
   @Override
   public Node getLeft() {
      return this.left;
   }

   /**
    *
    * @return
    */
   @Override
   public Node getRight() {
      return this.right;
   }

   /**
    *
    * @param left
    */
   public void setLeft(Node left) {
      this.left = left;
   }

   /**
    *
    * @param right
    */
   public void setRight(Node right) {
      this.right = right;
   }

}
