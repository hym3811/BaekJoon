package a0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2798 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int count = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[count];
		
		for(int i=0;i<count;i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		System.out.println(rs(arr,count,max));
		
	}

	static int rs(int[] arr,int count,int max){
		int result=0;
		for(int i=0;i<count-2;i++){
			for(int j=i+1;j<count-1;j++){
				for(int k=j+1;k<count;k++){
					int r=arr[i]+arr[j]+arr[k];
					if(r==max)
						return r;
					if(r<=max&&r>result){
						result=r;
					}
				}
			}
		}
		return result;
	}
	
}
