package config;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;


public class HelloHackathonConfig extends Configuration {

    @NotEmpty
    private String defaultName;

    public String getDefaultName() {
        return defaultName;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }
}
