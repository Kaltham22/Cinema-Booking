package cinemabooking;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author kaltham mohsen
 */
public class CinemaBooking {

    public static void main(String[] args) throws IOException{
        String input;// The user input.
        String dayBooking;// The user choose of day.
        String timeBooking;// The user choose of time.
        String movieName;// The user choose of movie.
        int seatNo;// The user choose of seats.
        String food_drinks;// The user choose of food & drinks.
        double total_price;// The total price of entered values.
        int chooseDay;// The person's choose of day.
        int time;// User selectable time to watch movie.
        String firstName;// The person's first name.
        String lastName;// The person's last name.
        String pNO;// The person's phone number.
        String emailAddress;// The person's email.
        final int TAX_RATE = 15;// The tax rate.
        double totalPrice;// Calculate the tax with total price.
        double BookingFee = 5.00;// The price of booking fee.
        double tax = 0.0;// The tax on the total price
        
        //----------------------------------------------------------------------------------------------------
        // First run
        
        JOptionPane.showMessageDialog(null, "WELCOME TO THE CINEMA BOOKING PROGRAM");
        
        // Movie Class
        
        // Create an instance of the Movie class.
        Movie movie1 = new Movie();
        Movie movie2 = new Movie("Fri 09 Apr", "11:15pm", "The Crime Boss", 2, "Caramel popcorn", 231);
        
        // Allow the user to choose the day.
        input = JOptionPane.showInputDialog("CHOOSE DAY\n" + 
                                                "1. Today\n" + 
                                                "2. Tomorrow\n" + 
                                                "3. Mon 05 Apr\n" + 
                                                "4. Tue 06 Apr\n" + 
                                                "5. Wed 07 Apr\n");
        chooseDay = Integer.parseInt(input);
        
        // Allow the user to choose the time to watch movie.
        input = JOptionPane.showInputDialog("CHOOSE TIME\n" + 
                                                "1. 1:15pm\n" + 
                                                "2. 3:45pm\n" + 
                                                "3. 6:15pm\n" + 
                                                "4. 8:45pm\n" +
                                                "5. 11:15pm\n");
        time = Integer.parseInt(input);
        movie1.setDate(chooseDay, time);

        // Instructions for booking at the cinema.
        JOptionPane.showMessageDialog(null, "CONDITIONS OF ACCESS TO THE CINEMA\n" + 
                                            "No one below the age of 18 will be permitted\n" + 
                                            "I understand that seats next to my selected seats\n" + 
                                            "will be left vacant and that i should maintain physical\n" + 
                                            "distancing to protect myself and others.");
        
        // Customer Class
        
        JOptionPane.showMessageDialog(null, "Your movie awaits, just a few details to record your booking.");
        
        // Create an instance of the Customer class.
        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Zainab", "Alshayeb", "536777220", "Z.m.sh1999@gmail.com");
        
        customer1.firstName = JOptionPane.showInputDialog("First Name\n");
        customer1.lastName = JOptionPane.showInputDialog("Last Name\n");
        input = JOptionPane.showInputDialog("Mobile phone (Like this 5***)\n");
        customer1.setPhoneNumber(input);
        input = JOptionPane.showInputDialog("Email\n");
        customer1.setEmail(input);
        
        
        //----------------------------------------------------------------------------------------------------
        // Second run
        // Movie Class
        
        JOptionPane.showMessageDialog(null, "The second run allows the user to enter data and place it in the third object");
        
        // Allow the user to enter values to be used in the third object in the Movie class.
        dayBooking = JOptionPane.showInputDialog("Enter the appropriate day for you for booking at cinema");
        timeBooking = JOptionPane.showInputDialog("Enter the appropriate time for you for booking at cinema");
        movieName = JOptionPane.showInputDialog("Enter the movie name you want to watch it");
        input = JOptionPane.showInputDialog("Enter the number of seats you want to book");
        seatNo = Integer.parseInt(input);
        // Booking for more than ten people are not allowed.
        while(seatNo > 10){
            int i = 0;
            JOptionPane.showMessageDialog(null, "Booking for more than ten people are not allowed.");
            input = JOptionPane.showInputDialog("Enter the number of seats you want to book again");
            seatNo = Integer.parseInt(input);
            ++i;
        }// End while.
        food_drinks = JOptionPane.showInputDialog("Enter the food or drinks you want to order");
        input = JOptionPane.showInputDialog("The total price will be...");
        total_price = Integer.parseInt(input);
        
        // Create an instance of the Movie class, will take values from user.
        Movie movie3 = new Movie(dayBooking, timeBooking, movieName, seatNo, food_drinks, total_price);
      
        // Customer Class
        
        // Allow the user to enter personal data to be used in the third object in the Customer class.
        firstName = JOptionPane.showInputDialog("Enter your first name");
        lastName = JOptionPane.showInputDialog("Enter your last name");
        pNO = JOptionPane.showInputDialog("Enter your phone number (Like this 5***)");
        emailAddress = JOptionPane.showInputDialog("Enter your email");
        
        // Create an instance of the Customer class, will take values from user.
        Customer customer3 = new Customer(firstName, lastName, pNO, emailAddress);
        
        
        //----------------------------------------------------------------------------------------------------
        // Calculation class
        
        // Create an instance of the Calculation class.
        Calculation calculation1 = new Calculation();
        
        // Calculate the tax.
        totalPrice = movie1.totalPrices + BookingFee;
        tax = (totalPrice * TAX_RATE) / 100;
        totalPrice += tax;
        calculation1.setCalculation(totalPrice);
        
        Calculation calculation2 = new Calculation(231, movie2);
        Calculation calculation3 = new Calculation(total_price, movie3);
        
        
        //----------------------------------------------------------------------------------------------------
        
        ArrayList<Movie> MovieList = new ArrayList<>();// ArrayList for Movie class.
        ArrayList<Customer> CustomerList = new ArrayList<>();// ArrayList for Customer class.
        ArrayList<Calculation> CalculationList = new ArrayList<>();// ArrayList for Calculation class.
       
        // Adding data objects in ArrayList.
        
        MovieList.add(movie1);
        MovieList.add(movie2);
        MovieList.add(movie3);
        
        CustomerList.add(customer1);
        CustomerList.add(customer2);
        CustomerList.add(customer3);
        
        CalculationList.add(calculation1);
        CalculationList.add(calculation2);
        CalculationList.add(calculation3);
        
        //----------------------------------------------------------------------------------------------------
        // Print the data into a file.
        
        PrintWriter outputFile = new PrintWriter("Booking data in the cinema.txt");// Open File
        
        for(int i = 0; i < MovieList.size(); i++){
            Movie movie = MovieList.get(i);
            Customer customer = CustomerList.get(i);
            Calculation calculation = CalculationList.get(i);
            
            outputFile.println(movie);
            outputFile.println(customer);
            outputFile.println(calculation);
        }// End for.
        
        outputFile.close();// Close file.
        
        //----------------------------------------------------------------------------------------------------
        // Read from a file.
        
        File myFile = new File("Booking data in the cinema.txt");
        Scanner inputFile = new Scanner(myFile);
        
        // While loop to read all the data in the file.
        while(inputFile.hasNext()){
            String str = inputFile.nextLine();
            System.out.println(str);
        }// End while.
        
        inputFile.close();// Close file.
                
        System.exit(0);// Close JOptionPane class.
        
    }// End main method
}// End class
