package fr.treeptik.cloudunit.docker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by guillaume on 21/10/15.
 */
public class LogConfig implements Serializable {

    @JsonProperty("Config")
    private Object config;

    @JsonProperty("Type")
    private String type;

    public Object getConfig() {
        return config;
    }

    public void setConfig(Object config) {
        this.config = config;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
