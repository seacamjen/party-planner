class PartyPlanner {

  public PartyPlanner() {

  }

  public int partySize(int guests){
    if (guests <= 35) {
      return 50;
    } else if (guests > 35 && guests <= 70) {
      return 75;
    } else if (guests > 70 && guests <= 125) {
      return 100;
    } else if (guests > 125 && guests <= 200) {
      return 150;
    } else if (guests > 200 && guests <= 300) {
      return 200;
    } else if (guests > 300 && guests <= 450) {
      return 250;
    }
    return 0;
  }
}
