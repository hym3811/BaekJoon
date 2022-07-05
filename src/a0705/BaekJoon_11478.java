package a0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BaekJoon_11478 {

	public static void main(String[] args)throws Exception {

		String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
		int size = str.length();
		
		Set<String> set = new HashSet<String>();
		for(int i=0;i<size;i++){
			for(int j=i+1;j<=size;j++){
				set.add(str.substring(i,j));
			}
		}
		System.out.println(set.size());
	}

}
