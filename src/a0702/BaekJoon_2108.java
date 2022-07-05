package a0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BaekJoon_2108 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[8001];
		
		int sum=0; //누적
		int max = Integer.MIN_VALUE; //최대값 (범위 구할 떄 사용)
		int min = Integer.MAX_VALUE; //최소값 (범위 구할 떄 사용)
		int mid = 10000; //중앙값
		int mode = 10000; //최빈값
		
		for(int i=0;i<N;i++){
			int tp = Integer.parseInt(br.readLine());
			sum+=tp;
			arr[tp+4000]++;
			
			if(tp>max){
				max=tp;
			}
			if(tp<min){
				min=tp;
			}
		}
		
		int count=0; //중앙값 반복 회수;
		int mod_max=0;
		boolean flag = false;
		
		for(int i=min+4000;i<=max+4000;i++){
			if(arr[i]>0){
				
				if(count<(N+1)/2){
					count+=arr[i];
					mid=i-4000;
				}
				
				if(mod_max<arr[i]){
					mod_max=arr[i];
					mode = i-4000;
					flag=true;
				}else if(mod_max==arr[i]&&flag==true){
					mode=i-4000;
					flag=false;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append((int)Math.round((double)sum/N)).append("\n");
		sb.append(mid).append("\n");
		sb.append(mode).append("\n");
		sb.append(max-min);
		
		System.out.println(sb);
		
	}

}
