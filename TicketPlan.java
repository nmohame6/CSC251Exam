public class TicketPlan{

   //fields for TicketPlan class
   private String lastname;
   private int type;
   private int adults;
   private int children;
   private int days;
   private String parkType;
   public double costPerDayChild;
   public double costPerDayAdult;
   
   //no argument constructor 
   public TicketPlan(){
         lastname = "";
         type = 0;
         adults = 0;
         children = 0;
         days = 0;
   }
   
   //constructor accepting arguments for each field
   public TicketPlan(String l, int t, int a, int c, int d){
         lastname = l;
         type = t;
         adults = a;
         children = c;
         days = d;
   }
   
   //mutator methods
   
   //sets the last name with parameter l representing lastname
   public void setLastName(String l){
         lastname = l;
    }
   
   //sets type of ticket plan with parameter t representing ticket type
   public void setType(int t){
         type = t;
    }
   
   //sets amount of adults with parameter a representing number of adults on the plan
   public void setNumberAdults(int a){
         adults = a;
    }
    
  //sets amount of children with parameter c representing number of children on the plan
   public void setNumberChildren(int c){
         children = c;
    }
    
  //sets number of days with parameter d representing the number of days the ticket plan covers
   public void setNumberDays(int d){
         days = d;
    }
    
  // accessor methods
    
  //The getLastName method returns last name with parameter l representing last name  
    public String getLastName(){
         return lastname;
    }
    
 //The getType method returns type of plan with parameter t representing plan type  
   public String getType(){
        
         if ( type == 1){
            parkType = "Amusement Park Only";
            }
         if ( type == 2){
            parkType = "Water Park Only";
            }
         if ( type ==3 ) {
            parkType =  "Both Parks";
            }
           return parkType;
    }
    
 //The getNumberAdults method returns amount of adults on plan with parameter a representing number of adults 
   public int getNumberAdults(){
         return adults;
    }
    
 //The getNumberChildren method returns amount of children on plan with parameter c representing number of children    
   public int getNumberChildren(){
         return children;
    }
    
 //The getNumberDays method returns number of days with parameter d representing length of plan in days
   public int getNumberDays(){
         return days;
    }
    
    
 //Other relevant methods
   public double getCostPerDayAdult(){
      if (days<=4){
         if (type ==1){
            costPerDayAdult = 104.99;
            }
         if (type == 2) {
            costPerDayAdult = 84.99;
            }
         if (type == 3) {
            costPerDayAdult = 169.99;
            }
         }
      else if( days > 4){
         if (type ==1){
            costPerDayAdult = 94.99;
            }
         if (type == 2) {
            costPerDayAdult = 79.99;
            }
         if (type == 3) {
            costPerDayAdult = 149.99;
            }
         }
         
      return costPerDayAdult;
   }
   
   public double getCostPerDayChild(){
      if (children<=2){
         if (type ==1){
            costPerDayChild = 52.49;
            }
         if (type == 2) {
            costPerDayChild = 42.49;
            }
         if (type == 3) {
            costPerDayChild = 84.99;
            }
         }
      else if( children > 2){
         if (type ==1){
            costPerDayChild = 47.49;
            }
         if (type == 2) {
            costPerDayChild = 39.99;
            }
         if (type == 3) {
            costPerDayChild = 74.99;
            }
         }
         
      return costPerDayChild;
   }
   
   public double getPlanPrice(){
      double price = (costPerDayChild*days)+ (costPerDayAdult * days);
      return price;
      }
    
} //End of class
    
