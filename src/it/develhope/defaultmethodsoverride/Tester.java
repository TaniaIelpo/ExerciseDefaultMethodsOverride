package it.develhope.defaultmethodsoverride;

/**
 * Test
 * @author Tania Ielpo
 */

public class Tester {

    public static void main(String[] args) throws CloneNotSupportedException {

        //Creation of 4 elements SmartphonePrice type
        SmartphonePrice producer1 = new SmartphonePrice("Producer", 301.6);
        SmartphonePrice producer2 = new SmartphonePrice("Producer", 370.25);
        SmartphonePrice retail1 = new SmartphonePrice("Retail", 724.99);
        SmartphonePrice retail2= new SmartphonePrice("Retail", 998.99);

        //Creation of 4 elements Smartphone type
        Smartphone smartPhone1=new Smartphone("Samsung","Galaxy S8", 3500, producer1,retail1);
        Smartphone smartPhone2= new Smartphone("iPhone", "iPhone X", 2716, producer2, retail2);

        //print Smartphone details
        System.out.println(smartPhone1);
        System.out.println(smartPhone2);

        //comparison between the two smartphone created
        boolean eq= smartPhone1.equals(smartPhone2);

        //print the comparison
        System.out.println("Are the two products the same? "+eq);

        //cloning the second smartphone
        try{
            Smartphone smartphone2Cloned=smartPhone2.clone();
            System.out.println(smartphone2Cloned);
            System.out.println("Is the cloned product the same as the original? "+smartPhone2.equals(smartphone2Cloned));

        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
            System.out.println(e);
         }
    }
}
