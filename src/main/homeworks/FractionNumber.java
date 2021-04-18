package main;

class FractionNumber {
    // private?
    int numerator;
    int denominator;

    // @Override ?
    public String toString(){
        if ( numerator > denominator ) {
            return String.format("%d %d/%d", this.numerator / this.denominator, this.numerator % this.denominator, this.denominator);
        }

        if ( denominator == 1 ) {
            return String.format("%d", this.numerator);
        }

        if ( denominator == 0 ) {
            return "DIVISION BY ZERO";
        }

        return String.format("%d/%d", this.numerator, this.denominator);
    }

    public FractionNumber(int a, int b){
        numerator = a;
        denominator = b;
        //сдается мне, код метода simplify можно сразу переносить в конструктор, так как оный симплифай более нигде не нужен
        this.simplify();
    }

    private void simplify () {
        int limit = Math.min(numerator, denominator);

        for (int i=2; i<= limit; i++) {
            if ( this.numerator % i == 0 && this.denominator % i ==0 ){
                this.numerator = this.numerator / i;
                this.denominator = this.denominator / i;
            }
        }
    }

    private int lcm (int a, int b) {
        int absHigherNumber = Math.max(a, b);
        int absLowerNumber = Math.min(a, b);
        int lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0) {
            lcm += absHigherNumber;
        }

        return lcm;
    }
    // не согласен. По ДЗ, методы не изменяют состояния текущей сущности, они порождают новую. Посему возвращаемый тип должен быть FractionNumber, не void
    // например
    /*
    FractionNumber a = new FractionNumber(1,2);
    FractionNumber b = new FractionNumber(3, 5);
    FractionNumber c = a.add(b);
     */
    public void add(FractionNumber anotherNumber){
        int lcm = lcm(denominator, anotherNumber.denominator);

        int firstMultiplier = lcm / denominator;
        int secondMultiplier = lcm / anotherNumber.denominator;

        numerator = numerator * firstMultiplier + anotherNumber.numerator * secondMultiplier;
        denominator = lcm;
        this.simplify();
    }

    public void subtract(FractionNumber anotherNumber){
        int lcm = lcm(denominator, anotherNumber.denominator);

        int firstMultiplier = lcm / denominator;
        int secondMultiplier = lcm / anotherNumber.denominator;

        numerator = numerator * firstMultiplier - anotherNumber.numerator * secondMultiplier;
        denominator = lcm;
        this.simplify();
    }

    public void multiply(FractionNumber anotherNumber){
        numerator =  anotherNumber.numerator * numerator;
        denominator = anotherNumber.denominator * denominator;
        this.simplify();
    }

    public void divide(FractionNumber anotherNumber){
        numerator =  anotherNumber.denominator * numerator;
        denominator = anotherNumber.numerator * denominator;
        this.simplify();

    }

    public static void main (String[] args){
        FractionNumber a = new FractionNumber(3,9);
        FractionNumber b = new FractionNumber(3,2);


        System.out.println("start ...");
        System.out.println(a);
        System.out.println(b);
        a.divide(b);
        System.out.println(a);
    }
}
