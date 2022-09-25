package org.launchcode.techjobs.oo.test;

import org.junit.Test;
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


}
