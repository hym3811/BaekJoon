package a0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BaekJoon_2751 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<number;i++){
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.size();i++){
			sb.append(arr.get(i)).append("\n");
		}
		System.out.println(sb);
	}

}
