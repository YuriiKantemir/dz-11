import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.hasProperty;



public class Dz_11_Tests {

    @Test
    public void testClassGetters() {
        Man testMan = new Man("TestFirstManName","TestLastManName", 50);
        Woman testWoman = new Woman("TestFirstWomanName","TestLastWomanName", 49);
        Assert.assertEquals(testMan.getFirstName(), "TestFirstManName", "First name is not as expected");
        Assert.assertEquals(testWoman.getFirstName(), "TestFirstWomanName", "First name is not as expected");
        Assert.assertEquals(testMan.getLastName(), "TestLastManName", "Last name is not as expected");
        Assert.assertEquals(testWoman.getLastName(), "TestLastWomanName", "Last name is not as expected");
        Assert.assertEquals(testMan.getAge(), 50, "Age is not as expected");
        Assert.assertEquals(testWoman.getAge(), 49, "Age is not as expected");

    }
    @Test
    public void testAgeGettersAndSetters(){
        Man testMan = new Man("TestFirstManName","TestLastManName", 50);
        Woman testWoman = new Woman("TestFirstWomanName","TestLastWomanName", 49);
        Assert.assertEquals(testMan.getAge(), 50, "Man age should be a 50");
        testMan.setAge(60);
        Assert.assertEquals(testMan.getAge(),60,"Mans age changed to 60");
        Assert.assertEquals(testWoman.getAge(), 49, "Woman age should be a 49");
        testWoman.setAge(50);
        Assert.assertEquals(testWoman.getAge(),50,"Mans age changed to 50");

    }

    @Test public void testFirstNameGettersAndSetters() {
        Man testMan = new Man("TestFirstManName","TestLastManName", 50);
        Woman testWoman = new Woman("TestFirstWomanName","TestLastWomanName", 49);
        Assert.assertEquals(testMan.getFirstName(), "TestFirstManName", "Should return man first name");
        testMan.setFirstName("Changed Fist Name");
        Assert.assertEquals(testMan.getFirstName(), "Changed Fist Name", "Should return changed man first name");
        Assert.assertEquals(testWoman.getFirstName(), "TestFirstWomanName", "Should return woman first name");
        testWoman.setFirstName("Changed Fist Name");
        Assert.assertEquals(testWoman.getFirstName(), "Changed Fist Name", "Should return changed woman first name");
    }
    @Test public void testLastNameGettersAndSetters() {
        Man testMan = new Man("TestFirstManName","TestLastManName", 50);
        Woman testWoman = new Woman("TestFirstWomanName","TestLastWomanName", 49);
        Assert.assertEquals(testMan.getLastName(), "TestLastManName", "Should return man last name");
        testMan.setLastName("Changed Last Name");
        Assert.assertEquals(testMan.getLastName(), "Changed Last Name", "Should return changed man last name");
        Assert.assertEquals(testWoman.getLastName(), "TestLastWomanName", "Should return woman last name");
        testWoman.setLastName("Changed Last Name");
        Assert.assertEquals(testWoman.getLastName(), "Changed Last Name", "Should return changed woman Lsat name");

    }
    @Test
    public void testIsNotRetired(){
        Man testMan = new Man("TestFirstManName","TestLastManName", 50);
        Woman testWoman = new Woman("TestFirstWomanName","TestLastWomanName", 49);

        Assert.assertFalse(testMan.isRetired(),"Man shouldn't be Retired");
        Assert.assertFalse(testWoman.isRetired(),"Woman shouldn't be Retired");
    }
    @Test
    public void testIsRetired(){
        Man testMan = new Man("TestFirstManName","TestLastManName", 65);
        Woman testWoman = new Woman("TestFirstWomanName","TestLastWomanName", 60);

        Assert.assertTrue(testMan.isRetired(),"Man should be Retired");
        Assert.assertTrue(testMan.isRetired(),"Woman should be Retired");
    }
    @Test
    public void testRegisterPartnerShip() {
        Man testMan = new Man("TestFirstManName","TestLastManName", 65);
        Woman testWoman = new Woman("TestFirstWomanName","TestLastWomanName", 60);
        testMan.registerPartnership(testWoman);
        Assert.assertEquals(
                testWoman.getLastName(),
                "TestLastManName",
                "Woman gets mans last name by register partnership"
        );

    }
    @Test
    public void testDeregisterPartnership(){
        Man testMan = new Man("TestFirstManName","TestLastManName", 65);
        Woman testWoman = new Woman("TestFirstWomanName","TestLastWomanName", 60);
        testMan.registerPartnership(testWoman);
        Assert.assertEquals(
                testWoman.getMaidenName(),
                "TestLastWomanName",
                "Woman last name returned to maiden name by deregister partnership");
    }
}
