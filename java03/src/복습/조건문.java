package 복습;

import javax.swing.JOptionPane;

public class 조건문 {

	public static void main(String[] args) {
		
		String target_ = JOptionPane.showInputDialog("숫자맞추기를 도전해보세요.");
		int target = Integer.parseInt(target_);
		
		int me = 88;
		
		
		if (target == me) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}

		String target2 = JOptionPane.showInputDialog("단어맞추기를 도전해보세요.");
		
		switch (target2) {
		case "로또":
			System.out.println("정답입니다.");
			break;
		case "놀자": case "게임": case "나가자":
			System.out.println("정답입니다.");
			break;
		default:
			System.out.println("아닙니다!");
			break;
		}
	}

}
