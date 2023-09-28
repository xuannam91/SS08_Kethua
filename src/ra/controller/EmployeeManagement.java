package ra.controller;

import ra.entity.Developer;
import ra.entity.Employee;
import ra.entity.SaleEmployee;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee employee = new SaleEmployee(2,"Minh", 15, "english");
        Employee employee1 = new Developer(1, "nam", 20, "java");

        employee.chamCong();
        employee.work();
        employee1.chamCong();
        employee1.work();

        doing(employee);
        doing(employee1);
    }
    public static void doing(Employee employee){
        if(employee instanceof Developer){
            ((Developer) employee).fixBug();
        } else if (employee instanceof SaleEmployee) {
            ((SaleEmployee) employee).sale();
        }
    }
}

