import org.junit.*;
import static org.junit.Assert.*;

public class PartyPlannerTest {


  @Test
    public void PartyPlanner_instantiatesCorrectly(){
      PartyPlanner testPartyPlanner = new PartyPlanner(10, "snacks", "light bar", "clown", "birthday");
      assertEquals(true, testPartyPlanner instanceof PartyPlanner);
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
