package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.lang.reflect.Constructor;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testEmptyConstructor(){
        Job firstJob = new Job();
        Job secondJob = new Job();

        assertNotEquals(firstJob.getId(), secondJob.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
//      assertEquals(testJob.getName() == "Product Tester");


//      Test Instance of each parameter
        assertTrue(testJob.getName() instanceof String);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);


//        Test Value of each parameter
        assertEquals("Product Tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().toString());
        assertEquals("Desert", testJob.getLocation().toString());
        assertEquals("Quality Control", testJob.getPositionType().toString());
        assertEquals("Persistence", testJob.getCoreCompetency().toString());
    }

    @Test

    public void testJobsForEquality(){
        Job firstJob = new Job("Software Developer",new Employer("Microsoft"), new Location("Remote"), new PositionType("Junior Dev"), new CoreCompetency("Java"));
        Job secondJob = new Job("Software Developer",new Employer("Microsoft"), new Location("Remote"), new PositionType("Junior Dev"), new CoreCompetency("Java"));
    assertFalse(firstJob.getId() == secondJob.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals('\n', testJob.toString().charAt(0));
        assertEquals('\n', testJob.toString().charAt(testJob.toString().length()-1));



    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
////        testJob.toString().("\nName: \nEmployer: \n Location: \nPosition Type: \n Core Competency: ");
//        String testString = testJob.toString();
//        testString.contains("ee");
        assertEquals("\nName: Product Tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality Control\nCore Competency: Persistence\n", testJob.toString());

//        testJob.toString().contains("Name: ");
//        testJob.toString().contains("Employer: ");
//        testJob.toString().contains("Location: ");
//        testJob.toString().contains("Position Type: ");
//        testJob.toString().contains("Core Competency: ");



    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job testJobNoCoreCompetency = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency(""));
        Job testJobNoPositionType = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        Job testJobNoLocation = new Job("Product Tester", new Employer("ACME"), new Location(""), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job testJobNoName = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job testJobNoEmployer = new Job("Product Tester", new Employer(""), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("\nName: Product Tester\nEmployer: Data Not Available\nLocation: Desert\nPosition Type: Quality Control\nCore Competency: Persistence\n", testJobNoEmployer.toString());
        assertEquals("\nName: Data Not Available\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality Control\nCore Competency: Persistence\n", testJobNoName.toString());
        assertEquals("\nName: Product Tester\nEmployer: ACME\nLocation: Data Not Available\nPosition Type: Quality Control\nCore Competency: Persistence\n", testJobNoLocation.toString());
        assertEquals("\nName: Product Tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Data Not Available\nCore Competency: Persistence\n", testJobNoPositionType.toString());
        assertEquals("\nName: Product Tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality Control\nCore Competency: Data Not Available\n", testJobNoCoreCompetency.toString());
    }


}
