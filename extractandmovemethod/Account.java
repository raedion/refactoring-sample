public class Account {
    public int a = 3;
    public int b = 8;
    public int getAccount() {
        Output output = new Output();
        output.output(this.a, this.b);
        return this.a + this.b;
    }
}
