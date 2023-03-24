public class Policy
{
   /**The policy class processes insurance information for one person*/
   
  private String policyNumber, //policy number
                 provider;     //name of the provider
                 
   
  /**Constructor*/
  
  public Policy()
  {
      //initializing variables
      policyNumber = "0";
      provider = "0";
 
  }
  
  
  /**Constructor
  @param number the value sent to become the policy number
  @param name the value sent to become the name of the provider*/
  
  public Policy(String number, String name)
  {
      //assigning values to the variables
      policyNumber = number;
      provider = name;
      
  }
  
  /**toString method
  @return A string with the policy information*/
  
  public String toString()
  {
      //string describing the object
      String text = "Policy Number: " + policyNumber +
                    "\nProvider Name: " + provider;
                    
      return text; //return string
  }
  
  /**The setPolicyNumber method assigns a value to the policyNumber variable
  @param number the value sent to become the policy number*/
  
  public void setPolicyNumber(String number)
  {
      policyNumber = number;
  } 
   
  /**The setProvider method assigns a value to the provider variable
  @param name the value sent to become the name of the provider*/
  
  public void setProvider(String name)
  {
     provider = name;
  } 
   
  
  /**The getPolicyNumber method returns the value of the policyNumber variable
  @return the policy number*/
  
  public String getPolicyNumber()
  {
      return policyNumber;
  } 
   
  /**The getProvider method returns the value of the provider variable
  @return the name of the provider*/
  
  public String getProvider()
  {
     return provider;
  } 
   
  
  
  /**The getPrice method calculates the insurance price based the policy holder's information
  @return the insurance price*/
  
  public double getPrice()
  {
      final double BASE_PRICE = 600,
                   SMOKING_FEE = 100,
                   BMI_LIMIT = 35,
                   AGE_LIMIT = 50,
                   AGE_FEE = 75,
                   FEE_PER_BMI = 20;
      
      double price = BASE_PRICE; //starting price is set
      
      if (age > AGE_LIMIT) // adding fee for old age
         price += AGE_FEE;
      
      if (smokingStatus.equals("smoker")) //adding fee for smoking
         price += SMOKING_FEE;
      
      if (getBmi() > BMI_LIMIT) //adding fee for high BMI
         price += ((getBmi() - BMI_LIMIT) * FEE_PER_BMI); //formula to calculate extra fee
         
      return price;
         
  }
}  