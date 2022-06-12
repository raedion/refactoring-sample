public class Account {
    public int a = 3;
    public int b = 8;
    public int getAccount() {
        output();
        return this.a + this.b;
    }
    private void output() {
        if (this.a < this.b) {
            System.out.println("a < b");
        }
    }
}
