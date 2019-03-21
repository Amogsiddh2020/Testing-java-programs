package nested_Ifelse_statement;

public class Electricity_billGenerating {

	public static void main(String[] args) {
		int units = 301;
		int bill = 0;
 
		if (units > 100)
		{
			if (units >= 200)
			{
				if (units > 300)
				{
					bill = units * 8;
				}
				else
					bill = units * 6;
			}
			else
				bill = units * 5;
		}
 
		System.out.println("CHENNAI ELECTRICITY LTD, CHENNAI");
		System.out.println("Units Consumed : " + units);
		System.out.println("Total Bill : " + bill);

	}

}
