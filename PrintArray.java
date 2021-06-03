package NormalWay;

public class PrintArray {

	public static void main(String[] args) {
		Integer[] myIntArray = {12,17,2,7,3,23};
		Double[] myDoubleArray = {2.5,7.3,10.2,6.6,5.9};
		Character[] myCharArray = {'S','H','R','E','Y','A','S'};
		
		System.out.println("Integer array:");
		toPrint(myIntArray);
		System.out.println("Double array:");
		toPrint(myDoubleArray);
		System.out.println("Character array:");
		toPrint(myCharArray);
	}
	
	public static void toPrint(Integer[] myIntArray)
	{
		for(int index : myIntArray)
		{
			System.out.println(index);
		}
		System.out.println();
	}
	
	public static void toPrint(Double[] DoubleArray)
	{
		for(double index : DoubleArray)
		{
			System.out.println(index);
		}
		System.out.println();

	}
	
	public static void toPrint(Character[] CharacterArray)
	{
		for(char index : CharacterArray)
		{
			System.out.println(index);
		}
		System.out.println();

	}

}
