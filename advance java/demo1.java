package advance_java;

class Gen1<T>
{
	T ob;
	Gen1 (T o){
		ob=o;
	}
	T getob() {
		return ob;
	}
	void showType(){
		System.out.println("Type of T is"+ob.getClass().getName());
	}
}
public class demo1 {

	public static void main(String[] args) {
		Gen1<Integer> iob;
		iob=new Gen1<Integer>(88);
		iob.showType();
		//get the value in iob. Notice that no cast is needed.
		int v=iob.getob();
		System.out.println("value: "+v);
		System.out.println();
		
		//create a Gen object for Strings
		Gen1<String> strob=new Gen1<String>("Generics Test");
		//show the type of data used by strob.
		strob.showType();
		//get the value of strob. Again, notice that no cast is needed.
		String str=strob.getob();
		System.out.println("value :"+str);
	}

}
