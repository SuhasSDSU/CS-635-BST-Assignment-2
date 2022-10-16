package edu.sdsu.visitor;
/*
The visitor pattern is used when you have to perform
the same action on many objects of different types
But here we are working only on Nodes
*/

public interface IVisitor {
   void visit(LongestPathVisitable pathVisitable);
   void visit(NullNodeVisitable pathVisitable);
}
