public class Teacher extends Employee {
    //attributes
    String qualification;
    String subject;

    //parameterized constructor
    Teacher(String name, Date dobOfTeacher, Date dateOfAppointment, String qualification, String subject) {
        this.name = name;
        this.dob = dobOfTeacher;
        this.dateOfAppointment = dateOfAppointment;
        this.subject = subject;
        this.qualification = qualification;
    }

    //overridden method from abstract class Person
    @Override
    void getDetails() {
        System.out.println("Name of Teacher: "+this.name);
        System.out.println("Date of Birth: "+this.dob.getDate());
        System.out.println("Date of Appointment: "+this.dateOfAppointment.getDate());
        System.out.println("Subject: "+this.subject);
        System.out.println("Qualifications: "+this.qualification);
        System.out.println("Salary: "+this.getSalary());
    }

    //overridden methods from super class Employee
    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    int getSalary() {
        return this.salary;
    }
}
