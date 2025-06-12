package KhachHangFactoryMethod;

public class KhachVipFac extends KhachHangFactory{

	@Override
	public KhachHang taoKhachHang() {
		// TODO Auto-generated method stub
		return new KhachVip();
	}
	
}
