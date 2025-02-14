package com.bhavya;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){}
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    public void populate(Scanner in){
        System.out.println("Enter the root node:");
        int value = in.nextInt();
        root = new Node(value);
        populate(in,root);
    }

    private void populate(Scanner in,Node node){
        System.out.println("Do you want to enter left of "+ node.value);
        boolean left  = in.nextBoolean();
        if(left){
            System.out.println("Enter the value of left of"+ node.value);
            int value = in.nextInt();
            node.left = new Node(value);
            populate(in,node.left);
        }
        System.out.println("Do you want to enter right of "+ node.value);
        boolean right  = in.nextBoolean();
        if(right){
            System.out.println("Enter the value of right of"+ node.value);
            int value = in.nextInt();
            node.right = new Node(value);
            populate(in,node.right);
        }
    }

    public void display(){
        display(this.root,"");
    }

    private void display(Node node,String indent){
        if(node == null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
    }

    public void prettydisplay(){
        prettydisplay(root,0);
    }
    private void prettydisplay(Node node,int level){
        if(node == null){
            return;
        }
        prettydisplay(node.right,level+1);

        if(level != 0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|---------->" + node.value);
        }else{
            System.out.println(node.value);
        }
        prettydisplay(node.left,level+1);
    }

}
