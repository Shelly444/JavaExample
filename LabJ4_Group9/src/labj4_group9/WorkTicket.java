/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labj4_group9;

/**
 *
 * @author Michelle Kirkwood, Mitchell Burt
 */
public class WorkTicket {
//Private attributes

    private int myWorkTicketNumber;
    private String myClientID;
    private java.time.LocalDate myTicketDate;
    private String myIssueDescription;
//Default constructor

    public WorkTicket() {
        myWorkTicketNumber = 0;
        myClientID = null;
        myTicketDate = null;
        myIssueDescription = null;
    }
//Paramaterized constructor

    public WorkTicket(int workTicketNumber, String clientID, java.time.LocalDate ticketDate, String issueDescription) {
        setWorkTicket(workTicketNumber, clientID, ticketDate, issueDescription);
    }
//Get accessors

    public int getWorkTicketNumber() {
        return myWorkTicketNumber;
    }

    public String getClientID() {
        return myClientID;
    }

    public java.time.LocalDate getTicketDate() {
        return myTicketDate;
    }

    public String getIssueDescription() {
        return myIssueDescription;
    }
//Set mutators

    public void setWorkTicketNumber(int workTicketNumber) {
        // validation goes here
        if (workTicketNumber <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0.");
        }
        myWorkTicketNumber = workTicketNumber;

    }

    public void setClientID(String clientID) {

        myClientID = clientID;

    }

    public void setTicketDate(java.time.LocalDate ticketDate) {
        if (ticketDate.getYear() < 2000) {
            throw new IllegalArgumentException("Year must be more than 2000.");
        } else if (ticketDate.getYear() > 2099) {
            throw new IllegalArgumentException("Year must be less than 2099.");
        }
        myTicketDate = ticketDate;

    }

    public void setIssueDescription(String issueDescription) {

        myIssueDescription = issueDescription;

    }
    
//Set workticket method

    public boolean setWorkTicket(int workTicketNumber, String clientID, java.time.LocalDate ticketDate, String issueDescription) {
        boolean isValid = true;
        if (workTicketNumber <= 0) {
            isValid = false;
            throw new IllegalArgumentException("Number must be greater than 0.");
        }
        if (ticketDate.getYear() < 2000) {
            isValid = false;
            throw new IllegalArgumentException("Year must be more than 2000.");
        } else if (ticketDate.getYear() > 2099) {
            isValid = false;
            throw new IllegalArgumentException("Year must be less than 2099.");
        }
        if (isValid) {
            setWorkTicketNumber(workTicketNumber);
            setClientID(clientID);
            setTicketDate(ticketDate);
            setIssueDescription(issueDescription);
        }

        return isValid;
    }

    @Override // generates an error unless it overrides a method in a supertype.
    public String toString() { // overrides Object.toString(){

        return String.format("Work Ticket Number: %d \n Client ID: %s \n Ticket Date: %s \n Ticket Description: %s.", myWorkTicketNumber, myClientID, myTicketDate, myIssueDescription);
    }
}

