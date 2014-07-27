package resource;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import msg.HackerGreeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello") @Produces(MediaType.APPLICATION_JSON)
public class HelloHackerResource {

    private String defaultName;

    public HelloHackerResource(String defaultName) {
        this.defaultName = defaultName;
    }

    @GET @Timed
    public HackerGreeting greet(@QueryParam("name") Optional<String> hacker) {
        return new HackerGreeting("Hello, hacker " + hacker.or(defaultName));
    }
}
