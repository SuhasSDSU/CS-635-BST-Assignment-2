package edu.sdsu.visitor;

public class NullNodeVisitable implements IVisitable{
   @Override
   public int accept(IVisitor iVisitor) {
      iVisitor.visit(this);
      return iVisitor.result();
   }
}
