public class Main {
    public static void main(String[] args) {
        Fraction t = new Fraction(5,6);
        Fraction j = new Fraction(3,6);
        t.mul(j);
        System.out.println(t.toString());
        t.div(j);
        System.out.println(t.toString());
        t.sub(j);
        System.out.println(t.toString());
    }
}
