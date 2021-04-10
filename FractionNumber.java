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

