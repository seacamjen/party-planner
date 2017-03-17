import org.junit.*;
import static org.junit.Assert.*;

public class PartyPlannerTest {


  @Test
    public void PartyPlanner_instantiatesCorrectly() {
      PartyPlanner testPartyPlanner = new PartyPlanner(10, "snacks", "light bar", "clown", "birthday");
      assertEquals(true, testPartyPlanner instanceof PartyPlanner);
    }

  @Test
    public void PartyPlanner_getPartySize_10() {
      PartyPlanner testPartyPlanner = new PartyPlanner(10, "snacks", "light bar", "clown", "birthday");
      assertEquals(10, testPartyPlanner.getPartySize());
    }

  @Test
    public void PartyPlanner_getFoodType_String() {
      PartyPlanner testPartyPlanner = new PartyPlanner(10, "snacks", "light bar", "clown", "birthday");
      assertEquals("snacks", testPartyPlanner.getFoodType());
      }

  @Test
    public void PartyPlanner_getBeverageType_String() {
      PartyPlanner testPartyPlanner = new PartyPlanner(10, "snacks", "light bar", "clown", "birthday");
      assertEquals("light bar", testPartyPlanner.getBeverageType());
      }

  @Test
    public void PartyPlanner_getEntertainmentType_String() {
      PartyPlanner testPartyPlanner = new PartyPlanner(10, "snacks", "light bar", "clown", "birthday");
      assertEquals("clown", testPartyPlanner.getEntertainmentType());
      }

  @Test
    public void PartyPlanner_getDecorationsType_String() {
      PartyPlanner testPartyPlanner = new PartyPlanner(10, "snacks", "light bar", "clown", "birthday");
      assertEquals("birthday", testPartyPlanner.getDecorationsType());
      }

  @Test
    public void PartyPlanner_determineFoodPrice_100() {
      PartyPlanner testPartyPlanner = new PartyPlanner(10, "snacks", "light bar", "clown", "birthday");
      assertEquals(100, testPartyPlanner.foodPrice());
      }

  @Test
    public void PartyPlanner_determineFoodPrice_1875() {
      PartyPlanner testPartyPlanner = new PartyPlanner(375, "snacks", "light bar", "clown", "birthday");
      assertEquals(1875, testPartyPlanner.foodPrice());
      }

  @Test
    public void PartyPlanner_determineBeveragePrice_250() {
      PartyPlanner testPartyPlanner = new PartyPlanner(10, "snacks", "light bar", "clown", "birthday");
      assertEquals(150, testPartyPlanner.beveragePrice());
      }

  @Test
    public void PartyPlanner_determineBeveragePrice_2107() {
      PartyPlanner testPartyPlanner = new PartyPlanner(301, "snacks", "light bar", "clown", "birthday");
      assertEquals(2107, testPartyPlanner.beveragePrice());
      }

  @Test
  public void PartyPlanner_determineEntertainmentPrice_200() {
    PartyPlanner testPartyPlanner = new PartyPlanner(10, "snacks", "light bar", "clown", "birthday");
    assertEquals(200, testPartyPlanner.entertainmentPrice());
  }

  @Test
  public void PartyPlanner_determineEntertainmentPrice_600() {
    PartyPlanner testPartyPlanner = new PartyPlanner(10, "snacks", "light bar", "band", "birthday");
    assertEquals(600, testPartyPlanner.entertainmentPrice());
  }

}
