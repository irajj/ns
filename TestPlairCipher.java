public class TestPlairCipher{
    public static void main(String[] args)
    {
        System.out.println("Example-1\n");
        
        String key1 = "Problem";
        String plainText1 = "Playfair";
        
        System.out.println("Key: " + key1);
        System.out.println("PlainText: " + plainText1);
        
        Playfaircipher pfc1 = new Playfaircipher(key1, plainText1);
        pfc1.cleanPlayFairKey();
        pfc1.generateCipherKey();
        
        String encText1 = pfc1.encryptMessage();
        System.out.println("Cipher Text is: " + encText1);
  
        System.out.println("\nExample-2\n");
        
        String key2 = "Problem";
        String plainText2 = "Hello";
        
        System.out.println("Key: " + key2);
        System.out.println("PlainText: " + plainText2);
        
        Playfaircipher pfc2 = new Playfaircipher(key2, plainText2);
        pfc2.cleanPlayFairKey();
        pfc2.generateCipherKey();
        
        String encText2 = pfc2.encryptMessage();
        System.out.println("Cipher Text is: " + encText2);
    }
}