abstract class Employee extends Person {
    //attributes
    Date dateOfAppointment;
    int salary;

    //abstract methods
    abstract void setSalary(int salary);
    abstract int getSalary();
}

