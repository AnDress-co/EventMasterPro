/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package access;

/**
 *
 * @author MarlonG
 */
public class Access {
    protected String event;
    protected String registryAttendees;

    public Access(String event, String registryAttendees) {
        this.event = event;
        this.registryAttendees = registryAttendees;
    }

    public void checkEntry(int attendeeId) {
        System.out.println("Checking entry for attendee ID: " + attendeeId + " at event: " + event);
    }

    public void registryAttendees() {
        System.out.println("Registering attendee to event: " + event);
    }

    public void genStatistics(int totalAttendees) {
        System.out.println("Total attendees registered: " + totalAttendees);
    }
}
