class PartyPlanner {
  private int mPartySize;
  private String mFood;
  private String mBeverages;
  private String mEntertainment;
  private String mDecorations;



  public PartyPlanner(int guests, String food, String beverages, String entertainment, String decor) {
    mPartySize = guests;
    mFood = food;
    mBeverages = beverages;
    mEntertainment = entertainment;
    mDecorations = decor;
  }

  public int getPartySize() {
    return mPartySize;
  }

  public String getFoodType() {
    return mFood;
  }

  public String getBeverageType() {
    return mBeverages;
  }

  public String getEntertainmentType() {
    return mEntertainment;
  }

  public String getDecorationsType() {
    return mDecorations;
  }

  public int foodPrice() {
    int total = 0;
    if (mPartySize <= 35) {
      total = mPartySize * 10;
      return total;
    }
    return total;
  }

  // public int partySize(int guests){
  //   if (guests <= 35) {
  //     return 50;
  //   } else if (guests > 35 && guests <= 70) {
  //     return 75;
  //   } else if (guests > 70 && guests <= 125) {
  //     return 100;
  //   } else if (guests > 125 && guests <= 200) {
  //     return 150;
  //   } else if (guests > 200 && guests <= 300) {
  //     return 200;
  //   } else if (guests > 300 && guests <= 450) {
  //     return 250;
  //   }
  //   return 0;
  // }
  //
  // public int foodType(String food){
  //   if (food.equals("snack")){
  //     return 100;
  //   }
  //   return 0;
  // }
}
