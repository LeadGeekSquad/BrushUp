public class SwapTwoNumbers {
    public static void main(String[] args) {

        SwapNumbers(100,200);
    }

    public static void SwapNumbers(int n, int p){
        int temp=0;
        temp = n;
        n = p;
        p =  temp;
        System.out.println("After Swapping with P, the new value of N is " + n);
        System.out.println("After Swapping with N, the new value of P is " + p);


    }

}
