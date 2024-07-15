package questions.chp4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CryptographyTest {

    @Test
    public void testThatNumbersCanBeEncryptedTest(){
        Cryptography cryptography = new Cryptography();
        int encryptNumber = Integer.parseInt(cryptography.encryptNumber(5678));
        assertEquals(4523, encryptNumber);
    }

    @Test
    public void testThatNumbersCanBeDecryptedTest(){
        Cryptography cryptography = new Cryptography();
        int decryptNumber = Integer.parseInt(cryptography.decryptNumber(4523));
        assertEquals(5678, decryptNumber);
    }
}
