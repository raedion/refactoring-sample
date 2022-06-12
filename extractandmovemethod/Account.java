public class Account {
    public int a = 3;
    public int b = 8;
    public int getAccount() {
        Output output = new Output();
        output.output(this.a, this.b);
        return this.a + this.b;
    }
    class Output {
        public void output(int a, int b) {
            if (a < b) {
                System.out.println("a < b");
            }
        }
    }
}
