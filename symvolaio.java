package ex;

public class symvolaio extends program {

	private int dxronosk;
	private int dxronoss;
	private int dsms;
	private int xronosk;
	private int xronoss;
	private int sms;
	private int ypoloipok;
	private int ypoloipos;
	private int ypsms;
	
	public symvolaio(String onomaYp, double mhnpag, int dxronosk, int dxronoss, int dsms,int xronosk,int xronoss,int sms, int ypoloipok, int ypoloipos, int ypsms){
		
		super(onomaYp, mhnpag);
		this.dxronosk=dxronosk;
		this.dxronoss=dxronoss;
		this.dsms=dsms;
		this.ypoloipok=ypoloipok;
		this.ypoloipos=ypoloipos;
		this.ypsms=ypsms;
		this.xronosk=xronosk;
		this.xronoss=xronoss;
		this.sms=sms;
		
	}
	// dinontai o dorean xronos k sms
	public int getdxronosk(){
		return dxronosk;
	}
	public int getdxronoss(){
		return dxronoss;
	}
	public int getdsms(){
		return dsms;
	}
	// dinontai o synolikos xronos k sms
	public int getxronosk(){
		return xronosk;
	}
	public int getxronoss(){
		return xronoss;
	}
	public int getsms(){
		return sms;
	}
	//ypologizetai h xreosh
	public void setypoloipok(int xronosk, int dxronosk){
		ypoloipok=xronosk-dxronosk;
	}
	public int getypoloipok(){
		return ypoloipok;
	}
	public void setypoloipos(int xronoss,int dxronoss){
		ypoloipos=xronoss-dxronoss;
	}
	public int getypoloipos(){
		return ypoloipos;
	}
	public void setypsms(int sms, int dsms){
		ypsms=sms-dsms;
	}
	public int getypsms(){
		return ypsms;
	}
	
	
	
	
}
