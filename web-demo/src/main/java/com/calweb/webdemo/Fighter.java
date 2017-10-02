package com.calweb.webdemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fighter {

    @JsonProperty(value = "last_name")
    private String lastName;
    @JsonProperty(value = "first_name")
    private String firstname;

    private String thumbnail;

    @JsonProperty(value = "weight_class")
    private String weightClass;

    public Fighter() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getWeightClass() {
        return weightClass;
    }

    public void setWeightClass(String weightClass) {
        this.weightClass = weightClass;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "lastName='" + lastName + '\'' +
                ", firstname='" + firstname + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", weightClass='" + weightClass + '\'' +
                '}';
    }
}
