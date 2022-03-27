package snippets;

public class SmallestNumber {

    public static void main(String[] args) {

        System.out.println(sm(99));
        System.out.println(sm(999));
        System.out.println(sm(9999));
        System.out.println(sm(99999));
        System.out.println(sm(2));
    }


    static int sm(int n) {
        if (n < 10)return 0;
        int res = 1;
        while (n >= 10) {
            res *= 10;
            n /= 10;
        }
        return res;
    }
}
