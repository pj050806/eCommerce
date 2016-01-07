package com.packtpub.wicket.commerce;

import com.pentasys.moneypattern.Money;
import java.io.Serializable;

public class Cheese implements Serializable {
  private String name;
  private String description;
  private Money price;
  public Cheese(String name, String description, double price) {
    super();
    this.name = name;
    this.description = description;
    this.price=new Money(price);
  }
  public String getName() {
    return name;
  }
  public String getDescription() {
    return description;
  }
  public double getPrice() {
    return Double.parseDouble(this.price.printAmount());
  }
  public Money getPriceMoney() {
      return price;
  }
}
