import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("Array without duplicates:");

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    found = true;
                    break;
                }
            }

            if (!found)
                System.out.print(a[i] + " ");
        }
    }
}