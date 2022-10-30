package edu.sdsu.node;

public class Node<E extends Comparable <E>> implements INode{
   private E value;
   private Node left;
   private Node right;

   public Node(){
      super();
      this.left = NullNode.getInstance();
      this.right = NullNode.getInstance();
   }

   /**
    *
    * @param value
    * Intialize with null node
    */
   public Node(E value){
      this.value = value;
      this.left = NullNode.getInstance();
      this.right = NullNode.getInstance();
   }

   /**
    *
    * @return
    * check if the node is null
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
    * @return left node
    */
   @Override
   public Node getLeft() {
      return this.left;
   }

   /**
    *
    * @return right node
    */
   @Override
   public Node getRight() {
      return this.right;
   }

   /**
    * set left node
    * @params
    */
   public void setLeft(Node left) {
      this.left = left;
   }

   /**
    * set right node
    * @param right
    */
   public void setRight(Node right) {
      this.right = right;
   }

}
