package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		printByteBinary((byte)140);
		System.out.println();
		
		printShortBinary((short) 13423);
		System.out.println();
		
		printIntBinary(114931033);
		System.out.println();
		
		printLongBinary(134189370113L);
		System.out.println();
	}
	
	public static void printByteBinary(byte b) {
		String fin = "";
		for(int i = 128; i >= 1; i/= 2) {
			if((b & i) != 0) fin += 1;
			else fin += 0;
		}
		
		System.out.print(fin);
	}
	
	public static void printShortBinary(short s) {
		printByteBinary((byte) (s>>8));
		printByteBinary((byte) s);
	}
	
	public static void printIntBinary(int i) {
		printShortBinary((short) (i>>16));
		printShortBinary((short) i);
	}
	
	public static void printLongBinary(long l) {
		printIntBinary((int) (l >> 32));
		printIntBinary((int) l);
	}
}
