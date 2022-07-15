package a0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1676 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=5;i<=N;i+=5){
			int temp = i;
			while(true){
				if(temp%5==0){
					count++;
					temp/=5;
				}else{
					break;
				}
			}
		}
		System.out.println(count);
	}

}
