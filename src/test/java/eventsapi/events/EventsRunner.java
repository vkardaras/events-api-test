package eventsapi.events;

import com.intuit.karate.junit5.Karate;

public class EventsRunner {

    @Karate.Test
    Karate testUsers() {
        return Karate.run("events").relativeTo(getClass());
    }
}
