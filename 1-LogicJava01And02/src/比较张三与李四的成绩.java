import java.util.Scanner;


public class �Ƚ����������ĵĳɼ� {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("qing shuru  zhangsan de chengji ?");
		int zchengji =  input.nextInt();
		int lichengji = 80;
		boolean flag = (zchengji >=lichengji) ;
		System.out.println("�����ĳɼ������ĵĳɼ�����?"+flag);
		
		boolean jieguo = (3+40%6)>(9/2*3);
		System.out.println(jieguo);
	}
}
