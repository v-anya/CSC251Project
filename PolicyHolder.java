public class PolicyHolder
{
   private String firstName,    //policy holder's first name
                  lastName,     // policy holder's last name
                  smokingStatus; //policy holder's smoking status
   private double age,           //policy holder's age
                  height,        //policy holder's height in inches
                  weight;        // policy holder's weight in pounds
   
   /**Constructor no args*/
   
   public PolicyHolder()
   {
      firstName = "0";           // initializing all
      lastName = "0";            //   the variables
      smokingStatus = "0";
      age = 0;
      height = 0;
      weight = 0;
   }
   
   /**Constructor
   @param fname the value sent to become the policy holder's first name
   @param lname the value sent to become the policy holder's last name
   @param status the value sent to become the policy holder's smoking status
   @param years the value sent to become the policy holder's age
   @param inches the value sent to become the policy holder's height in inches
   @param pounds the value sent to become the policy holder's weight in pounds*/
   
   public PolicyHolder(String fname, String lname, String status, double years, double inches, double pounds)
   {
      firstName = fname;           // assigning values to
      lastName = lname;            //   the variables
      smokingStatus = status;
      age = years;
      height = inches;
      weight = pounds;
   }
   
   /**Copy Constructor
   @param object a policyholder object to copy*/
   
   public PolicyHolder(PolicyHolder object)
   {
      firstName = object.getFirstName();           // copying values to
      lastName = object.getLastName();            //  the variables
      smokingStatus = object.getSmokingStatus();
      age = object.getAge();
      height = object.getHeight();
      weight = object.getWeight();
   }
   
   /**toString method
   @return a String with the policyholder's first name, last name, smoking status, age, height and weight*/
   
   public String toString()
   {
      //create string describing the object
      String text = String.format("Policyholder's First Name: %s \nPolicyholder's Last Name: %s \nPolicyholder's Age: %.0f \nPolicyholder's Smoking Status (Y/N): %s \nPolicyholder's Height: %.1f inches \nPolicyholder's Weight: %.1f pounds \nPolicyholder's BMI: %.2f",
                                   firstName, lastName, age, smokingStatus, height, weight, getBmi());
      
                    
      return text; //return the formatted string
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

}