package edu.sdsu.node;

public final class NullNode<E> extends Node {

   /**
    * We have implemented Null Object pattern using
    * Singleton Pattern.
    */
   private E val;
   private NullNode left;
   private NullNode right;

   private static final NullNode node = new NullNode();
   private NullNode(){}

   /**
    *
    * @return
    */
   public static NullNode getInstance(){
      return node;
   }
   public void setVal(E val){}

   /**
    *
    * @return
    */
   @Override
   public NullNode getLeft() {
      return this.left;
   }

   /**
    *
    * @return
    */
   @Override
   public NullNode getRight(){
      return this.right;
   }

   /**
    *
    * @return
    */
   @Override
   public boolean isNull() {
      return true;
   }
}
