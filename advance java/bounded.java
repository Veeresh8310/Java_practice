package advance_java;

public class bounded<T extends Number> {
	T[] nums;
	

	
	public bounded(T[] nums) {
		this.nums = nums;
	}
	double average()
	{
		double sum=0.0;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i].doubleValue();
		}
		return sum/nums.length;
	}


	public static void main(String[] args) {
		Integer inums[]= {1,2,3,4,5};
		bounded<Integer>iob=new bounded<Integer>(inums);
		double v=iob.average();
		System.out.println("iob average is "+v);
		Double dnums[]= {1.1,2.2,3.3,4.4,5.5};
		bounded<Double> dob=new bounded<Double>(dnums);
		double w=dob.average();
		System.out.println("dob average is "+w);
		
		
//		String strs[]= {"1","2","3","4","5"};
//		bounded<String> sob=new bounded<String>(strs);
//		double x=sob.average();
//		System.out.println("sob average is "+x);
	}

}
