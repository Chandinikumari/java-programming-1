public class Calculator{
 
	interface LambdaExpression{
		float operation(int a, int b);
	}
	public static void main(String[] args){
 
		LambdaExpression add = (int a, int b) -> (a+b);
		LambdaExpression difference = (int a, int b) -> (a-b);
		LambdaExpression product = (int a, int b) -> (a*b);
		LambdaExpression safeDivision = (int a, int b) ->{
			if(b != 0)
				return a/b;
			else
				return 0;
		};
		System.out.println(add.operation(7,5));
		System.out.println(difference.operation(12,5));
		System.out.println(product.operation(5,5));
		System.out.println(safeDivision.operation(8,5));
 
	}
}			