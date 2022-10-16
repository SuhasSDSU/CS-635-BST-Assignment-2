package edu.sdsu.visitor;

public class NullNodeVisitable implements IVisitable{
   @Override
   public void accpet(IVisitor iVisitor) {
      iVisitor.visit(this);
   }
}
