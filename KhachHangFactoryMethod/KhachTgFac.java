package KhachHangFactoryMethod;

import DataBase.KhachHangData;

public class KhachTgFac extends KhachHangFactory {
	
	@Override
	public KhachHang taoKhachHang(KhachHangData ikh) {
		// TODO Auto-generated method stub
		return new KhachTg(ikh.id, ikh.hoten, ikh.diachi, ikh.sdt );
	}
	
}
