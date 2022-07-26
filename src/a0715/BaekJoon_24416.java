package a0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon_24416 {

	static int[] count = new int[2];
	static int[] arr;
	
	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		fx1(n);fx2(n);
		System.out.print(count[0]+" ");
		System.out.println(count[1]);

	}
	
	static int fx1(int n){
		if(n==1||n==2){
			count[0]++;
			return 1;
		}
		return fx1(n-2)+fx1(n-1);
	}
	
	static int fx2(int n){
		
		if(n==1||n==0){
			return 1;
		}
		
		if(arr[n]==0){
			count[1]++;
			arr[n]=fx2(n-1)+fx2(n-2);
		}
		
		return arr[n];
	}

}
