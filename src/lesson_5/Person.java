package lesson_5;

public class Person {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person() {}

    public Person(String name) {
        this(name, null, null, null, 0, 0);
    }

    public Person(String name, String position) {
        this(name, position, null, null, 0, 0);
    }

    public Person(String name, String position, String email) {
        this(name, position, email, null, 0, 0);
    }

    public Person(String name, String position, String email, String phone) {
        this(name, position, email, phone, 0, 0);
    }

    public Person(String name, String position, String email, String phone, int age) {
        this(name, position, email, phone, age, 0);
    }

    public Person(String name, String position, String email, String phone, int age, int salary) {
        this.name = name;
        this.phone = phone;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", position='" + position + '\'' +
            ", email='" + email + '\'' +
            ", phone='" + phone + '\'' +
            ", age=" + age +
            ", salary=" + salary +
        '}';
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Возраст введен не корректно");
        }
    }

    public void setSalary(int salary) {

        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Введено не корректное значение");
        }
    }

    public void printInfo() {
        System.out.println(this);
    }
}
