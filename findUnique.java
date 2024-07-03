public class findUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 2};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int distinct = 0;
        for (int n : arr) {
            distinct ^= n;
        }
        return distinct;
    }
}
