package main.Ejercicio_03_listLeves;

import java.util.List;
import main.Materia.Models.Node;

public class EjemploListLevels {

    public static void main(String[] args) {

        ListLevels listLevels = new ListLevels();
        Node root = new Node(3);
        root.setLeft(new Node(9));
        root.setRight(new Node(20));
        root.getRight().setLeft(new Node(15));
        root.getRight().setRight(new Node(7));

        List<List<Node>> levels = listLevels.listLevels(root);
        System.out.println("Recorrido por niveles:");
        int levelNumber = 0;
        for (List<Node> level : levels) {
            System.out.print("Nivel " + levelNumber + ": ");
            for (Node node : level) {
                System.out.print(node.getValue() + " ");
            }
            System.out.println();
            levelNumber++;
        }
    }
}