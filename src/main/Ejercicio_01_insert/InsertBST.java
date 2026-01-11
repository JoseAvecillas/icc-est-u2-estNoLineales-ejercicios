package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {

    public Node insert(Node root, int value) {

        // Si el árbol está vacío, crear la raíz
        if (root == null) {
            return new Node(value);
        }

        // Si el valor es menor, va a la izquierda
        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        }
        // Si el valor es mayor, va a la derecha
        else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }

        return root;
    }
}