public class Person {

    protected String name;
    private String address;
    private Account account;
    final String VERSION = "0.0.3";

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Account getAccount() {
        return this.account;
    }

//    public void printAccountDetail() {
//        System.out.println("Account number is: " + this.account.accountNumber);
//        System.out.println("Is this a Saving Account? " + this.account.isSavingAccount);
//    }

    public void printAccountDetailSecondMethod() {
        System.out.println("Account number is: " + this.account.getAccountNumber());
        System.out.println("Is this a Saving Account? " + this.account.isSavingAccount());
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void sayGreetings(){
        System.out.println("Thank you for being our customer, " + this.name);

    }
}
