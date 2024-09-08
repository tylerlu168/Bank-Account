public class BankAccount
{
    private double balance; //instance variable

    public BankAccount(double balance2)
    {
        balance = balance2;
    }
    public double getBalance() //getter method for balance
    {
        return balance;
    }

    public void deposit(double deposit) //adds money to balance
    {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) //takes money away from balance
    {
        this.balance -= withdraw;
    }

    @Override
    public String toString()
    {
        return "balance=" +
                balance;
    }
}
