package main.Ejercicio_03_listLeves;

import java.util.*;


import main.Materia.Models.Node;

public class ListLevels {

    public List<List<Node>> listLevels(Node root) {

        List<List<Node>> result = new ArrayList<>();
        // Si el árbol está vacío
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                level.add(current);

                if (current.getLeft() != null) {
                    queue.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    queue.add(current.getRight());
                }
            }
            result.add(level);
        }
        return result;
    }
}