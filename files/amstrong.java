public class Main
{
	public static void main(String[] args)
	{
	   int num=1231;
	   int count=0;
	   System.out.println(amstrongNumber(num,count));
	}
    public static int amstrongNumber(int num,int count)
    {
		//int num=123;
		String num1=""+num;
		//int count=0;
		for(int i=0;i<num1.length();i++)
		{
			int x=(num1.charAt(i)-'0');
			count+=Math.pow(x,num1.length());
		}
	        return count;	
		
	}
}
