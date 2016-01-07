package com.packtpub.wicket.commerce;

import com.pentasys.moneypattern.Money;
import com.pentasys.moneypattern.differentCurrencyException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cart implements java.io.Serializable {
  private List<Cheese> cheeses = new ArrayList<Cheese>();

  private Address billingAddress = new Address();

  public List<Cheese> getCheeses() {
    return cheeses;
  }

  public void setCheeses(List<Cheese> other) {
    cheeses = other;
  }

  public Address getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(Address other) {
    billingAddress = other;
  }

  public double getTotal() {
    //double total = 0;
    Money sum = new Money(0);    
    for (Cheese cheese : cheeses) {
        try {
            //total += cheese.getPrice();
            sum.add(cheese.getPriceMoney());
        } catch (differentCurrencyException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Currency Exception in Cart::getTotal");
        }
    }
    return Double.parseDouble(sum.printAmount());
  }
}
