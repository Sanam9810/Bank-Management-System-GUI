import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener.*;
import javax.swing.JButton;
import java.util.ArrayList;
/**
 * Write a description of class BankGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankGUI implements ActionListener
{
    JFrame BankFrame, DebitFrame, CreditFrame, WithdrawFrame, CreditLimitFrame, CancelCreditFrame;//Declaring Frame

    JLabel Heading, Heading1, Heading2, Heading3,SubHead1, SubHead2, ClientName, CardID, BankAccount, IssuerBank, BalanceAmount, PinNumber, Client_Name, Bank_Account, Balance_Amount, Card_ID, Issuer_Bank, CVCNumber, InterestRate, ExpirationDate, cardID, WithdrawalAmount, DateOfWithdrawal, pinNumber, Heading4, Heading5, card_ID, CreditLimit, GracePeriod, Heading6, ccdCardID;//Declaring Labels

    JButton DebitButton, CreditButton, WithdrawButton, DisplayButton, ClearButton, btnDisplay, CreditLimitButton, CancelCreditButton, btnClear, AddCreditButton, AddDebitButton, withdrawButton, displayButton, clearButton, buttonDisplay, buttonClear, btnCreditLimit, b1, b2, b3, b4, CancelCreditBtn;//Declaring Buttons

    JPanel p1, p2, p3, p4, p5, p6;//Declaring Panels

    JTextField txtClientName, txtBankAccount, txtBalanceAmount, txtCardID, txtIssuerBank, txtPinNumber, txtClient_Name, txtBank_Account, txtBalance_Amount, txtCard_ID, txtIssuer_Bank, txtCVCNumber, txtInterestRate, txtcardID, txtWithdrawalAmount, txtpinNumber, txtcard_ID, txtCreditLimit, txtGracePeriod, txtCancelCardID;//Declaring text fields

    JComboBox <String> DayComboBox,dayComboBox, MonthComboBox, YearComboBox, monthComboBox, yearComboBox;//Declaring combo boxes.

    int cardid, balanceamount, pinnumber, cBalanceAmount, cCardID, cCVCNumber, cInterestRate;//declaring integral variables

    String clientname, bankaccount, issuerbank, cClientName, cBankAccount, cIssuerBank, cExpirationDate;//Declaring string variables

    ArrayList<BankCard> List = new ArrayList<BankCard>();//Declaring ArrayList

    BankGUI()
    {
        BankFrame = new JFrame();
        //adding panel in Bank Frame
        p1 = new JPanel();
        p1.setBounds(0,0,586,535);
        p1.setLayout(null);

        //Adding labels in panel for BankFrame
        Heading = new JLabel("Welcome to Himalaya Bank");
        Heading.setBounds(92,45,402,46);
        Heading.setFont(new Font("Helvetica",Font.BOLD,30));
        p1.add(Heading);

        Heading1 = new JLabel("Please choose your card of interest.");
        Heading1.setBounds(86,142,413,36);
        Heading1.setFont(new Font("Helvetica",Font.BOLD,24));
        p1.add(Heading1);

        //adding buttons in panel for Bank frame
        DebitButton = new JButton("Debit Card");
        DebitButton.setBounds(218,256,150,48);

        p1.add(DebitButton);

        CreditButton = new JButton("Credit Card");
        CreditButton.setBounds(218,356,150,48);

        p1.add(CreditButton);

        BankFrame.setLayout(null);
        BankFrame.setSize(586,535);
        BankFrame.add(p1);
        BankFrame.setVisible(true);
        BankFrame.setResizable(false);
        BankFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Debit frame
        DebitFrame = new JFrame();
        p2 = new JPanel();
        p2.setBounds(0,0,825,600);
        p2.setLayout(null);

        //Code for Heading
        Heading2 = new JLabel("Debit Card");
        Heading2.setBounds(333,26,159,42);
        Heading2.setFont(new Font("Helvetica",Font.BOLD,30));
        p2.add(Heading2);

        //Code for Labels of Debit Class
        ClientName = new JLabel("Client Name : ");
        ClientName.setBounds(33,129,114,20);
        ClientName.setFont(new Font("Helvetica",Font.PLAIN,16));
        p2.add(ClientName);

        BankAccount = new JLabel("Bank Account : ");
        BankAccount.setBounds(33,208,114,20);
        BankAccount.setFont(new Font("Helvetica",Font.PLAIN,16));
        p2.add(BankAccount);

        BalanceAmount = new JLabel("Balance Amount : ");
        BalanceAmount.setBounds(33,287,130,22);
        BalanceAmount.setFont(new Font("Helvetica",Font.PLAIN,16));
        p2.add(BalanceAmount);

        CardID = new JLabel("Card ID : ");
        CardID.setBounds(470,127,130,20);
        CardID.setFont(new Font("Helvetica",Font.PLAIN,16));
        p2.add(CardID);

        IssuerBank = new JLabel("Issuer Bank : ");
        IssuerBank.setBounds(470,206,130,20);
        IssuerBank.setFont(new Font("Helvetica",Font.PLAIN,16));
        p2.add(IssuerBank);

        PinNumber = new JLabel("Pin Number : ");
        PinNumber.setBounds(470,285,130,22);
        PinNumber.setFont(new Font("Helvetica",Font.PLAIN,16));
        p2.add(PinNumber);

        //Code For TextFields
        txtClientName = new JTextField();
        txtClientName.setBounds(177,123,180,32);
        p2.add(txtClientName);

        txtBankAccount = new JTextField();
        txtBankAccount.setBounds(177,202,180,32);
        p2.add(txtBankAccount);

        txtBalanceAmount = new JTextField();
        txtBalanceAmount.setBounds(177,281,180,32);
        p2.add(txtBalanceAmount);

        txtCardID = new JTextField();
        txtCardID.setBounds(608,120,180,32);
        p2.add(txtCardID);

        txtIssuerBank = new JTextField();
        txtIssuerBank.setBounds(608,200,180,32);
        p2.add(txtIssuerBank);

        txtPinNumber = new JTextField();
        txtPinNumber.setBounds(608,280,180,32);
        p2.add(txtPinNumber);

        //Code for adding Buttons in DebitCard Frame
        WithdrawButton = new JButton("Withdraw");
        WithdrawButton.setBounds(342,485,160,55);
        WithdrawButton.setBackground(Color.LIGHT_GRAY);
        WithdrawButton.setFont(new Font("Helvetica",Font.PLAIN,18));
        p2.add(WithdrawButton);

        //button to go back to bank frame
        b2 = new JButton("|<");
        b2.setBounds(17,17,37,32);
        b2.setFont(new Font("Helvetica",Font.BOLD,14));
        p2.add(b2);

        //Display Button
        DisplayButton = new JButton("Display");
        DisplayButton.setBounds(76,485,160,55);
        DisplayButton.setFont(new Font("Helvetica",Font.PLAIN,18));
        p2.add(DisplayButton);

        //ClearButton
        ClearButton = new JButton("Clear");
        ClearButton.setBounds(608,485,160,55);
        ClearButton.setFont(new Font("Helvetica",Font.PLAIN,18));
        p2.add(ClearButton);

        //Button for adding information to debit card
        AddDebitButton = new JButton("Add Debit Card");
        AddDebitButton.setBounds(342,381,160,55);
        AddDebitButton.setFont(new Font("Helvetica",Font.PLAIN,18));
        p2.add(AddDebitButton);

        DebitFrame.add(p2);
        DebitFrame.setSize(825,600);
        DebitFrame.setLayout(null);
        DebitFrame.setVisible(false);
        DebitFrame.setResizable(false);
        DebitFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Credit Card code
        CreditFrame = new JFrame();

        //adding panel
        p3 = new JPanel();
        p3.setBounds(0,0,800,800);
        p3.setLayout(null);

        //adding heading for CeditCard Frame
        Heading3 = new JLabel("Credit Card");
        Heading3.setBounds(321,47,167,42);
        Heading3.setFont(new Font("Helvetica",Font.BOLD,30));//Font for Heading
        p3.add(Heading3);//adding heading to panel

        //Adding labels for Credit Frame
        SubHead1 = new JLabel("User Information : ");
        SubHead1.setBounds(42,141,204,34);
        SubHead1.setFont(new Font("Helvetica",Font.PLAIN,24));//Font for sub heading
        p3.add(SubHead1);

        SubHead2 = new JLabel("Credit Information : ");
        SubHead2.setBounds(42,412,219,34);
        SubHead2.setFont(new Font("Helvetica",Font.PLAIN,24));//Font for second subheading
        p3.add(SubHead2);

        Client_Name = new JLabel("Client Name : ");
        Client_Name.setBounds(42,202,114,20);
        Client_Name.setFont(new Font("Helvetical",Font.PLAIN,16));//Font for client name
        p3.add(Client_Name);

        Bank_Account = new JLabel("Bank Account : ");
        Bank_Account.setBounds(42,267,123,20);
        Bank_Account.setFont(new Font("Helvetical",Font.PLAIN,16));//Font for bank account
        p3.add(Bank_Account);

        Balance_Amount = new JLabel("Balance Amount : ");
        Balance_Amount.setBounds(42,338,148,22);
        Balance_Amount.setFont(new Font("Helvetical",Font.PLAIN,16));//Font for balance amount
        p3.add(Balance_Amount);

        Card_ID = new JLabel("Card ID : ");
        Card_ID.setBounds(439,202,123,20);
        Card_ID.setFont(new Font("Helvetical",Font.PLAIN,16));//Font for card id
        p3.add(Card_ID);

        Issuer_Bank = new JLabel("Issuer Bank : ");
        Issuer_Bank.setBounds(439,273,123,20);
        Issuer_Bank.setFont(new Font("Helvetical",Font.PLAIN,16));//Font for Isuuer bank
        p3.add(Issuer_Bank);

        CVCNumber = new JLabel("CVC Number : ");
        CVCNumber.setBounds(42,470,130,20);
        CVCNumber.setFont(new Font("Helvetical",Font.PLAIN,16));//Font for CVCNumber
        p3.add(CVCNumber);

        InterestRate = new JLabel("Interest Rate : ");
        InterestRate.setBounds(438,470,114,20);
        InterestRate.setFont(new Font("Helvetical",Font.PLAIN,16));//Font for Interest rate
        p3.add(InterestRate);

        //adding textfields for Credit Frame
        txtClient_Name = new JTextField();
        txtClient_Name.setBounds(201,196,180,32);
        p3.add(txtClient_Name);

        txtBank_Account = new JTextField();
        txtBank_Account.setBounds(201,264,180,32);
        p3.add(txtBank_Account);

        txtBalance_Amount = new JTextField();
        txtBalance_Amount.setBounds(201,332,180,32);
        p3.add(txtBalance_Amount);

        txtCard_ID = new JTextField();
        txtCard_ID.setBounds(562,196,180,32);
        p3.add(txtCard_ID);

        txtIssuer_Bank = new JTextField();
        txtIssuer_Bank.setBounds(562,267,180,32);
        p3.add(txtIssuer_Bank);

        txtCVCNumber = new JTextField();
        txtCVCNumber.setBounds(201,464,180,32);
        p3.add(txtCVCNumber);

        txtInterestRate = new JTextField();
        txtInterestRate.setBounds(562,464,180,32);
        p3.add(txtInterestRate);

        //adding buttons for Credit Frame
        //CreditLimit Button
        CreditLimitButton = new JButton("Credit Limit");
        CreditLimitButton.setBounds(250,610,140,48);
        CreditLimitButton.setFont(new Font("Helvetica",Font.PLAIN,16));

        p3.add(CreditLimitButton);

        //CancelCredit Button
        CancelCreditButton = new JButton("Cancel Credit");
        CancelCreditButton.setBounds(425,610,140,48);
        CancelCreditButton.setFont(new Font("Helvetica",Font.PLAIN,16));//Font for cancel button
        p3.add(CancelCreditButton);

        //Display button for credit
        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(42,704,140,48);
        btnDisplay.setFont(new Font("Helvetica",Font.PLAIN,16));//Font for display button
        p3.add(btnDisplay);

        //clear button for credit
        btnClear = new JButton("Clear");
        btnClear.setBounds(602,704,140,48);
        btnClear.setFont(new Font("Helvetica",Font.PLAIN,16));//Font for clear button
        p3.add(btnClear);

        //Button for adding credit
        AddCreditButton = new JButton("Add Credit Card");
        AddCreditButton.setBounds(330,704,140,48);
        AddCreditButton.setFont(new Font("Helvetica",Font.PLAIN,16));
        p3.add(AddCreditButton);

        //Button to go back to Bank Frame
        b3 = new JButton("|<");
        b3.setBounds(17,17,37,32);
        b3.setFont(new Font("Helvetica",Font.BOLD,14));
        p3.add(b3);

        //Code for expiration date
        ExpirationDate = new JLabel("Expiration Date : ");
        ExpirationDate.setBounds(42,540,130,22);
        ExpirationDate.setFont(new Font("Helvetica",Font.PLAIN,16));
        p3.add(ExpirationDate);

        //adding value in first combobox
        String Day[] = {"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","20","21","22","23","24","25","26","27","28","29","30","31"};
        DayComboBox = new JComboBox <String> (Day);
        DayComboBox.setBounds(201,527,79,43);
        p3.add(DayComboBox);

        //adding value in second combobox

        String Month[] = {"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
        MonthComboBox = new JComboBox <String> (Month);
        MonthComboBox.setBounds(274,527,107,43);
        p3.add(MonthComboBox);

        //adding value in third combobox
        String Year[] = {"Year","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030","2031","2032","2033","2034","2035","2036","2037","2038","2039","2040"};
        YearComboBox = new JComboBox <String> (Year);
        YearComboBox.setBounds(372,527,93,43);
        p3.add(YearComboBox);

        //Credit Frame 
        CreditFrame.setSize(800,800);
        CreditFrame.add(p3);
        CreditFrame.setLayout(null);
        CreditFrame.setVisible(false);
        CreditFrame.setResizable(false);
        CreditFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Withdrawal Frame
        WithdrawFrame = new JFrame();

        //panel for Withdrawal Frame.
        p4 = new JPanel();
        p4.setBounds(0,0,600,600);
        p4.setLayout(null);

        //adding heading in withdrawal frame
        Heading4 = new JLabel("Withdrawal");
        Heading4.setBounds(219,26,162,46);
        Heading4.setFont(new Font("Helvetica",Font.BOLD,30));
        p4.add(Heading4);

        //Adding labels for Withdrawal Frame
        //Card ID Label
        cardID = new JLabel("Card ID : ");
        cardID.setBounds(118,116,152,28);
        cardID.setFont(new Font("Helvetica",Font.PLAIN,16));
        p4.add(cardID);

        //Withdrawal Amount Label
        WithdrawalAmount = new JLabel("Withdrawal Amount : ");
        WithdrawalAmount.setFont(new Font("Helvetica",Font.PLAIN,16));
        WithdrawalAmount.setBounds(118,182,152,28);
        p4.add(WithdrawalAmount);

        //Date of withdrawal Label
        DateOfWithdrawal = new JLabel("Date of Withdrawal : ");
        DateOfWithdrawal.setBounds(118,248,152,28);
        DateOfWithdrawal.setFont(new Font("Helvetica",Font.PLAIN,16));
        p4.add(DateOfWithdrawal);

        //Pin Number Label for Withdrawal Frame
        pinNumber = new JLabel("Pin Number : ");
        pinNumber.setBounds(118,314,152,28);
        pinNumber.setFont(new Font("Helvetica",Font.PLAIN,16));
        p4.add(pinNumber);

        //textfields for withdrawal Frame
        txtcardID = new JTextField();
        txtcardID.setBounds(278,112,185,32);
        p4.add(txtcardID);

        txtWithdrawalAmount = new JTextField();
        txtWithdrawalAmount.setBounds(278,178,185,32);
        p4.add(txtWithdrawalAmount);

        txtpinNumber = new JTextField();
        txtpinNumber.setBounds(278,310,185,32);
        p4.add(txtpinNumber);

        //Adding Buttons in Withdrawal Frame
        //withdraw button for withdrawal frame
        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(225,395,150,48);
        withdrawButton.setFont(new Font("Helvetica",Font.PLAIN,16));
        p4.add(withdrawButton);

        //displaybutton
        displayButton = new JButton("Display");
        displayButton.setBounds(75,488,150,48);
        displayButton.setFont(new Font("Helvetica",Font.PLAIN,16));
        p4.add(displayButton);

        //clearButton 
        clearButton = new JButton("Clear");
        clearButton.setBounds(375,484,150,48);
        clearButton.setFont(new Font("Helvetica",Font.PLAIN,16));
        p4.add(clearButton);

        //Button to go back
        b1 = new JButton("|<");
        b1.setBounds(17,17,37,32);
        b1.setFont(new Font("Helvetica",Font.BOLD,14));
        p4.add(b1);

        //adding ComboBox for Withdrawal Frame
        String day[] = {"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","20","21","22","23","24","25","26","27","28","29","30","31"};
        dayComboBox = new JComboBox <String> (Day);
        dayComboBox.setBounds(278,244,79,35);
        p4.add(dayComboBox);

        String month[] = {"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
        monthComboBox = new JComboBox <String> (month);
        monthComboBox.setBounds(348,244,129,35);
        p4.add(monthComboBox);

        String year[] = {"Year","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030","2031","2032","2033","2034","2035","2036","2037","2038","2039","2040"};
        yearComboBox = new JComboBox <String> (year);
        yearComboBox.setBounds(467,244,94,35);
        p4.add(yearComboBox);

        WithdrawFrame.add(p4);//adding panel to withdrawal frame.
        WithdrawFrame.setSize(600,600);
        WithdrawFrame.setLayout(null);
        WithdrawFrame.setVisible(false);
        WithdrawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Frame for credit limit.
        CreditLimitFrame = new JFrame();
        //adding panel in credit frame
        p5 = new JPanel();
        p5.setBounds(0,0,600,600);
        p5.setLayout(null);

        //adding heading for credit limit frame.
        Heading5 = new JLabel("Credit Limit");
        Heading5.setBounds(212,47,177,42);
        Heading5.setFont(new Font("Helvetica",Font.BOLD,30));
        p5.add(Heading5);//adding heading in panel

        //adding labels for Credit limit Frame
        card_ID = new JLabel("Card ID : ");
        card_ID.setBounds(121,155,111,28);
        card_ID.setFont(new Font("Helvetica",Font.PLAIN,16));
        p5.add(card_ID);

        CreditLimit = new JLabel("Credit Limit : ");
        CreditLimit.setBounds(121,224,111,28);
        CreditLimit.setFont(new Font("Helvetica",Font.PLAIN,16));
        p5.add(CreditLimit);

        GracePeriod = new JLabel("Grace Period : ");
        GracePeriod.setBounds(121,293,111,28);
        GracePeriod.setFont(new Font("Helvetica",Font.PLAIN,16));
        p5.add(GracePeriod);

        //adding textfields in panel for credit Limit frame
        txtcard_ID = new JTextField();
        txtcard_ID.setBounds(244,155,202,32);
        p5.add(txtcard_ID);

        txtCreditLimit = new JTextField();
        txtCreditLimit.setBounds(244,224,202,32);
        p5.add(txtCreditLimit);

        txtGracePeriod = new JTextField();
        txtGracePeriod.setBounds(244,293,202,32);
        p5.add(txtGracePeriod);

        //adding buttons in panel for credit limit frame
        btnCreditLimit = new JButton("Set Credit Limit");
        btnCreditLimit.setBounds(225,380,145,48);
        btnCreditLimit.setFont(new Font("Helvetica",Font.PLAIN,16));
        p5.add(btnCreditLimit);

        buttonDisplay = new JButton("Display");
        buttonDisplay.setBounds(63,472,145,48);
        buttonDisplay.setFont(new Font("Helvetica",Font.PLAIN,16));
        p5.add(buttonDisplay);

        buttonClear = new JButton("Clear");
        buttonClear.setBounds(386,472,145,48);
        buttonClear.setFont(new Font("Helvetica",Font.PLAIN,16));
        p5.add(buttonClear);

        //button to go back to Credit Frame
        b4 = new JButton("|<");
        b4.setBounds(17,17,37,32);
        b4.setFont(new Font("Helvetica",Font.BOLD,14));
        p5.add(b4);

        CreditLimitFrame.add(p5);//adding panel in frame
        CreditLimitFrame.setSize(600,600);
        CreditLimitFrame.setLayout(null);
        CreditLimitFrame.setResizable(false);
        CreditLimitFrame.setVisible(false);
        CreditLimitFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Cancel Credit Frame
        CancelCreditFrame = new JFrame();

        //panel for Cancel credit card frame
        p6 = new JPanel();
        p6.setBounds(0,0,542,278);
        p6.setLayout(null);

        //labels for Cancel Credit Frame
        Heading6 = new JLabel("Cancel Credit Card");
        Heading6.setBounds(133,19,276,39);
        Heading6.setFont(new Font("Helvetica",Font.BOLD,30));
        p6.add(Heading6);

        ccdCardID = new JLabel("Card ID : ");
        ccdCardID.setBounds(94,111,97,28);
        ccdCardID.setFont(new Font("Helvetica",Font.PLAIN,20));
        p6.add(ccdCardID);

        //textfield for cancel credit frame
        txtCancelCardID = new JTextField();
        txtCancelCardID.setBounds(195,100,206,47);
        p6.add(txtCancelCardID);

        //button for cancel credit frame
        CancelCreditBtn = new JButton("Cancel Credit");
        CancelCreditBtn.setBounds(191,197,160,37);
        CancelCreditBtn.setFont(new Font("Helvetica",Font.PLAIN,18));
        p6.add(CancelCreditBtn);

        CancelCreditFrame.add(p6);
        CancelCreditFrame.setSize(542,278);
        CancelCreditFrame.setVisible(false);
        CancelCreditFrame.setLayout(null);
        CancelCreditFrame.setResizable(false);
        CancelCreditFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adding action listeners for buttons.
        DebitButton.addActionListener(this);
        CreditButton.addActionListener(this);
        CreditLimitButton.addActionListener(this);
        WithdrawButton.addActionListener(this);
        ClearButton.addActionListener(this);//DebitClass
        btnClear.addActionListener(this);//Creditclass
        buttonClear.addActionListener(this);//CReditLimit
        clearButton.addActionListener(this);//withdraw
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        AddDebitButton.addActionListener(this);
        AddCreditButton.addActionListener(this);
        DisplayButton.addActionListener(this);
        btnDisplay.addActionListener(this);
        withdrawButton.addActionListener(this);
        CancelCreditButton.addActionListener(this);
        CancelCreditBtn.addActionListener(this);
        btnCreditLimit.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDisplay.addActionListener(this);
        displayButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        //action listener when debit button is pressed.
        if(e.getSource() == DebitButton)
        {
            BankFrame.setVisible(false);
            DebitFrame.setVisible(true);
        }

        //action listener when credit button is pressed.
        else if(e.getSource() == CreditButton)
        {
            CreditFrame.setVisible(true);
            BankFrame.setVisible(false);
        }

        //action listener when Withdraw button is pressed.
        else if(e.getSource() == WithdrawButton)
        {
            WithdrawFrame.setVisible(true);

        }

        //action listener when credit limit button is pressed.
        else if(e.getSource() == CreditLimitButton)
        {
            CreditLimitFrame.setVisible(true);

        }

        //action listener when clear button is pressed.
        else if(e.getSource() == ClearButton)
        {
            txtClientName.setText("");
            txtBankAccount.setText("");
            txtBalanceAmount.setText("");
            txtCardID.setText("");
            txtIssuerBank.setText("");
            txtPinNumber.setText("");
        }

        //action listener when btnClear button is pressed.
        else if(e.getSource() == btnClear)
        {
            txtClient_Name.setText("");
            txtBank_Account.setText("");
            txtBalance_Amount.setText("");
            txtCard_ID.setText("");
            txtIssuer_Bank.setText("");
            txtCVCNumber.setText("");
            txtInterestRate.setText("");
        }

        //action listener when buttonClear button is pressed.
        else if(e.getSource() == buttonClear)
        {
            txtcard_ID.setText("");
            txtCreditLimit.setText("");
            txtGracePeriod.setText("");
        }

        //action listener when clearButton button is pressed.
        else if(e.getSource() == clearButton)
        {
            txtcardID.setText("");
            txtWithdrawalAmount.setText("");
            txtpinNumber.setText("");
        }

        //action listener when b1 button is pressed.
        else if(e.getSource() == b1)
        {
            WithdrawFrame.setVisible(false);
            DebitFrame.setVisible(true);
        }

        //action listener when b2 button is pressed.
        else if(e.getSource() == b2)
        {
            DebitFrame.setVisible(false);
            BankFrame.setVisible(true);
        }

        //action listener when b3 button is pressed.
        else if(e.getSource() == b3)
        {
            CreditFrame.setVisible(false);
            BankFrame.setVisible(true);
        }

        //action listener when b4 button is pressed.
        else if(e.getSource() == b4)
        {
            CreditLimitFrame.setVisible(false);
            CreditFrame.setVisible(true);
        }
        
        //action listener when cancelcreditbutton button is pressed
        else if(e.getSource() == CancelCreditButton)
        {
            CancelCreditFrame.setVisible(true);  
        }

        //action listener when adddebit button is pressed.
        else if(e.getSource() == AddDebitButton)
        {
            if(txtClientName.getText().isEmpty()||txtBankAccount.getText().isEmpty()||txtBalanceAmount.getText().isEmpty()||txtCardID.getText().isEmpty()||txtIssuerBank.getText().isEmpty()||txtPinNumber.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(DebitFrame,"Empty fields detected.Please fill all the informations","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    clientname = txtClientName.getText();
                    bankaccount = txtBankAccount.getText();
                    balanceamount = Integer.parseInt(txtBalanceAmount.getText());
                    cardid = Integer.parseInt(txtCardID.getText());
                    issuerbank = txtIssuerBank.getText();
                    pinnumber = Integer.parseInt(txtPinNumber.getText());

                    if (List.isEmpty())
                    {
                        DebitCard obj = new DebitCard(cardid, clientname, issuerbank, balanceamount, bankaccount, pinnumber);
                        List.add(obj);
                        JOptionPane.showMessageDialog(DebitFrame,"We have successfully added your information in the system. Thank you!");

                    }
                    else
                    {
                        for(BankCard Y:List)
                        {
                            if(Y instanceof DebitCard)
                            {
                                //downcast
                                DebitCard debitcard = (DebitCard)Y;
                                if(debitcard.getCard_Id() == cardid)
                                {
                                    JOptionPane.showMessageDialog(DebitFrame,"Card ID already exists. Please check your Card ID and enter a new one","Alert",JOptionPane.ERROR_MESSAGE);
                                }
                                else
                                {
                                    DebitCard obj = new DebitCard(cardid, clientname, issuerbank, balanceamount, bankaccount, pinnumber);
                                    List.add(obj);
                                    JOptionPane.showMessageDialog(DebitFrame,"We have successfully added your information in the system. Thank you!");
                                }
                            }
                            else
                            {

                                DebitCard obj1 = new DebitCard(cardid, clientname, issuerbank, balanceamount, bankaccount, pinnumber);
                                List.add(obj1);
                                JOptionPane.showMessageDialog(DebitFrame,"We have successfully added your information in the system. Thank you!");   

                            }
                        }
                    }
                }
                catch(NumberFormatException f)
                {
                    JOptionPane.showMessageDialog(DebitFrame,"Please enter integer values","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //action listener when add credit button is pressed.
        else if(e.getSource() == AddCreditButton)
        {
            if(txtClient_Name.getText().isEmpty()||txtBalance_Amount.getText().isEmpty()||txtBank_Account.getText().isEmpty()||txtIssuer_Bank.getText().isEmpty()||txtCard_ID.getText().isEmpty()||txtCVCNumber.getText().isEmpty()||txtInterestRate.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(CreditFrame,"Please fill all the informations.","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    cClientName = txtClient_Name.getText();
                    cBalanceAmount = Integer.parseInt(txtBalance_Amount.getText());
                    cBankAccount = txtBank_Account.getText();
                    cIssuerBank = txtIssuer_Bank.getText();
                    cCardID = Integer.parseInt(txtCard_ID.getText());
                    cCVCNumber = Integer.parseInt(txtCVCNumber.getText());
                    cInterestRate = Integer.parseInt(txtInterestRate.getText());
                    String a = DayComboBox.getSelectedItem().toString();
                    String b = MonthComboBox.getSelectedItem().toString();
                    String c = YearComboBox.getSelectedItem().toString();
                    String cExpirationDate  = a+"/"+b+"/"+c;

                    if(List.isEmpty())
                    {
                        CreditCard obj2 = new CreditCard(cCardID, cClientName, cIssuerBank, cBankAccount, cBalanceAmount, cCVCNumber, cInterestRate, cExpirationDate);
                        List.add(obj2);
                        JOptionPane.showMessageDialog(CreditFrame,"We have successfully added your information in the system. Thank you!");
                    }
                    else
                    {
                        for(BankCard Y:List)
                        {
                            if(Y instanceof CreditCard)
                            {
                                CreditCard creditcard = (CreditCard)Y;
                                if(creditcard.getCard_Id() == cCardID)
                                {
                                    JOptionPane.showMessageDialog(CreditFrame,"Card ID already exists. Please check your Card ID and enter again.","Alert",JOptionPane.ERROR_MESSAGE);
                                }
                                else
                                {
                                    CreditCard obj3 = new CreditCard(cCardID, cClientName, cIssuerBank, cBankAccount, cBalanceAmount, cCVCNumber, cInterestRate, cExpirationDate);
                                    List.add(obj3);
                                    JOptionPane.showMessageDialog(CreditFrame,"We have successfully added your information in the system. Thank You!");                                   
                                }
                            }
                            else
                            {
                                CreditCard obj = new CreditCard(cCardID, cClientName, cIssuerBank, cBankAccount, cBalanceAmount, cCVCNumber, cInterestRate, cExpirationDate);
                                List.add(obj);
                                JOptionPane.showMessageDialog(CreditFrame,"We have successfully added your information in the system. Thank You!");                                   
                            }
                        }
                    }
                }
                catch(NumberFormatException f)
                {
                    JOptionPane.showMessageDialog(CreditFrame,"Cannot convert string values to ineteger.Please enter integer values","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }            
        }

        //action listener when display button is pressed.
        else if (e.getSource() == DisplayButton)
        {
            if(List.size() == 0)
            {
                JOptionPane.showMessageDialog(DebitFrame,"Please fill all the informations","Alert",JOptionPane.ERROR_MESSAGE);
            }

            else{
                for(BankCard Y:List)
                {
                    if (Y instanceof DebitCard)
                    {
                        DebitCard debitcard = (DebitCard) Y;
                        debitcard.display();
                    } 
                }
            }
        }

        //action listener when btnDisplay button is pressed.
        else if (e.getSource() == btnDisplay)
        {
            if(List.size() == 0)
            {
                JOptionPane.showMessageDialog(DebitFrame,"Please fill all the informations","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                for(BankCard Y:List)
                {
                    if(Y instanceof CreditCard)
                    {
                        CreditCard creditcard = (CreditCard) Y;
                        creditcard.display();
                    }
                }
            }
        }

        //action listener when withdraw button is pressed.
        else if(e.getSource() == withdrawButton)
        {
            if(txtcardID.getText().isEmpty() || txtWithdrawalAmount.getText().isEmpty() || txtpinNumber.getText().isEmpty() )
            {
                JOptionPane.showMessageDialog(WithdrawFrame,"Empty fields detected. Please fill all the informations.","Alert",JOptionPane.ERROR_MESSAGE);
            }  
            else
            {
                try
                {
                    int Wcardid = Integer.parseInt(txtcardID.getText());
                    int Wwithdrawalamount = Integer.parseInt(txtWithdrawalAmount.getText());
                    int Wpinnumber = Integer.parseInt(txtpinNumber.getText());
                    String d = dayComboBox.getSelectedItem().toString();
                    String M = monthComboBox.getSelectedItem().toString();
                    String Y = yearComboBox.getSelectedItem().toString();
                    String Wdateofwithdrawal = d+"/"+M+"/"+Y;
                    if (List.isEmpty())
                    {
                        JOptionPane.showMessageDialog(WithdrawFrame,"No data found in debit card. Please add your debit card.","Alert",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        for(BankCard card:List)
                        {
                            DebitCard debit = (DebitCard) card;
                            if(card instanceof DebitCard)
                            {
                                if(Wcardid!=debit.getCard_Id())
                                {
                                    JOptionPane.showMessageDialog(WithdrawFrame,"Invalid Card ID. Please try again.","Error",JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                                else{
                                    if(Wpinnumber == debit.getPin_Number())
                                    {
                                        DebitCard D = (DebitCard)card;
                                        D.withdraw(Wwithdrawalamount, Wdateofwithdrawal, Wpinnumber);
                                        JOptionPane.showMessageDialog(WithdrawFrame,"Your money has been successfully withdrawn. Thank you for banking with us. Success !");
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(WithdrawFrame,"Invalid Pin Number. Please try again !","ERROR",JOptionPane.ERROR_MESSAGE);
                                        break;
                                    }
                                }
                            }

                        }
                    }
                }
                catch(NumberFormatException f)
                {
                    JOptionPane.showMessageDialog(WithdrawFrame,"Please enter integral values in integral textfields. Cannot convert string into ineteger.","Alert",JOptionPane.ERROR_MESSAGE);
                }

            }
        }

        //action listener when cancelcreditbtn button is pressed.
        else if (e.getSource() == CancelCreditBtn)
        {
            if(txtCancelCardID.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(CreditFrame,"Empty fields detected. Please fill all the informations.","Alert",JOptionPane.ERROR_MESSAGE);   
            }
            else
            {
                try{
                    int canCard_ID = Integer.parseInt(txtCancelCardID.getText());
                    for(BankCard card:List)
                    {
                        if (card instanceof CreditCard)
                        {
                            if(canCard_ID == card.getCard_Id())
                            {
                                CreditCard cancelcredit = (CreditCard)card;
                                cancelcredit.cancelCreditCard();
                                JOptionPane.showMessageDialog(CreditFrame,"Credit Card successfully cancelled. Thank You !");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(CreditFrame,"Credit Card not found. Please check and try again.","No Credit Card",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
                catch(NumberFormatException f)
                {
                    JOptionPane.showMessageDialog(WithdrawFrame,"Please enter integral values in integral fields. Cannot convert string into integer.","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //action listener when btnCreditLimit is pressed
        else if(e.getSource() == btnCreditLimit)
        {
            if(txtcard_ID.getText().isEmpty() || txtCreditLimit.getText().isEmpty() || txtGracePeriod.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(CreditLimitFrame,"Empty fields detected. Please fill all the informations.","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    int setCardID = Integer.parseInt(txtcard_ID.getText());
                    int setGracePeriod = Integer.parseInt(txtGracePeriod.getText());
                    double setCreditLimit = Double.parseDouble(txtCreditLimit.getText());

                    for(BankCard each : List)
                    {
                        if(setCardID!=each.getCard_Id())
                        {
                            JOptionPane.showMessageDialog(WithdrawFrame,"Invalid Card ID. Please try again.","Invalid",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                        else
                        {
                            if(setCreditLimit > (2.5*(each.getBalanceAmount())))
                            {
                                JOptionPane.showMessageDialog(CreditLimitFrame,"You do not have enough balance in your account to set the given credit limit.","Insufficient Balance",JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                            else
                            {
                                CreditCard credit = (CreditCard)each;
                                credit.setCredit_Limit(setCreditLimit, setGracePeriod);
                                JOptionPane.showMessageDialog(CreditLimitFrame,"Your data has been successfully entered in the system. Thank YOU !");
                            }
                        }
                    }
                }
                catch(NumberFormatException f)
                {
                    JOptionPane.showMessageDialog(WithdrawFrame,"Please enter integral values in integral fields. Cannot convert string into integer.","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        else if (e.getSource() == buttonClear)
        {
            txtcard_ID.setText("");
            txtCreditLimit.setText("");
            txtGracePeriod.setText("");
        }

        else if (e.getSource() == buttonDisplay)
        {
            if(List.size() == 0)
            {
                JOptionPane.showMessageDialog(DebitFrame,"Please fill all the informations","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                for(BankCard card:List)
                {
                    if(card instanceof CreditCard)
                    {
                        CreditCard creditcard = (CreditCard) card;
                        creditcard.display();
                    }
                }
            }
        }
        //action listener when display button is pressed
        else if(e.getSource() == displayButton)
        {
            if(List.size() == 0)
            {
                JOptionPane.showMessageDialog(DebitFrame,"Please fill all the informations","Alert",JOptionPane.ERROR_MESSAGE);
            }

            else{
                for(BankCard card:List)
                {
                    if (card instanceof DebitCard)
                    {
                        DebitCard debitcard = (DebitCard) card;
                        debitcard.display();
                    } 
                }
            }
        }
    }

    //main method to call constructot BankGUI.
    public static void main(String[]args)
    {
        new BankGUI();
    }
}

