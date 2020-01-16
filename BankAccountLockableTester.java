

public class BankAccountLockableTester {

    public static void main(String[] args) {
        BankAccountLockable gAccount = new BankAccountLockable("Gillian", "USAA",
                "Gillian's Checking", 510, 0.02, 2222);
        BankAccountLockable nAccount = new BankAccountLockable("Nina", "Wells Fargo",
                "Nina's Checking", 612, 0.02, 4444);

        gAccount.setKey(5533);
        gAccount.unlock(6878);
        gAccount.locked();
        System.out.println("~ Withdrawing money from account ~");
        gAccount.withdraw(600);
        System.out.println();
        System.out.println("~ Depositing money into account ~");
        gAccount.deposit(200);
        System.out.println();
        System.out.println("\n" + gAccount.toString());
    }
}


