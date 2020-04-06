public class SavingsAccount
{
    float balance;

    public SavingsAccount(float s)
    {
        balance = s;
    }

    public void deposit(float d)
    {
        balance += d;
    }

    public void withdraw(float w)
    {
        balance -= w;
    }
}