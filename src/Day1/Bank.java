package Day1;

class Calculation {
    public static void savingsUserAccount(){
        float BalanceofAmrita = 100000f;
        float RateofInterestSaving = 0.03f;
        float PerMonthSavings = (RateofInterestSaving /12);
        float Interest =0;
        float newBalanceSavings;
        Interest = Interest + (BalanceofAmrita *3* PerMonthSavings);
        newBalanceSavings = BalanceofAmrita + Interest;
        System.out.println("Interest given  for the first quarter = " + Interest);
        System.out.println("Amount in the account after first quarter interest = " + newBalanceSavings);
        System.out.println();
    }

    public static void currentUserAccount(){
        float Initial_Balance =50000f;
        float Deposit_Amount = 10000f;
        float New_Balance = Initial_Balance + Deposit_Amount;
        float Overdraft_limit = 0.2f;
        float withdrawAmount = 70000f;
        float Max_Withdrawal = 0, Remaining_Balance = 0;
        Max_Withdrawal = New_Balance + New_Balance * Overdraft_limit;
        Remaining_Balance = Max_Withdrawal - withdrawAmount;
        if (Max_Withdrawal > withdrawAmount){
            System.out.println("The funds are sufficient enough to make a withdrawal");
            System.out.println("The New balance after withdrawal is: " + Remaining_Balance);
        }
        else{
            System.out.println("The balance is inadequate");
        }

    }

}

public class Bank {
    public static void main(String[] args) {
        Calculation.savingsUserAccount();
        Calculation.currentUserAccount();
    }
}
