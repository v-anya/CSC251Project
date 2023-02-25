/**This program will demonstrate the Policy class*/

import java.util.Scanner; //needed to read input

public class Project_anya_vourakis
{
   public static void main (String args[])
   {
      Scanner keyboard = new Scanner(System.in); //creating a Scanner object to read input
      
      String policyNumber, //policy number
             provider,     //name of the provider
             firstName,    //policy holder's first name
             lastName,     // policy holder's last name
             smokingStatus; //policy holder's smoking status
             
      double age,           //policy holder's age
             height,        //policy holder's height in inches
             weight;        // policy holder's weight in pounds
                 
      System.out.print("Please enter the Policy Number: "); //getting policy number
      policyNumber = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Provider Name: "); //getting provider name
      provider = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's First Name: "); //getting the policyholder's first name
      firstName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Last Name: "); //getting the policyholder's last name
      lastName = keyboard.nextLine();

      System.out.print("\nPlease enter the Policyholder's Age: "); //getting the policyholder's age
      age = keyboard.nextDouble();
      
      keyboard.nextLine(); //clearing the enter
      
      System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): "); //getting the policyholder's smoking status
      smokingStatus = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Height (in inches): "); //getting the policyholder's height
      height  = keyboard.nextDouble();
      
      System.out.print("\nPlease enter the Policyholder's Weight (in pounds): "); //getting the policyholder's weight
      weight  = keyboard.nextDouble();
      
      Policy insurancePolicy = new Policy(policyNumber, provider, firstName, lastName, smokingStatus, age, height, weight); //creating Policy object
      
      //displaying information using the object's methods
      
      System.out.println("\nPolicy Number :" + insurancePolicy.getPolicyNumber());
      System.out.println("Provider Name :" + insurancePolicy.getProvider());
      System.out.println("Policyholder's First Name: " + insurancePolicy.getFirstName());
      System.out.println("Policyholder's Last Name: " + insurancePolicy.getLastName());
      System.out.printf("Policyholder's Age: %.0f", insurancePolicy.getAge());
      System.out.println("\nPolicyholder's Smoking Status: " + insurancePolicy.getSmokingStatus());
      System.out.printf("Policyholder's Height: %.1f inches", insurancePolicy.getHeight());
      System.out.printf("\nPolicyholder's Weight: %.1f pounds", insurancePolicy.getWeight());
      System.out.printf("\nPolicyholder's BMI: %.2f", insurancePolicy.getBmi());
      System.out.printf("\nPolicy Price: $%.2f", insurancePolicy.getPrice());
      
   }
}
