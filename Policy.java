import java.util.*;

class Policy{
   private int polnumber;
   private String provname;
   private String polfirst;
   private String pollast;
   private int polage;
   private boolean smokestat;
   private double polheight;
   private double polweight;
   private double calcBMI;
   private double calcInsuranceNumber= 600.00;
   private double addFee = 0;

public Policy(int polnumber, String provname, String polfirst, String pollast, int polage, boolean smokestat, double polheight, double polweight){
   this.polnumber = polnumber;
   this.provname = provname;
   this.polfirst = polfirst;
   this.pollast = pollast;
   this.polage = polage;
   this.smokestat = smokestat;
   this.polheight = polheight;
   this.polweight = polweight;
   }
   
public void setPolNumber(int polnumber){
   this.polnumber = polnumber;
   }
public void setProvName(String provname){
   this.provname = provname;
   }
public void setPolFirst(String polfirst){
   this.polfirst = polfirst;
   }
public void setPolLast(String pollast){
   this.pollast = pollast;
   }
public void setPolAge(int polage){
   this.polage = polage;
   }
public void setSmokeStat(boolean smokestat){
   this.smokestat = smokestat;
   }
public void setPolHeight( double polheight){
   this.polheight = polheight;
   }
public void setPolWeight(double polweight){
   this.polweight = polweight;
   }
public double calculateBMI(){
   calcBMI = (polweight * 703)/ (polheight*polheight);
   return calcBMI;
   }
public double calculateInsurancePolicy(){
   if(polage >=50){
      addFee +=75;
   }
   if(smokestat){
      addFee +=100;
   }
   if(calcBMI >= 35){
     addFee += ((calcBMI - 35)*20);
   }
   calcInsuranceNumber += addFee;
   return calcInsuranceNumber;
}
  
public int getPolNumber(){
   return polnumber;
   }
public String getProvName(){
   return provname;
   }
public String getPolFirst(){
   return polfirst;
   }
public String getPolLast(){
   return pollast;
   }
public int getPolAge(){
   return polage;
   }
public boolean getSmokeStat(){
   return smokestat;
   }
public double getPolHeight(){
   return polheight;
   }
public double getPolWeight(){
   return polweight;
   }

public static void main(String[] args){
   int policyNumber;
   String providerName;
   String policyFirstName;
   String policyLastName;
   int policyAge;
   String policySmoker;
   boolean polSmoker;
   double policyWeight;
   double policyHeight;
   
   Scanner userInput = new Scanner(System.in);
   System.out.println("Please enter the Provider Name: ");
   providerName = userInput.nextLine();
   System.out.println("Please enter the Policy Number: ");
   policyNumber = userInput.nextInt();
   System.out.println("Please enter the Policyholder's age: ");
   policyAge = userInput.nextInt();
   System.out.println("Please enter the Policyholder's First Name: " );
   policyFirstName = userInput.next();
   System.out.println("Please enter the Policyholder's Last Name: " );
   policyLastName = userInput.next();
   System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
   policySmoker = userInput.next();
   if(policySmoker == "smoker"){
      polSmoker = true;
      }
   else{
      polSmoker =false;
      }
   System.out.println("Please enter the Policyholder's Height (in inches): ");
   policyHeight = userInput.nextDouble();
   System.out.println("Please enter the Policyholder's Weight (in pounds): ");
   policyWeight = userInput.nextDouble();
   Policy newClient = new Policy(policyNumber, providerName, policyFirstName, policyLastName, policyAge, polSmoker, policyHeight, policyWeight);
   newClient.calculateBMI();
   newClient.calculateInsurancePolicy();
   System.out.println("Policy Number: " + policyNumber);
   System.out.println("Provider Name: " + providerName);
   System.out.println("Policyholder's First Name: " + policyFirstName);
   System.out.println("Policyholder's Last Name: " + policyLastName);
   System.out.println("Policyholder's Age: " + policyAge);
   System.out.println("Policyholder's Smoking Status: " + polSmoker); 
   System.out.println("Policyholder's Weight: " + policyWeight);
   System.out.println("Policyholder's Height: " + policyHeight);
   System.out.println("Policyholder's BMI: " + newClient.calculateBMI());
   System.out.println("Policy Price: $" + newClient.calculateInsurancePolicy());
   

}
}