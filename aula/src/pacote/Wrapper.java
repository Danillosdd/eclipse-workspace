package pacote;

public class Wrapper {

	public static void main(String[] args) {
		String numInt = "9822";

		Float fNum1 = new Float("200.50");
		Integer iNum1 = new Integer(numInt);
		//Double dNum1 = new Double(512.22);

		Character cNum = new Character('a');

		Float fNum2 = new Float(500.50);
		//Integer iNum2 = new Integer(2800);
		//Double dNum2 = new Double(512.22);

		System.out.println("Float representado por string: " + fNum1);
		System.out.println("Float natural: " + fNum2);
		System.out.println("Integer representadopor string: " + iNum1);
		System.out.println("Char: " + cNum);

	}
}
