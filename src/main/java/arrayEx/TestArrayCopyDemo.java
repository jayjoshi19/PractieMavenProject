package arrayEx;

class TestArrayCopyDemo {
	public static void main(String[] args) {
		// declaring a source array
		char[] copyFromArr = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		// declaring a destination array
		char[] copyToArr = new char[7];
		// copying array using System.arraycopy() method
		// copying from srcArryName, startPos, destArryName, destPos, length
		System.arraycopy(copyFromArr, 2, copyToArr, 0, 7);
		// printing the destination array
		System.out.println("Copied Array Value :: " + String.valueOf(copyToArr));
	}
}
