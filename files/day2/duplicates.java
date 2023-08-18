public class Main
{
  public static void main(String[] args)
  {
     int[] arr={1,2,1,4,1,3,1,1,1};
     int count=0;
    
     for(int i=0;i<arr.length;i++)
     {
        for(int j=i+1;j<arr.length;j++)
        {
           if(arr[i]==arr[j])
           {
               count++;
               break;
           }
        }
     }
     System.out.println(count);
     
   }
 }
            
