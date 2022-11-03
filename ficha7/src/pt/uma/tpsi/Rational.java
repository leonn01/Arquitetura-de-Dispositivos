package pt.uma.tpsi;

import java.util.Objects;

public class Rational implements Comparable<Rational>{
    private  int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Rational() {
        this.numerator = 0;
        this.denominator = 0;
    }

    //-------------------------------------------

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

    public void setAll(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString(){
        return "Rational{"+
                "numerator=" +numerator+
                ", denominator="+denominator+
                '}';
    }

    @Override
    public boolean equals(Object object) {
        //verificar o true por defeito: comparaçao de refencia (identidade)
        if (this == object)
            return true;
        //verificar o false por defeito: verificar se é null ou se sao classes deferentes
        if (object == null || this.getClass() != object.getClass())

            return false;

        Rational objectRational=(Rational) object;
        return getNumerator()==objectRational.getNumerator()&& getDenominator() ==objectRational.getDenominator();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumerator(), getDenominator());
    }

    @Override
    public int compareTo(Rational o) {
        return numerator*o.getDenominator()-o.getNumerator()*denominator;
    }

}
