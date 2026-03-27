package ca.ns.navid.shx.patterns.creational.builder;

public class Person {

    //Mandatory Fields
    private int id;
    private String name;

    //Optional Fields
    private String email;
    private String phoneNumber;

    private Person(Builder builder) {
        builder.id = this.id;
        builder.name = this.name;
        builder.email = this.email;
        builder.phoneNumber = this.phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class Builder {

        private int id;
        private String name;
        private String email;
        private String phoneNumber;

        //Constructor for mandatory fields.
        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
