public class Policy
{
   /**The policy class processes insurance information for one person*/
   
  private String policyNumber, //policy number
                 provider,     //name of the provider
                 firstName,    //policy holder's first name
                 lastName,     // policy holder's last name
                 smokingStatus; //policy holder's smoking status
  private double age,           //policy holder's age
                 height,        //policy holder's height in inches
                 weight;        // policy holder's weight in pounds
   
  /**Constructor*/
  
  public Policy()
  {
      policyNumber = "0";
      provider = "0";
      firstName = "0";           // initializing all
      lastName = "0";            //   the variables
      smokingStatus = "0";
      age = 0;
      height = 0;
      weight = 0;
 
  }
  
  
  /**Constructor
  @param number the value sent to become the policy number
  @param name the value sent to become the name of the provider
  @param fname the value sent to become the policy holder's first name
  @param lname the value sent to become the policy holder's last name
  @param status the value sent to become the policy holder's smoking status
  @param years the value sent to become the policy holder's age
  @param inches the value sent to become the policy holder's height in inches
  @param pounds the value sent to become the policy holder's weight in pounds*/
  
  public Policy(String number, String name, String fname, String lname, String status, double years, double inches, double pounds)
  {
  
      policyNumber = number;
      provider = name;
      firstName = fname;           // assigning values to
      lastName = lname;            //   the variables
      smokingStatus = status;
      age = years;
      height = inches;
      weight = pounds;
      
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
   
  /**The setFirstName method assigns a value to the firstName variable
  @param name the value sent to become the policy holder's first name*/
  
  public void setFirstName(String name)
  {
      firstName = name;
  }
     
  /**The setLastName method assigns a value to the lastName variable
  @param name the value sent to become the policy holder's last name*/
  
  public void setLastName(String name)
  {
      lastName = name;
  }
     
  /**The setSmokingStatus method assigns a value to the smokingStatus variable
  @param status the value sent to become the policy holder's smoking status*/
  
  public void setSmokingStatus(String status)
  {
      smokingStatus = status;
  }
  
  /**The setAge method assigns a value to the age variable
  @param years the value sent to become the policy holder's age*/
  
  public void setAge(double years)
  {
      age = years;
  }
  
  /**The setHeight method assigns a value to the height variable
  @param inches the value sent to become the policy holder's height in inches*/
  
  public void setHeight(double inches)
  {
      height = inches;
  }
  
  /**The setWeight method assigns a value to the weight variable
  @param pounds the value sent to become the policy holder's weight in pounds*/
  
  public void setWeight(double pounds)
  {
      weight = pounds;
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
   
  /**The getFirstName method returns the value of the firstName variable
  @return the policy holder's first name*/
  
  public String getFirstName()
  {
      return firstName;
  }
     
  /**The getLastName method returns the value of the lastName variable
  @return the policy holder's last name*/
  
  public String getLastName()
  {
      return lastName;
  }
     
  /**The getSmokingStatus method returns the value of the smokingStatus variable
  @return the policy holder's smoking status*/
  
  public String getSmokingStatus()
  {
      return smokingStatus;
  }
  
  /**The getAge method returns the value of the age variable
  @return the policy holder's age*/
  
  public double getAge()
  {
      return age;
  }
  
  /**The getHeight method returns the value of the height variable
  @return the policy holder's height in inches*/
  
  public double getHeight()
  {
      return height;
  }
  
  /**The getWeight method returns the value of the weight variable
  @return the policy holder's weight in pounds*/
  
  public double getWeight()
  {
      return weight;
  }
  
  /**The getBmi method calculates and returns the policy holder's BMI
  @return the policy holder's BMI*/
  
  public double getBmi()
  {
      return (weight * 703 ) / (height * height); //BMI formula
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