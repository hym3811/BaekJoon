package a0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class TimeOut_18871 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		br.close();
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<N;i++){
			ar.add(Integer.parseInt(st.nextToken()));
			hs.add(ar.get(i));
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Iterator val = hs.iterator();
		while(val.hasNext()){
			arr.add((Integer) val.next());
		}
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++){
			sb.append(arr.indexOf(ar.get(i))).append(" ");
		}
		System.out.println(sb);
	}

}
