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



    // @Test
    // public void PartyPlanner_partyOfTenReturnsPrice_50() {
    //   PartyPlanner testPartyPlanner = new PartyPlanner();
    //   assertEquals(50, testPartyPlanner.partySize(10));
    //   assertEquals(250, testPartyPlanner.partySize(375));
    // }
    //
    // @Test
    // public void PartyPlanner_lightSnackReturnsPrice_100() {
    //   PartyPlanner testPartyPlanner = new PartyPlanner();
    //   assertEquals(100, testPartyPlanner.foodType("snack"));
    // }


}
