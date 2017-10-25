/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6bst;

/**
 *
 * @author xeniazantello
 */
public class BSTnode {
    private int key;
    private BSTnode p;
    private BSTnode right;
    private BSTnode left;
    
    BSTnode(int key){
        this.key = key;
        p = null;
        right = null;
        left = null;
    }
    
    public void setKey(int newKey){
        this.key = newKey;
    }
    
    public int getKey(){
        return this.key;
    }
    
    public void setP(BSTnode newP){
        this.p = newP;
    }
    
    public BSTnode getP(){
        return this.p;
    }
    
    public void setRight(BSTnode newRight){
        this.right = newRight;
    }
    
    public BSTnode getRight(){
        return this.right;
    }
    
    public void setLeft(BSTnode newLeft){
        this.left = newLeft;
    }
    
    public BSTnode getLeft(){
        return this.left;
    }
            
            
            
            
            
            
}
