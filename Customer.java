package cinemabooking;
import javax.swing.JOptionPane;
/**
 *
 * @author kaltham mohsen
 */
public class Customer {
    //fields
    public String firstName;// The person's first name.
    public String lastName;// The person's last name.
    private String phoneNumber;// The person's phone number.
    private String email;// The person's email address.
    
    //methods
    //no-arg Constructor
    public Customer( ){
        firstName = " ";
        lastName = " ";
        phoneNumber = "+966";
        email = " ";
    }
    
    /**
      Constructor
      @param firstName The person's first name.
      @param lastName The person's last name.
      @param phoneNumber The person's phone number.
      @param email The person's email address.
   */
    public Customer(String firstName, String lastName, String phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public void setPhoneNumber(String phNo){
        phoneNumber = phNo;
    }// End setPhoneNumber method.
    
    public void setEmail(String e){
        email = e;
    }// End setEmail method.
    
    public String getPhoneNumber( ){
        return phoneNumber;
    }// End getPhoneNumber method.
    
    public String getEmail( ){
        return email;
    }// End getEmail method.
    
    /**
     * The toString method.
     * @return Information about the person.
     */
    public String toString( ){
        return ("Name: " + firstName + " " + lastName + 
                "\nMobile phone: +966" + phoneNumber + "\nEmail: " + email);
    }// End toString method.

}
