package fr.epsi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPalindromes {

    @ParameterizedTest
    @ValueSource(strings = {"hello", "world", "turtle"})
    @DisplayName("La chaîne entrée n'est pas un palindrome")
    public void testNonPalindrome(String chaîne) {
        VérificationPalindrome vérificationPalindrome = new VérificationPalindrome(new LangueFrançaise(), MomentDeLaJournée.Inconnu);
        String résultat = vérificationPalindrome.Vérifier(chaîne);

        assertFalse(résultat.contains(Expressions.BienDit));
    }

    @ParameterizedTest
    @ValueSource(strings = {"radar", "kayak", "level"})
    @DisplayName("La chaîne entrée est un palindrome")
    public void testPalindrome(String chaîne) {
        VérificationPalindrome vérificationPalindrome = new VérificationPalindrome(new LangueAnglaise(), MomentDeLaJournée.Matin);
        String résultat = vérificationPalindrome.Vérifier(chaîne);

        assertTrue(résultat.contains(Expressions.WellSaid));
    }
}
