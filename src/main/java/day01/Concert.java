package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person, LocalTime time) {
        if (person.getTicket().entryTime().isBefore(LocalTime.now())) {
            people.add(person);
        } else {
            throw new IllegalArgumentException("too early");
        }
    }

}
