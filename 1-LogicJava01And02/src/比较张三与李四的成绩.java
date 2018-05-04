import java.util.Scanner;


public class 比较张三与李四的成绩 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("qing shuru  zhangsan de chengji ?");
		int zchengji =  input.nextInt();
		int lichengji = 80;
		boolean flag = (zchengji >=lichengji) ;
		System.out.println("张三的成绩比李四的成绩高吗?"+flag);
		
		boolean jieguo = (3+40%6)>(9/2*3);
		System.out.println(jieguo);
	}
}
