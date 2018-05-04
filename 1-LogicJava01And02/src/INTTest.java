
public class INTTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);//21亿的数值
		System.out.println(Integer.MIN_VALUE);
		
		//如果超过了某个数据类型的极限，它就会变成他的另一个极端的值，所以使用时需要注意
		int i = Integer.MAX_VALUE+1;
		System.out.println("int类型最大值再加一后是："+i);
	}

}
