package KhachHangFactoryMethod;

public class KhachTgFac extends KhachHangFactory {
	@Override
	public KhachHang taoKhachHang() {
		// TODO Auto-generated method stub
		return new KhachTg();
	}
	
}
