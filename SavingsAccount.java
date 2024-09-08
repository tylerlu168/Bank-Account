public class SavingsAccount extends BankAccount
{
    private double interestRate;
    public SavingsAccount(double balance, double interestRate)
    {
        super(balance);
        this.interestRate = interestRate;
    }
    public void addInterest()
    {
        super.deposit(getBalance() * interestRate); //adds interest to balance in BankAccount
    }

    @Override
    public String toString()
    {
        return super.toString() +
                ',' + " interestRate=" + interestRate;
    }
}
