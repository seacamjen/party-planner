import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    PartyPlanner birthday1 = new PartyPlanner(25, "snacks", "none", "clown", "birthday");
    PartyPlanner wedding1 = new PartyPlanner(150, "dinner", "premium bar", "dj", "wedding");
    PartyPlanner sports1 = new PartyPlanner(30, "snacks", "light bar", "none", "none");

    List<PartyPlanner> allPlans = new ArrayList<PartyPlanner>();
    allPlans.add(birthday1);
    allPlans.add(wedding1);
    allPlans.add(sports1);

    boolean programRun = true;

    while (programRun) {

      System.out.println("Welcome to the best party planning ever! What would you like to do? If you would like to look at existing plans enter: plan, if you would like to create your own plan enter: create, if you would like to enter a coupon/discount code enter: discount, if you would like to leave enter: exit.");
      String userInput = console.readLine();


      if (userInput.equals("plan")) {
        for (PartyPlanner plan : allPlans ) {
          System.out.println("<><><><><><><><><><>");
          System.out.println("Party Size: " + plan.getPartySize());
          System.out.println("Food Type: " + plan.getFoodType());
          System.out.println("Beverage Type: " + plan.getBeverageType());
          System.out.println("Entertainment Type: " + plan.getEntertainmentType());
          System.out.println("Decorations Type: " + plan.getDecorationsType());
          System.out.println("Total Price: " + plan.totalPrice());
          System.out.println(" ");
        }
      } else if(userInput.equals("create")) {
        System.out.println("What is the size of your party?");
        int userPartySize = Integer.parseInt(console.readLine());
        System.out.println("What type of food would you like? snacks, dinner or none");
        String userFoodType = console.readLine();
        System.out.println("What type of beverages would you like? light bar, premium bar or none");
        String userBeverageType = console.readLine();
        System.out.println("What kind of entertainment would you like? clown, comedian, band, dj, or none");
        String userEntertainmentType = console.readLine();
        System.out.println("What kind of decorations would you like? birthday, wedding, sports, or none");
        String userDecorationType = console.readLine();
        PartyPlanner userPlan = new PartyPlanner(userPartySize, userFoodType, userBeverageType, userEntertainmentType, userDecorationType);
        allPlans.add(userPlan);
        System.out.println(" ");
        System.out.println("Here is your Party Plan:");
          System.out.println("<><><><><><><><><><>");
          System.out.println("Party Size: " + userPlan.getPartySize());
          System.out.println("Food Type: " + userPlan.getFoodType());
          System.out.println("Beverage Type: " + userPlan.getBeverageType());
          System.out.println("Entertainment Type: " + userPlan.getEntertainmentType());
          System.out.println("Decorations Type: " + userPlan.getDecorationsType());
          System.out.println("Total Price: " + userPlan.totalPrice());
          System.out.println(" ");
      } else if(userInput.equals("discount")){

      } else if(userInput.equals("exit")){
        programRun = false;
      }
    } //while loop end

  }
}
