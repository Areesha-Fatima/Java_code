
package vehiclee;

public class car implements vehicle{
    int speed;
    int gear;
    
    public void changegear(int gear){
        this.gear= gear;
     
    public void speedUp(int increment){
          
        speed = speed + increment;
    }
      
    public void applyBrakes(int decrement){
          
        speed = speed - decrement;
    }
}

