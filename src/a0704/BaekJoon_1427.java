package a0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon_1427 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = br.readLine();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<number.length();i++){
			arr.add(Character.getNumericValue(number.charAt(i)));
		}
		Collections.sort(arr);
		Collections.reverse(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.size();i++){
			sb.append(arr.get(i));
		}
		System.out.println(sb);
	}

}
