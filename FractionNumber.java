<<<<<<< HEAD
public class FractionNumber {
    static class Fraction {

        int numerator;
        int denominator;

        public Fraction(int numr, int denr) {
            numerator = numr;
            denominator = denr;
            reduce();
        }

        public int getNumerator() {
            return numerator;
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }

        public int calculateGCD(int numerator, int denominator) {
            if (numerator % denominator == 0) {
                return denominator;
            }
            return calculateGCD(denominator, numerator % denominator);
        }

        void reduce() {
            int gcd = calculateGCD(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;
        }

        Fraction add(Fraction fractionTwo) {
            int numer = (numerator * fractionTwo.getDenominator()) +
                    (fractionTwo.getNumerator() * denominator);
            int denr = denominator * fractionTwo.getDenominator();
            return new Fraction(numer, denr);
        }

        Fraction subtract(Fraction fractionTwo) {
            int newNumerator = (numerator * fractionTwo.denominator) -
                    (fractionTwo.numerator * denominator);
            int newDenominator = denominator * fractionTwo.denominator;
            Fraction result = new Fraction(newNumerator, newDenominator);
            return result;
        }

        Fraction multiply(Fraction fractionTwo) {
            int newNumerator = numerator * fractionTwo.numerator;
            int newDenominator = denominator * fractionTwo.denominator;
            Fraction result = new Fraction(newNumerator, newDenominator);
            return result;
        }

        Fraction divide(Fraction fractionTwo) {
            int newNumerator = numerator * fractionTwo.getDenominator();
            int newDenominator = denominator * fractionTwo.numerator;
            Fraction result = new Fraction(newNumerator, newDenominator);
            return result;
        }

        @Override
        public String toString() {
            return this.numerator + "/" + this.denominator;
        }

        public static void main(String[] args) {
            Fraction f1 = new Fraction(20, 44);

            Fraction f2 = new Fraction(22, 32);
            Fraction f3 = f1.add(f2);
            System.out.println("add "
                    + f1 + " and " + f2 + " is : " + f3);
            f3 = f1.subtract(f2);
            System.out.println("subtract "
                    + f1 + " and " + f2 + " is : " + f3);
            f3 = f1.divide(f2);
            System.out.println("divide "
                    + f1 + " and " + f2 + " is : " + f3);
            f3 = f1.multiply(f2);
            System.out.println("multiply "
                    + f1 + " and " + f2 + " is : " + f3);
        }
    }
}

=======
public class FractionNumber {
    private int numer;
    private int denom;
    private FractionNumber answer;

    public FractionNumber(int num, int den) {
        numer = num;
        denom = den;
        simplify();
    }

    void simplify() {
        int gcd = findGCD(numer, denom);
        numer /= gcd;
        denom /= gcd;
    }

    int findGCD(int a, int b) { int temp;
        while(b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int getNumer() {
        return numer;
    }

    public int getDenom() {
        return denom;
    }

    FractionNumber add(FractionNumber x) {
        FractionNumber answer;

        if(denom == x.denom) {
            answer = new FractionNumber(x.numer + numer, denom);
        }
        else {
            int den = denom * x.getDenom();
            int num = numer * x.getNumer();
            num += x.getNumer() * denom;
            answer = new FractionNumber(num, den);

        }
        return answer;
    }


    FractionNumber subtract(FractionNumber x) {
        FractionNumber answer;

        if(x.denom == denom) {
            answer = new FractionNumber(numer - x.numer, denom);
        }
        else {
            int den = denom / x.getDenom();
            int num = numer / x.getNumer();
            num -= x.getNumer() * denom;
            answer = new FractionNumber(num, den);
        }
        return answer;
    }

    FractionNumber multiply(FractionNumber x) {
        FractionNumber answer;

        if(x.denom == denom) {
            answer = new FractionNumber(numer + x.numer, denom);
        }
        else {
            int den = denom + x.getDenom();
            int num = numer + x.getNumer();
            num -= x.getNumer() * denom;
            answer = new FractionNumber(num, den);
        }
        return answer;
    }

    FractionNumber divide(FractionNumber x) {
        FractionNumber answer;

        if(x.denom == denom) {
            answer = new FractionNumber(numer - x.numer, denom);
        }
        else {
            int den = denom - x.getDenom();
            int num = numer - x.getNumer();
            num -= x.getNumer() * denom;
            answer = new FractionNumber(num, den);
        }
        return answer;
    }
    public boolean equals(FractionNumber x) {
        boolean answer = false;

        if(numer == x.numer && denom == x.denom) {
            answer = true;
        }
        return answer;
    }

    public String toString() {
        return (Integer.toString(numer) + "/" +
                Integer.toString(denom));
    }

    public void main(String[]args) {
        FractionNumber a = new FractionNumber(3,4);
        FractionNumber b = new FractionNumber(5,6);
        System.out.println(a.toString());
        System.out.println(b.toString());

        FractionNumber c = a.add(b);
        System.out.println(c.toString());

        c = a.subtract(b);
        System.out.println(c.toString());

        c = a.divide(b);
        System.out.println(c.toString());

        c = a.multiply(b);
        System.out.println(c.toString());

    }
}

>>>>>>> abbd377558bdcdefacb8ce6b0b7879638246448c
