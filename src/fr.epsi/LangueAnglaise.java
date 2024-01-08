package fr.epsi;

public class LangueAnglaise implements LangueInterface {
    @Override
    public String Féliciter() {
        return Expressions.WellSaid;
    }

    @Override
    public String Saluer() {
        return Expressions.Hello;
    }

    @Override
    public String toString() {
        return "Langue Anglaise";
    }
}
