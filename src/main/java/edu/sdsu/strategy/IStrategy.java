package edu.sdsu.strategy;

import edu.sdsu.node.Node;

public interface IStrategy<E>{
   public boolean add(E val, Node head);
}
