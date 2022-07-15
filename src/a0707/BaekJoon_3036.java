package a0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_3036 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<N;i++){
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		StringBuilder sb = new StringBuilder();
		int F = arr.get(0);
		for(int i=1;i<N;i++){
			int T = arr.get(i);
			int val = gcd(F,T);
			sb.append(F/val).append("/").append(T/val).append("\n");
		}
		System.out.println(sb);
	}

	static int gcd(int a,int b){
		while(b!=0){
			int temp = a%b;
			a = b;
			b = temp;
		}
		return a;
	}
	
}
