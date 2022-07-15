package a0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BaekJoon_1037 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());
		
		//boolean사용시 156ms
		/*boolean[] chk = new boolean[1000001];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<count;i++){
			chk[Integer.parseInt(st.nextToken())]=true;
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=2;i<1000001;i++){
			if(chk[i]){
				min=i;
				break;
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i=1000000;i>1;i--){
			if(chk[i]){
				max=i;
				break;
			}
		}*/
		
		//처리속도 128ms
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int result = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<count;i++){
			int temp = Integer.parseInt(st.nextToken());
			
			if(temp<min)
				min=temp;
			if(temp>max)
				max=temp;
			
		}
		
		System.out.println(min*max);
		
	}

}
