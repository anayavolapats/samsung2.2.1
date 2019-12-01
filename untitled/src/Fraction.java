public class Fraction {
    int numerator; // Числитель
    int denominator; // Знаменатель
    public Fraction(int numerator, int denominator){
        if (denominator == 0){
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void sub(Fraction d){
        if(this.denominator == d.denominator){
            numerator = numerator - d.numerator;
            denominator = d.denominator;
        }
        else{
            this.numerator = numerator*d.denominator - d.numerator*denominator;
            this.denominator = denominator*d.denominator;
        }
    }
    public void mul(Fraction d){
        this.numerator = d.numerator*numerator;
        this.denominator = d.denominator*denominator;
    }
    public void div(Fraction d){
        this.numerator = d.numerator*denominator;
        this.denominator = d.denominator*numerator;
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

}