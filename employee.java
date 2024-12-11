//  Design and develop inheritance for a given case study, identify objects and 
// relationships and implement inheritance wherever applicable. Employee class 
// hasEmp_name, Emp_id, Address, Mail_id, and Mobile_noas members. Inherit the 
// classes: Programmer, Team Lead, Assistant Project Manager and Project Manager 
// from employee class. Add Basic Pay (BP) as the member of all the inherited classes 
// with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club 
// fund. Generate pay slips for the employees with their gross and net salary.


// Base class for Employee
class Employee {
    protected String empName;
    protected String empId;
    protected String address;
    protected String mailId;
    protected String mobileNo;
    protected double basicPay;

    public Employee(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        double da = 0.97 * basicPay; // 97% of BP
        double hra = 0.10 * basicPay; // 10% of BP
        double pf = 0.12 * basicPay; // 12% of BP
        double staffClubFund = 0.001 * basicPay; // 0.1% of BP
        return basicPay + da + hra + pf - staffClubFund; // Gross Salary
    }

    // Method to generate pay slip
    public void generatePaySlip() {
        double grossSalary = calculateGrossSalary();
        System.out.println("Pay Slip for " + empName + " (ID: " + empId + ")");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("--------------------------------------------------");
    }
}

// Subclass for Programmer
class Programmer extends Employee {
    public Programmer(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Subclass for Team Lead
class TeamLead extends Employee {
    public TeamLead(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Subclass for Assistant Project Manager
class AssistantProjectManager extends Employee {
    public AssistantProjectManager(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Subclass for Project Manager
class ProjectManager extends Employee {
    public ProjectManager(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Test class to demonstrate the implementation
public class EmployeeTest {
    public static void main(String[] args) {
        Employee programmer = new Programmer("Alice", "P001", "123 Main St", "alice@example.com", "1234567890", 50000);
        Employee teamLead = new TeamLead("Bob", "T001", "456 Elm St", "bob@example.com", "0987654321", 70000);
        Employee apm = new AssistantProjectManager("Charlie", "APM001", "789 Oak St", "charlie@example.com", "1122334455", 60000);
        Employee pm = new ProjectManager("Diana", "PM001", "321 Pine St", "diana@example.com", "5566778899", 90000);

        programmer.generatePaySlip();
        teamLead.generatePaySlip();
        apm.generatePaySlip();
        pm.generatePaySlip();
    }
}