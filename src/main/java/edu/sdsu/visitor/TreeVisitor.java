package edu.sdsu.visitor;

import edu.sdsu.node.Node;

public class TreeVisitor implements IVisitor{
   private Node root;
   private int nonLeafNode;
   private int leafNodes;
   public TreeVisitor(Node head){
      this.root = head;
      this.nonLeafNode = 0;
      this.leafNodes = 0;
   }
   @Override
   public void visit(LongestPathVisitable pathVisitable) {
      getLongestPath();
      System.out.println(getNonLeafNode());
      getAvgPath();
   }
   @Override
   public void visit(NullNodeVisitable pathVisitable) {
      getNullNodes();
      System.out.println(this.getLeafNodes());
   }

   private void getLongestPath(){
      nonLeafNode = calculateNonLeafNode(this.root);
   }
   private int calculateNonLeafNode(Node node){
      if(node.isNull()) {
         return 0;
      }
      return 1 + calculateNonLeafNode(node.getLeft()) + calculateNonLeafNode(node.getRight());
   }

   private void getAvgPath(){}

   // utility method that helps in finding Non-Leaf nodes
   private void getNullNodes(){
      calculateLeafNodes(this.root);
   }

   private void calculateLeafNodes(Node node){
      if(node.isNull()) {
         this.leafNodes++;
         return;
      }
      calculateLeafNodes(node.getLeft());
      calculateLeafNodes(node.getRight());
   }

   public int getNonLeafNode(){
      return nonLeafNode;
   }

   public int getLeafNodes() {
      return leafNodes;
   }
}
