package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {

    public Node invertTree(Node root) {

        // Caso base
        if (root == null) {
            return null;
        }
        // Intercambiamos los hijos
        Node left = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(left);
        // Invertimos recursivamente
        invertTree(root.getLeft());
        invertTree(root.getRight());
        return root;
    }
}