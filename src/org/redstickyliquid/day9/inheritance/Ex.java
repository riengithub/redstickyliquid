package org.redstickyliquid.day9.inheritance;

public class Ex {
	public static void main(String[] args) {
		Heir sh = new Heir(20);
		Inherited si = new Inherited(20);
		System.out.println(si.getWealth());
		System.out.println(sh.getWealth());
		
	}
}

class Inherited {
	public String pub;
	String def;
	protected String pro;
	private String pri;
	
	int wealth;
	
	Inherited () {
		pub = "pub";
		def = "def";
		pro = "pro";
		pri = "pri";
	}
	
	Inherited (int wealth) {
		this();
		this.wealth = wealth;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public String getDef() {
		return def;
	}

	public void setDef(String def) {
		this.def = def;
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public String getPri() {
		return pri;
	}

	public void setPri(String pri) {
		this.pri = pri;
	}

	public int getWealth() {
		return wealth;
	}

	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	
}

class Heir extends Inherited{
	
	String child;
	
	Heir () {
		super();
		child = "child";
	}
	
	Heir (String child) {
		this.child = child;
	}
	
	Heir (int wealth) {
		super(wealth);
	}
	
	void show() {
		System.out.println("shown");
	}
	
	public int getWealth() {
		return super.getWealth() * 2;
		
	}
	
}


