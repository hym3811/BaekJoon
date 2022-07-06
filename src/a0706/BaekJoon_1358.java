package a0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1358 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int r = H/2;
		
		int count = 0;
		
		for(int i=0; i<P; i++){
			st = new StringTokenizer(br.readLine()," ");
			int px = Integer.parseInt(st.nextToken());
			int py = Integer.parseInt(st.nextToken());
			
			if(py>=Y&&py<=Y+H){ //Y가 범위 내에 있을때에만 체크 가능
				if(px>=X&&px<=X+W){ //링크 사각형
					count++;
				}else if(px<X){ //링크 왼쪽 반원일 때
					double distance = Math.sqrt(Math.pow(X-px, 2)+Math.pow(Y+r-py, 2));
					if(distance<=r){
						count++;
					}
				}else if(px>X+W){ //링크 오른쪽 반원일 때
					double distance = Math.sqrt(Math.pow(px-(X+W), 2)+Math.pow(Y+r-py, 2));
					if(distance<=r){
						count++;
					}
				}
			}
			
			
		}
		
		System.out.println(count);

	}

}
