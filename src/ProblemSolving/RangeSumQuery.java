package ProblemSolving;

import java.util.Arrays;

public class RangeSumQuery {
    public int[] solve(int[] A, int[][]B)
    {
        int N = A.length;
        int M = B[0].length;
        int[] Sum = new int[B.length];

        for(int i =1; i<N ; i++)
        {
            A[i]+=A[i-1];
        }

        for(int i = 0; i < M; i++)
        {
            int s = B[i][0];
            int e = B[i][1];

            if(s==0)
            {
                Sum[i]=A[e];
            }
            else
            {
                Sum[i]= A[e]-A[s-1];
            }
        }
        return Sum;
    }
    public static void main(String[] args) {
        int[] A = new int[] {1, 2, 3, 4, 5};
        int[][] B = new int[][] {{0, 3}, {1, 2}};
        RangeSumQuery r = new RangeSumQuery();
        int[] result= r.solve(A,B);
        System.out.println(Arrays.toString(result));

    }
}
