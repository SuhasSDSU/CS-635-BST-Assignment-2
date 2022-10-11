package edu.sdsu.tree;


import edu.sdsu.node.Node;

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

public class BSTIterator<E> {
   private Stack<Node> stack;
   private Node currentNode;
   private List bstList;
   public BSTIterator(Node head){
      stack = new Stack<>();
      currentNode = head;
      bstList = new ArrayList<>();

   }
   public List traverse(){
      inorderRec(currentNode);
      return bstList;
   }
   private void inorderRec(Node node){
      //perform recursion till we reach the leaf node
      if (!node.isNull()) {
         inorderRec(node.getLeft());
         bstList.add(node.getValue());
//         System.out.println(node.getValue());
         inorderRec(node.getRight());
      }
   }


}
