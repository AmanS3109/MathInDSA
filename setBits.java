public class setBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(countSetBits(n));
    }

    private static int countSetBits(int n) {
        int count = 0;
        // while (n > 0) {
        //     count++;
        //     n -= (n &(-n));
        // }
        while (n > 0) {
            count++;
            n = n & (n-1);
        }
        return count; 
    }
}
