package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class bottom_Up2 {
	
	static HashMap<Integer,Long> map = new HashMap<Integer,Long>();

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		map.put(0, (long) 1);map.put(1, (long) 1);

		System.out.println(fx(N));
		System.out.println(map.toString());

	}

	static long fx(int n){
		
		if(map.get(n)==null){
			map.put(n, fx(n-1)+fx(n-2));
		}
		
		return map.get(n);
	}
	
}
