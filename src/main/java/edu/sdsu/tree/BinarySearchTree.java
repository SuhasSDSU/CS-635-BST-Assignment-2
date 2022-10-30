package edu.sdsu.tree;

import edu.sdsu.node.Node;
import edu.sdsu.node.NullNode;
import edu.sdsu.strategy.IStrategy;
import edu.sdsu.student.Student;


import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.List;

public class BinarySearchTree <E extends Comparable<E>> {
   private IStrategy strategy;
   private Node root;
   private Node searchedNode;
   private List<Node> nodeList;
   public BinarySearchTree(IStrategy strategy){
      this.root = NullNode.getInstance();
      searchedNode = NullNode.getInstance();
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

   public Node search(Integer redId){
     Node result = recursiveSearch(redId, this.root);
     if(!result.isNull()){
        return result;
     }
     return NullNode.getInstance();
   }

   private Node recursiveSearch(Integer redID, Node node){
      if(!node.isNull()){
         Student rootStudent = (Student) node.getValue();
         if(compare(redID, rootStudent) == 0 || node.isNull()) {
            setSearchedNode(node);
         }
         if (compare(redID, rootStudent) > 0){
            // if REDID is less than root, go to left subtree
            recursiveSearch(redID, node.getLeft());
         } else {
            recursiveSearch(redID, node.getRight());
         }
      }
      return getSearchedNode();
   }

   private int compare(Integer redid, Student student1) {
      return Integer.compare(student1.getRedId() ,redid);
   }

   public Node getRoot(){
      return this.root;
   }

   public void setSearchedNode(Node node){
      this.searchedNode = node;
   }
   public Node getSearchedNode() {
      return searchedNode;
   }
}
