
public class ��ӡ�˵� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String shirt = "Tshirt";
		int shirtPrice=245;
		int shirtCount=2;
		
		String qiuxie="wangqiuxie";
		int qiuxiePrice=570;
		int qiuxieCount=1;
		
		String qiupai="wangqiupai";
		int qiuepaiPrice =320;
		int qiupaiCount=1;
		
		double discount =0.8;
		double finalPrice ;
		double shishouPrice=1500;
		double zhaoling;
		int ����;
		
		
		finalPrice = ((shirtPrice*shirtCount)+(qiuxiePrice*qiuxieCount)+(qiuepaiPrice*qiupaiCount))*discount;
		zhaoling = shishouPrice-finalPrice;
		����=(int)finalPrice/100;
		
		System.out.println("*******�嵥*********");
		System.out.println("����\t����\t����\t���");
		System.out.println(shirt+"\t"+shirtPrice+"\t"+shirtCount+"\t"+(shirtPrice*shirtCount));
		System.out.println(shirt+"\t"+shirtPrice+"\t"+shirtCount+"\t"+(shirtPrice*shirtCount));
		System.out.println(shirt+"\t"+shirtPrice+"\t"+shirtCount+"\t"+(shirtPrice*shirtCount));
		System.out.println("�ۿ�"+discount);
		System.out.println("Ӧ��"+finalPrice);
		System.out.println("ʵ��"+shishouPrice);
		System.out.println("����"+zhaoling);
		System.out.println("����"+����);
		
	}

}
