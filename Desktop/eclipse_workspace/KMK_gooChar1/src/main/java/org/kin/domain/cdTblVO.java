package org.kin.domain;

public class cdTblVO {

	String cd_id;
	String cd_nm;
	String use_yn;
	
	public String getCd_id() {
		return cd_id;
	}
	public void setCd_id(String cd_id) {
		this.cd_id = cd_id;
	}
	public String getCd_nm() {
		return cd_nm;
	}
	public void setCd_nm(String cd_nm) {
		this.cd_nm = cd_nm;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	
	@Override
	public String toString() {
		return "cdTblVO [cd_id=" + cd_id + ", cd_nm=" + cd_nm + ", use_yn=" + use_yn + "]";
	}
	
}
