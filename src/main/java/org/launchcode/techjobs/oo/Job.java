package org.launchcode.techjobs.oo;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String value;
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
        this.value = name;
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
    public String toString() {
        if (getEmployer().toString() == "" || getEmployer() == null) {
            employer.setValue("Data not available");
        }
        if (getName().toString() == "" || getName() == null) {
            setName("Data not available");
        }
        if (getLocation().toString() == "" || getLocation() == null) {
            location.setValue("Data not available");
        }
         if (getPositionType().toString() == "" || getPositionType() == null) {
            positionType.setValue("Data not available");
        }
        if (getCoreCompetency().toString() == "" || getCoreCompetency() == null) {
            coreCompetency.setValue("Data not available");
        }
        return "\nID: " + getId() +
                "\nName: " + getName() +
                "\nEmployer: " + getEmployer() +
                "\nLocation: " + getLocation() +
                "\nPosition Type: " + getPositionType() +
                "\nCore Competency: " + getCoreCompetency() + "\n";
//        if (this.getEmployer().toString() == "" || this.getEmployer() == null) {
//            employer = "Data Not Available";
//        }
    }
//        String response = "\n";

//        if(Job.class.getFields())
//        for(field )

//        for(int i = 0; i < Job.class.getDeclaredFields().length; i++){
//        Field[] fields = Job.class.getFields();

//            System.out.println(fields);
//            if(Job.class.getDeclaredFields()[i].toString() != ""){
//                response += Job.class.getDeclaredFields().+ "\n";
//            }
//            if(Job.class.getDeclaredFields()[i].toString().trim() != ""){
//            Field[] field = Job.class.getDeclaredFields();
//                response += field[i].toString() + "\n";
//                response += Job.class.getDeclaredFields()[i] + ": \n" + Job.class.getDeclaredFields()[i].getName();
//                response += Job.class.getDeclaredFields()[i];
//            }

//        }

//        return "\nID: " + this.getId() + "\nName: " +
//                if(this.value.trim() == ""){
//                    return "Data Not Available";
//                }`
//                else { return this.value;}
//                + "\nEmployer: " + this.getEmployer();

//        for(int i = 0; Job.class.getDeclaredFields().
//        String response = "\n";
//        Field[] fields = someJob.getClass().getDeclaredFields();
//        for(Field field: fields){
//            response += field + "\n";
//        Field[] allFields = Job.class.getDeclaredFields();
//        String response = "";
//        for (Field field : Job.class.getDeclaredFields()) {
//            if (field.toString() != "") {
//                response += "\n" + field.getName().toUpperCase() + ": " + ;
//            }
//
//        }
//    return response;
//    }
//
//        }
//        Class cls = null;
//        try {
//            cls = Class.forName("Job");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        Field[] fields = cls.getDeclaredFields();
//        return response;
//    if(this.getName().trim().equals("")){
//        return "\nID: " + this.getId() + "\nName: Data Not Available" + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: "  + this.getCoreCompetency() + "\n";
//    }
//       else if(this.getEmployer().toString().trim().equals("")){
//            return "\nID: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: Data Not Available" +  "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: "  + this.getCoreCompetency() + "\n";
//        }
//       else if(this.getLocation().toString().trim().equals("")){
//            return "\nID: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() +  "\nLocation: Data Not Available" + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: "  + this.getCoreCompetency() + "\n";
//        }
//        else if(this.getPositionType().toString().trim().equals("")){
//            return "\nID: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: Data Not Available"+ "\nCore Competency: "  + this.getCoreCompetency() + "\n";
//        }
//        else if(this.getCoreCompetency().toString().trim().equals("")){
//            return "\nID: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: Data Not Available\n";
//        }
//
//    else
//        return "\nID: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: "  + this.getCoreCompetency() + "\n";
//    }




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
        return value;
    }

    public void setName(String name) {
        this.value = name;
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
