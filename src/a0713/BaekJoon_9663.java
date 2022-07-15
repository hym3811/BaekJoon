package a0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_9663 {

	static boolean check = false;
	static int[] arr;
	static int count=0;
	static int N = 0;
	
	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		nQueen(0);
		System.out.println(count);
		

	}
	
	static void nQueen(int step){
		if(step==N){
			count++;
			return;
		}
		for(int i=0;i<N;i++){
			arr[step] = i;
			if(possible(step)){
				nQueen(step+1);
			}
		}
	}
	
	static boolean possible(int step){
		
		for(int i=0;i<step;i++){
			if(arr[step]==arr[i]){
				return false;
			}else if(Math.abs(arr[step]-arr[i])==Math.abs(step-i)){
				return false;
			}
		}
		
		return true;
	}
	
}
