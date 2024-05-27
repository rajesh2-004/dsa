import java.util.*;

public class Missing{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        long totalSum = (long) n * (n + 1) / 2;
        long givenSum = 0;
        for (int i = 0; i < n - 1; i++) {
            int number = in.nextInt();
            givenSum += number;
        }
        long missingNumber = totalSum - givenSum;
        System.out.println(missingNumber);
    }
}
