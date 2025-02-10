package OopClass.payment;

import OopClass.Animals.puplic;

public abstract class Payment {

  int amount, creditCardNumber, paypalEmail;
  public abstract void pay();

  public Payment(int amount_) {
    this.amount = amount_;
  }

  public int getPay() {
    return amount;
  }

  public int Payment(int creditCardNumber_) {
    this.creditCardNumber = creditCardNumber;
  }

  public int Payment() {
    return creditCardNumber;
  }

  puplic String 

  Payment(String paypalEmail_) {
    this.paypalEmail = paypalEmail_;
  }

  puplic String Payment() {
    return paypalEmail;
  }

}