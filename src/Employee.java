public class Employee {
    private final int id;
    private static int counter=0;

    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.id= counter;
        this.name = name;
        this.age = age;
        setSalary(salary);
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
