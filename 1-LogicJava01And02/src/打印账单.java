
public class 打印账单 {

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
		int 积分;
		
		
		finalPrice = ((shirtPrice*shirtCount)+(qiuxiePrice*qiuxieCount)+(qiuepaiPrice*qiupaiCount))*discount;
		zhaoling = shishouPrice-finalPrice;
		积分=(int)finalPrice/100;
		
		System.out.println("*******清单*********");
		System.out.println("名称\t单价\t数量\t金额");
		System.out.println(shirt+"\t"+shirtPrice+"\t"+shirtCount+"\t"+(shirtPrice*shirtCount));
		System.out.println(shirt+"\t"+shirtPrice+"\t"+shirtCount+"\t"+(shirtPrice*shirtCount));
		System.out.println(shirt+"\t"+shirtPrice+"\t"+shirtCount+"\t"+(shirtPrice*shirtCount));
		System.out.println("折扣"+discount);
		System.out.println("应收"+finalPrice);
		System.out.println("实收"+shishouPrice);
		System.out.println("找零"+zhaoling);
		System.out.println("积分"+积分);
		
	}

}
