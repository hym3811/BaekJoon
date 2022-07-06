package a0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1004 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<T;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			//출발점
			int x1 = Integer.parseInt(st.nextToken());int y1 = Integer.parseInt(st.nextToken());
			//도착점
			int x2 = Integer.parseInt(st.nextToken());int y2 = Integer.parseInt(st.nextToken());
			
			int count = 0; //내접 횟수
			int n = Integer.parseInt(br.readLine());
			for(int j=0;j<n;j++){
				st = new StringTokenizer(br.readLine()," ");
				int cx = Integer.parseInt(st.nextToken()); //원 x 좌표
				int cy = Integer.parseInt(st.nextToken()); //원 y 좌표
				int r = Integer.parseInt(st.nextToken()); //원 반지름
				int rr = (int) Math.pow(r, 2);
				
				int sd = (int) (Math.pow(x1-cx, 2)+Math.pow(y1-cy, 2)); //출발점에서 원의 중심 까지의 거리
				int ad = (int) (Math.pow(x2-cx, 2)+Math.pow(y2-cy, 2)); //도착점에서 원의 중심 까지의 거리
				
				boolean start = false; // 출발점이 입력받은 원 안에 있는가
				boolean arrival = false; // 도착점이 입력받은 원 안에 있는가
				
				//원의 반지름이 중심과 점과의 거리보다 크면 점은 원안에 있음
				if(rr>sd){
					start = true;
				}
				if(rr>ad){
					arrival = true;
				}
				
				if(start)
					if(!arrival)
						count++;
				
				if(arrival)
					if(!start)
						count++;
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}

}
