package ex;

public class internet extends program{

	private double dedomena;
	private double ddedomena;
	private double ypoloipod;
	
	public internet (String onomaYp, double mhnpag, double dedomena, double ddedomena, double ypoloipod){
		super(onomaYp, mhnpag);
		this.dedomena=dedomena;
		this.ddedomena=ddedomena;
		this.ypoloipod=ypoloipod;
	}
	
	public void setypoloipod(double ddedomena, double dedomena){
		ypoloipod=dedomena-ddedomena;
	}
	public double getypoloipod(){
		return ypoloipod;
	}
	
}
