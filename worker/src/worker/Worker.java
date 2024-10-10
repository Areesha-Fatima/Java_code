package worker;

public class Worker {
String name;
int working_hours;

  public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    
      public int getworking_hours()
    {
        return  working_hours;
    }
    public void setworking_hours(int  working_hours)
    {
        this. working_hours =  working_hours;
    } 
    
    public static void main(String[] args) {
        
    employee e =new employee();
    e.setname_of_departement("BUSSINESS");
    System.out.println("Name of departement :" + e.getname_of_departement());
    
   e.setsalary(20000);
   System.out.println("Salary is :" + e.getsalary());
   
  manager m=new manager();
    m.setno_of_employees(10);
    System.out.println("No. of Employees :" +m.getno_of_employees());
    
  m.setno_of_projects(5);
   System.out.println("No. of Projects :" +m.getno_of_projects()); 
    }   
}

