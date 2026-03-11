package ca.ns.navid.shx.patterns.creational.builder;

public class Main {

    static void main() {

        Person linda = new Person.Builder(3655, "Linda")
                .email("linda.test@yahoo.com")
                .phoneNumber("123456789")
                .build();

        Person david = new Person.Builder(2055, "David")
                .email("linda.test@yahoo.com")
                .build();


        Person sara = new Person.Builder(1012, "Sara")
                .phoneNumber("987654321")
                .build();

        Person maria = new Person.Builder(2030, "Maria")
                .build();

        IO.println(linda);
        IO.println(david);
        IO.println(sara);
        IO.println(maria);
    }
}
