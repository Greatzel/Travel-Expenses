import java.util.Scanner;

public class Hwk1Travel_UnabiaGreatzel
  
{
  
  public static void main (String [] args)
    
  {
    
    Scanner input = new Scanner(System.in);
    
      System.out.println("Enter Total Proposed Budget: ");
    
         double totalPBudget = input.nextDouble();
    
    System.out.println("Enter distance of travel in Miles: ");
    
           double totalMiles = input.nextDouble();
           
           
           
    double hotelBudget = 325;
    double perMile = 0.50;  
    
      
      double costMiles = totalMiles * .50;
      
           double totalTravelCost = costMiles + hotelBudget;
           
           
           
    double totalPBRemain = totalPBudget - hotelBudget;
    double maxMiles = totalPBRemain / perMile;
      
      
      
     if (totalTravelCost <= totalPBudget)
       System.out.print ("Budget Approved!");
     
     if (totalTravelCost > totalPBudget)
       System.out.print (" Error. Total miles travelled exceeds total proposed budget. Maximum miles travelled with remaining budget will only be "+ maxMiles + " miles instead of "+ totalMiles + "miles.");
    
      
    input.close();
    
  }
}