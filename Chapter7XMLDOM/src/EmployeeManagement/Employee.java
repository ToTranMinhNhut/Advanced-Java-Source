/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManagement;

/**
 *
 * @author hv
 */
public class Employee {

    private String id;
    private String name;
    private String sex;
    private String dOb;
    private double salary;
    private String address;
    private String department;

    public Employee(String id, String name, String sex, String dOb, double salary, String address, String department) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dOb = dOb;
        this.salary = salary;
        this.address = address;
        this.department = department;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setdOb(String dOb) {
        this.dOb = dOb;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getdOb() {
        return dOb;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", sex=" + sex + ", dOb=" + dOb + ", salary=" + salary
                + ", address=" + address + ", department=" + department + "]";
    }

    
}
