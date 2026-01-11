package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    public int maxDepth(Node root) {

        // Caso base: árbol vacío
        if (root == null) {
            return 0;
        }

        // Profundidad del subárbol izquierdo
        int leftDepth = maxDepth(root.getLeft());

        // Profundidad del subárbol derecho
        int rightDepth = maxDepth(root.getRight());

        // Tomamos la mayor y sumamos 1 (nivel actual)
        return Math.max(leftDepth, rightDepth) + 1;
    }
}