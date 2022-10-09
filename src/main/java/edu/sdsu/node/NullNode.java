package edu.sdsu.node;

public final class NullNode<E> extends Node{

   /**
    * We have implemented Null Object pattern using
    * Singleton object.
    */
   private E val;
   private NullNode left;
   private NullNode right;

   private static final NullNode node = new NullNode();
   private NullNode(){}

   public void setVal(E val){}
   public static NullNode getInstance(){
      return node;
   }

   @Override
   public Node getLeft() {
      return null;
   }

   @Override
   public Node getRight(){
      return null;
   }

   @Override
   public boolean isNull() {
      return true;
   }
}
