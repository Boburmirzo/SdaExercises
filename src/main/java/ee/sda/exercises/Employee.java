package ee.sda.exercises;

public class Employee {
    // EmployeeType is custom data type as Enum class.
    private EmployeeType employeeType;
    private double monthlySalary;
    private double commission;
    private double bonus;

    public Employee(EmployeeType employeeType){
        this.employeeType = employeeType;
    }
    public Employee(EmployeeType employeeType,
                    double monthlySalary,
                    double commission,
                    double bonus) {
        this.employeeType = employeeType;
        this.monthlySalary = monthlySalary;
        this.commission = commission;
        this.bonus = bonus;
    }
    double payAmount() {
        // This example for if else statement
//        if(employeeType == EmployeeType.ENGINEER){
//            return monthlySalary;
//        } else if (employeeType == EmployeeType.SALESMAN){
//            return monthlySalary + commission;
//        } else if (employeeType == EmployeeType.MANAGER){
//            return monthlySalary + bonus;
//        } else {
//            throw new Exception("Incorrect Employee");
//        }
        // This is Switch
        switch (getEmployeeType()) {
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                return 0.0;
        }
    }
    public EmployeeType getEmployeeType() {
        return employeeType;
    }
    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
