package OCP.Chapter5.root.passbyvalue;

public class ZooTickets {
    public static void main(String[] args) {
        int tickets = 2;
        String guests = "abc";
        addTickets(tickets);
        // fix: tickets = addTickets(tickets);
        guests = addGuests(guests);
        System.out.println(tickets + guests);
    }

    public static int addTickets(int tickets) {
        tickets++;
        return tickets;
    }

    public static String addGuests(String guests) {
        guests += "d";
        return guests;
    }

}
