package edu.sdsu.node;

import java.util.function.Consumer;

public interface INode<E>{
   INode getLeft();
   INode getRight();
   boolean isNull();
//   <E> void forEach(Consumer<? super E> action);
}
