package a0718;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int[] arr;
	
	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		for(int i=1;i<=N;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int cnt = 0; //1계단을 오른 연속횟수
		int i = 1;
		int rs = arr[1];
		while(true){
			
			if(i==N){
				break;
			}
			
			int temp;
			
			if(cnt == 1){
				if(i == N-1){
					rs-=arr[i];
					temp=arr[i+1];
					rs+=temp;
					cnt = 0;
					i++;
				}else{
					temp=arr[i+2];
					rs+=temp;
					i+=2;
					cnt = 0;
				}
			}else{
				temp = arr[i+1];
				rs+=temp;
				i++;
				cnt++;
			}
			
		}
		
		System.out.println(rs);
		
	}
	
}
