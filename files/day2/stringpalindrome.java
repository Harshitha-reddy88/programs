public class Main
{
  public static void main(String[] args)
  {
     String str="12";
     String str1="";
     for(int i=0;i<str.length();i++)
     {
         str1=str.charAt(i)+str1;
     }
     if(str.equals(str1))
     {
        System.out.println("palindrome");
     }
     else
     {
        System.out.println("not a palindrome");
     }
     
   }
 }
