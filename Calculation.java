package cinemabooking;
import javax.swing.JOptionPane;
/**
 *
 * @author kaltham mohsen
 */
public class Calculation {
    //fields
    private double calculation;// Calculate the comprehensive cost of the booking.
    public Movie movie;
    
    //methods
    //no-arg Constructor
    public Calculation( ){
        calculation = 0;
        movie = null;
    }
    
    /**
     * Constructor
     * @param calculation The comprehensive cost of the booking.
     * @param movie 
     */
    public Calculation(double calculation, Movie movie){
        this.calculation = calculation;
        this.movie = movie;
    }// End Calculation method.
    
    public void setCalculation(double c){
        calculation = c;
    }// End setCalculation method.
    
    public double getCalculation( ){
        return calculation;
    }// End getCalculation method.
    
    /**
     * The toString method.
     * @return Information about the calculation.
     */
    public String toString( ){
        return ("ORDER TOTAL: " + calculation + " SAR\n\n");
    }// End toString method.
}
