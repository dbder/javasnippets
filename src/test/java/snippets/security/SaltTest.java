package snippets.security;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SaltTest {

    @Test
    void createSHA256HashWithSalt() {
        //given: a password and 2 salts
        String passwordToHash = "myPassword";
        byte[] salt1 = SecUtil.createSalt();
        byte[] salt2 = SecUtil.createSalt();

        //when: 2 passwords are created
        String securePassword1 = SecUtil.getSHA256Salted(passwordToHash, salt1);
        String securePassword2 = SecUtil.getSHA256Salted(passwordToHash, salt2);

        //then: the passwords are not eachother and not the original
        assertFalse(securePassword1.equals(securePassword2));
        assertFalse(securePassword1.equals(passwordToHash));
        //and: the size is 64
        assertEquals(64, securePassword1.length());
    }

    @Test
    void createMD5HashWithSalt() {

        //given: a password and 2 salts
        String passwordToHash = "myPassword";
        byte[] salt1 = SecUtil.createSalt();
        byte[] salt2 = SecUtil.createSalt();

        //when: 2 passwords are created
        String securePassword1 = SecUtil.getMD5Salted(passwordToHash, salt1);
        String securePassword2 = SecUtil.getMD5Salted(passwordToHash, salt2);

        //then: the passwords are not eachother and not the original
        assertFalse(securePassword1.equals(securePassword2));
        assertFalse(securePassword1.equals(passwordToHash));
        //and: the size is 32
        assertEquals(32, securePassword1.length());

    }

}
