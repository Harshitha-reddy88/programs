 class main
 {
  	public static  String x="hellow harshitha how are you";
  	public static char [] arr=x.toCharArray();
  	 
   	public static void main(String[] args)
     	{      //function calling
        	reverseString(0,arr.length-1,arr);
        	System.out.println(arr);
     	}
     	
     	//reversing the string
  	public static void reverseString(int startpoint, int endpoint , char [] arr)
     	{
        	while(startpoint <= endpoint)
         	{
             		char y = arr[startpoint];
             		arr[startpoint] = arr[endpoint];
             		arr[endpoint] = y;
             		startpoint++;
             		endpoint--;  
        	 }
     	}  
  }  
