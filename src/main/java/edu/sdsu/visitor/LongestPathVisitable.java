package edu.sdsu.visitor;

import edu.sdsu.node.Node;

public class LongestPathVisitable implements IVisitable{

   @Override
   public void accpet(IVisitor iVisitor) {
      iVisitor.visit(this);
   }
}
