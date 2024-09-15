public class BankAccount{
    private String owner;
    private double balance;
    
    public BankAccount(String owner, double initialBalance){
        this.owner = owner;
        this.balance = initialBalance;
    }
    public void deposite(double amount){
        if(amount > 0){
            balance+= amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        }
        else{
            System.out.println("Deposite amount must be positive.");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <balance){
            balance -= amount;
            System.out.println("Withdrew" + ". New balance: " + balance);
        }
        else{
            System.out.println("Withdrawal amount must be positive and less than or equal to the balance.");
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getOwner(){
        return owner;
    }
    public static void main(String[] args){
        BankAccount account = new BankAccount("Sujal", 10000.0);
        System.out.println(account.getOwner() + "'s initial balance: " + account.getBalance());

        account.deposite(500.0);
        account.withdraw(2000.0);
        account.withdraw(1000.0);
    }
}