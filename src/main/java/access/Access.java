package access;



public class Access {
    protected String event;
    protected String registryAttendees;
    
    /*Contructor*/
    
    public Access(String event, String registryAttendees) {
        this.event = event;
        this.registryAttendees = registryAttendees;
    }
    
    /*Getters and Setters*/

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getRegistryAttendees() {
        return registryAttendees;
    }

    public void setRegistryAttendees(String registryAttendees) {
        this.registryAttendees = registryAttendees;
    }
    
    /*Methods*/
    
    public void checkEntry(int attendeeId) {
        System.out.println("Checking entry for attendee ID: " + attendeeId + " at event: " + event);
    }    

    public void genStatistics(int totalAttendees) {
        System.out.println("Total attendees registered: " + totalAttendees);
    }
}
