public class Main
{
  public static void main(String[] args)
  {
    int[] arr={1,2,2,2,1};
    int sum=1;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%2==0)
      {
        sum=sum*arr[i];
      }
    }
    System.out.println(sum);
  }
}
