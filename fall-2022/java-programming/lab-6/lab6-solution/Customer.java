package lab6;

public class Customer {
	private String custName;
	private String custType;
	private double custDisc;

	Customer() {
		this(AppConstants.NAME_UNKNOWN, "", 0);
	}

	Customer(String custName) {
		this(custName, "", 0);
	}

	Customer(String custName, String custType) {
		this(custName, custType, 0);
	}

	Customer(String custName, double custDisc) {
		this(custName, "", custDisc);
	}

	Customer(String custName, String custType, double custDisc) {
		this.custName = custName;
		this.custType = custType;
		this.custDisc = custDisc;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		if (AppConstants.CUST_TYPE_RETAIL.equalsIgnoreCase(custType)
				|| AppConstants.CUST_TYPE_WHOLESALE.equalsIgnoreCase(custType)) {
			this.custType = custType;
		}
	}

	public double getCustDisc() {
		return custDisc;
	}

	public void setCustDisc(double custDisc) {
		this.custDisc = custDisc;
	}

}
