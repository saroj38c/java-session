package day5.encapsulation;

/**
 * Defining Class for Account
 */
public class Account {
    //Defining variables
    private String name;
    private String accountNumber;
    private AccountType accountType;
    private double accountBalance;
    private String socialSecurityNumber;

    /**
     * Getter for name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for accountNumber
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter for accountNumber
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Getter for accountType
     * @return accountType
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Setter for accountType
     * @param accountType
     */
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * Getter for accountBalance
     * @return accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Setter for accountBalance
     * @param accountBalance
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * Setter for socialSecurityNumber
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

/*   public void transferBalance(Account fromAccount, Account toAccount, double amountToBeTransferred) {

  } */
}