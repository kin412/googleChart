package org.kin.domain;

public class searchVO {

	/*String rollUp;
	String rollUpOrder;
	int area;
	int areaOrder_seoul;
	int areaOrder_busan;
	int areaOrder_gwangju;
	int areaOrder_daejeon;
	int areaOrder_gangwon;
	int areaOrder_pyeongtaek;
	int areaOrder_incheon;
	int areaOrder_asan;
	int areaOrder_anyang;
	int areaOrder_paju;
	int gbg;*/
	
	String rollUp;
	String rollUpOrder;
	String area;
	String areaOrder_seoul;
	String areaOrder_busan;
	String areaOrder_gwangju;
	String areaOrder_daejeon;
	String areaOrder_gangwon;
	String areaOrder_pyeongtaek;
	String areaOrder_incheon;
	String areaOrder_asan;
	String areaOrder_anyang;
	String areaOrder_paju;
	String gbg;
	
	public String getRollUp() {
		return rollUp;
	}
	public void setRollUp(String rollUp) {
		this.rollUp = rollUp;
	}
	public String getRollUpOrder() {
		return rollUpOrder;
	}
	public void setRollUpOrder(String rollUpOrder) {
		this.rollUpOrder = rollUpOrder;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		System.out.println(area + "******");
		this.area = area;
	}
	public String getAreaOrder_seoul() {
		return areaOrder_seoul;
	}
	public void setAreaOrder_seoul(String areaOrder_seoul) {
		this.areaOrder_seoul = areaOrder_seoul;
	}
	public String getAreaOrder_busan() {
		return areaOrder_busan;
	}
	public void setAreaOrder_busan(String areaOrder_busan) {
		this.areaOrder_busan = areaOrder_busan;
	}
	public String getAreaOrder_gwangju() {
		return areaOrder_gwangju;
	}
	public void setAreaOrder_gwangju(String areaOrder_gwangju) {
		this.areaOrder_gwangju = areaOrder_gwangju;
	}
	public String getAreaOrder_daejeon() {
		return areaOrder_daejeon;
	}
	public void setAreaOrder_daejeon(String areaOrder_daejeon) {
		this.areaOrder_daejeon = areaOrder_daejeon;
	}
	public String getAreaOrder_gangwon() {
		return areaOrder_gangwon;
	}
	public void setAreaOrder_gangwon(String areaOrder_gangwon) {
		this.areaOrder_gangwon = areaOrder_gangwon;
	}
	public String getAreaOrder_pyeongtaek() {
		return areaOrder_pyeongtaek;
	}
	public void setAreaOrder_pyeongtaek(String areaOrder_pyeongtaek) {
		this.areaOrder_pyeongtaek = areaOrder_pyeongtaek;
	}
	public String getAreaOrder_incheon() {
		return areaOrder_incheon;
	}
	public void setAreaOrder_incheon(String areaOrder_incheon) {
		this.areaOrder_incheon = areaOrder_incheon;
	}
	public String getAreaOrder_asan() {
		return areaOrder_asan;
	}
	public void setAreaOrder_asan(String areaOrder_asan) {
		this.areaOrder_asan = areaOrder_asan;
	}
	public String getAreaOrder_anyang() {
		return areaOrder_anyang;
	}
	public void setAreaOrder_anyang(String areaOrder_anyang) {
		this.areaOrder_anyang = areaOrder_anyang;
	}
	public String getAreaOrder_paju() {
		return areaOrder_paju;
	}
	public void setAreaOrder_paju(String areaOrder_paju) {
		this.areaOrder_paju = areaOrder_paju;
	}
	public String getGbg() {
		return gbg;
	}
	public void setGbg(String gbg) {
		this.gbg = gbg;
	}
	@Override
	public String toString() {
		return "searchVO [rollUp=" + rollUp + ", rollUpOrder=" + rollUpOrder + ", area=" + area + ", areaOrder_seoul="
				+ areaOrder_seoul + ", areaOrder_busan=" + areaOrder_busan + ", areaOrder_gwangju=" + areaOrder_gwangju
				+ ", areaOrder_daejeon=" + areaOrder_daejeon + ", areaOrder_gangwon=" + areaOrder_gangwon
				+ ", areaOrder_pyeongtaek=" + areaOrder_pyeongtaek + ", areaOrder_incheon=" + areaOrder_incheon
				+ ", areaOrder_asan=" + areaOrder_asan + ", areaOrder_anyang=" + areaOrder_anyang + ", areaOrder_paju="
				+ areaOrder_paju + ", gbg=" + gbg + "]";
	}
	
}
