package access;



public class Access {    
    protected String registeredAttendees;
    
    /*Contructor*/
    
    public Access(String registeredAttendees) {        
        this.registeredAttendees = registeredAttendees;
    }
    
    /*Getters and Setters*/


    /*Methods*/
    
    public void checkEntry(int attendeeId) {
        System.out.println("Checking entry for attendee ID: " + attendeeId + " at event: " );
    }    

    public void genStatistics(int totalAttendees) {
        System.out.println("Total attendees registered: " + totalAttendees);
    }
}
