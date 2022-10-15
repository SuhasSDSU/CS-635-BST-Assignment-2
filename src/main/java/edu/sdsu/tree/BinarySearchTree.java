package edu.sdsu.tree;

import edu.sdsu.node.Node;
import edu.sdsu.node.NullNode;
import edu.sdsu.strategy.IStrategy;
import edu.sdsu.visitor.IVisitable;
import edu.sdsu.visitor.IVisitor;
import edu.sdsu.visitor.LongestPathVisitor;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.List;

public class BinarySearchTree <E extends Comparable<E>> {
   IStrategy strategy;
   IVisitor visitor; // understand how to consume using the accept
   // how to use visitor, how to maintain the context and understand the structures

   IVisitable visitable;
   Node root;

   private List<Node> nodeList;
   public BinarySearchTree(IStrategy strategy){
      this.root = NullNode.getInstance();
      this.strategy = strategy;
      nodeList = new ArrayList<>();
   }
   public boolean add(E val){
       this.root = strategy.add(val,root);
       return root.isNull();
   }
   public void forEach(Consumer<Node> action){
      Objects.requireNonNull(action);
      inorderRec(root);// create the list of nodes using inorder traversal
      // pass that {@nodeList} to consumer
      for (int i = 0; i < nodeList.size(); i++) {
         action.accept(nodeList.get(i));
      }
   }

   private void inorderRec(Node node){
      //perform recursion till we reach the leaf node
      if (!node.isNull()) {
         inorderRec(node.getLeft());
         nodeList.add(node);
         inorderRec(node.getRight());
      }
   }

   public int getInternalNode(){
      visitor = new LongestPathVisitor(this.root);
      visitable.accpet(visitor);
      return 0;
   }
}
