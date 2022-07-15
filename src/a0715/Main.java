package a0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	static boolean[] check; //N자리수 배열
	static int count = 1; // N이 짝수일때는 0값 존재하고 N이 홀수일때는 1값 무조건 존재하므로 1부터 시작
	static int N;
	static int tp; // = "1" x N +1 (1을 N번 반복한 숫자 + 1)
	static int rs = 1;

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		String s = "";
		for(int i=0;i<N;i++){
			s+="1";
		}
		tp = Integer.parseInt(s)+1;
		check = new boolean[tp];
		if(N%2==0){
			check[0]=true;
		}else{
			check[1]=true;
		}
		fx();
		System.out.println(count%15746);

	}

	static void fx(){
		
		if(rs>tp-1){ //결과가 배열 인덱스 초과시 리턴
			return;
		}
		
		
		
	}
	
}
