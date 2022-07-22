package cinemabooking;
import javax.swing.JOptionPane;
/**
 *
 * @author kaltham mohsen
 */
public class Movie {
    //fields
    private String date;// The choose for day.
    private String time;// The choose for time.
    public String movieName;// The movie name.
    public int seatNumber;// The number of seats booked.
    public String foodAndDrink;// The choose for food or drinks.
    public double totalPrices = 0.0;// The total prices.
    
    //methods
    //no-arg Constructor
    public Movie( ){
        date = " ";
        time = " ";
        movieName = " ";
        seatNumber = 0;
        foodAndDrink = " ";
        totalPrices = 0.0;
    }
    
    /**
     * Constructor
     * @param date The choose for day.
     * @param time The choose for time.
     * @param movieName The movie name.
     * @param seatNumber The number of seats booked.
     * @param foodAndDrink The choose for food or drinks.
     * @param totalPrices The total prices.
     */
    public Movie(String date, String time, String movieName, int seatNumber, String foodAndDrink, double totalPrices){
        this.date = date;
        this.time = time;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.foodAndDrink = foodAndDrink;
        this.totalPrices = totalPrices;
    }
    
    /**
     * This method allow for user to choose the date.
     * @param day for the date filed.
     * @param time for the setTime method.
     */
    public void setDate(int day, int time){
        // Allow the user to choose the day.
        switch(day){
                case 1:
                    date = "Today";
                    chooseMovie();// Call chooseMovie method.
                    setTime(time);// Call setTime method.
                    totalPrices = chooseSeat();// Call chooseSeat method and set the value in totalPrices field.
                    foodAndDrink = chooseFood();// Call chooseFood method and set the value in foodAndDrink field.
                    break;
                    
                case 2:
                    date = "Tomorrow";
                    chooseMovie();
                    setTime(time);
                    totalPrices = chooseSeat();
                    foodAndDrink = chooseFood();
                    break;
                    
                case 3:
                    date = "Mon 05 Apr";
                    chooseMovie();
                    setTime(time);
                    totalPrices = chooseSeat();
                    foodAndDrink = chooseFood();
                    break;
                    
                case 4:
                    date = "Tue 06 Apr";
                    chooseMovie();
                    setTime(time);
                    totalPrices = chooseSeat();
                    foodAndDrink = chooseFood();
                    break;
                    
                case 5:
                    date = "Wed 07 Apr";
                    chooseMovie();
                    setTime(time);
                    totalPrices = chooseSeat();
                    foodAndDrink = chooseFood();
                    break;
                    
                default:
                    System.out.println("Sorry! wrong input, Exitting program");
                    System.exit(0);
        }// End switch.
        
    }// End setDate method.
    
    /**
     * This method allows for the user to choose a movie he/she wants to watch it.
     */
    public void chooseMovie(){
        String input;// The user input.
        int chooseMovie;// The The person's choose of movie.
        
        // Allow the user to choose the movie.
        input = JOptionPane.showInputDialog("CHOOSE MOVIE\n" + 
                                            "1. Godzilla vs Kong\n" + 
                                            "2. Waafet Reggaala\n" + 
                                            "3. Crisis\n" + 
                                            "4. SAS: Red Notice\n" + 
                                            "5. Tom and Jerry: The Movie\n");
        chooseMovie = Integer.parseInt(input);
                    
        switch(chooseMovie){
            case 1:
                movieName = "Godzilla vs Kong";
                break;

            case 2:
                movieName = "Waafet Reggaala";
                break;

            case 3:
                movieName = "Crisis";
                break;

            case 4:
                movieName = "SAS: Red Notice";
                break;

            case 5:
                movieName = "Tom and Jerry: The Movie";
                break;

            default:
                System.out.println("Sorry! wrong input, Exitting program");
                System.exit(0);    
        }// End switch.
        
    }// End chooseMovie method.
    
    /**
     * This method allow for user to choose the time.
     * @param time The choose for time.
     */
    public void setTime(int time){
        
        switch(time){
            case 1:
                this.time = "1:15pm";
                break;
                
            case 2:
                this.time = "3:45pm";
                break;
                
            case 3:
                this.time = "6:15pm";
                break;
                
            case 4:
                this.time = "8:45pm";
                break;
                
            case 5:
                this.time = "11:15pm";
                break;
                
            default:
                System.out.println("Sorry! wrong input, Exitting program");
                System.exit(0);    
        }// End switch.
        
    }// End setTime method.
    
    /**
     * This method allow for user to choose seats.
     * @return seatNumber * totalPrices.
     */
    public double chooseSeat(){
        String input;// The user input.
        int chooseSeats;// The person's choose of seats.
        String seatType;// The type of seat.
        char letter = ' ';// The user's Y or N decision.
        
        // Do while loop to allow the user to booking for more than one person.
        do{
            // Allow the user to choose the seats.
            input = JOptionPane.showInputDialog("CHOOSE SEATS\n" + 
                                                "1. Premium\n" + 
                                                "   65.00 SAR\n" +
                                                "2. Standard\n" + 
                                                "   55.00 SAR\n" +
                                                "3. Wheelchair Space\n" +
                                                "   55.00 SAR\n" +
                                                "4. Lounger\n" + 
                                                "   100.00 SAR\n");
            chooseSeats = Integer.parseInt(input);

            switch(chooseSeats){
                case 1:
                    seatType = "Premium";
                    totalPrices += 65.0;// The price for this type of seat.
                    break;
                    
                case 2:
                    seatType = "Standard";
                    totalPrices += 55.0;// The price for this type of seat.
                    break;
                    
                case 3:
                    seatType = "Wheelchair Space";
                    totalPrices += 55.0;// The price for this type of seat.
                    break;
                
                case 4:  
                    seatType = "Lounger";
                    totalPrices += 100.0;// The price for this type of seat.
                    break;
                    
                default:
                    System.out.println("Sorry! wrong input, Exitting program");
                    System.exit(0);
            }// End switch.
            
            input = JOptionPane.showInputDialog("Do you want to booking for another person (Y / N)?");
            letter = input.charAt(0);
            ++seatNumber;
        }while(letter != 'N' && letter != 'n' && seatNumber < 10);// End while loop.
        
        if(seatNumber >= 10){
            JOptionPane.showMessageDialog(null, "Booking for more than ten people are not allowed");
        }// End if statement
        
        return seatNumber * totalPrices;
    }// End chooseSeat method.
    
    /**
     * This method allow for user to choose the food or drinks.
     * @return The choose for foodAndDrink.
     */
    public String chooseFood(){
        String input;// The user input.
        int chooseFood;// The person's choose of food or drinks.
        char letter = ' ';// The user's Y or N decision.
        
        // Your choice of food or drinks is optional.
        input = JOptionPane.showInputDialog("Do you want to order food or drinks (Y / N)?");
        letter = input.charAt(0);
        if(letter != 'N' && letter != 'n'){
            do{
                // Allow the user to choose food or deinks if he/she wants. 
                input = JOptionPane.showInputDialog("CHOOSE FOOD & DRINKS\n" + 
                                                    "1. Nachos Large Flavor Combo\n" + 
                                                    "   61.00 SAR\n" +
                                                    "2. Hotdog Large Flover Combo\n" + 
                                                    "   51.00 SAR\n" +
                                                    "3. Large Pepsi\n" + 
                                                    "   22.00 SAR\n" +
                                                    "4. Beef burger & fries\n" +
                                                    "   43.00 SAR\n" +
                                                    "5. Galaxy bar\n" + 
                                                    "   8.00 SAR\n");
                chooseFood = Integer.parseInt(input);
                
                switch(chooseFood){
                    case 1:
                        foodAndDrink += "Nachos Large Flavor Combo ";
                        totalPrices += 61;
                        break;

                    case 2:
                        foodAndDrink += "Hotdog Large Flover Combo ";
                        totalPrices += 51;
                        break;

                    case 3:
                        foodAndDrink += "Large Pepsi ";
                        totalPrices += 22;
                        break;

                    case 4:
                        foodAndDrink += "Beef burger & fries ";
                        totalPrices += 43;
                        break;

                    case 5:
                        foodAndDrink += "Galaxy bar ";
                        totalPrices += 8;
                        break;

                    default:
                        System.out.println("Sorry! wrong input, Exitting program");
                        System.exit(0);    
                }// End switch.

                input = JOptionPane.showInputDialog("Do you want to order more food or drinks (Y / N)?");
                letter = input.charAt(0);
                
            }while(letter != 'N' && letter != 'n');// End do while.
            
        }// End if statement.
        else{
            JOptionPane.showMessageDialog(null, "Okay, you didn't order food or drinks");
            foodAndDrink = " No order";
        }// End else statement.
           
        return foodAndDrink;
    }// End chooseFood method.
    
    /**
     * The getDate return the date.
     * @return The choose for day.
     */
    public String getDate( ){
        return date;
    }// End getDate method.
    
    /**
     * The getTime return the time.
     * @return The choose for time.
     */
    public String getTime( ){
        return time;
    }// End getTime method.
    
    /**
     * The toString method.
     * @return Information about the booked.
     */
    public String toString( ){
        return ("When: " + time + ", " + date + 
                "\nMovie name: " + movieName + "\nNumber of seats booked: " + seatNumber + 
                "\nFood & Drinks: " + foodAndDrink);
    }// End toString method.
}
