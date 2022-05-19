package denemeProje;

public class special extends Account {

	public special(int ID, int bakiye) {
		super(ID, bakiye);
		// TODO Auto-generated constructor stub
	}
	public void faizSekli(int yil)
	{

			if(bakiye>=1000)
			{
				for (int e=0; e<=yil; e++)
				{
				 double birikimliTutar=bakiye*(1+(0.12*e));
				 System.out.println(e+". yýldaki faizli tutar: "+ (int)birikimliTutar);
				}
			}
			else
			{
				System.out.println("faiz uygulanamaz.");
			}
			
	}
}
