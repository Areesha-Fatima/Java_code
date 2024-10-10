
package vehiclee;

public class Vehiclee {

    public static void main(String[] args) {
     bicycle b1 = new bicycle();
        b1.changeGear(2);
        b1.speedUp(3);
        b1.applyBrakes(1);
          
        System.out.println("Bicycle present state :");
        b1.printStates();
          
        bike b = new bike();
        b.changeGear(1);
        b.speedUp(4);
        b.applyBrakes(3);
          
        System.out.println("Bike present state :");
        b.printStates();
    }
    }
    

