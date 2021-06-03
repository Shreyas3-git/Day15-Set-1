package Generic.assignment;

public class PrintArrayWithGenerics<E> {
	
	private E[] myArray;
	
	public PrintArrayWithGenerics(E[] myArray)
	{
		this.myArray = myArray;
	}
	
	public static <E>void toPrint(E[] myIntArray)
	{
		for(E index : myIntArray)
		{
			System.out.println(index);
		}
		System.out.println();
	}
	
	public void toPrint()
	{
		PrintArrayWithGenerics.toPrint(myArray);
	}
	
	public static void main(String[] args) {
		
		Integer[] myIntArray = {12,17,2,7,3,23};
		Double[] myDoubleArray = {2.5,7.3,10.2,6.6,5.9};
		Character[] myCharArray = {'S','H','R','E','Y','A','S'};
		
		new PrintArrayWithGenerics(myIntArray).toPrint();;
		PrintArrayWithGenerics.toPrint(myDoubleArray);
		PrintArrayWithGenerics.toPrint(myCharArray);
	
	}

}
