
package worker;

public class project extends Worker{
       String name_of_project  ;
  double current_progress  ;
  
   public String getname_of_project()
    {
        return name_of_project;
    }
    public void setname_of_project(String name_of_project)
    {
        this.name_of_project=name_of_project;
    }
    
      public double getcurrent_progress ()
    {
        return current_progress ;
    }
    public void setcurrent_progress (double current_progress )
    {
        this.current_progress  = current_progress ;
    }

}
