package edu.sdsu.visitor;

import edu.sdsu.node.Node;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeVisitor implements IVisitor{
   private Node root;
   private Queue<Node> queue;
   private int countEdges;
   private int maxHeight;
   public TreeVisitor(Node head){
      this.root = head;
      this.maxHeight = 0;
      queue = new ArrayDeque();
      this.countEdges = 0;
   }
   @Override
   public int visit(LongestPathVisitable pathVisitable) {
      getLongestPath();
      getAvgPathLength();
      return getMaxHeight();
   }

   private void getAvgPathLength() {
      calculateNumberOfEdges();
      Float avgPath = new Float(this.countEdges / this.maxHeight);
      System.out.println(avgPath);
   }

   private void calculateNumberOfEdges() {
      getMaxHeight();
      System.out.println(this.countEdges);
   }

   @Override
   public int visit(NullNodeVisitable pathVisitable) {
      // calculates null node using BFS
      queue.add(this.root);
      int count = 0;
      while(!queue.isEmpty()){
         Node node = queue.remove();
         while(!node.isNull()){
            if(!node.getLeft().isNull()){
               node.setLeft(node.getLeft());
               queue.add(node);
            }
            if(node.isNull())count++;
            if(!node.getRight().isNull()){
               node.setRight(node.getRight());
               queue.add(node);
            }
         }// inner while
      }//outer while

      return count;
   }

   private void getLongestPath(){
      maxHeight = depthFirstSearch(this.root);
   }
   // using this for finding max height and calculating the number of edges
   private int depthFirstSearch(Node node){
      this.countEdges++;
      if(node.isNull()) {
         return 0;
      }
      return 1 + Math.max(depthFirstSearch(node.getLeft()) , depthFirstSearch(node.getRight()) ) ;
   }

   public int getMaxHeight(){
      return maxHeight;
   }

   @Override
   public int result(){
      return getMaxHeight();
   }

}
