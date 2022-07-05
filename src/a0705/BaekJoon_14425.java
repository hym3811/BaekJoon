package a0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BaekJoon_14425 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> arr = new HashSet<>();
		for(int i=0;i<N;i++){
			arr.add(br.readLine());
		}
		int count=0;
		for(int i=0;i<M;i++){
			if(arr.contains(br.readLine()))
				count++;
		}
		System.out.println(count);
	}

}
