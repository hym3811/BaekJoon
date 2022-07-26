package a0718;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_1912 {
	
	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] rs = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		rs[0] = arr[0];
		int max = arr[0];
		
		for(int i=1;i<N;i++){
			rs[i] = Math.max(rs[i-1]+arr[i], arr[i]);
			max = Math.max(max, rs[i]);
		}
		
		System.out.println(max);

	}

}
