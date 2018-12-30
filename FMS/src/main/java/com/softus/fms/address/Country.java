/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softus.fms.address;

import java.util.Set;

/**
 *
 * @author ajay
 */
public class Country {

    private String ID;
    private String countryName;
    private String countryCode;
    private String timezoneid;
    private Set<State> states;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTimezoneid() {
        return timezoneid;
    }

    public void setTimezoneid(String timezoneid) {
        this.timezoneid = timezoneid;
    }

    public Set<State> getStates() {
        return states;
    }

    public void setStates(Set<State> states) {
        this.states = states;
    }

}
