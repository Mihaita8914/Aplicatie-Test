public class Employee {
    //State of a employee

    String name;
    int age;

    //Constructor. Called when we have Employee e = new Employee("Joe, 30");
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //Behavior of a employee

    public void greet() {
        System.out.println("Good Moring, I am " + name);
    }
    public void work() {
        System.out.println(name + " is working");
    }
    
}