package KhachHangFactoryMethod;

public class client {
	public static void main(String[] args) {
		KhachHangFactory khachtg = new KhachTgFac();
		//khachtg.taoKhachHang();
		
		KhachHangFactory khachvip = new KhachVipFac();
		//khachvip.taoKhachHang();
		
		System.out.println("khach tg info: " + khachtg.getInfo(1));
		System.out.println("khach tg rank: " + khachtg.getRank(1));
		
		System.out.println();
		System.out.println("khach vip info: " + khachvip.getInfo(1));
		System.out.println("khach vip rank: " + khachvip.getRank(1));
	}
}
