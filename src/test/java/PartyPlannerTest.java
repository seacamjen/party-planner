import org.junit.*;
import static org.junit.Assert.*;

public class PartyPlannerTest {

    @Test
    public void PartPlanner_partyOfTenReturnsPrice_50() {
      PartyPlanner testPartyPlanner = new PartyPlanner();
      assertEquals(50, testPartyPlanner.partySize(10));
      assertEquals(250, testPartyPlanner.partySize(375));
    }


}
