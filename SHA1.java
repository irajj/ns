import java.math.BigInteger;
import java.security.MessageDigest;

public class SHA1 {

	public static void main(String[] argv){

		String value = "this is a test";

		String sha1 = "";
		
		// With the java libraries
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
	        digest.reset();
	        digest.update(value.getBytes("utf8"));
	        sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
		} catch (Exception e){
			e.printStackTrace();
		}

		System.out.println( "The sha1 of \""+ value + "\" is:");
		System.out.println( sha1 );
		System.out.println();

		
     }
}