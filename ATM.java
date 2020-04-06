import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        CheckingAccount checking = new CheckingAccount(50);
        SavingsAccount saving = new SavingsAccount(50);

        Boolean Power = true;
        int transactions = 0;

        do
        {
            System.out.println("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit? ");
            char input = kb.next().charAt(0);
            if (input == 'Q' || input == 'q')
            {
                System.out.println("Your Checking Account has " + checking.balance + " credits");
                System.out.println("Your Savings Account has " + saving.balance + " credits");
                Power = false;
            }
            if (input == 'C' || input == 'c')
            {
                System.out.println("Your Checking Account has " + checking.balance + " credits");
                System.out.println("Your Savings Account has " + saving.balance + " credits");

            }
            if (input == 'D' || input == 'd')
            {
                System.out.println("Deposit to (1)Checking Account or (2)Savings Account");
                int acc = sn.nextInt();
                System.out.println("how many credits do you want to deposit?");
                float depo = sn.nextFloat();

                if(acc == 1)
                {
                    checking.deposit(depo);
                }
                if(acc == 2)
                {
                    saving.deposit(depo);
                }
            }
            if (input == 'W' || input == 'w')
            {
                System.out.println("Withdraw from (1)Checking Account or (2)Savings Account");
                int acc = sn.nextInt();
                System.out.println("how many credits do you want to withdraw?");
                float with = sn.nextFloat();

                if(acc == 1)
                {
                    if(with > checking.balance)
                    {
                        System.out.println("Insufficient Funds");
                    }
                    if(with <= checking.balance)
                    {
                        checking.withdraw(with);
                    }
                }
                if(acc == 2)
                {
                    if(with > saving.balance)
                    {
                        System.out.println("Insufficient Funds");
                    }
                    if(with <= saving.balance)
                    {
                        saving.withdraw(with);
                    }
                }
            }
            if(input == 'T' || input == 't')
            {
                System.out.println("Transfer from (1)Checking Account or (2)Savings Account");
                int acc = sn.nextInt();
                System.out.println("how many credits do you want to transfer?");
                float trans = sn.nextFloat();

                if(acc == 1)
                {
                    if(trans > checking.balance)
                    {
                        System.out.println("Insufficient Funds");
                    }
                    if(trans <= checking.balance)
                    {
                        checking.withdraw(trans);
                        saving.deposit(trans);
                    }
                }
                if(acc == 2)
                {
                    if(trans > saving.balance)
                    {
                        System.out.println("Insufficient Funds");
                    }
                    if(trans <= saving.balance)
                    {
                        saving.withdraw(trans);
                        checking.deposit(trans);
                    }
                }
            }
            
        } while (Power == true);
        System.out.println("Thank You for using this ATM. Have a good day");
    }
}