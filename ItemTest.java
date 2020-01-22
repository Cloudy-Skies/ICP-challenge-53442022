
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richard
 */
import java.util.Scanner;

/**
 * A class to test thet item.java file
 */
public class ItemTest {
    /**
     *
     * @param args
     */
    public static void main (String args[]){
        Calendar cal = Calendar.getInstance();
        
        long startTime= cal.getTimeInMillis(); // start time
        Item provision = new Item(null, 0, 0); // Item are intialized with a null value so that it may be recognized a sthe
        Scanner sc= new Scanner(System.in);
        System.out.println("How many items do you want to add?");
        int num= sc.nextInt();
        for(int i = 0; i<num;i++){
            try{
                System.out.println("Name of item: ");
                String item= sc.next();
                System.out.println("Quantity of item: ");
                int quant= sc.nextInt();
                System.out.println("Price of item");
                double price = sc.nextDouble();
                provision.addItem(item,quant,price);
            }
            //An exception to handle incorrect user input
            catch(Exception e){
                System.out.println("An error occured");
            }
            
        }
        // This value stores the time after the program has run
        Calendar cal2 = Calendar.getInstance();
        
        provision.display();
        long endTime= cal2.getTimeInMillis();// end time
        long runTime= endTime-startTime;// runtimes is deduced via subtraction
        System.out.println("Elasped time: "+ runTime);
        System.out.println("Done");
    }
}
