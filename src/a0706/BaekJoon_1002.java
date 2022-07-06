package a0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1002 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			double distance = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
			int sum = r1+r2;
			int diff = r1-r2;
			if(diff<0)diff*=-1;
			/*System.out.println("i: "+i);
			System.out.println((int)distance);
			System.out.println(sum);
			System.out.println(diff);
			System.out.println();*/
			
			if(distance==0&&diff==0){//무한대
				sb.append("-1\n");
			}else if(distance>sum||distance<diff){// 0
				sb.append("0\n");
			}else if(distance==sum||distance==diff){// 1
				sb.append("1\n");
			}else{//2
				sb.append("2\n");
			}
			
		}
		//System.out.println("------------");
		System.out.println(sb);
	}

}
