package advance_java;

class Arr<T>
{
	private T[] a;
	private T s;
	public Arr(T[] words,T key)
	{
		a=words;
		s=key;
	}
	public void display()
	{
		System.out.println("The Array Elements Are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	void linear_search(T key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				System.out.println("the key "+key+" element found at index="+i);
			}
		}
		System.out.println("element not found");
	}
	void binary_search()
	{
		 
	}
}
public class arrdisp {

	public static void main(String[] args) {
//		String[] words= {"dog","cat","tea","jug"};
//		Arr<String> myArray= new Arr<String>(words);
//		myArray.display();
//		System.out.println();
		
		Integer[] intArr= {12,3,4,56};
		Integer z=4;
		Arr<Integer> myIntArray=new Arr<Integer>(intArr,z);
		myIntArray.display();
		myIntArray.linear_search(z);
		System.out.println();
		
		


	}

}
