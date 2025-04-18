/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package access;

/**
 *
 * @author Yermy
 */
public class Attendees {
    protected int id;
    protected String name;
    protected String contact;
    protected String type;
    protected String technical;
    protected String participationHistory;

    public Attendees(int id, String name, String contact, String type, String technical, String participationHistory) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.type = type;
        this.technical = technical;
        this.participationHistory = participationHistory;
    }
    
    /**/

    /**
     * /
     * @return
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTechnical() {
        return technical;
    }

    public void setTechnical(String technical) {
        this.technical = technical;
    }

    public String getParticipationHistory() {
        return participationHistory;
    }

    public void setParticipationHistory(String participationHistory) {
        this.participationHistory = participationHistory;
    }
    
    /*Methods*/
    public void registry(){
        System.out.println("Registry");
    }
    public void update(){
        System.out.println("Updating");
    }
    public void addRequeriment(){};
    public void addParticipationHistory(){}
    public void listHistory(){}
    
}
