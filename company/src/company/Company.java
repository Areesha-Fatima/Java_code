
package company;

import company.worker.worker;
import company.department.department;
import company.employee.employee;
import company.manager.manager;
import company.project.project;

public class Company {

    public static void main(String[] args) {
        System.out.println("*****COMPANY*****");
        System.out.println();
        System.out.println("---WORKER---");
    worker w = new worker();
    w.workinghours(10);
    w.totalworker(20);
    System.out.println();
    System.out.println("---DEPARTMENT---");
    department d = new department();
    d.nodep(3);
    d.dep("BUSSINESS");
    d.dep("COMPUTER SCIENTIST");
    d.dep("ACCUNTANT");
    d.noofemp(50);
    System.out.println();
    System.out.println("---EMPLOYEE---");
    employee e = new employee();
    e.name("M. USMAN");
    e.id(12345);
    e.nameofdep("ACCOUNTANT");
    e.salary(50000);
    System.out.println();
    System.out.println("---MANAGER---");
    manager m = new manager();
    m.name("ALI KHAN");
    m.dep("BUSSINESS");
    m.noofemp(12);
    m.noofpro(03);
    System.out.println();
    System.out.println("---PROJECT---");
    project p = new project();
    p.nameofpro("COMPUTER SCIENTIST");
    p.cp("100%");
    p.rem("NO");
    }
    
}
