package edu.sdsu.visitor;

import edu.sdsu.node.Node;

public class TreeVisitor implements IVisitor{
   private Node root;
   private int maxHeight;
   public TreeVisitor(Node head){
      this.root = head;
      this.maxHeight = 0;
   }
   @Override
   public void visit(LongestPathVisitable pathVisitable) {
      getLongestPath();
      System.out.println(getMaxHeight());
   }
   @Override
   public void visit(NullNodeVisitable pathVisitable) {
      System.out.println(this.getMaxHeight());
   }

   private void getLongestPath(){
      maxHeight = calculateMaxHeight(this.root);
   }
   private int calculateMaxHeight(Node node){
      if(node.isNull()) {
         return 0;
      }
      return 1 + Math.max(calculateMaxHeight(node.getLeft()) , calculateMaxHeight(node.getRight()) ) ;
   }

   public int getMaxHeight(){
      return maxHeight;
   }

}
