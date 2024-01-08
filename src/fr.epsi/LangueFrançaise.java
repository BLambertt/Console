package fr.epsi;

public class LangueFrançaise implements LangueInterface {
    @Override
    public String Féliciter() {
        return Expressions.BienDit;
    }

    @Override
    public String Saluer() {
        return Expressions.Bonjour;
    }

    @Override
    public String toString() {
        return "Langue Française";
    }
}
