package Ch08.sec02;

class Fraction {
    private int numerator;                  // 분자
    private int denominator;                // 분모
    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    private double getDouble() {
        return (double) numerator / denominator;
    }
    int getInt() {
        return (int) getDouble();
    }
    public double getDoouble() {
        return (double) numerator / denominator;
    }
}