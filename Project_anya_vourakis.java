/**This program will demonstrate the Policy class*/

import java.util.Scanner; //needed to read input
import java.io.*; //for files
import java.util.ArrayList; //to use ArrayList

public class Project_anya_vourakis
{
   public static void main (String args[]) throws IOException
   {
      
      ArrayList<Policy> policyArray = new ArrayList<Policy>(); //create array list for policy objects
      
      File policies = new File("PolicyInformation.txt"); //"open" the file
      
      if (!policies.exists()) //checking that the file exists
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
             
      //counter for smokers
      int smokers = 0; 
               
      while (fileReader.hasNext()) //loop while there is data to read
      {
         //read and assign data from file
         policyNumber = fileReader.nextLine();
         provider = fileReader.nextLine();
         firstName = fileReader.nextLine();
         lastName = fileReader.nextLine();
         age = fileReader.nextDouble();
         fileReader.nextLine(); //clear buffer
         smokingStatus = fileReader.nextLine();
         height = fileReader.nextDouble();
         weight = fileReader.nextDouble();
         if (fileReader.hasNext()) //making sure there are more lines before
            fileReader.nextLine(); //clear buffer
         if (fileReader.hasNext()) //making sure there are more lines before
            fileReader.nextLine(); //skip blank line
          
         //create policy holder for the object
         PolicyHolder holder = new PolicyHolder(firstName, lastName, smokingStatus, age, height, weight);
         
         //adjusting smoking counter
         if (holder.getSmokingStatus().equalsIgnoreCase("smoker"))
            smokers++;

         
         //create policy object in the array with the information  
         policyArray.add(new Policy(policyNumber, provider, holder));
      }
      
      
      
      
      for (Policy insurancePolicy : policyArray)
      {
         //print information
         System.out.println(insurancePolicy);
         //blank space before next set
         System.out.println();
         System.out.println();
         
                  
      }          
      
      //display final count
      System.out.println("There were " + policyArray.size() + " Policy objects created.");
      System.out.println("\nThe number of policies with a smoker is: " + smokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyArray.size() - smokers));
      
      
      
   }
}
