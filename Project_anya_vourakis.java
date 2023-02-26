/**This program will demonstrate the Policy class*/

import java.util.Scanner; //needed to read input
import java.io.*; //for files
import java.util.ArrayList; //to use ArrayList

public class Project_anya_vourakis
{
   public static void main (String args[]) throws IOException
   {
      
      ArrayList<Policy> policyArray = new ArrayList<>; //create array list for policy objects
      
      File policies = new File("PolicyInformation.txt"); //"open" the file
      
      if (!policies.exists) //checking that the file exists
      {
         System.out.println("The file does not exist. Program terminated.");
         System.exit(0);
      }
      
      Scanner fileReader = new Scanner(policies); //scanner for input file
      
      String policyNumber, //policy number
             provider,     //name of the provider
             firstName,    //policy holder's first name
             lastName,     // policy holder's last name
             smokingStatus; //policy holder's smoking status
             
      double age,           //policy holder's age
             height,        //policy holder's height in inches
             weight;        // policy holder's weight in pounds
      
      while (fileReader.hasNext()) //loop while there is data to read
      {
      
      //read and assign data from file
      policyNumber = fileReader.nextLine();
      provider = fileReader.nextLine();
      firstName = fileReader.nextLine();
      lastName = fileReader.lastName();
      age = fileReader.nextDouble();
      fileReader.nextLine(); //clear buffer
      smokingStatus = fileReader.nextLine();
      height = fileReader.nextDouble();
      weight = fileReader.nextDouble();
      if (fileReader.hasNext) //making sure there are more lines before
         fileReader.nextLine(); //clear buffer
      if (fileReader.hasNext) //making sure there are more lines before
         fileReader.nextLine(); //skip blank line
       
      //create policy object in the array with the information  
      policyArray.add(policyNumber, provider, firstName, lastName, smokingStatus, age, height, weight);
      }
                 
      
      
      Policy insurancePolicy = new Policy(policyNumber, provider, firstName, lastName, smokingStatus, age, height, weight); //creating Policy object
      
      //displaying information using the object's methods
      
      System.out.println("\nPolicy Number :" + insurancePolicy.getPolicyNumber());
      System.out.println("Provider Name :" + insurancePolicy.getProvider());
      System.out.println("Policyholder's First Name: " + insurancePolicy.getFirstName());
      System.out.println("Policyholder's Last Name: " + insurancePolicy.getLastName());
      System.out.println("Policyholder's Age: " + insurancePolicy.getAge());
      System.out.println("Policyholder's Smoking Status: " + insurancePolicy.getSmokingStatus());
      System.out.printf("Policyholder's Height: %.1f inches", insurancePolicy.getHeight());
      System.out.printf("\nPolicyholder's Weight: %.1f pounds", insurancePolicy.getWeight());
      System.out.printf("\nPolicyholder's BMI: %.2f", insurancePolicy.getBmi());
      System.out.printf("\nPolicy Price: $%.2f", insurancePolicy.getPrice());
      */
   }
}
