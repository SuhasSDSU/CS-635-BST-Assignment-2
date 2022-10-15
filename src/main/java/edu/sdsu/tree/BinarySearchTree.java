package edu.sdsu.tree;

import edu.sdsu.iterator.BSTIterator;
import edu.sdsu.node.Node;
import edu.sdsu.node.NullNode;
import edu.sdsu.strategy.IStrategy;
import edu.sdsu.visitor.IVisitable;
import edu.sdsu.visitor.IVisitor;
import edu.sdsu.visitor.LongestPathVisitor;


public class BinarySearchTree <E extends Comparable<E>> {
   IStrategy strategy;
   IVisitor visitor; // understand how to consume using the accept
   // how to use visitor, how to maintain the context and understand the structures

   IVisitable visitable;
   Node root;
   public BinarySearchTree(IStrategy strategy){
      this.root = NullNode.getInstance();
      this.strategy = strategy;
   }
   public boolean add(E val){
       this.root = strategy.add(val,root);
       return root.isNull();
   }


   public BSTIterator createIterator(){
      return new BSTIterator(this.root);
   }

   public int getInternalNode(){
      visitor = new LongestPathVisitor(this.root);
      visitable.accpet(visitor);
      return 0;
   }
}
