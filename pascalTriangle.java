public class pascalTriangle {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sumOfNthNum(n));
    }
    static int sumOfNthNum(int n){
        return 1 << (n - 1);
    }
}
