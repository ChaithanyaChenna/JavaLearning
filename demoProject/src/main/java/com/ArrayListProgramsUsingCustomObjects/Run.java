package com.ArrayListProgramsUsingCustomObjects;

import java.util.ArrayList;
import java.util.List;

public class Run {
     List<Employee> employeeList=new ArrayList<>();
    private void addEmployee(Employee employee)
    {
     employeeList.add(employee);
    }
    private void removeEmployeeById(int id)
    {
        for (Employee employee:employeeList)
        {
            if(employee.getId()==id)
            {
                employeeList.remove(id);
            }

        }


    }
    private void showEmployeeList()
    {
        for (Employee employee:employeeList)
        {
           System.out.println(employee.getId()+" "+ employee.getName()+" "+employee.getSalary());
        }
    }
    private void searchByName(String name){
        for (Employee employee:employeeList) {
            if(employee.getName().equals(name))
            {
                System.out.println("Information for :"+employee.getName());
                System.out.println(employee.getId()+" "+employee.getSalary());
            }

        }

    }
   /* private void updateSalary(int salary)
    {

    }*/
    public static void main(String args[])
    {
        Run run=new Run();
       // List<Employee> employeeList=new ArrayList<>();
        Employee employee1=new Employee("Adithi",1,1000);
        Employee employee2=new Employee("chithra",2,2000);
        Employee employee3=new Employee("sushma",3,3000);
        Employee employee4=new Employee("baby",4,4000);


        run.addEmployee(employee1);
        run.addEmployee(employee2);
        run.addEmployee(employee3);
        run.addEmployee(employee4);
        //System.out.println(employeeList);

        run.showEmployeeList();

        run.removeEmployeeById(3);
        run.showEmployeeList();

        run.searchByName("sushma");
        run.searchByName("chithra");


    }
}
