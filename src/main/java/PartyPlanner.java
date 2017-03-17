class PartyPlanner {

  public PartyPlanner() {

  }

  public int partySize(int guests){
    if (guests <= 35) {
      return 50;
    }
    return 0;
  }
}
