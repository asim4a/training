class HDFCAccount implements IAccount
{
    double deposits;
    double withdrawals;


    public double getBalance()
    {
        return deposits - withdrawals;
    }

    public void deposit(double amount)
    {
        deposits += amount;
    }

    public void withdraw(double amount)
    {
        withdrawals += amount;
    }
}
