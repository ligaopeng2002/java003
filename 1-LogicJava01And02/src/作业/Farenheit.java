package ��ҵ;
import java.util.Scanner;
/**
 * �κ���ҵ�������¶�
 */
public class Farenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����뵱ǰ�Ļ����¶ȣ�");
		
		double f = input.nextDouble();
		double c;

		c = 5/9.0 * (f-32); //ת��

		/*��ʾ���*/
		System.out.println("\n��ǰ�������¶���: " + c);
	}
}
