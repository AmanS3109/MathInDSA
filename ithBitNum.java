// find the ith bit of given number
public class ithBitNum {
    public static void main(String[] args) {
        int num = 29;
        int i = 2; // Example bit position to find
        System.out.println(findBit(num, i));
    }

    static int findBit(int num, int i) {
        // (num >> (i - 1)) & 1 shifts the bits to the right (i - 1) times
        // and then masks all but the least significant bit
        // return (num >> (i - 1)) & 1;
        // using mask
        int mask = 1 << (i - 1);
        return (num & mask) >> (i-1);
    }
}