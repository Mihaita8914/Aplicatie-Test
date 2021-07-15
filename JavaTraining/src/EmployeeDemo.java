/* 

       This is main application

*/

public class EmployeeDemo {

    public static void main(String[] args) {

     // Create Joe object
        Employee joe = new Employee("Joe", 30);

     //Create Mike object
       Employee mike = new Employee("Mike", 25);

     //Ask them to greet
       joe.greet();
       mike.greet();

     //Ask them to work
       joe.work();
       mike.work();

}
}