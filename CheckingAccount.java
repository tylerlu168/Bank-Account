public class CheckingAccount extends BankAccount
{
    private int FREE_TRANSACTIONS;
    private double TRANSACTION_FEE;
    private int transactions;

    public CheckingAccount(double balance)
    {
        super(balance);
        FREE_TRANSACTIONS = 3;
        TRANSACTION_FEE = 2.0;
    }
    public void deposit(double deposit)
    {
        super.deposit(deposit);
        transactions++;
    }
    public void withdraw(double withdraw)
    {
        super.withdraw(withdraw);
        transactions++;
    }

    public void deductFees()
    {
        if(FREE_TRANSACTIONS < transactions) //if statement checks whether if there are more transactions than free transactions given
        {
            transactions -= FREE_TRANSACTIONS;
            transactions *= TRANSACTION_FEE;
            super.withdraw(transactions);
            transactions = 0;
        }
    }
    @java.lang.Override
    public java.lang.String toString()
    {
        return super.toString() + //uses toString BankAccount balance output
                ',' + " transaction=" + transactions;
    }

}
