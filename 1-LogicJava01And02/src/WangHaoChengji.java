import java.util.Scanner;//ɨ������ ��ר��������Ļ����Ĺ�����

public class WangHaoChengji {

	/**
	 * @param args
	 * java.util.InputMismatchException
	 * ���쳣�����������������Ҫ�õ������Ͳ�ƥ�䣬���Գ��ָô���
	 */
	public static void main(String[] args) {
		//����Բ���
		double d = Math.PI*1.5*1.5;
		System.out.println(d);
		
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧԱ��������");
		String name = "Ĭ�ϵ��û�";
		if(input.hasNext()){
			name = input.next();//��ȡ��һ����Ļ������ַ���
		}
		System.out.println("������"+name+"��java�ɼ���");
		double java = input.nextDouble();//��ȡ��һ����Ļ����ķ�����ֵ
		System.out.println("������"+name+"��sql�ɼ���");
		double sql = input.nextDouble();
		System.out.println("������"+name+"�����ĳɼ���");
		double yuwen = input.nextDouble();
		
		System.out.println("java�ɼ���sql�ɼ��Ĳ�ֵ��"+(java-sql));
		
		double avg = (java+sql+yuwen)/3;
		
		System.out.println("���ųɼ���ƽ��ֵ�ǣ�"+avg);
		
		
		
	}

}


