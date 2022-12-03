public class LargestAmongThreeNos {

    public static void main(String[] args) {
        int n = 33;
        int k = 10;
        int p = 1001;

        if( (n>p) && (n>k)){
            System.out.println(n + " is the largest among " + n +", "+ p +", "+ k);
        } else if (p>n && p>k) {
            System.out.println(p + " is the largest among " + n +", "+ p +", "+ k);
        } else {
            System.out.println(k + " is the largest among " + n +", " + p +", "+ k);
        }
    }
}
