
package mobileapp;

public class Mobileapp {

    public static void main(String[] args) {
            System.out.println("---IPHONE MOBILE---");
    iphonedetail i = new iphonedetail();
    i.model();
    i.price();
    i.color();
    i.lauchdate();
    System.out.println();
    System.out.println("---SAMSUNG MOBILE---");
    samsungdetail s = new samsungdetail();
    s.model();
    s.price();
    s.color();
    s.lauchdate();
    System.out.println();
    System.out.println("---REDMI MOBILE---");
    redmidetail r = new redmidetail();
    r.model();
    r.price();
    r.color();
    r.lauchdate();
     System.out.println();
    System.out.println("---TOTAL SELLING OF MOBILES---");
    sellingdetail sd = new sellingdetail();
    sd.iphone(60000);
    sd.samsung(50900);
    sd.redmi(10070);
    }
    
}
