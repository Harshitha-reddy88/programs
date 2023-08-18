public class Main{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5};
		System.out.println(findingMidElementOddOrEven(arr.length,arr));
	}
  public static boolean findEvenOrNot(int num)
  {
  	if(num%2==0)
  	{
  	  return true;
  	}
  	else
  	{
  	  return false;
  	}
  }
  //function to check the mid numis even or odd
   public static String findingMidElementOddOrEven(int arrlength,int[] arr)
   {
  	int mid=arr.length/2;
  	if(findEvenOrNot(arr[mid])) 
  	{
  		return "even";
  	}
  	else
  	{
  		return "odd";
  	}
  }
}
  	
	
