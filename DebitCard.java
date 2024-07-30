
/**
 * Write a description of class DebitCard here.
 *
 * @author (Sanam Budha)
 * @version (2)
 */
public class DebitCard extends BankCard
{
    private int pin_Number;
    private int withdrawal_Amount;
    private String date_Of_Withdrawal;
    private boolean has_Withdrawn;

    public DebitCard(int card_Id, String clientName, String issuerBank, double balanceAmount, String bankAccount, int pin_Number)
    {
        super(card_Id, bankAccount, issuerBank, balanceAmount);
        super.setClientName(clientName);
        this.pin_Number = pin_Number;
        this.has_Withdrawn = false;
    }

    //getter method.
    public int getPin_Number()
    {
        return this.pin_Number;
    }

    public String getDate_Of_Withdrawal()
    {
        return this.date_Of_Withdrawal;
    }

    public boolean getHas_Withdrawn()
    {
        return this.has_Withdrawn;
    }

    public int getWithdrawal_Amount()
    {
        return this.withdrawal_Amount;
    }
    //setter

    public void setWithdrawal_Amount(int withdrawal_Amount)
    {
        this.withdrawal_Amount = withdrawal_Amount;

    }

    public void withdraw(int withdrawal_Amount, String date_Of_Withdrawal, int pin_Number) 
    {
        if(pin_Number == this.pin_Number)
        {
            if(super.getBalanceAmount()>=withdrawal_Amount)
            {
                this.has_Withdrawn = true;
                this.withdrawal_Amount = withdrawal_Amount;
                this.date_Of_Withdrawal = date_Of_Withdrawal;
                super.setBalanceAmount(getBalanceAmount()-withdrawal_Amount);
            }
            else
            {
                System.out.println("You don't have enough balance in your bank account");
            }
        }
        else
        {
            System.out.println("Invalid pin number. Please try again.");
        }
    }

    //To display details of Debit Card.
    public void display()
    {
        if(this.has_Withdrawn == true)
        {
            super.display();
            System.out.println("Dear Customer, Your pin number is "+getPin_Number()+".");
            System.out.println("Dear Customer, You have withdrawn NRP." +getWithdrawal_Amount()+ " from your A/C.");
            System.out.println("Dear Customer, You have withdrawn money on : "+getDate_Of_Withdrawal());
        }
        else
        {
            System.out.println("Dear Customer, You have NRP."+super.getBalanceAmount()+" in your bank account.");
        }
    }
}