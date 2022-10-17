package edu.sdsu.visitor;

import edu.sdsu.node.Node;

public class TreeVisitor implements IVisitor{
   private Node root;
   private int nullNodeCount;
   private int pathCount;

   public TreeVisitor(Node head){
      this.root = head;
      this.nullNodeCount = 0;
      this.pathCount = 0;
   }
   @Override
   public void visit(LongestPathVisitable pathVisitable) {
      /*This is the code for
      Longest and avg path in the tree
      * */
   }

   private void getNullNode(Node node){
      if(!node.isNull()){
         if(node.isNull())this.nullNodeCount++;
         getNullNode(node.getLeft());
         getNullNode(node.getRight());
      }
   }


   @Override
   public void visit(NullNodeVisitable pathVisitable) {
         getNullNode(this.root);
         System.out.println(getNullNodeCount());
   }

   public int getNullNodeCount() {
      return nullNodeCount;
   }
}
