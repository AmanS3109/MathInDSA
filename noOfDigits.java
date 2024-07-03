//number of digits in base b of number n
public class noOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
