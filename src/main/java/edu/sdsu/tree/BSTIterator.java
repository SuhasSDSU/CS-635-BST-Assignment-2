package edu.sdsu.tree;

import edu.sdsu.node.Node;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BSTIterator<E> implements Iterable<E> {
   E head;

   public BSTIterator(E element){
      this.head = element;
   }
   @Override
   public void forEach(Consumer<? super E> action) {
      Objects.requireNonNull(action);
      for(E element: this){
         action.accept(element);
      }
   }

   @Override
   public Spliterator<E> spliterator() {
      return Iterable.super.spliterator();
   }

   @Override
   public Iterator<E> iterator() {
      return null;
   }
}
