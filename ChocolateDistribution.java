/*
Suppose I have "m" chocolates. and "n" children, if i want to distribute each chocolates to all m children in a sequential order by repeating same list of children if excess in     chocolates. how do you distribute?

Note: you can solve either in Python/Java.

example 1: if m=3 (chocolates here is 3) , n=3 (children are 3 you can name children as 1,2,3 ) answer: {1:1,2:1,3:1}

example 2: if m=7 and n=5 then child {1:2, 2:2, 3:1, 4:1, 5:1}

can you write a simple python/java function to resolve this? where n and m are parameters.*/

public class ChocolateDistribution {

	public static void displayChocolateDistribution(int n,int m ) {
		// n no of children
		//m no of chocolates.
		int arr[] = new int[n];
		try {
		for(int i=0;i<arr.length;i++) {
			arr[i]=m/n;
			if (i<m%n) {
				arr[i]=arr[i]+1;
			}
			System.out.println(i+1 +":"+arr[i]);
		}
	}catch (ArithmeticException e){
		e.getMessage();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayChocolateDistribution(5,7);
	}

}
