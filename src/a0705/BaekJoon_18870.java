package a0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon_18870 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		br.close();
		
		ArrayList<Integer> arr = new ArrayList<Integer>(); //기본 리스트
		ArrayList<Integer> sorted = new ArrayList<Integer>(); //정렬 리스트
		HashMap<Integer,Integer> rank = new HashMap<Integer,Integer>(); //정렬된 값의 순위 맵
		
		for(int i=0;i<N;i++){
			arr.add(Integer.parseInt(st.nextToken()));
			sorted.add(arr.get(i));
		}
		
		Collections.sort(sorted);
		
		int r = 0;
		for(int i : sorted){
			
			if(!rank.containsKey(i)){
				rank.put(i, r);
				r++;
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i : arr){
			sb.append(rank.get(i)).append(' ');
		}
		
		System.out.println(sb);

	}

}
