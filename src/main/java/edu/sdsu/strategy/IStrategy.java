package edu.sdsu.strategy;

import edu.sdsu.node.Node;
import edu.sdsu.tree.BinarySearchTree;

import java.util.Comparator;

public interface IStrategy<E>{
   Node add(E val, Node context);

}
