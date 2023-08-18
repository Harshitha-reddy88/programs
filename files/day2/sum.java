public class Main
{
   public static void main(String[] args)
   {
      int num=311;
      int sum=0;
      String str=""+num;
      for(int i=0;i<str.length();i++)
      {
         sum+=str.charAt(i)-'0';
      }
      System.out.println("sum of the digits:" + " "+sum);
   }
}
         
