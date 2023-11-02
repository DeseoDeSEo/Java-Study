package 게임만들기;

import java.util.Random;
import java.util.Scanner;

public class PlusGame implements GameRule {
	int num1=0;
	int num2=0;

	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	@Override//난수를 생성할 수 있는 기능
	public int random() {
		int num = random.nextInt(10)+1;
		return num;  
	}
	@Override // 문제를 출제할 수 있는 기능
	public String getQuizMsg() {
		num1 = random();
		num2 = random();
		return(num1 +"과 "+ num2 + "의 합은?");
	}

	@Override // 정답을 체크할 수 있는 기능
	public boolean checkAnswer(int ans) {
		ans = sc.nextInt();
		int answer = getNum1() + getNum2();
		if (answer == ans ) {
			return true;
		} else {
			return false;
		}
	}
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}


}
