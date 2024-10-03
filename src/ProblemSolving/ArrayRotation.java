package ProblemSolving;

import java.util.Arrays;
//Brute Force Approach
public class ArrayRotation {
    public  int[] solve(int[] A, int B) {
        int N = A.length;
        int s = 0;
        int e = N-1;

      while(s<e)
      {
          int temp = A[s];
          A[s] = A[e];
          A[e] = temp;
          s++;
          e--;
      }

      s =0;
      e= B-1;
      while(s<e)
      {
          int temp = A[s];
          A[s] = A[e];
          A[e] = temp;
          s++;
          e--;
      }
        s =B;
        e= N-1;
        while(s<e)
        {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }

        return A;
    }
    public static void main(String[] args) {
        int[] A1 = new int[] {1, 2, 3, 4};
        int B =2;
        ArrayRotation a =new ArrayRotation();

        System.out.print(Arrays.toString(a.solve(A1, B)));



    }
}
