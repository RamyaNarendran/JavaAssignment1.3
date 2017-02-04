
public class assignment1_3 {
public static void main(String[] args) {
	int num1=76, num2=87;
	System.out.println("Before Swap:");
	System.out.println("num1 = "+num1);
	System.out.println("num2 = "+num2);
	// Task = Swap without using 3rd variable
	num1+=num2;
	num2 = num1 - num2;
	num1 = num1 - num2;
	System.out.println("After Swap:");
	System.out.println("num1 = "+num1);
	System.out.println("num2 = "+num2);
}
}
