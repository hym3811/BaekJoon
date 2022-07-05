package a0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MemoryOver_18871 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		br.close();
		
		int[] arr = new int[N]; //입력된 숫자 배열
		int min=1000000000;
		int max=-1000000000;
		
		for(int i=0;i<N;i++){
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]<min){
				min=arr[i];
			}
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int range; //입력된 숫자의 범위
		boolean[] chk=null;
		int[] ar=null;
		if(min<0){
			range = max-min;
			chk = new boolean[range+1]; //입력된 숫자 체크 배열
			ar = new int[range+1]; //입력된 숫자의 등수
		}else{
			chk = new boolean[max+1];
			ar = new int[max+1];
		}
		int c=0; //최소값이 음수일 경우 배열 인덱스에 계산해줄 변수
		if(min<0){
			c=min*-1;
		}
		
		for(int i=0;i<N;i++){
			if(!chk[arr[i]+c]){
				chk[arr[i]+c]=true; //입력된 숫자값이면 true
			}
		}
		
		int count=0;
		for(int i=0;i<chk.length;i++){
			if(chk[i]){
				ar[i]=count; //true 만나면 count 를 ar[i]에 대입
				count++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++){
			sb.append(ar[arr[i]+c]).append(" ");
		}
		
		System.out.println(sb);
		
	}

}
