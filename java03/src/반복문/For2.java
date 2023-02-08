package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for(;;) {	//무한루프 
			System.out.println("안씀");
			String data = JOptionPane.showInputDialog("종료할까요? (y/n)");
			if (data.equals("y")) {
				System.out.println("안녕히 가세요!");
				break;	//if문은 자동 break 있음 -> 이거는 for문 break임
			}else {
				continue;
			}
		}

	}

}
