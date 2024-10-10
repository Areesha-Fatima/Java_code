
package worker;

public class employee extends Worker{
         String name_of_departement ;
   int salary ;
    
    public String getname_of_departement()
    {
        return name_of_departement;
    }
    public void setname_of_departement(String name_of_departement)
    {
        this.name_of_departement=name_of_departement;
    }

    
      public int getsalary()
    {
        return salary;
    }
    public void setsalary(int salary)
    {
        this.salary = salary;
    }

}


