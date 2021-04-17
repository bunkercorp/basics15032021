public class FractionNumber {

    private int numerator;
    private int denominator;

    public FractionNumber(int numerator, int denominator){
        int reduction = numerator;
        numerator = (numerator < 0 ) ? numerator *= -1 : numerator;
        denominator = (denominator < 0 ) ? denominator *= -1 : denominator;

        for(; reduction > 1; reduction--){
            final double flNumerator = (double)numerator / reduction - (numerator / reduction);
            final double flDenominator = (double)denominator / reduction - (denominator / reduction);

            if( flNumerator == 0 && flDenominator == 0)
                break;
        }
        this.numerator = numerator / reduction;
        this.denominator = denominator / reduction;
    }

    @Override
    public String toString() {
        if(denominator == 1)
            return String.format("%d", numerator);
        else if(denominator == 0)
            return "DIVISION BY ZERO";
        else if(numerator < denominator)
            return String.format("%d/%d", numerator, denominator);
        else if(numerator >= denominator)
            return String.format("%d %d/%d", numerator/denominator, numerator%denominator, denominator);

        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != FractionNumber.class || obj == null)
            return false;
        FractionNumber newObj =(FractionNumber) obj;
        return this.numerator == newObj.numerator && this.denominator == newObj.denominator;
    }


    public FractionNumber add(FractionNumber fn){
        if(fn == null) return null;

        if(this.denominator == fn.denominator)
            return new FractionNumber(this.numerator + fn.numerator, this.denominator);

        return new FractionNumber(this.numerator * fn.denominator + fn.numerator * this.denominator, this.denominator * fn.denominator);
    }

    public FractionNumber subtract(FractionNumber fn){
        if(fn == null) return null;

        if(this.denominator == fn.denominator)
            return new FractionNumber(this.numerator - fn.numerator, this.denominator);

        return new FractionNumber(this.numerator * fn.denominator - fn.numerator * this.denominator, this.denominator * fn.denominator);
    }

    public FractionNumber multiply(FractionNumber fn){
        if(fn == null) return null;

        return new FractionNumber(this.numerator *  fn.numerator, this.denominator * fn.denominator);
    }

    public FractionNumber divide(FractionNumber fn){
        if(fn == null) return null;

        return new FractionNumber(this.numerator *  fn.denominator, this.denominator * fn.numerator);
    }
}
