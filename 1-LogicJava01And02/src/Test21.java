
public class Test21 {//类名字，首字母大写，遇到多个单词首字母大写，其他字母小写
	/**
	 * @param args
	 */
	public static void main(String[] args) {//方法的名字，定义规则参考变量命名规则
		// TODO Auto-generated method stub
		int money = 1000;
		System.out.println(money);
		
		//ctrl+1 反向创建快捷键
		double chengji = 98.5;//变量的名字，首字母小写，其他单词首字母大写
		String name = "张三";
		char sex = '男';
		System.out.println("考试的最高分是:"+chengji);
		System.out.println("姓名是:"+name);
		System.out.println("性别是:"+sex);
		
		//常见错误1.在【方法中定义变量】后要记得赋值，然后才能使用，不然使用时提示错误。
		int temp =10;
		System.out.println(temp);
		
		//常用错误3.定义了重复的变量名称
		String username = "zhangsan";
		String username1 = "lisi";
		
		
		
		
	}

}
