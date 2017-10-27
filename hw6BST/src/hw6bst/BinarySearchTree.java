/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6bst;

/**
 *
 * @author xenia
 */
public class BinarySearchTree {
    private BSTnode root;
    private int size;
    
    
    BinarySearchTree(){
        this.root = null;
        this.size = 0;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public void insert(BinarySearchTree tree, BSTnode newNode){
        BSTnode nodeParent = null;
        BSTnode curNode = tree.root; 
        while(curNode != null){
            nodeParent = curNode;
            if(newNode.getKey() < curNode.getKey()){
                curNode = curNode.getLeft();
            }
            else{
                curNode = curNode.getRight();
            }
        }
        newNode.setP(nodeParent);
        if(nodeParent == null){
            tree.root = newNode;
        }
        else if(newNode.getKey() < nodeParent.getKey()){
            nodeParent.setLeft(newNode);
        }
        else{
            nodeParent.setRight(newNode);
        }
        this.size ++;
    }
    
    private void transplant(BinarySearchTree tree, BSTnode toBeRe, BSTnode replacing){
        if(toBeRe.getP() == null){
            tree.root = replacing;
        }
        else if(toBeRe == toBeRe.getP().getLeft()){
            toBeRe.getP().setLeft(replacing);
        }
        else{
            toBeRe.getP().setRight(replacing);
        }
        if(replacing != null){
            replacing.setP(toBeRe.getP());
        }
    }
}
