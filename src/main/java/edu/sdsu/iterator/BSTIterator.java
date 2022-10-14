package edu.sdsu.iterator;


import edu.sdsu.node.Node;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator<E> {
   private Node currentNode;
   private List bstList;
   public BSTIterator(Node head){
      currentNode = head;
      bstList = new ArrayList<>();

   }
   public List getListOfNodes(){
      inorderRec(currentNode);
      return bstList;
   }
   private void inorderRec(Node node){
      //perform recursion till we reach the leaf node
      if (!node.isNull()) {
         inorderRec(node.getLeft());
         bstList.add(node);
         inorderRec(node.getRight());
      }
   }


}
