package dima;

public class Communication {
    Person p1;
    Person p2;
    int degree1;
    int degree2;

    public Person getP1() {
        return p1;
    }

    public Person getP2() {
        return p2;
    }

    public int getDegree1() {
        return degree1;
    }

    public int getDegree2() {
        return degree2;
    }

    public Communication(Person p1, Person p2, int degree1, int degree2) {
        this.p1 = p1;
        this.p2 = p2;
        this.degree1 = degree1;
        this.degree2 = degree2;
    }
}