import java.util.*;
public class Main {
  public static void main(String[] args){
    int[] prices = {7};      
    int min = Integer.MAX_VALUE;
    int profit = 0;

    for(int price:prices){
      if(price<min){
        min=price;
      }
      if(price-min>profit){
        profit=price-min;
      }
    }

    System.out.println(profit);
    
  }
}
