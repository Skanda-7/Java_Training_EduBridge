public class Recursion {

    static double powRec(int x, int n) {

        if (n == 0)
            return 1;

        double half = powRec(x, n / 2);

        if (n % 2 == 0)
            return half * half;
        else
            return half * half * x;
    }

    public static void main(String[] args) {

        int x = 2, n = 10;

        double ans = powRec(x, Math.abs(n));

        if (n < 0)
            System.out.println(1 / ans);
        else
            System.out.println(ans);
    }
}