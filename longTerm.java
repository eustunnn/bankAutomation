package denemeProje;

public class longTerm extends Account {

	public longTerm(int ID, int bakiye) {
		super(ID, bakiye);
		// TODO Auto-generated constructor stub
	}
	public void faizSekli(int yil)
	{

			if(bakiye>=1000)
			{
				for (int w=0; w<=yil; w++)
				{
				 double birikimliTutar=bakiye*(1+(0.24*w));
				 System.out.println(w+". yýldaki faizli tutar: "+ (int)birikimliTutar);
				}
			}
			else
			{
				System.out.println("faiz uygulanamaz.");
			}
			
	}

}
