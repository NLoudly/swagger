package com.yungu.demo.entity;

public class Employee {

    private  Integer id;
    private  String name;
    private  Double salary;
    private  Integer age;
    private  Integer comid;

    public Employee(){}

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getComid() {
        return comid;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", comid=" + comid +
                '}';
    }
}
