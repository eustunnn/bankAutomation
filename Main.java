package denemeProje;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date tarih=null;
		DateFormat f= new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			tarih=f.parse("14/02/2022");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		shortTerm kisaVadeli = new shortTerm(1,0);
		longTerm uzunVadeli = new longTerm(2,0);
		special ozelVadeli = new special(3,0);
		current normalVadeli = new current(4,0);

		Scanner giris = new Scanner(System.in);
        int secim;
        int i=1;
        while(i<2)
        {
        System.out.println("<<<<<<<<<<<<<<<BANKA OTOMASYON S�STEM�NE HO�GELD�N�Z>>>>>>>>>>>>");
        System.out.println("1.K�sa vadeli hesap acma ve y�netme");
        System.out.println("2.Uzun vadeli hesap acma ve y�netme");
        System.out.println("3.Ozel vadeli hesap acma ve y�netme");
        System.out.println("4.Normal vadeli hesap acma ve y�netme");
        System.out.println("5.B�t�n hesaplar� g�ster");
        System.out.println("6.Tarihi g�rme");
        System.out.println("7.Tarihi degistirme");
        System.out.println("8.Cekilis");
        System.out.println("Secim yapiniz (1 - 2 - 3 - 4 - 5 )");
        secim=giris.nextInt();
       
        switch (secim) {
        case 1 :
            System.out.println("----------------------K�sa Vadeli hesap i�lemleri---------------------------");
            System.out.println("1.Hesaba para y�kleme ");
            System.out.println("2.Hesaptan para �ekme ");
            System.out.println("3.Faiz hesab� yapma");
            System.out.println("4.Hesab�n bakiye kontrol� ");
            System.out.println("5.Hesap IDsi g�rme");
            System.out.println("6.bir �nceki men�ye cikis");
        	System.out.println("**********************************");

            System.out.println("Seciminizi giriniz:");
            int secim2=giris.nextInt();
            int j=1;
            
            	switch (secim2) {
                case 1 :
                	System.out.println("Y�klemek istediginiz miktari giriniz.");
                	int para1=giris.nextInt();
            		kisaVadeli.deposit(para1);
            		System.out.println("basariyla y�klendi");
                    break;
                   

                case 2 :
                	System.out.println("Cekmek istediginiz miktari giriniz.");
                	int paracek1=giris.nextInt();
            		kisaVadeli.withDraw(paracek1);
                    break;

                case 3 :
                	System.out.println("Kac y�ll�k faizdeki paran�z� g�rmek istiyorsunuz.");
                	int faiz1=giris.nextInt();
            		kisaVadeli.faizSekli(faiz1);
                    break;
                case 4 :
            		System.out.println(kisaVadeli.getBalance());
                	break;
                case 5 :
                	System.out.println("Hesap IDniz " + kisaVadeli.getid());
                	break;
                case 6 :
                	j=3;
                	break;
                default :
                    System.out.println("Hatali secim!");
                    break;
                }
            	break;
            
        case 2 :
            System.out.println("---------------------------Uzun vadeli hesap i�lemleri---------------------------");
            System.out.println("1.Hesaba para y�kleme ");
            System.out.println("2.Hesaptan para �ekme ");
            System.out.println("3.Faiz hesab� yapma");
            System.out.println("4.Hesab�n bakiye kontrol� ");
            System.out.println("5.Hesap IDsi g�r�nt�leme");
            System.out.println("6.Bir �nceki men�ye d�n�s");
        	System.out.println("**********************************");

            System.out.println("Seciminizi giriniz:");
            
            int secim3=giris.nextInt();
            int q=1;
           
            	switch (secim3) {
                case 1 :
                	System.out.println("Y�klemek istediginiz miktari giriniz.");
                	int para1=giris.nextInt();
            		uzunVadeli.deposit(para1);
            		System.out.println("basariyla y�klendi");
                    break;

                case 2 :
                	System.out.println("Cekmek istediginiz miktari giriniz.");
                	int paracek1=giris.nextInt();
            		uzunVadeli.withDraw(paracek1);
                    break;

                case 3 :
                	System.out.println("Kac y�ll�k faizdeki paran�z� g�rmek istiyorsunuz.");
                	int faiz1=giris.nextInt();
            		uzunVadeli.faizSekli(faiz1);
                    break;
                case 4 :
            		System.out.println(uzunVadeli.getBalance());
                	break;
                case 5 :
                	System.out.println("Hesap IDniz " + uzunVadeli.getid());
                	break;
                case 6 :
                	q=3;
                	break;
                default :
                    System.out.println("Hatali secim!");
                    break;
                }
            break;
            
        case 3 :
            System.out.println("---------------------------�zel vadeli hesap i�lemleri---------------------------");
            System.out.println("1.Hesaba para y�kleme ");
            System.out.println("2.Hesaptan para �ekme ");
            System.out.println("3.Faiz hesab� yapma");
            System.out.println("4.Hesab�n bakiye kontrol� ");
            System.out.println("5.Hesap IDnizi g�r�nt�le");
            System.out.println("6.Bir �nceki men�ye d�n�s");
        	System.out.println("**********************************");

            System.out.println("Seciminizi giriniz:");

            int secim4=giris.nextInt();
            int a=1;
           
            	switch (secim4) {
                case 1 :
                	System.out.println("Y�klemek istediginiz miktari giriniz.");
                	int para1=giris.nextInt();
            		ozelVadeli.deposit(para1);
            		System.out.println("basariyla y�klendi");
                    break;
                

                case 2 :
                	System.out.println("Cekmek istediginiz miktari giriniz.");
                	int paracek1=giris.nextInt();
            		ozelVadeli.withDraw(paracek1);
                    break;

                case 3 :
                	System.out.println("Kac y�ll�k faizdeki paran�z� g�rmek istiyorsunuz.");
                	int faiz1=giris.nextInt();
            		ozelVadeli.faizSekli(faiz1);
                    break;
                case 4 :
            		System.out.println(ozelVadeli.getBalance());
                	break;
                case 5 :
                	System.out.println("Hesap IDniz " + ozelVadeli.getid());
                	break;
                case 6 :
                	a=3;
                	break;
                default :
                    System.out.println("Hatali secim!");
                    break;
                }
            break;
          
        case 4  :
            System.out.println("---------------------------Normal vadeli hesap i�lemleri---------------------------");
            System.out.println("1.Hesaba para y�kleme ");
            System.out.println("2.Hesaptan para �ekme ");
            System.out.println("3.Faiz hesab� yapma");
            System.out.println("4.Hesab�n bakiye kontrol� ");
            System.out.println("5.Hesap IDnizi g�r�nt�leme");
        	System.out.println("**********************************");
            System.out.println("6.Bir �nceki men�ye d�n�s");

            System.out.println("Seciminizi giriniz:");
            int secim5=giris.nextInt();
            int b=1;
            
            	switch (secim5) {
                case 1 :
                	System.out.println("Y�klemek istediginiz miktari giriniz.");
                	int para1=giris.nextInt();
            		normalVadeli.deposit(para1);
            		System.out.println("basariyla y�klendi");
                    break;

                case 2 :
                	System.out.println("Cekmek istediginiz miktari giriniz.");
                	int paracek1=giris.nextInt();
            		normalVadeli.withDraw(paracek1);
                    break;

                case 3 :
                	System.out.println("Kac y�ll�k faizdeki paran�z� g�rmek istiyorsunuz.");
                	int faiz1=giris.nextInt();
            		normalVadeli.faizSekli();
                    break;
                case 4 :
            		System.out.println(normalVadeli.getBalance());
                	break;
                case 5 :
                	System.out.println("Hesap IDniz " + normalVadeli.getid());

                	break;
                case 6 :
                	b=3;
                	break;
                default :
                    System.out.println("Hatali secim!");
                    break;
                }
            break;
        
        case 5:
        	System.out.println("**********************************");
        	System.out.println("Kisa vadeli hesabinizin IDsi : " + kisaVadeli.getid());
        	System.out.println("Uzun vadeli hesabinizin IDsi : " + uzunVadeli.getid());
        	System.out.println("Ozel vadeli hesabinizin IDsi : " + ozelVadeli.getid());
        	System.out.println("Normal vadeli hesabinizin IDsi : " + normalVadeli.getid());
        	System.out.println("**********************************");
        	break;
        case 6:
        	System.out.println("G�ncel tarih:" + f.format(tarih));
        	break;
        case 7:
        	Date tarih2=null;
    		DateFormat f2= new SimpleDateFormat("dd/MM/yyyy");
    		System.out.println("g�n/ay/yil gir");
        	int t=giris.nextInt();
    		String s=String.valueOf(t);
        	try {
    			tarih2=f.parse(s);
    		} catch (ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		System.out.println(f2.format(tarih2));
        	break;
        case 8:
        	Random r=new Random(); //random s�n�f�
        	int c=r.nextInt(4)+1;
        	System.out.println("**********************************");
        	System.out.println("Cekilis yap�l�yor....");
        	System.out.println("**********************************");

        	if(c==1)
        	{
        		kisaVadeli.deposit(10000);
            	System.out.println("**********************************");
            	System.out.println("1 ID numaral� hesap kazandi"  );
            	System.out.println("**********************************");

        	}
        	if(c==2)
        	{
        		uzunVadeli.deposit(10000);
            	System.out.println("**********************************");
            	System.out.println("2 ID numaral� hesap kazandi"  );
            	System.out.println("**********************************");

        	}
        	if(c==3)
        	{
        		ozelVadeli.deposit(10000);
            	System.out.println("**********************************");
            	System.out.println("3 ID numaral� hesap kazandi"  );
            	System.out.println("**********************************");

        	}
        	if(c==4)
        	{
            	System.out.println("**********************************");
        		normalVadeli.deposit(10000);
            	System.out.println("4 ID numaral� hesap kazandi"  );
            	System.out.println("**********************************");

        	}
        	else
        	{
        		System.out.println(c);
        	}
        	break;
        default :
            System.out.println("Hatali secim!");
            break;
        }

		
	}
	}
}



