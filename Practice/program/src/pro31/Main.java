package pro31;

import java.util.Scanner;

/**
 * @author ζ―θθΏζ
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        Person person = new Person(id, name);
        person.name_id();
    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void name_id() {
        System.out.println(this.id + ":" + this.name);
    }
}
