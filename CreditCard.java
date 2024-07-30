
/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
    private int cvc_Number;
    private double credit_Limit;
    private double interest_Rate;
    private String expiration_Date;
    private int grace_Period;
    private boolean isGranted;

    public CreditCard(int card_Id, String clientName, String issuerBank, String bankAccount, double balanceAmount, int cvc_Number, double interest_Rate, String expiration_Date)
    {
        super(card_Id, bankAccount, issuerBank, balanceAmount);
        super.setClientName(clientName);
        this.cvc_Number = cvc_Number;
        this.interest_Rate = interest_Rate;
        this.expiration_Date = expiration_Date;
        this.isGranted = false;
    }
    //getter method.
    public int getCVC_Number()
    {
        return this.cvc_Number;
    }

    public int getGrace_Period()
    {
        return this.grace_Period;
    }

    public double getCredit_Limit()
    {
        return this.credit_Limit;
    }

    public double getInterest_Rate()
    {
        return this.interest_Rate;
    }
    
    public String getExpiration_Date()
    {
        return this.expiration_Date;
    }

    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    //setter method.
    public void setCredit_Limit(double credit_Limit, int grace_Period)
    {
        if(credit_Limit <= 2.5*getBalanceAmount())
        {
            this.credit_Limit = credit_Limit;
            this.grace_Period = grace_Period;
            this.isGranted = true;
        }
        else
        {
            System.out.println("You do not have enough balance. Credit cannot be issued.");
        }
    }
    //Method to remove client's credit card.
    public void cancelCreditCard()
    {
        this.cvc_Number = 0;
        this.credit_Limit = 0;
        this.grace_Period = 0;
        this.isGranted = false;
        System.out.println("Your credit card is cancelled.");
    }
    //To display the details of Credit Card.
    //overriding
    public void display()
    {
        if(this.isGranted == true)
        {
            super.display();
            System.out.println("Dear Customer, Your CVC Number is "+getCVC_Number()+".");
            System.out.println("Dear Customer, Your credit limit is "+getCredit_Limit()+".");
            System.out.println("Dear Customer, The rate of interest is "+getInterest_Rate()+".");
            System.out.println("Dear Customer, Your credit expiration date is "+getExpiration_Date()+".");
            System.out.println("Dear Customer, Your grace period is "+getGrace_Period()+".");

        }
        else
        {
            System.out.println("Hello " +getClientName()+".");
            System.out.println("You have NRP." +getBalanceAmount()+ " in your A/C.");
            System.out.println("Your account is " +getBankAccount()+".");
            System.out.println("Your Card ID is " +getCard_Id()+".");
            System.out.println("Your bank of issue is " +getIssuerBank()+".");
        }
    }
}