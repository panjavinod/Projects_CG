package com.cg;

public class EmployeeBean {

	private String eName;
	private String eAddress;
	private int eid;
	private int eSalary;
	@Override
	public String toString() {
		return "EmployeeBean [eName=" + eName + ", eAddress=" + eAddress + ", eid=" + eid + ", eSalary=" + eSalary
				+ "]";
	}
	public EmployeeBean(String eName, String eAddress, int eid, int eSalary) {
		this.eName=eName;
		this.eAddress=eAddress;
		this.eid=eid;
		this.eSalary=eSalary;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	
	
	
}
