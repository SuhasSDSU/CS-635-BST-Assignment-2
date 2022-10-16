package edu.sdsu.visitor;

import edu.sdsu.node.Node;

public class LongestPathVisitable implements IVisitable{
   private Node root;

   public LongestPathVisitable(Node head){
      this.root = head;
   }

   @Override
   public void accpet(IVisitor iVisitor) {
      iVisitor.visit(this);
   }
}
