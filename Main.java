import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    int fund=0;
    Bank savings = new Bank();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the amount to be withdrawn :");
    try{
      fund = scanner.nextInt();
      savings.withdraw(fund);
    }catch(NonNegativeException e){
      System.out.println(e.getMessage());
    }catch(LesserBalanceException e){
      System.out.println(e.getMessage());
    }catch(Exception e){
      System.out.println("Invalid input, must be a number");
    }finally{
      System.out.println("Available balance is :"+savings.getBalance());
    }
  }
}
