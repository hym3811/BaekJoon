package a0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2231 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		int n = Integer.parseInt(num);
		int size = num.length();
		int result=0;
		for(int i=n-(size*9);i<n;i++){// 자리수*9를 뺸 값이 생성자가 될수 있는 최소값
			int number=i;
			int sum=0;
			while(number!=0) {//10으로 나눈 나머지의 합 누적 = 각 자리수 합
				sum+=number%10;
				number/=10;
			}
			if(n==i+sum){ //i+sum = n 일경우 조건 충족하므로 탈출
				result=i;
				break;
			}
		}
		System.out.println(result);
	}

}
