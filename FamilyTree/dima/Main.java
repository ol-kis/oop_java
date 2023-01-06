package dima;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();

        Person p1 = new Person("Person1", 30);
        Person p2 = new Person("Person2", 5);
        Person p3 = new Person("Person3", 3);
        Person p4 = new Person("Person4", 2);

        tree.treePerson.add(p1);
        tree.treePerson.add(p2);
        tree.treePerson.add(p3);
        tree.treePerson.add(p4);

        p1.addCommunication(p2, 1, 2);
        p1.addCommunication(p3, 1, 2);
        p2.addCommunication(p4, 1, 2);

        p1.printRelatives(2);

        tree.printTree(p1, "");
    }

}