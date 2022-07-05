package a0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class TimeOut_2108 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<N;i++){
			int tp = Integer.parseInt(br.readLine());
			arr.add(tp);
			hs.add(tp);
			sum+=tp;
		}
		br.close();
		StringBuilder sb = new StringBuilder();
		double avg=(double)sum/N;
		Collections.sort(arr);
		
		sb.append((int)avg).append("\n"); //산술평균
		sb.append(arr.get((N/2))).append("\n"); //중앙값
		
		ArrayList<Integer> fqNum = new ArrayList<Integer>();
		int maxFQ=0; //최대 빈도수
		int idx=0; //최대 빈도수를 가지는 수
		Iterator<Integer> iter = hs.iterator();
		while(iter.hasNext()){
			int tp = iter.next();
			int fq = Collections.frequency(arr, tp);
			
			if(fq>maxFQ){ //빈도수가 현재 최빈수 보다 클 때
				idx=tp;
				maxFQ=fq;
				fqNum=new ArrayList<Integer>(); //동일 (최대)빈도수 수의 리스트(fqNum) 초기화
				fqNum.add(tp);
			}else if(fq==maxFQ){ //동일 (최대)빈도수 수가 나오면 리스트(fqNum)에 추가
				fqNum.add(tp);
			}
		}
		Collections.sort(fqNum); //fqNum 정렬
		if(fqNum.size()>2){ //단독 최빈수가 아닐 때 idx를 두번째로 작은 수로 설정
			idx=fqNum.get(1);
		}
		
		sb.append(idx).append("\n"); //최빈값
		sb.append(arr.get(arr.size()-1)-arr.get(0)).append("\n"); //범위
		
		System.out.println(sb);

	}

}
