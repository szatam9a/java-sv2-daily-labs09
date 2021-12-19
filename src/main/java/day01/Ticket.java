package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String bandName;
    private int price;
    private LocalDateTime date;

    public Ticket(String bandName, int price, LocalDateTime date) {
        this.bandName = bandName;
        this.price = price;
        this.date = date;
    }

    public LocalTime entryTime() {
        return LocalTime.of(getDate().getHour() - 1, getDate().getMinute());
    }

    public String getBandName() {
        return bandName;
    }

    public int getPrice() {
        return price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket("name", 10, LocalDateTime.now());
        System.out.println(ticket.entryTime());
    }
}
