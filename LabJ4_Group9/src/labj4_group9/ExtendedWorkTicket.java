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
public class ExtendedWorkTicket extends WorkTicket {

    private int myWorkTicketNumber;
    private String myClientID;
    private java.time.LocalDate myTicketDate;
    private String myIssueDescription;
    private boolean myOpen;

    public ExtendedWorkTicket() {
        myWorkTicketNumber = 0;
        myClientID = null;
        myTicketDate = null;
        myIssueDescription = null;
        myOpen = true;
    }

    public ExtendedWorkTicket(int workTicketNumber, String clientID, java.time.LocalDate ticketDate, String issueDescription, boolean isOpen) {
        setWorkTicket(workTicketNumber, clientID, ticketDate, issueDescription, isOpen);
    }

    public boolean getIsOpen() {
        return myOpen;
    }
    public void setOpenTicket(boolean isOpen){
        myOpen = true;
    }
    public void setCloseTicket(boolean isOpen){
        myOpen = false;
    }

    public boolean setWorkTicket(int workTicketNumber, String clientID, java.time.LocalDate ticketDate, String issueDescription, boolean isOpen) {
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
    
    public String toString() { // overrides Object.toString(){
        if(myOpen == true){
            
        return String.format("Work Ticket Number: %d \n Client ID: %s \n Ticket Date: %s \n Ticket Description: %s. Ticket status open", myWorkTicketNumber, myClientID, myTicketDate, myIssueDescription);
        }
        
        else
        {
            return String.format("Work Ticket Number: %d \n Client ID: %s \n Ticket Date: %s \n Ticket Description: %s. Ticket status closed", myWorkTicketNumber, myClientID, myTicketDate, myIssueDescription);
        }
    }
}