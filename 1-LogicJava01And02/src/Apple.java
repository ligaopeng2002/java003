
public class Apple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int before =20;
		double rise = 9.8;
		//强制类型转换会损失小数点后的精度，并不4舍5入 
		int now = before+(int)rise;
		System.out.println(now);
		
		
		
		
//		实现一个数字加密器，加密规则是：
//	    加密结果 = （整数*10+5）/2 + 3.14159，加   密结果仍为一整数
		int data = 100;
		int jiami =(int)((data*10+5)/2+3.1415926);
		System.out.println("加密后的数字是："+jiami);
	}

}
