package 프로그래머스연습문제;

public class 배열두배 {
	public static void main(String[] args) {
		
		int[] num_list = {1,2,3,4,5};
		
		int[] answer = new int[num_list.length];
        
        int j=0;
        for(int i=num_list.length-1; i>=0; i--){
            answer[j] = num_list[i];
            j++;
        }
        
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        
	}
}
