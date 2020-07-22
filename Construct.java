import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;
public class Construct
{
	int s,a;
	Construct(int std,int area)
	{
		s=std;
		a=area;
	}
	String calculate()
	{
		if(s==1)
			return("Cost: "+a*12000);
		else if(s==2)
			return("Cost: "+a*15000);
		else if(s==3)
			return("Cost:"+a*18000);
		else if(s==4)
			return("Cost:"+a*25000);
		else
			return("invalid");
	}
}
