package aes;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AES{
private static SecretKeySpec secretKey;
private static byte[] key;
public static void initKey(String myKey) throws Exception {
MessageDigest md5Code = null;
key = myKey.getBytes(StandardCharsets.UTF_8);
md5Code = MessageDigest.getInstance("MD5");
key = md5Code.digest(key);
key = Arrays.copyOf(key, 16);
secretKey = new SecretKeySpec(key, "AES");
}
public static String encrypt(String strToEncrypt, String secret) throws Exception {
initKey(secret);
Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
cipher.init(Cipher.ENCRYPT_MODE, secretKey);
return
Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes(StandardCharsets.UTF_8)));
}
public static String decrypt(String strToDecrypt, String secret) throws Exception {
initKey(secret);
Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
cipher.init(Cipher.DECRYPT_MODE, secretKey);
return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("\nAES Algorithm\n");
System.out.println("Enter the message: (A-Z, a-z, 0-9)");
String message;
message = sc.nextLine();
System.out.println("Enter the key: (a-z,A-Z,0-9) (no spacing)");
String secretKey;
secretKey = sc.next();
String encryptedString = "";
String decryptedString = "";
try {
encryptedString = encrypt(message, secretKey);
decryptedString = decrypt(encryptedString, secretKey);
}
catch (Exception e){
e.printStackTrace();
}
System.out.println();
System.out.println("CipherText: " + encryptedString);
System.out.println("PlainText: " + decryptedString);
}
}
        
    
    

