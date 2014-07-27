package main;

import config.HelloHackathonConfig;
import health.AppHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import resource.HelloHackerResource;

public class App extends Application<HelloHackathonConfig> {

    @Override
    public String getName() {
        return "hello-hackathon";
    }

    @Override
    public void initialize(Bootstrap<HelloHackathonConfig> bootstrap) {

    }

    @Override
    public void run(HelloHackathonConfig config, Environment environment) throws Exception {
        final HelloHackerResource resource = new HelloHackerResource(config.getDefaultName());
        environment.jersey().register(resource);
        environment.healthChecks().register("app", new AppHealthCheck());
    }

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }


}
