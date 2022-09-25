package org.launchcode.techjobs.oo;

import java.lang.reflect.Field;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job () {
        id = nextId;
        nextId++;
    }

    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString(){
//        String response = "\n";
//        Field[] fields = someJob.getClass().getDeclaredFields();
//        for(Field field: fields){
//            response += field + "\n";
//
//
//        }
//        return response;
    if(this.getName().trim().equals("")){
        return "\nName: Data Not Available" + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: "  + this.getCoreCompetency() + "\n";
    }
        if(this.getEmployer().toString().trim().equals("")){
            return "\nName: " + this.getName() + "\nEmployer: Data Not Available" +  "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: "  + this.getCoreCompetency() + "\n";
        }
        if(this.getLocation().toString().trim().equals("")){
            return "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() +  "\nLocation: Data Not Available" + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: "  + this.getCoreCompetency() + "\n";
        }
        if(this.getPositionType().toString().trim().equals("")){
            return "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: Data Not Available"+ "\nCore Competency: "  + this.getCoreCompetency() + "\n";
        }
        if(this.getCoreCompetency().toString().trim().equals("")){
            return "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: Data Not Available\n";
        }

    else
        return "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: "  + this.getCoreCompetency() + "\n";
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
