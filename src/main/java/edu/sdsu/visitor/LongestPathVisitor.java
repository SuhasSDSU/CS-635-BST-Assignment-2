package edu.sdsu.visitor;

import edu.sdsu.node.Node;

public class LongestPathVisitor implements IVisitor{
   private Node root;
   private int countOfNodes;
   public LongestPathVisitor(Node head){
      this.root = head;
      this.countOfNodes = 0;
   }
   @Override
   public void visit(IVisitor visitor) {
        inOrder(this.root);
   }

   private void inOrder(Node node){
      if(!node.isNull()){
         node.setLeft(node.getLeft());
         countOfNodes++;
         node.setRight(node.getRight());
      }
   }

   public int getCountOfNodes() {
      return countOfNodes;
   }
}
