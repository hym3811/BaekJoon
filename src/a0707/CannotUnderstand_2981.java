package a0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CannotUnderstand_2981 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<N;i++){
			arr.add(Integer.parseInt(br.readLine()));
		}br.close();
		Collections.sort(arr);
		StringBuilder sb = new StringBuilder();
		
		int val = arr.get(1)-arr.get(0);
		
		for(int i=2;i<N;i++){
			val = rs(val,arr.get(i)-arr.get(i-1));
		}
		
		for(int i=2;i<=val;i++){
			if(val%i ==0){
				sb.append(i).append(" ");
			}
		}
		
		System.out.println(sb);
		
	}
	
	static int rs(int a,int b){
		while(b!=0){
			int temp = a%b;
			a=b;
			b=temp;
		}
		return a;
	}

}
