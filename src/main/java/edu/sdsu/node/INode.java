package edu.sdsu.node;

public interface INode<E>{
   INode getLeft();
   INode getRight();
   boolean isNull();
}
