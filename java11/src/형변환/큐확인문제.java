package 형변환;

import java.util.LinkedList;

public class 큐확인문제 {

	public static void main(String[] args) {
		LinkedList subj = new LinkedList();
		subj.add("국어");
		subj.add("수학");
		subj.add("영어");
		subj.add("컴퓨터");
		System.out.println("전체 과목 : " + subj);
		
		int N = subj.size();		//subj.size()가 remove()할때마다 1씩 감소함.
		for(int i=0; i<(N-1); i++)	//i : 0,1,2
		{
			subj.remove();
			System.out.println((i+1) + "일차 시험본 후 남은 과목: " + subj);
		}
	}

}
