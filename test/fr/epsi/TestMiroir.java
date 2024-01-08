package fr.epsi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMiroir {

    @ParameterizedTest
    @ValueSource(strings = {"test", "epsi"})
    @DisplayName("La chaîne entrée est renvoyée à l'envers")
    public void testMiroir(String chaîne) {
        VérificationPalindrome vérificationPalindrome = new VérificationPalindrome(new LangueFrançaise(), MomentDeLaJournée.Inconnu);
        String résultat = vérificationPalindrome.Vérifier(chaîne);

        String inversion = new StringBuilder(chaîne)
                .reverse()
                .toString();

        assertTrue(résultat.contains(inversion));
    }
}
