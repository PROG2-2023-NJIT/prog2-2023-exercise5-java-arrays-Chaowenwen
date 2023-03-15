package prog2.exercise5.flight.booking.system;



import java.util.Scanner;
import java.time.LocalDate;

public class FlightBooking {
   private String[] passengerFullName;
   private String[]passengerGender;
   private int[]passengerAge;
   private String[] ticketNumber;
   private int number;
    String flightID = "dtrde6ftfyu";
    private int  childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private double departingTicketPrice;
    private double returnTicketPrice=1102.3;
    private double totalTicketPrice=1107.7;
   
    private LocalDate departingDate;
    private LocalDate returnDate;
    
    private  Source_airport sourceAirport;
  
    private Destination_airport destinationAirport ;
    private final String FlightCompany = "Flights-of-Fancy";
    BookingClass  bookingclass;
TripType triptype;
TripSource tripSource;
TripDestination tripdestination;

   public void setBookingClass(String choice){
    if(choice=="1"){
    this.bookingclass = BookingClass.FIRST;
   }
   if(choice=="2"){
    this.bookingclass = BookingClass.BUSINESS;
   }
   if(choice=="3"){
    this.bookingclass = BookingClass.ECONOMY;
   }
}

   public BookingClass getBookingClass(){
    return bookingclass;
   }
    
public void setTripType(String choice1){
    if(choice1=="1"){
        this.triptype=TripType.ONE_WAY;

    }
    if(choice1=="2"){
        this.triptype=TripType.RETURN;
    }
}
public TripType getTripType(){
    return triptype;
}
public void setTripSource(String choice2){
    if(choice2=="1"){
        this.tripSource=TripSource.NANJING;
    }
    if (choice2=="2"){
        this.tripSource=TripSource.BEIJING;
    }
    if(choice2=="3"){
        this.tripSource=TripSource.OULU;
    }
    if(choice2=="4"){
        this.tripSource=TripSource.HELSINKI;
    }
}
public TripSource getTripSource(){
    return tripSource;
}



public void setTripDestination(String choice2,String choice3){
    if(choice3=="1"){
        this.tripdestination=TripDestination.NANJING;
    }
    if (choice3=="2"){
        this.tripdestination=TripDestination.BEIJING;
    }
    if(choice3=="3"){
        this.tripdestination=TripDestination.OULU;
    }
    if(choice3=="4"){
        this.tripdestination=TripDestination.HELSINKI;
    }
}
public TripDestination getTripDestination(){
    return tripdestination;
}




    public void setDepartureDate(LocalDate departingDate) {
        this.departingDate = departingDate;
    }
    public LocalDate getDepartureDate(){
        return departingDate;
    }
    
    public void setReturnDate(LocalDate returnDate) {
        int result = returnDate.compareTo(departingDate);
        if(result >= 2){
            this.returnDate = returnDate;
        }else if(result == 1){
            this.returnDate = returnDate.plusDays(1);
        }else if(result == 0){
            this.returnDate = returnDate.plusDays(2);
        }
        
    
    }
    public LocalDate getReturnDate(){
        return returnDate;
    }
   
    public String getFlightID(){
        return flightID;
    }
    public int getChildrenPassengers(){
        return childPassengers;
    }
    public int getAdultPassengers(){
        return adultPassengers;
    }
    public int getTotalPassengers(){
        return totalPassengers;
    }
    public void setTotalPassengers(int childPassengers,int adultPassengers){
        this.totalPassengers=childPassengers+adultPassengers;
    }







    public void setReturnTicketPrice() {
        if(triptype==TripType.RETURN){
        this.returnTicketPrice = departingTicketPrice;}
        else{this.returnTicketPrice=0;}
    }
    public double getDepartingTicketPrice(){
        
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(int child, int adults) {
        double n1;
        if((((tripSource==TripSource.NANJING)&&(tripdestination==TripDestination.BEIJING))||((tripSource==TripSource.BEIJING)&&(tripdestination==TripDestination.NANJING))||((tripSource==TripSource.OULU)&&(tripdestination==TripDestination.HELSINKI))||(tripSource==TripSource.HELSINKI)&&(tripdestination==TripDestination.OULU)))
    
       {
        n1=300+0.1*300+0.05*300;

       } 
       else{
        n1=300+0.15*300+0.1*300;
       }
       this.departingTicketPrice = n1*(child+adults);
       int n2=0;
        
        
            if(bookingclass == BookingClass.FIRST){
                n2=250;
            }
        if(bookingclass == BookingClass.BUSINESS){
            n2=150;
        }
        if(bookingclass == BookingClass.ECONOMY){
            n2=50;
        }
            this.departingTicketPrice = departingTicketPrice+n2*(child+adults);
        
       
    }
    public double getReturnTicketPrice(){
        return returnTicketPrice;
    }
    public void setTotalTicketPrice() {
        this.totalTicketPrice= returnTicketPrice+departingTicketPrice;
    }
    public double getTotalTicketPrice(){
        return totalTicketPrice;
    }



    public void setPassengerFullName(int index,String passengerFullName){
        this.passengerFullName [index]=passengerFullName;
    }

    public String getPassengerFullName(int index){
        return passengerFullName[index];
    }

public void setPassengerGender(int index,String passengerGender){
    this.passengerGender[index]=passengerGender;
}

public String getPassengerGender(int index){
    return passengerGender[index];
}


public void setPassengerAge(int index,int passengerAge){
    this.passengerAge[index]=passengerAge;
}

public int getPassengerAge(int index) {
    return passengerAge[index];
}



public FlightBooking(int number){
 this.passengerFullName = new String[number];
 this.passengerGender = new String[number];
 this.passengerAge = new int[number];
 this.ticketNumber = new String[number];
this.number = number;
 }
Scanner chh=new Scanner(System.in);
public void reserveTickets(int number){
 for (int numb = number;numb > 0; --numb) {
 System.out.println("Dear passenger please input some messages for the No."+(number+1-numb)+"passenger");
System.out.println("Please input Your FullName:");
this.passengerFullName[number-numb] = chh.nextLine();
 System.out.println("Please input Your gender(Male, Female or Other):");
 this.passengerGender[number-numb]= chh.nextLine();
System.out.println("Please input Your age:");
 this.passengerAge[number-numb] = chh.nextInt();
 }

System.out.println("\nPlease input some message for people");
System.out.println("Please input your date of departure:");
String sta = chh.nextLine();
LocalDate departure = LocalDate.parse(sta);
setDepartureDate(departure);
 System.out.println("Please input your date of returning:");
String sta2 = chh.nextLine();
 LocalDate returningDate = LocalDate.parse(sta2);
 
setReturnDate(returningDate);


 System.out.println("Dear passenger please input the number of childpassengers:");
this.childPassengers = chh.nextInt();
 System.out.println("Dear passenger please input the number of adultpassengers:");
 this.adultPassengers = chh.nextInt();
 
 System.out.println("Please pick the number of class you would like to travel in " );
System.out.println("1." + "First");
System.out.println("2." + "Business");
 System.out.println("3." + "Economy");
 String num1 = chh.nextLine();
 setBookingClass(num1);

System.out.println("Please pick the choice(number) of 1.One way \n 2.Return ");
 String num2 = chh.nextLine();
 setTripType(num2);

System.out.println("Please pick the number of tripsouce you would like to travel" );
 System.out.println("1." + "Nanjing");
 System.out.println("2." + "Beijing");
 System.out.println("3." + "Oulu");
 System.out.println("4." + "Helsinki");

 String num = chh.nextLine();
setTripSource(num);
 setSourceAirport(num);

 System.out.println("Please pick the number of tripdestination you would like to go" );
 System.out.println("1." + "Nanjing");
 System.out.println("2." + "Beijing");
System.out.println("3." + "Oulu");
 System.out.println("4." + "Helsinki");

String num3 = chh.nextLine();
 setTripDestination(num,num3);
 setDestinationAirport(num,num3);

 for (int numb =number;numb>0;--numb){
 getTicketNumber(number-numb);
 chh.close();
 }
}
public void setSourceAirport(String num) {
    switch(num) {
        case "1":
        this.sourceAirport = Source_airport.Nanjing_Lukou_International_Airport;
        break;
        case "2":
        this.sourceAirport = Source_airport.Beijing_Capital_International_Airport;
        break;
        case "3":
        this.sourceAirport = Source_airport.Oulu_Airport;
        break;
        case "4":
        this.sourceAirport = Source_airport.Helsinki_Airport;
        break;
    }
     }
public Source_airport getSourceAirport() {
    return sourceAirport;
}

public void setDestinationAirport(String num,String num3) {
    if(!num.equals(num3)) {
    switch(num3) {
        case "1":
        this.destinationAirport = Destination_airport.Nanjing_Lukou_International_Airport;
        break;
        case "2":
        this.destinationAirport = Destination_airport.Beijing_Capital_International_Airport;
        break;
        case "3":
        this.destinationAirport = Destination_airport.Oulu_Airport;
        break;
        case "4":
        this.destinationAirport = Destination_airport.Helsinki_Airport;
        break;
    }
} else {
        System.out.println("The  source airport and the  destination airport should not be the same!");}
}
public Destination_airport getDestinationAirport() {
    return destinationAirport;
}



    private String a;
   private  String b;
    private String c;
    public void setTicketNumber(int index) {
        if(triptype==TripType.ONE_WAY){
            a="11";
        }
        if(triptype==TripType.RETURN){
            a="22";
        }
        if(bookingclass == BookingClass.FIRST){
            b="F";
        }
        if(bookingclass == BookingClass.BUSINESS){
            b="B";
        }
        if(bookingclass == BookingClass.ECONOMY){
            b="E";
        }
        if(((tripSource==TripSource.NANJING)&&(tripdestination==TripDestination.BEIJING))||((tripSource==TripSource.BEIJING)&&(tripdestination==TripDestination.NANJING))||((tripSource==TripSource.OULU)&&(tripdestination==TripDestination.HELSINKI))||(tripSource==TripSource.HELSINKI)&&(tripdestination==TripDestination.OULU)){
            c="DOM";
        }
        else{
            c="INT";
        }
        String ticketnumber=a+b+"ASDF"+c;
        this.ticketNumber[index]= ticketnumber;
        this.ticketNumber = ticketNumber;
    }
    public String getTicketNumber(int index){
        
        return ticketNumber[index];
    }

   public String getFlightCompany() {
       return FlightCompany;
   }
  
   
    public FlightBooking(String passengerFullname,LocalDate departingDate,LocalDate returnDate,int childrenPassengers,int adultPassengers){
        this.passengerFullName=new String[1];
        this.passengerFullName[0]=passengerFullname;
        this.departingDate=departingDate;
        this.returnDate=returnDate;
        this.childPassengers=childrenPassengers;
        this.adultPassengers=adultPassengers;
    }
    
   
    public String toString(){
        return  "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        FlightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripdestination + "\n" +
        "Date of departure: " + departingDate + "\n" +
        "Date of return: " + returnDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice;

    }


    enum BookingClass {
    
  
        FIRST,BUSINESS,ECONOMY
           
        }
        
        enum TripType{
            ONE_WAY,RETURN
          
        
        }
        
        
        enum Trip_source{
            Nanjing, Beijing, Shanghai, Oulu, Helsinki, Paris
        }
        enum Trip_destination{
        
            Nanjing, Beijing, Shanghai, Oulu, Helsinki,  Paris
        }
        enum Source_airport{
            Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport,  Paris_Charles_de_Gaulle_Airport
            
        }
        enum Destination_airport{
            Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport,  Paris_Charles_de_Gaulle_Airport
        }
        enum TripSource{
            NANJING,BEIJING,OULU,HELSINKI
        }
        enum TripDestination{
            NANJING,BEIJING,OULU,HELSINKI
        }
       
        double domesticbase = 300 ;
        double domestictaxes= 0.1*domesticbase;
        double domesticfees = 0.05*domesticbase;
        double internationalbase = 300;
        double internationaltaxes =0.15*internationalbase;
        double internationalfees = 0.1*internationalbase;
        double First = 250;
        double Business = 150;
        double Economy = 50;
    
    }
    







 

