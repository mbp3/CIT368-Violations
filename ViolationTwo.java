import java.math.BigInteger;

public class ViolationTwo {

	public static void main(String[] args) {
		/* Violation of Rule 04: STR03-J  */
		// https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string
		BigInteger x = new BigInteger("530500452766");
		byte[] byteArr = x.toByteArray();
		String string = new String(byteArr);
		byteArr = string.getBytes();
		BigInteger y = new BigInteger(byteArr);
		
		System.out.println("Original: " + x);
		System.out.println("Modified: " + y);
		System.out.println("Error of: " + x.subtract(y));
	}
}
