package ��ҵ;
/*
 * �κ���ҵ������������
 */
public class DoChange {
	public static void main(String[] args) {
		int first = 10;   //�洢��һ������
		int second = 8;   //�洢�ڶ�������
		int third;        //�м����
		
		/*��ʾ����ǰ����*/
		System.out.println("�������ǰ���е�ֽ�ƣ�");
		System.out.println("�����е�ֽ�ƣ� " + first);
		System.out.println("�����е�ֽ�ƣ� " + second);
		
		/*������������*/
		third = first;
		first = second;
		second = third;
		
		/*��ʾ���������*/
		System.out.println("\n������������е�ֽ�ƣ�");
		System.out.println("�����е�ֽ�ƣ� " + first);
		System.out.println("�����е�ֽ�ƣ� " + second);
	}
}
