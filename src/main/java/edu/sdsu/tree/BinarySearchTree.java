package edu.sdsu.tree;

import edu.sdsu.iterator.BSTIterator;
import edu.sdsu.node.Node;
import edu.sdsu.node.NullNode;
import edu.sdsu.strategy.IStrategy;
import edu.sdsu.strategy.RedIdStrategy;


public class BinarySearchTree <E extends Comparable<E>> {
   IStrategy strategy;
   Node root;
   public BinarySearchTree(IStrategy strategy){
      this.root = NullNode.getInstance();
      this.strategy = strategy;
   }
   public void add(E val){
      strategy.add(val, this.root);
   }

   /*Strategy content*/

   public BSTIterator createIterator(){
      return new BSTIterator(this.root);
   }
}
