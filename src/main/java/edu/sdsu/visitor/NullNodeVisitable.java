package edu.sdsu.visitor;

public class NullNodeVisitable implements IVisitable{
   @Override
   public int accpet(IVisitor iVisitor) {
      iVisitor.visit(this);
      return 0;
   }
}
