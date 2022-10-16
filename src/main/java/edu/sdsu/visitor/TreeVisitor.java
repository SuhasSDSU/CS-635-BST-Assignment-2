package edu.sdsu.visitor;

public class TreeVisitor implements IVisitor{
   @Override
   public void visit(LongestPathVisitable pathVisitable) {
      System.out.println("LongestPath");
   }

   @Override
   public void visit(NullNodeVisitable pathVisitable) {
         System.out.println("NullNode path");
   }
}
