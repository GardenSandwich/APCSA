package Unit_7._7_4.airlinetickets;
import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;

    public TicketOrganizer(ArrayList<AirlineTicket> tickets) {
        this.tickets = tickets;
    }

    public ArrayList<AirlineTicket> getTickets() {
        return tickets;
    }

    public void printPassengersByBoardingGroup() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Boarding Group " + i + ":");
            for (AirlineTicket ticket : tickets) {
                if (ticket.getBoardingGroup() == i) {
                    System.out.println(ticket.getName());
                }
            }
        }
    }

    public void canBoardTogether() {
        boolean madePair = false;
        for (int i = 0; i < tickets.size()-1; i++) {
            if(tickets.get(i).getRow() == tickets.get(i+1).getRow() && tickets.get(i).getBoardingGroup() == tickets.get(i+1).getBoardingGroup()) {
                System.out.println("Passenger " + i + " can board with Passenger " + (i+1));
                madePair = true;
            }
        }
        if (!madePair) {
            System.out.println("There are no passengers with the same row and boarding group.");
        }
    }
}
