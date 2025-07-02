package questions.playcode.oop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Receipt {
     private final Printer printer;

     private final List<Item> item = new ArrayList<>();
     private final List<Money> amount = new ArrayList<>();

     public Receipt(Printer p){
         this.printer = p;
     }

     public void add(String description, Money price){
           item.add(new Item(description, price));
     }


    public void print(){
       item.forEach(item -> item.print(printer));
    }
}
