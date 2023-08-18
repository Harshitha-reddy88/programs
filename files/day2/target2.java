public class Main
{
   public static void main(String[] args)
   {
       int[] arr={1,3,1,1,4,5,1};
       int target=8;
       String bag="";
       for(int i=0;i<arr.length;i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i]+arr[j]==target)
               {
                    bag=bag+i+" ";
                    bag=bag+j;
               }
           }
       }
       System.out.println(bag);
    }
 }
                   
