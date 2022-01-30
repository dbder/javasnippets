package snippets.security;

import lombok.extern.java.Log;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * BCryptPasswordEncoder is part of spring sec.
 */
@Log
public class BcryptTest {
    private static final BCryptPasswordEncoder BCRYPTPASSWORDENCODER = new BCryptPasswordEncoder();


    @Test
    void brypt_2encodes_differGreatly() {
        //given: a password
        var pw = "password1";

        //when: it's bcrypted twice
        var encoded1 = BCRYPTPASSWORDENCODER.encode(pw);
        var encoded2 = BCRYPTPASSWORDENCODER.encode(pw);

        //then: bcypt knows it's the same
        assertTrue(BCRYPTPASSWORDENCODER.matches(pw, encoded1));
        assertTrue(BCRYPTPASSWORDENCODER.matches(pw, encoded2));
        //and: they are not alike
        var distance = LevenshteinDistance.getDefaultInstance().apply(encoded1, encoded2);
        assertTrue(distance > 45);

    }
}
