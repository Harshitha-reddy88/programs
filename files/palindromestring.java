class HelloWorld 
{
    public static String str="hello madam you won the racecar";
    public static char[] arr=str.toCharArray();
    public static void main(String[] args)
    {
       	int count = 0;
       	if(functionReverseString(0, arr.length-1, arr))
       	{
           	count += 1;
       	}
        
        System.out.println(count);
        
        int wordStart = 0;
        int wordEnd = 0;
        
        while((wordEnd=functionWordEnd(wordStart,arr)) != -1)
        
        {
                if(functionReverseString(wordStart, wordEnd-1, arr))
                {
                    count += 1;
                }
                
                wordStart = wordEnd + 1;
        }
       
        System.out.println(count); 
    }
    public static int functionWordEnd(int start,char[] arr)
    	{
        	if(start >= arr.length)
        	{
            		return -1;
            
        	}
        
        	int wordEnd = start;
        
        	while(wordEnd < arr.length && arr[wordEnd]!= ' ')
        	{
           		 wordEnd++;
        	}
        	return wordEnd;
    	}
    
     public static boolean functionReverseString(int start,int end, char[] arr)
    	{
        
        	if(arr==null)
        	{
            		return false;
        	}
        	boolean flag = true;
        	while(start<=end)
        	{
            		if(arr[start] != arr[end])
            		{
                		flag = false;
                		break;
            		}
            		start++;
            		end--;
        	}

        	return flag;
    }
}
