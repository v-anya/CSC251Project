public class Policy
{
   /**The policy class processes insurance information for one person*/
   
  private static int count = 0; //counter for policy classes created
  
  private String policyNumber, //policy number
                 provider;     //name of the provider
                 
  private PolicyHolder holder; //object for the policyholder
                 
   
  /**Constructor*/
  
  public Policy()
  {
      //initializing variables
      policyNumber = "0";
      provider = "0";
      holder = new PolicyHolder();
      
      count++; //update count
 
  }
  
  
  /**Constructor
  @param number the value sent to become the policy number
  @param name the value sent to become the name of the provider
  @param client a PolicyHolder object*/
  
  public Policy(String number, String name, PolicyHolder client)
  {
      //assigning values to the variables
      policyNumber = number;
      provider = name;
      holder = new PolicyHolder(client);
      count++; //update count      
  }
  
  /**The getCount method will return the number of instance of the class
  @return number of Policies*/
  public int getCount()
  {
      return count;
  }
  
  /**toString method
  @return A string with the policy information*/
  
  public String toString()
  {
      //string describing the object
      String text = String.format("Policy Number: %s \nProvider Name: %s \n%s \nPolicy Price: $%.2f",
                                   policyNumber, provider, holder, getPrice());
                    
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
  
  /**The setHolder methods stores a reference to a copy of the PolicyHolder object it receives
  @param client the PolicyHolder object with the information*/
  
  public void setHolder(PolicyHolder client)
  {
      holder = new PolicyHolder(client);
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
  
  /**The getHolder method will return a reference to a copy of the policyholder objecy
  @return reference to a copy of the holder*/
  
  public PolicyHolder getHolder()
  {
      return new PolicyHolder(holder); //return copy
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
      
      if (holder.getAge() > AGE_LIMIT) // adding fee for old age
         price += AGE_FEE;
      
      if (holder.getSmokingStatus().equals("smoker")) //adding fee for smoking
         price += SMOKING_FEE;
      
      if (holder.getBmi() > BMI_LIMIT) //adding fee for high BMI
         price += ((holder.getBmi() - BMI_LIMIT) * FEE_PER_BMI); //formula to calculate extra fee
         
      return price;
         
  }
}  