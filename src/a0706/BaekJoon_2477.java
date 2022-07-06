package a0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BaekJoon_2477 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		int temp=0;
		for(int i=0;i<6;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int drc = Integer.parseInt(st.nextToken());
			int point = Integer.parseInt(st.nextToken());
			
			switch(drc){
			case 1:
				x.add(point);
				y.add(temp);
				break;
			case 2:
				x.add(point);
				y.add(temp);
				break;
			case 3:
				y.add(point);
				x.add(temp);
				break;
			case 4:y.add(point);
				x.add(temp);
				break;
			}
		}
		
		int[] X = new int[2];
		int[] Y = new int[2];
		X[0] = Collections.max(x);
		Y[0] = Collections.max(y);
		
		int[] idx = new int[2];
		idx[0]=x.indexOf(Collections.max(x));
		idx[1]=y.indexOf(Collections.max(y));
		
		switch(idx[1]){
		case 0:
			X[1]=x.get(5)-x.get(1);
			break;
		case 5:
			X[1]=x.get(4)-x.get(0);
			break;
			default:
				X[1]=x.get(idx[1]-1)-x.get(idx[1]+1);
				break;
		}if(X[1]<0)X[1]*=-1;
		
		switch(idx[0]){
		case 0:
			Y[1]=y.get(5)-y.get(1);
			break;
		case 5:
			Y[1]=y.get(4)-y.get(0);
			break;
			default:
				Y[1]=y.get(idx[0]-1)-y.get(idx[0]+1);
				break;
		}if(Y[1]<0)Y[1]*=-1;
		
		int result=
				K*((X[0]*Y[0])-(X[1]*Y[1]));
		
		System.out.println(result);
		
	}

}
