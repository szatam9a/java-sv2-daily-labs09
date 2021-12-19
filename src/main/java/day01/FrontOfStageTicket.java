package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {
    private String code;


    public FrontOfStageTicket(String bandName, int price, LocalDateTime date) {
        super(bandName, price, date);
        code = "20%Cheap";
    }

    @Override
    public LocalTime entryTime() {
        return LocalTime.of(getDate().getHour() - 2, getDate().getMinute());

    }
}
