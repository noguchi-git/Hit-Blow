package hitandblow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HitAndBlow {
    
    final static int answer_size = 3;//当てる数。4にすれば4つの数字を当てるゲームになる。
	static int hit = 0;
	static int blow = 0;
	static int challenge = 1;
	
	//メインメソッド
	public static void main(String[] args) {
		
		printDirection();
		int[] right_answer;
		right_answer = makeRightAnswer();
		
		while(true) {
			int[] user_answer;
			user_answer = readUserAnswer();
			checkAnswer(right_answer, user_answer);
			challenge++;
			if(hit == answer_size) {
				System.out.println("正解です。ゲームを終了します。");
				break;
			}
		}
	}
	
	//説明を表示
	public static void printDirection() {
	    String direction = "ゲームを開始します 。＼n"
	    	+ "これから"+answer_size+"つの色を当ててもらいます。\n"
				+ "同じ色が使用されていることがあります。\n"
				+ "色と位置が合っていた場合、\"hit\"\n"
			+ "色が合っていて位置が間違っていた場合、\"blow\"とカウントされます。\n\n";
		
		System.out.println(direction);
	}
}