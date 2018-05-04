
public class 变量的作用域演示 {

	//变量作用域1.全局变量，放在类的下面，定义各种变量
	//全局变量有默认初始化值
	static String pinpai; //字符串默认是null值
	static double zhongliang;//double默认是0.0
	static String dianchileixing;
	static int shoujia;//int默认是0 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//在方法内部定义的变量，称为局部变量，局部变量一定要赋值才能使用,只能用在该方法中，超出该方法变量就失效了
		int shuliang=1;
		System.out.println(pinpai);
		System.out.println(zhongliang);
		System.out.println(dianchileixing);
		System.out.println(shoujia);
		System.out.println(shuliang);
	}
	
	public void main2(){
		//在main2方法不能引用main方法中定义的局部变量
//		System.out.println(shuliang);
		System.out.println(pinpai);
		System.out.println(zhongliang);
		System.out.println(dianchileixing);
		System.out.println(shoujia);
	}

}
