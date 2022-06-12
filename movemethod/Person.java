public class Person {
    Account account;
    public Person() {
        account = new Account();
    }
    public int getValue() {
        return account.getAccount();
    }
}
