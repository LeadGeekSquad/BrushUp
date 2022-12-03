
public class AddTwoIntegers {

    public static void main(String[] args) {

	//Add a comment here
	//This is how it wors
        AddTwoIntegers n1 = new AddTwoIntegers();
        int result = n1.addTwoIntegers(1,2);
        System.out.println("The sum of numbers is: " + result);

    }

    public int addTwoIntegers(int n, int p){

        int sum = n + p;

        return sum;
    }
}
