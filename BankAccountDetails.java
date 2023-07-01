public class BankAccountDetails {
    public int accountNumber;
    public char[] acHolderName;
    public long mobile;
    public char[] emailId;
    public double balance;
    public char[] branchName;

    public static void main(String[] args) {
        BankAccountDetails account = new BankAccountDetails();
        account.accountNumber = 123456789;
        account.acHolderName = new char[]{'S', 'a', 'n', 'j' , 'u'};
        account.mobile = 9876543210L;
        account.emailId = new char[]{'s', 'a', 'n', 'j', 'u', '@', 'e', 'x', 'a', 'm', 'p', 'l', 'e', '.', 'c', 'o', 'm'};
        account.balance = 5000.0;
        account.branchName = new char[]{'A', 'B', 'C', ' ', 'B', 'a', 'n', 'k'};

        System.out.println("Bank Account Details:");
        System.out.println("Account Number: " + account.accountNumber);
        System.out.print("Account Holder Name: ");
        for (char ch : account.acHolderName) {
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("Mobile: " + account.mobile);
        System.out.print("Email ID: ");
        for (char ch : account.emailId) {
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("Balance: " + account.balance);
        System.out.print("Branch Name: ");
        for (char ch : account.branchName) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
