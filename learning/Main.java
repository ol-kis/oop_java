package learning;

public class Main {
    public static void main(String[] args) {
        Person P = new Person();
        P.setNameAndAge("Nika", 30);
        P.speak();
        P.setName("");
        P.setAge(12);
        P.speak();
        System.out.println("Вовзращаем переменную " + P.getAge());

    }
}

class Person {
    private String name;
    private int age;

    public void setName(String UserName) {
        if (UserName.isEmpty()) {
            System.out.println("Пустое имя");
        } else {
            name = UserName;
        }

    }

    public String getName() {
        return name;
    }

    public void setAge(int UserAge) {
        age = UserAge;
    }

    public int getAge() {
        return age;
    }

    void speak() {
        System.out.println("My name is " + name + ". My age is " + age);
    }

    void setNameAndAge(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

}
// У класса есть данные (поля)
// 2. Действия (методы)
