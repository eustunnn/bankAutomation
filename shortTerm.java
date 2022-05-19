package denemeProje;

public class shortTerm extends Account  {
	int gün;
	int ay;
	int yil;
	public shortTerm(int ID, int bakiye) {
		super(ID,bakiye);
		// TODO Auto-generated constructor stub
	}
	public void faizSekli(int yil)
	{

			if(bakiye>=1000)
			{
				for (int s=0; s<=yil; s++)
				{
				 double birikimliTutar=bakiye*(1+(0.17*s));
				 System.out.println(s+". yýldaki faizli tutar: "+ (int)birikimliTutar);
				}
				
			}
			else
			{
				System.out.println("faiz uygulanamaz.");
			}
			
	}

	

}
