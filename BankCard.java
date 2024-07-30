
/**
 * Write a description of class BankCard here.
 *
 * @author (Sanam Budha)
 * @version (1)
 */
public class BankCard
{
    private int card_Id;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;

    public BankCard(int card_Id, String bankAccount, String issuerBank, double balanceAmount){
        this.clientName = "";
        this.balanceAmount = balanceAmount;
        this.card_Id = card_Id;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
    }
    //getter

    public String getClientName()
    {
        return this.clientName;
    }
    
    public int getCard_Id()
    {
        return this.card_Id;
    }

    public String getIssuerBank()
    {
        return this.issuerBank;
    }

    public String getBankAccount()
    {
        return this.bankAccount;
    }

    public double getBalanceAmount()
    {
        return this.balanceAmount;
    }
    //setter

    public void setClientName ( String clientName)
    {
        this.clientName = clientName;
    }

    public void setBalanceAmount (double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }
    //To display details of Bank Card.

    public void display()
{
        if(clientName == "")
        {
            System.out.println("Client name is not assigned. Please enter your name.");
        }
        else
        {
            System.out.println("Your name is "+this.clientName);
            System.out.println("Dear Customer, You have NRP."+this.balanceAmount+" in your bank account.");
            System.out.println("Dear Customer, Your account number is "+this.bankAccount+".");
            System.out.println("Dear Customer, Your Card Id is "+this.card_Id+".");
            System.out.println("Dear Customer, Your bank of issue is "+this.issuerBank+".");
        }

    }
}
