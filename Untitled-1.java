import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] buses = new int[n];
        
        for (int i = 0; i < n; i++) {
            buses[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int low = 0, high = n - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;

            if (buses[mid] == x) {
                System.out.println(mid);
                break;
            } else if (buses[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        sc.close();
    }
}
