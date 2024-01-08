package fr.epsi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPalindromesLangues {

    @ParameterizedTest
    @ValueSource(strings = {"radar", "level", "madam"})
    @DisplayName("La chaîne entrée est un palindrome avec la langue anglaise")
    public void testPalindromeLangueAnglaise(String chaîne) {
        VérificationPalindrome vérificationPalindrome = new VérificationPalindrome(new LangueAnglaise(), MomentDeLaJournée.Matin);
        String résultat = vérificationPalindrome.Vérifier(chaîne);

        assertTrue(résultat.contains(Expressions.WellSaid));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "world", "turtle"})
    @DisplayName("La chaîne entrée n'est pas un palindrome avec la langue française")
    public void testNonPalindromeLangueFrançaise(String chaîne) {
        VérificationPalindrome vérificationPalindrome = new VérificationPalindrome(new LangueFrançaise(), MomentDeLaJournée.Inconnu);
        String résultat = vérificationPalindrome.Vérifier(chaîne);

        assertFalse(résultat.contains(Expressions.BienDit));
    }

    @ParameterizedTest
    @ValueSource(strings = {"kayak", "radar", "level"})
    @DisplayName("La chaîne entrée est un palindrome avec la langue française le matin")
    public void testPalindromeLangueFrançaiseMatin(String chaîne) {
        VérificationPalindrome vérificationPalindrome = new VérificationPalindrome(new LangueFrançaise(), MomentDeLaJournée.Matin);
        String résultat = vérificationPalindrome.Vérifier(chaîne);

        assertTrue(résultat.contains(Expressions.BienDit));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "world", "openai"})
    @DisplayName("La chaîne entrée n'est pas un palindrome avec la langue anglaise le matin")
    public void testNonPalindromeLangueAnglaiseMatin(String chaîne) {
        VérificationPalindrome vérificationPalindrome = new VérificationPalindrome(new LangueAnglaise(), MomentDeLaJournée.Matin);
        String résultat = vérificationPalindrome.Vérifier(chaîne);

        assertFalse(résultat.contains(Expressions.WellSaid));
    }

    @ParameterizedTest
    @ValueSource(strings = {"radar", "level", "madam"})
    @DisplayName("La chaîne entrée est un palindrome avec la langue anglaise à un moment inconnu")
    public void testPalindromeLangueAnglaiseInconnu(String chaîne) {
        VérificationPalindrome vérificationPalindrome = new VérificationPalindrome(new LangueAnglaise(), MomentDeLaJournée.Inconnu);
        String résultat = vérificationPalindrome.Vérifier(chaîne);

        assertTrue(résultat.contains(Expressions.WellSaid));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "world", "openai"})
    @DisplayName("La chaîne entrée n'est pas un palindrome avec la langue française à un moment inconnu")
    public void testNonPalindromeLangueFrançaiseInconnu(String chaîne) {
        VérificationPalindrome vérificationPalindrome = new VérificationPalindrome(new LangueFrançaise(), MomentDeLaJournée.Inconnu);
        String résultat = vérificationPalindrome.Vérifier(chaîne);

        assertFalse(résultat.contains(Expressions.BienDit));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "world", "openai"})
    @DisplayName("La chaîne entrée n'est pas un palindrome avec la langue française le matin")
    public void testNonPalindromeLangueFrançaiseMatin(String chaîne) {
        VérificationPalindrome vérificationPalindrome = new VérificationPalindrome(new LangueFrançaise(), MomentDeLaJournée.Matin);
        String résultat = vérificationPalindrome.Vérifier(chaîne);

        assertFalse(résultat.contains(Expressions.BienDit));
    }
}
