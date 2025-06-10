public class Bank {
  private int Balance = 50000;

  public int getBalance(){
    return Balance;
  }

  public int withdraw(int fund) throws LesserBalanceException, NonNegativeException {
    if(fund<0){
      throw new NonNegativeException("Withdraw amount should be greater than zero");
    }else if(Balance<fund){
      throw new LesserBalanceException("Withdraw amount should be lesser than Balance");
    }else{
      Balance=Balance-fund;
      return Balance;
    }
  }
}
