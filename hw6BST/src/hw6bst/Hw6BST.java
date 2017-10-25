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
public class Hw6BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BSTnode un = new BSTnode(1);
        BSTnode du = new BSTnode(2);
        BSTnode trois = new BSTnode(3);
        System.out.println(un.getKey());
        System.out.println(un.getP());
        du.setLeft(un);
        du.setRight(trois);
        System.out.println(du.getRight().getKey());
        
    }
    
}
