class Employee {
    int id;
    int salary;

    Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    String getInfo() {
        return "EmployeeID:" + id + " Salary:" + salary;
    }
}

class SalesEmployee extends Employee {
    int sales = 0;

    SalesEmployee(int id, int salary, int sales) {
        super(id, salary);
        this.sales = sales;
    }

    @Override
    String getInfo() {
        return "EmployeeID:" + id + " Salary:" + salary + " Sales:" + sales;
    }
}