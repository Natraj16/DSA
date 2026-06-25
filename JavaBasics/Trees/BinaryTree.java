package JavaBasics.Trees;

import java.util.Scanner;

class BinaryTree {
    public BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    //insert elements

    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner, root);
        }
        private void populate(Scanner scanner, Node root) {
            System.out.println("Do you want to enter left child of ");
    }

}

