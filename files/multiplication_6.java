public class Main
   {	
   	public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
     	int rows=3;
     	int colums=3;
     	System.out.println(multiplicationOfMatrix(rows,colums,arr));
   }
   public static int multiplicationOfMatrix(int rows,int colums,int[][] arr)
   {
   //multiplication of the elements in matrix   
            int x=1;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                  	x=x*arr[i][j];
                }
            }
            return x;
    }
    
    
}
      
                   
