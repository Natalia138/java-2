package ex;

public class xarakthr {
		
	private int kodikoss=0;
	private String ypiresia;
	private String onoma;
	private String thl;
	private String hmeromhnia;
	private String exoflhsh;
	
	public xarakthr (int kodikoss, String ypiresia, String onoma, String thl, String hmeromhnia, String exoflhsh){
		this.kodikoss=kodikoss;
		this.ypiresia=ypiresia;
		this.onoma=onoma;
		this.thl=thl;
		this.hmeromhnia=hmeromhnia;
		this.exoflhsh=exoflhsh;
	}
	
	public void setkodikoss(int kodikoss){
		kodikoss++;
	}
	public int getkodikoss(){
		return kodikoss;
		
	}
	
	
	public String getypiresia(){
		return ypiresia;
	}
	
	public String getonoma(){
		return onoma;
	}
	public String getthl(){
		return thl;
	}
	public String gethmeromhnia(){
		return hmeromhnia;
	}
	public String getexoflhsh(){
		return exoflhsh;
	}
	
	public String toString(){
		return "Όνομα: " + onoma + "/n" + " κωδικός: " + "/n" + kodikoss + "/n" + " τηλέφωνο : " + thl + "/n" + "Υπηρεσία: " + ypiresia ;
	}
	
}
