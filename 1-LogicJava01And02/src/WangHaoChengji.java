import java.util.Scanner;//扫描器类 ，专门用于屏幕输入的工具类

public class WangHaoChengji {

	/**
	 * @param args
	 * java.util.InputMismatchException
	 * 该异常代表输入的类型与你要得到的类型不匹配，所以出现该错误
	 */
	public static void main(String[] args) {
		//计算圆面积
		double d = Math.PI*1.5*1.5;
		System.out.println(d);
		
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学员的姓名：");
		String name = "默认的用户";
		if(input.hasNext()){
			name = input.next();//获取下一次屏幕输入的字符串
		}
		System.out.println("请输入"+name+"的java成绩：");
		double java = input.nextDouble();//获取下一次屏幕输入的非整数值
		System.out.println("请输入"+name+"的sql成绩：");
		double sql = input.nextDouble();
		System.out.println("请输入"+name+"的语文成绩：");
		double yuwen = input.nextDouble();
		
		System.out.println("java成绩与sql成绩的差值："+(java-sql));
		
		double avg = (java+sql+yuwen)/3;
		
		System.out.println("三门成绩的平均值是："+avg);
		
		
		
	}

}


