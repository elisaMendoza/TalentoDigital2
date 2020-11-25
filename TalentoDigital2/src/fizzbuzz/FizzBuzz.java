package fizzbuzz;

public class FizzBuzz {
	public String fizzBuzz(int number) {
		if(number%3==0) {
			return "Fizz";
		}else if(number%5==0){
			return "Buzz";
		}
		else if(number%15==0) {
			return "FizzBuzz";
		}else {
			return "El número introducido fue: " + number;
		}
	    }



public static void main(String[] args) {
	FizzBuzz test = new FizzBuzz();
	System.out.println(test.fizzBuzz(45));
	
}
}