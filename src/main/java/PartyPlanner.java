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
    if (mFood.equals("snacks")){
      if (mPartySize <= 35) {
        total = mPartySize * 10;
        return total;
      } else if (mPartySize > 35 && mPartySize <= 70) {
        total = mPartySize * 9;
        return total;
      } else if (mPartySize > 70 && mPartySize <= 125) {
        total = mPartySize * 8;
        return total;
      } else if (mPartySize > 125 && mPartySize <= 200) {
        total = mPartySize * 7;
        return total;
      } else if (mPartySize > 200 && mPartySize <= 300) {
        total = mPartySize * 6;
        return total;
      } else if (mPartySize > 300 && mPartySize <= 450) {
        total = mPartySize * 5;
      }
      return total;
    } else if (mFood.equals("dinner")) {
      if (mPartySize <= 35) {
        total = mPartySize * 40;
        return total;
      } else if (mPartySize > 35 && mPartySize <= 70) {
        total = mPartySize * 39;
        return total;
      } else if (mPartySize > 70 && mPartySize <= 125) {
        total = mPartySize * 38;
        return total;
      } else if (mPartySize > 125 && mPartySize <= 200) {
        total = mPartySize * 37;
        return total;
      } else if (mPartySize > 200 && mPartySize <= 300) {
        total = mPartySize * 36;
        return total;
      } else if (mPartySize > 300 && mPartySize <= 450) {
        total = mPartySize * 35;
        return total;
      }
    }
    return total;
  }

  public int beveragePrice() {
    int total = 0;
    if (mBeverages.equals("light bar")){
      if (mPartySize <= 35) {
        total = mPartySize * 15;
        return total;
      } else if (mPartySize > 35 && mPartySize <= 70) {
        total = mPartySize * 14;
        return total;
      } else if (mPartySize > 70 && mPartySize <= 125) {
        total = mPartySize * 13;
        return total;
      } else if (mPartySize > 125 && mPartySize <= 200) {
        total = mPartySize * 10;
        return total;
      } else if (mPartySize > 200 && mPartySize <= 300) {
        total = mPartySize * 9;
        return total;
      } else if (mPartySize > 300 && mPartySize <= 450) {
        total = mPartySize * 7;
        return total;
      }
    } else if (mBeverages.equals("premium bar")) {
      if (mPartySize <= 35) {
        total = mPartySize * 25;
        return total;
      } else if (mPartySize > 35 && mPartySize <= 70) {
        total = mPartySize * 24;
        return total;
      } else if (mPartySize > 70 && mPartySize <= 125) {
        total = mPartySize * 23;
        return total;
      } else if (mPartySize > 125 && mPartySize <= 200) {
        total = mPartySize * 20;
        return total;
      } else if (mPartySize > 200 && mPartySize <= 300) {
        total = mPartySize * 19;
        return total;
      } else if (mPartySize > 300 && mPartySize <= 450) {
        total = mPartySize * 17;
        return total;
      }
    }
    return total;
  }

  public int entertainmentPrice() {
    if (mEntertainment.equals("clown")) {
      return 200;
    } else if (mEntertainment.equals("comedian")) {
      return 450;
    } else if (mEntertainment.equals("band")) {
      return 600;
    }
    return 0;
  }

  public int decorationPrice() {
    if (mDecorations.equals("birthday")) {
      return 100;
    } else if (mDecorations.equals("wedding")) {
      return 600;
    } else if (mDecorations.equals("sports")) {
      return 450;
    }
    return 0;
  }

  public int totalPrice() {
    int total = foodPrice() + beveragePrice() + entertainmentPrice() + decorationPrice();
    return total;
  }

  public int birthdayPackage() {
    int total = totalPrice();
    if (mPartySize >= 50 && mFood.equals("dinner") && beveragePrice() > 0 && mEntertainment.equals("clown") && mDecorations.equals("birthday")){
      total = total - 100;
      return total;
    }
    return total;
  }

  public int weddingPackage() {
    int total = totalPrice();
    if (mPartySize >= 100 && mFood.equals("dinner") && mBeverages.equals("premium bar") && entertainmentPrice() > 0 && decorationPrice() > 0 ) {
      total = total - 600;
      return total;
    }
    return total;
  }

}
