import java.util.Scanner;


public class 幸运会员 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = (11+3*8)/4%3;
		System.out.println(x);
		
		Scanner input = new Scanner(System.in);
		System.out.println("qing shuru huiyuan kahao?");
		int kahao = input.nextInt();
		
		int qianwei = kahao/1000;
		int baiwei = kahao/100%10;
		int shiwei = kahao/10%10;
		int gewei = kahao%10;
		int sum = qianwei+baiwei+shiwei+gewei;
		boolean flag = sum>20;
		String jieguo = flag?"是":"非幸运用户";
		System.out.println(jieguo);
	}

}
