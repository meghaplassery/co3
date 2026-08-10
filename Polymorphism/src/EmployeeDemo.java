class Employee {
    void calculateSalary() {
        System.out.println("Calculating employee salary");
    }
}

class Manager extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Manager Salary = ₹80,000");
    }
}

class Developer extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Developer Salary = ₹60,000");
    }
}

class Intern extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Intern Stipend = ₹15,000");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee emp=new Employee();
        emp.calculateSalary();

        emp=new Manager();
        emp.calculateSalary();

        emp=new Developer();
        emp.calculateSalary();

        emp=new Intern();
        emp.calculateSalary();


    }
}
