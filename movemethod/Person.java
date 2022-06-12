public class Person {
    Account account;
    public Person() {
        account = new Account();
    }
    public int getValue() {
        if (account.a < account.b) {
            System.out.println("a < b");
        }
        return account.a + account.b;
    }
}
