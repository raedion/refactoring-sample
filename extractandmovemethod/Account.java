public class Account {
    public int a = 3;
    public int b = 8;
    public int getAccount() {
        if (this.a < this.b) {
            System.out.println("a < b");
        }
        return this.a + this.b;
    }
}
