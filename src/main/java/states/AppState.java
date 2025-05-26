package states;

import access.Attendees;
import artist.Artist;
import java.util.ArrayList;
import java.util.HashMap;
import sales.Sales;
import location.Location;
import event.Event;

public class AppState {
    public static ArrayList<Artist> listArtists = new ArrayList<>();    
    public static ArrayList<Attendees> listAttendees = new ArrayList<>();
    public static ArrayList<Sales> salesList = new ArrayList<>();
    public static HashMap<String, Double> typeEntry = new HashMap<>();
    public static ArrayList<Location> locationsList = new ArrayList<>();
    public static ArrayList<Event> eventList = new ArrayList<>();
}
