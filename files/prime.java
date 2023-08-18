//code to check given number is prime or not
public class Main
{
   public static void main(String[] args)
   {   
       int num=1;
       int count=0;
       System.out.println(primeNumber(num,count));
   }
   public static boolean primeNumber(int num,int count)
   {   
     if (num==0 || num==1)
     {
        return false;
     }
      for(int i=1;i<=num;i++)
      {
         if(num%i==0)
         {
            count++;
         }
      }
    // if count is 2 given num is prime
      if(count==2)
      {
         return true;
       }
     // if count is greater than or less than 2 then it is not a prime 
       else
       {
         return false;
       }
    }

 }
   
       
