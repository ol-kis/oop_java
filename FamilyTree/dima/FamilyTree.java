package dima;

import java.util.ArrayList;

public class FamilyTree {
    ArrayList<Person> treePerson = new ArrayList<Person>();

    public void printTree(Person tree, String table) {
        if (tree != null) {
            System.out.println(table + tree.name);
        } else {
            System.out.println(table + "null");
            return;
        }

        for (int i = 0; i < tree.children.size(); i++) {
            printTree(tree.children.get(i).getP2(), table + "  ");

        }
    }
}