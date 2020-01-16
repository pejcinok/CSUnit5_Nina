

public class BankAccountLockable implements Lockable{

    private double balance;
    private double interest;
    private String accountName;
    private String owners;
    private String bankName;
    private int pin;
    private int theKey;
    private boolean isLocked;
    private int theLock;


    public BankAccountLockable(String accOwners, String accBank, String accName,
                               double accBalance, double accInterest, int thePin) {
        balance = accBalance;
        accountName = accName;
        owners = accOwners;
        bankName = accBank;
        interest = accInterest;
        pin = thePin;
    }

        public String getAccName(){
            return accountName;
        }
        public String getOwners(){
            return owners;
        }
        public String getBank(){
            return bankName;
        }
        public double getInterest(){
            return interest;
        }
        public double getBalance(){
            return balance;
        }




        public int setKey(int key) {
             theKey = key;
             return theKey;
        }

        public void lock(int lockKey){
            if (lockKey != theKey) {
                isLocked = true;
            }
            else
                isLocked = false;
        }

        public void unlock(int unlockKey){
            if (unlockKey== theKey )
                isLocked = false;
            else
                isLocked = true;

        }


        public  boolean locked(){

        return isLocked;

        }


        //setter methods for instance variables
        public void setBalance(double theBalance){

            balance = theBalance;

        }

        public void setInterest(){


                setBalance(balance * (1 + interest));

        }

        //lets client withdraw money
        public void withdraw(double subWithdraw){

            if (isLocked)
                System.out.println("Wrong passcode: method locked");
            else
            setBalance(getBalance() - subWithdraw);
        }

        // lets client deposit money
        public void deposit(double addDeposit){
            if (isLocked)
                System.out.println("Wrong passcode: method locked");
            else
                System.out.println("unlocked");
            setBalance(getBalance() + addDeposit);

        }

        //prints current state of bank account
        public String toString(){
            String result = "";
            result += "    Account Owners: " + owners + "\n Bank Name: " + bankName + "\n";
            result += "    Account Name: " + accountName + "\n";
            result += "    Account Balance: " + getBalance() + "\n";
            return result;
        }
    }

