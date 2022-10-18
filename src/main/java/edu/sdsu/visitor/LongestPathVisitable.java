package edu.sdsu.visitor;

public class LongestPathVisitable implements IVisitable{

   @Override
   public int accpet(IVisitor iVisitor) {
      iVisitor.visit(this);
      return 0;
   }
}
