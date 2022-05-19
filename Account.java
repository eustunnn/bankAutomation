package denemeProje;

public class Account {
	int ID;
	int bakiye;
	public Account(int ID,int bakiye)
	{
		this.ID=ID;
		this.bakiye=bakiye;
	}

	public void deposit(int para){
		bakiye=bakiye+para;
		
		
	}
	public void withDraw(int cekilenPara){
		if (bakiye>=cekilenPara)
		{
			bakiye=bakiye-cekilenPara;
			System.out.println("Basariyla para cekildi");
		}
		else 
		{
			System.out.println("O kadar para yok.");
		}
	}
	public int getBalance(){
		return bakiye;
	}
	public int getid(){
		return ID;
	}
	public void benefit(){
		
		}
	}
