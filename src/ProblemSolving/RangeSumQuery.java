package ProblemSolving;

import java.util.Arrays;

public class RangeSumQuery {
    public int[] solve(int[] A, int[][]B)
    {
        int N = A.length;
        int M = B[0].length;
        int[] sum = new int[B.length];



        for(int i = 0; i < M; i++)
        {
            int s = B[i][0];
            int e = B[i][1];
            for(int j = s; j <=e; j++)
            {
                sum [i] += A[j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] A = new int[] {2, 2, 2};
        int[][] B = new int[][] {{0, 0}, {1, 2}};
        RangeSumQuery r = new RangeSumQuery();
        int[] result= r.solve(A,B);
        System.out.println(Arrays.toString(result));

    }
}
