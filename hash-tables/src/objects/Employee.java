package objects;

public class Employee {
    private int empId;
    private String name;
    private String position;
    private double salary;

    public Employee(int empId, String name, String position, double salary) {
        this.empId = empId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        //can't be null
        if (obj == null) return false;
        //must be the same class
        else if (!obj.getClass().equals(this.getClass())) return false;

        //what do I know about obj?
        Employee other = (Employee)obj;

        //compare employees
        return this.name.equals(other.name);
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
