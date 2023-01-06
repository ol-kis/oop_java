package dima;

import java.util.ArrayList;

public class Person {
    String name;
    int age;
    ArrayList<Communication> children = new ArrayList<Communication>();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Communication> getChildren() {
        return children;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, ArrayList<Communication> children) {
        this.name = name;
        this.age = age;
        this.children = children;
    }

    public Person(String name, ArrayList<Communication> children) {
        this.name = name;
        this.children = children;
    }

    public void printRelatives(int degree) {
        ArrayList<Communication> list = this.getChildren();
        System.out.println("degree of kinship: " + degree + ", for " + this.name);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).p1 != this && list.get(i).degree2 == degree) {
                System.out.println("Name: " + list.get(i).p2.name + ", ");
                System.out.println("Age: " + list.get(i).p2.age + ", ");
                System.out.println("degree of kinship: " + list.get(i).degree2);
            }
        }
    }

    public void addCommunication(Person p2, int degree1, int degree2) {
        this.children.add(new Communication(this, p2, 1, 2));
    }
}