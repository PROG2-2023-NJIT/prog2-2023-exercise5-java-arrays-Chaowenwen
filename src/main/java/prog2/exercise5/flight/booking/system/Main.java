package prog2.exercise5.flight.booking.system;


import java.time.*;
import java.util.Scanner;

import prog2.exercise5.flight.booking.system.FlightBooking.TripDestination;
import prog2.exercise5.flight.booking.system.FlightBooking.TripSource;
public class Main 
{
    public static void main( String[] args ){

Scanner chh=new Scanner(System.in);
System.out.println("enter ticket number");
int number = chh.nextInt();
FlightBooking cqq=new FlightBooking(number);
cqq.reserveTickets(number);
chh.close();


    // System .out.println("输入来回日期");
    //     Scanner input = new Scanner(System.in);
    //     String returningOn=input.nextLine();
    //     String departingOn=input.nextLine();
    //     LocalDate depart = LocalDate.parse(departingOn);
    //     LocalDate returnDate = LocalDate.parse(returningOn);






    //     FlightBooking cww=new FlightBooking("null",depart,returnDate,2,3);


    //     int size = input.nextInt();
    //     System.out.println("Please enter your fullname");
    //          String passengerFullName = input.nextLine();
             
            
    //         String [] fullName = {};
    //         String [] gender = {};
    //         int [] age = {};
 
 
 
    //         for(int i=0; i<size; ++i){
    //          cww.setPassengerFullName(i, fullName[i]);
    //          cww.setPassengerGender(i, gender[i]);
    //          cww.setPassengerAge(i, age[i]);
             
    //      }
 
            
    //         cww.getPassengerFullName();
    //         cww.getPassengerGender();
    //         cww.setPassengerAge();
            
            
            
            
            
            
            
            
   
    
   
    
    // cww.setDepartureDate(depart);
    //    cww.setReturnDate(returnDate);
    //    cww.getDepartureDate();
    //    cww.getReturnDate();
    //         System.out.println("Please enter your fullname");
    //         String passengerFullName = input.nextLine();
            
           
           

    //         System.out.println("1.First\n"+"2.Business\n"+"3.Economy");
    //         int bookingclass = input.nextInt();
    //       String bookingclass1 = bookingclass+"";
    //         if(bookingclass1=="1")
    //         {
    //             cww.setBookingClass("1");
    //         }
    //         else if(bookingclass1=="2")
    //         {
    //             cww.setBookingClass("2");
            
    //         }
    //         else if(bookingclass1=="3"){
    //            cww.setBookingClass("3");
    //         }
        
    //        System.out.println("1.One way\n"+"2.Return");
    //        int triptype = input.nextInt();
    //        String triptype1=triptype+"";
    //        if(triptype1=="1")
    //        {
    //         cww.setTripType("1");
        
    //        }
    //     else {
    //        cww.setTripType("2");
    //     }   
    //     cww.getBookingClass();
    // cww.getTripType();
    //     System.out.println("1.Nanjing\n"+"2.Beijing\n"+"3.Oulu\n"+"4.Helsinki");
    //     int tripSource = input.nextInt();
    //     String tripSource1=tripSource+"";
    //     if(tripSource1=="1"){
    //         cww.setTripSource("1");
    //     }
    //        else if(tripSource1=="2"){
    //         cww.setTripSource("2");
    //        }
    //        else if(tripSource1 =="3"){
    //         cww.setTripSource("3");
    //        }
    //        else {
    //         cww.setTripSource("4");
    //        }
           
    //        System.out.println("1.Nanjing\n"+"2.Beijing\n"+"3.Oulu\n"+"4.Helsinki");
    //        int tripdestination= input.nextInt();
    //        String tripdestination1=tripdestination+"";
    //        if(tripdestination1=="1"){
    //            cww.setTripDestination(tripSource1,"1");
    //        }
    //           else if(tripdestination1=="2"){
    //             cww.setTripDestination(tripSource1,"2");
    //           }
    //           else if(tripdestination1 =="3"){
    //             cww.setTripDestination(tripSource1,"3");
    //           }
    //           else {
    //             cww.setTripDestination(tripSource1,"4");
    //           }
           

    //           TripSource source = cww.getTripSource();
    //           String company = cww.getFlightCompany();
    //           TripDestination destination = cww.getTripDestination();
    //           String ticketNumber = cww.getTicketNumber();
            
           
    //         cww.setTotalPassengers(2, 3);
    //         int totalPassengers = cww.getTotalPassengers();
    //         cww.setDepartingTicketPrice(2, 3);
    //         cww.setReturnTicketPrice();
    //         cww.getDepartingTicketPrice();
    //         cww.getReturnTicketPrice();
    //         cww.setTotalTicketPrice();
    //         double totalTicketPrice = cww.getTotalTicketPrice();
    
           
    
    //         System.out.println("Dear " + passengerFullName + ". Thank you for booking your flight with " + 
    //         company + ". Following are the details of your booking and the trip:" + "\n" + 
    //         "Ticket Number: " + ticketNumber + "\n" + 
    //         "From " + source + " to " + destination + "\n" +
    //         "Date of departure: " + depart+ "\n" +
    //         "Date of return: " + returnDate + "\n" +
    //         "Total passengers: " + totalPassengers + "\n" +
    //         "Total ticket price in Euros: " + totalTicketPrice);
           
    //         input.close();
        
        
    }
}

