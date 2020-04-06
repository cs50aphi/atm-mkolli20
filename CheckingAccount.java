public class CheckingAccount
{
    float balance;

    public CheckingAccount(float c)
    {
        balance = c;
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