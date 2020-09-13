package ee.sda.exercises;

public class Main {

    public static void main(String[] args) {
        Employee engineer = new Employee(EmployeeType.ENGINEER, 3400, 0.0, 0.0);
        Employee manager = new Employee(EmployeeType.MANAGER, 2800, 0.0, 200);
        Employee salesman = new Employee(EmployeeType.SALESMAN, 2500, 700, 0.0);

        double salary1 = engineer.payAmount();
        double salary2 = manager.payAmount();
        double salary3 = salesman.payAmount();

        System.out.println("Engineer's salary is " +salary1);
        System.out.println("MANAGER's salary is " +salary2);
        System.out.println("SALESMAN's salary is " +salary3);

        Employee director = new Employee(EmployeeType.DIRECTOR);
        director.setBonus(1000);
        director.setCommission(200);
        director.setMonthlySalary(4000);

        System.out.println("SALESMAN's salary is " +director.payAmount());

    }
}
