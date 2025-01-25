package com.bhavya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(in);
//        tree.display();
        tree.prettydisplay();
    }

}

// Types of binary trees
// 1. Complete binary tree
//    all level full
//    last full from L to R
// 2. Full or Strict binary tree
//    either 0 or 2 children
// 3. Perfect binary tree
//    all levels are full
// 4. Height balanced
//    average height of O(logN)
// 5. Skewed binary tree
//    height O(N) like binary tree
// 6. Ordered binary tree
//    every node has some property like BST


// Properties that help in questions
// in perfect BT having height = h
// then total nodes = 2^(h+1) - 1
// total leaf nodes in perfect BT = 2^h
// if we have N no. of leaves then log(N+1) levels atleast
// if we have N nodes then log(N+1) min levels
// in Strict BT if have N leaf nodes then
// it has N-1 internal nodes
// therefore no.of leaf nodes = no.of internal nodes + 1
// no.of leaf nodes = 1 + No.of internal nodes with 2 children (Not including root)