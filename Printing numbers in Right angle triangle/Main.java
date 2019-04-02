import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int c_row = 1; c_row <= n; c_row++)
      {
      for(int c_col = 1; c_col <= c_row; c_col++)
      {
        System.out.print(c_row);
      }
    System.out.println();
	}
}
}