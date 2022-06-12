public class Account {
    public int a = 3;
    public int b = 8;
    public int getAccount() {
        if (a < b) {
            System.out.println("a < b");
        }
        return a + b;
    }
}
