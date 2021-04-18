 final class Fraction {

    private int numerator;

    private int denominator;
    // ДЗ не дает пользователю выбора, сокращать дробь или нет.
    public Fraction(int numerator,int denominator,boolean wantToReduce) {
        if (denominator == 0) {
    // ДЗ дает пространство решить эту проблему без применения механизмов, с которыми мы еще не ознакомились
            throw new IllegalArgumentException("The denominator is zero.");
        }
        if(numerator==0){
            this.numerator = 0;
            this.denominator = 1;
        }
        else{
            this.numerator = numerator;
            this.denominator = denominator;
        }
        if(denominator<0){
            this.numerator = -1*this.numerator;
            this.denominator = -1*this.denominator;
        }
        // if(wantToReduce) это законно
        if(wantToReduce==true)
            this.reduce();
    }
    public Fraction(int num) {
        this.numerator = num;
        this.denominator = 1;
    }

    // ДЗ навязывает 4 ситуации. Здесь учтены две
    @Override
    public String toString() {
        if(denominator!=1)
            return numerator+"/"+denominator;
        else
            return numerator+"";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Fraction))
            return false;
        Fraction f = ((Fraction)obj);
        int gcd =gcd(numerator,denominator);
        f.reduce();
         // return (this.numerator/gcd==f.numerator) && (this.denominator/gcd == f.denominator); это законно
        if(this.numerator/gcd==f.numerator && this.denominator/gcd == f.denominator)
            return true;
        else
            return false;
    }
    public static int gcd(int a,int b){
        if(a<0)
            a=-1*a;
        if(b<0)
            b=-1*b;
        int t;
        while(b!=0){
            t=b;
            b = a%b;
            a = t;
        }
        return a;
    }

    public Fraction reduce(){
        int gcd =gcd(numerator,denominator);
        numerator = numerator/gcd;
        denominator = denominator/gcd;
        return this;
    }

    //Cannot decide weather to make static methods or not so I randomly picked one.

     // мы обсуждали этот вопрос  при постановке ДЗ. Эти методы должны быть у инстанций, то есть, они НЕ статичны.
     // как эти методы должны применяться:
     /*
     FractionNumber a = new FractionNumber(1,2);
     FractionNumber b = new FractionNumber(3,5);
     FractionNumber c = a.add(b);
     */
    public static Fraction add(Fraction f1,Fraction f2,boolean w){
        return new Fraction(f1.numerator*f2.denominator+f2.numerator*f1.denominator,f1.denominator*f2.denominator,w);
    }
    public static Fraction sub(Fraction f1,Fraction f2,boolean w){
        return new Fraction(f1.numerator*f2.denominator-f2.numerator*f1.denominator,f1.denominator*f2.denominator,w);
    }
    public static Fraction mul(Fraction f1,Fraction f2,boolean w){
        return new Fraction(f1.numerator*f2.numerator,f1.denominator*f2.denominator,w);
    }
    public static Fraction div(Fraction f1,Fraction f2,boolean w){
        return new Fraction(f1.numerator*f2.denominator,f1.denominator*f2.numerator,w);
    }




}
