package ProblemSolving;

public class FindPerfectNumbers {
    public int solve(int A)
    {
        if(A<=1)
        {
            return 0;
        }
        int sum =1;
        for(int i=2;i*i<=A;i++)
        {
            if(A%i==0)
            {
                if(i==A/i)
                {
                    sum +=i;
                }
                else {
                    sum+=i+A/i;
                }
            }

        }
        if(sum==A){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        FindPerfectNumbers f = new FindPerfectNumbers();

        int A= 28;
        System.out.println(f.solve(A));

    }
}
