public class ex07메서드예제 {
	public static void main(String[] args) {
//            완전 수 구하기
//            :나를 제외한 약수의 합이 나와 같은 수
//         6의 약수: 1 2 3 6 => 6(완전수)	
//       1단계) 약수인지 아닌지 약수인지 아닌지 확인해주는 메서드 만들기
	      int num1 = 10; 
	      int num2 = 2;
	      boolean divisor = isDivisor(num1, num2);
	      System.out.println(divisor);
	      getDivisor(10);
	      getDivisor(16);
	      getDivisor(24);
	      int result = getSumofDivisors(num1);
	      System.out.println(num1 + "의 약수의 합: "+ result);
	      getDivisor(num1);
	      //4단계) 완전수인지 아닌지를 판단해주는 메서드 isperfectnumber
	      int num3 = 369;
	      boolean result2 = isPerfectNumber(num3);
	      System.out.println("완전수인가요? : "+result2);
	      int startValue=2;
 	      int endValue=1000;
 	      getPerfectNumber(startValue, endValue);}
	
	public static boolean isDivisor(int num1, int num2) {
		if(num1 % num2 == 0) {
			boolean divisor = true;
			return divisor;
		}
		else {
			boolean divisor = false;
			return divisor;
		}
	}

//    2단계)getDivisior
	public static void getDivisor(int a) {
		System.out.print(a+"의 약수: ");
		for(int i=1; i<= a; i++) {
			if(isDivisor(a,i)) { //isDivisor : num1을 num2로 나눴을 때 나누어 떨어지는가
				System.out.print(i+" ");
				}if(a == i) {
					System.out.println(" ");
				}
			}		
		}
//    3단계) getSumofDivisors()
	public static int getSumofDivisors(int num1) {
		int sum =0;
		for(int i=1; i<=num1; i++) {
			if(num1%i==0) {
				sum= sum+ i;
			} 
		}return sum;
			
			
		}
//    4단계)완전수인지 아닌지를 판단해주는 메서드 isperfectnumber
	public static boolean isPerfectNumber(int num3) {
		int sum = getSumofDivisors(num3)-num3;
		if( sum == num3) {
			return true;
		}
		else {
			return false;
		}
	}
//    5단계)
	public static void getPerfectNumber(int a, int b) {
		System.out.print(a+"~"+b+"까지의 완전수 : ");
		for( int i=a;i<=b; i++) {
			if(isPerfectNumber(i)) {
				System.out.print(i +" ");
			}
		}	
	  }
	}