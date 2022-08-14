package ch12;

public class Person {

    private String name;
    private int age;

    public Person()
    {
        this("no name", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson()
    {
        System.out.printf("%s, %d\n", this.name, this.age);
    }

    public Person getPerson()
    {
        return this;
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.showPerson();

        System.out.println(person);

        Person person2 = person.getPerson();
        System.out.println(person2);
    }
}
