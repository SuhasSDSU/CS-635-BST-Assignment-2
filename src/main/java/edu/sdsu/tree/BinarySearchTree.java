package edu.sdsu.tree;

import edu.sdsu.iterator.BSTIterator;
import edu.sdsu.node.Node;
import edu.sdsu.node.NullNode;
import edu.sdsu.strategy.IStrategy;


public class BinarySearchTree <E extends Comparable<E>> {
   IStrategy strategy;
   Node root;
   public BinarySearchTree(IStrategy strategy){
      this.root = NullNode.getInstance();
      this.strategy = strategy;
   }
   public void add(E val){
       this.root = strategy.add(val,root);
   }

   /*Strategy content*/

   public BSTIterator createIterator(){
      return new BSTIterator(this.root);
   }
}
