import java.util.Scanner;
import java.util.ArrayList;

public class TicketPlanDemo{
   public static void main(String[] args) {
      // declaring relevant variables
      Scanner scan = new Scanner(System.in);
      ArrayList<TicketPlan> ticketPlans = new ArrayList<TicketPlan>();
      int arrayIndex = 0;
      boolean continueEntering = true;
      String familyLastName;
      int ticketPlanType;
      int numChildren;
      int numAdults;
      int numDays;
      double mostExpensive = 0;
      String nameOfMostExpensive = " ";
      double holder1;
      double holder2;
      String yesOrNo;
      
      //creating loop which user can choose whether or not to continue entering in data
      
      while( continueEntering == true){
      // asking users to enter in relevant data
         System.out.println("Enter the last name of the family purchasing the plan:");
         familyLastName = scan.next();
         System.out.println("    1. Amusement Park Only");
         System.out.println("    2. Water Park Only");
         System.out.println("    3. Both Parks");
         System.out.println("Select a Ticket plan from the menu above: ");
         ticketPlanType = scan.nextInt();
         // weeding out invalid input for ticket type
         while(ticketPlanType < 1 || ticketPlanType > 3){
            System.out.println("ERROR: Incorrect ticket plan type. Enter a correct value (1,2, or 3)");
               ticketPlanType = scan.nextInt();
            }
  
         System.out.println("Enter the number of adults on the ticket plan: ");
         numAdults = scan.nextInt();
         
         //catching out of scope entries for number of adults
         while(numAdults < 1){
            System.out.println("ERROR: Must have at least one adult present. Try again.");
            numAdults = scan.nextInt();
            }
         System.out.println("Enter the number of children on the ticket plan: ");
         numChildren = scan.nextInt();
            while(numChildren < 0){
            System.out.println("ERROR: Invalid number of children. Try again.");
            numChildren = scan.nextInt();
            }
         System.out.println("Enter the number of days the ticket plan covers: ");
         numDays = scan.nextInt();
         
         //catching out of scope enteries for number of days
         while(numDays < 1){
            System.out.println("ERROR: Stay duration must be at least one day. Try again.");
            numDays = scan.nextInt();
            }
            // adding collected data to array
         ticketPlans.add(new TicketPlan(familyLastName, ticketPlanType, numAdults, numChildren, numDays));
         // asking if user wishes to continue
         System.out.print("Do you wish to enter information for another ticket plan (Y/N)?");
         yesOrNo = scan.next();
         while(!(yesOrNo.equalsIgnoreCase("y")) && !(yesOrNo.equalsIgnoreCase("n"))){
            System.out.println("Invalid input. Enter 'Y' or 'N'");
            yesOrNo = scan.nextLine();
        }
        if (yesOrNo.equalsIgnoreCase("n")){
            continueEntering = false;
            }
        if (yesOrNo.equalsIgnoreCase("y")){
            arrayIndex++;
            }
           
       }
       //printing out entered data
       System.out.println(" ");
       System.out.println("Ticket Plan Report");
       System.out.println(" ");
       
       //for loop to output data for each index of array ticketPlans
       for(int i = 0; i < ticketPlans.size(); i++){
       
         System.out.println("Last name: " + ticketPlans.get(i).getLastName());
         System.out.println("Ticket Plan type: " + ticketPlans.get(i).getType());
         System.out.println("Number of Adults: " + ticketPlans.get(i).getNumberAdults());
         System.out.println("Number of Children: " + ticketPlans.get(i).getNumberChildren());
         System.out.println("Number of Days " + ticketPlans.get(i).getNumberDays());
         ticketPlans.get(i).getCostPerDayChild();
         ticketPlans.get(i).getCostPerDayAdult();
         System.out.println("Price of Ticket Plan " + ticketPlans.get(i).getPlanPrice());
         System.out.println(" ");
         // if loop to determine the family with the most expensive plan
         if(ticketPlans.get(i).getPlanPrice() > mostExpensive){
            mostExpensive = ticketPlans.get(i).getPlanPrice();
            nameOfMostExpensive = ticketPlans.get(i).getLastName(); 
         }
         }
         //outputting name of family w/ most expensive plan
         System.out.println("Name of family that purchased most expensive plan: " + nameOfMostExpensive);
   
   }
}
