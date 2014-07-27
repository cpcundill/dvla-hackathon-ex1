package msg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HackerGreeting {

    private String greeting;

    public HackerGreeting() {}

    public HackerGreeting(String greeting) {
        this.greeting = greeting;
    }

    @JsonProperty
    public String getGreeting() {
        return greeting;
    }

}
