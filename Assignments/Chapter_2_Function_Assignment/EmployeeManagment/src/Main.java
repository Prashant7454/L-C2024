class Employee {
    private int id;
    private String name;
    private String department;
    private boolean working;

    public Employee(int id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    public boolean isWorking() {
        return working;
    }

    public void terminate() {
        this.working = false;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
}

class EmployeeDatabase {
    public void saveToDatabase(Employee emp) {
        System.out.println("Saving employee " + emp.getName() + " to database...");
    }
}

class EmployeeReport {
    public void generateXMLReport(Employee emp) {
        System.out.println("<Employee>\n\t<ID>" + emp.getId() + "</ID>\n\t<Name>"
                + emp.getName() + "</Name>\n</Employee>");
    }

    public void generateCSVReport(Employee emp) {
        System.out.println(emp.getId() + "," + emp.getName() + "," + emp.getDepartment());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", "IT", true);
        EmployeeDatabase db = new EmployeeDatabase();
        EmployeeReport report = new EmployeeReport();

        db.saveToDatabase(emp);
        report.generateXMLReport(emp);
        report.generateCSVReport(emp);

        emp.terminate();
        System.out.println("Is working: " + emp.isWorking());
    }
}
