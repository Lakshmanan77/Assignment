package week1Day4;

public class Mobile {

	public static void main(String[] args) {

		String mobileName = "iphone";
		String mobileModel = "15pro";
		int mobilePrice = 50000;
		float mobileOffer = 5.9999F;
		double mobileSARvalue = 1234.5678901;
		boolean isExpensive = true;
		char mobileLogo = 'I';
		long mobileIMEnumber = 12563467893L;
		short cashBack = 50;

		System.out.println(mobileName);
		System.out.println(mobileModel);
		System.out.println(mobilePrice);
		System.out.println(mobileOffer);
		System.out.println(mobileSARvalue);
		System.out.println(isExpensive);
		System.out.println(mobileLogo);
		System.out.println(mobileIMEnumber);
		System.out.println(cashBack);

		System.out.println(mobileName + "\n" + mobileModel + "\n" + mobilePrice + "\n" + mobileOffer + "\n"
				+ isExpensive + "\n" + mobileLogo + "\n"+cashBack+"\n"+mobileIMEnumber+"\n");
		
		System.out.println(mobileName + " " + mobileModel + " " + mobilePrice + " " + mobileOffer + " "
				+ isExpensive + " " + mobileLogo + " "+cashBack+" "+mobileIMEnumber);


	}

}
