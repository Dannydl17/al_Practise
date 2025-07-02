package questions.playcode.oop;

import java.math.BigDecimal;

public class Money {
     private final BigDecimal amount;

     private final String currency;

     public Money(BigDecimal amount, String currency){
         this.amount = amount;
         this.currency = currency;
     }

     public void print(Printer p){
         p.print(currency);
         p.print(String.valueOf(amount));
     }
}
