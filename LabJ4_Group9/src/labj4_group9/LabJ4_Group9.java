/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labj4_group9;

import java.util.Scanner;

/**
 *
 * @author Michelle Kirkwood, Mitchell Burt
 */
public class LabJ4_Group9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExtendedWorkTicket ticket = new ExtendedWorkTicket();
        int choice = 0;
        Scanner keyboardInput = new Scanner(System.in);

        //Input
        System.out.println("Please enter an option: ");//Ask an option input
        System.out.println(" 1.Get work ticket number \n 2.Get client ID \n 3.Get ticket date \n 4.Get issue Descritpion \n 5.Set ticket number \n 6.Set client ID \n 7.Set ticket Date \n 8.Set Issue description \n 9.Set work ticket \n 10.Get is open \n 11.Set open ticket. \n 12. Set closed ticket.");
        choice = keyboardInput.nextInt();//Saves the users input
        
        if (choice == 1) {
            System.out.println("Your work ticket number is: " + ticket.getWorkTicketNumber());

        } else if (choice == 2) {
            System.out.println("Your client ID is: " + ticket.getClientID());

        } else if (choice == 3) {
            System.out.println("Your work ticket date is: " + ticket.getTicketDate());

        } else if (choice == 4) {
            System.out.println("Your issue description is: " + ticket.getIssueDescription());

        } else if (choice == 5) {
             System.out.println("Please enter a work ticket number");
            int workTicketNumber = keyboardInput.nextInt();
            ticket.setWorkTicketNumber(workTicketNumber);
            System.out.println("Your work ticket number is now: " + ticket.getWorkTicketNumber());
            
        } else if (choice == 6) {
            System.out.println("Please enter a client ID");
            String clientID = keyboardInput.next();
            ticket.setClientID(clientID);
            System.out.println("Your client ID is now: " + ticket.getClientID());

        } else if (choice == 7) {
            System.out.print("Please enter a ticket date");
          //  java.time.LocalDate ticketDate = keyboardInput.next();
          //  ticket.setTicketDate(ticketDate);
          //System.out.println("Your work ticket date is: " + ticket.getTicketDate());

        } else if (choice == 8) {
            System.out.println("Please enter an issue description");
            String issueDescription = keyboardInput.next();
            ticket.setIssueDescription(issueDescription);
            System.out.println("Your issue description is now: " + ticket.getIssueDescription());

        } else if (choice == 9) {
            System.out.println("Please enter a work ticket number");
            int workTicketNumber = keyboardInput.nextInt();
            ticket.setWorkTicketNumber(workTicketNumber);
            System.out.println("Your work ticket number is now: " + ticket.getWorkTicketNumber());
            System.out.println("Please enter an issue description");
            String issueDescription = keyboardInput.next();
            ticket.setIssueDescription(issueDescription);
            System.out.println("Your issue description is now: " + ticket.getIssueDescription());
            System.out.println("Please enter a client ID");
            String clientID = keyboardInput.next();
            ticket.setClientID(clientID);
            System.out.println("Your client ID is now: " + ticket.getClientID());

        }
        
        else if (choice == 10) {
            System.out.println("Your work ticket is: " + ticket.getIsOpen());
        }
        
        else if (choice == 11) {
            ticket.setOpenTicket(true);
            System.out.println("Your workticket is now open");
        }
       
         else if (choice == 12) {
            ticket.setCloseTicket(false);
            System.out.println("Your workticket is now closed");  
        }
        
        
        else {
            System.out.print("Invalid input, please enter a number between 1 and 12 ");
        }
    }

}
