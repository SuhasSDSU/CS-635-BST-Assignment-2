package edu.sdsu.visitor;

public class LongestPathVisitable implements IVisitable{
   @Override
   public void accpet(IVisitor iVisitor) {
      return iVisitor.visit(this);
   }
}
