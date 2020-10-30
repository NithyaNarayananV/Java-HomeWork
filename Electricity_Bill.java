/*
Experiment 1
PROGRAM TO GENERATE ELECTRICITY BILL
AIM
To develop a Java application to generate Electricity bill.
PROCEDURE
1.Create a class with the following members Consumer no., consumer name, previous month reading,
current month reading, type of EB connection (i.e domestic or commercial).
2.Compute the bill amount using the following tariff.
If the type of the EB connection is domestic, calculate the amount to be paid as follows:
• First 100 units - Rs. 1 per unit
• 101-200 units - Rs. 2.50 per unit
• 201 -500 units - Rs. 4 per unit
• 501 units - Rs. 6 per unit
If the type of the EB connection is commercial, calculate the amount to be paid as follows:
• First 100 units - Rs. 2 per unit
• 101-200 units - Rs. 4.50 per unit
• 201 -500 units - Rs. 6 per unit
• 501 units - Rs. 7 per unit
3. Create the object for the created class .Invoke the methods to get the input from the consumer and
display the consumer information with the generated electricity bill.

*/
import java.util.Scanner;
public class Electricity_Bill 
{
	public static void main(String[] args) 
	{
		Scanner A = new Scanner(System.in);
		int Consumer_no, Previous_Month, Current_Month,Total_Units;
		double Unit1=1, Unit2=2.5, Unit3=4, Unit4=6,Bill_Amount;
		char Connection_Type;
		System.out.println("		~~~Electricity Bill Generator~~~\n");
		System.out.print  ("		Consumer Number 	: ");
		Consumer_no= A.nextInt();
		System.out.print  ("		Connection Type (D/C) 	: ");
		Connection_Type=A.next().charAt(0);
		System.out.print  ("		Previous Month Reading 	: ");
		Previous_Month= A.nextInt();
		System.out.print  ("		Current Month Reading 	: ");
		Current_Month= A.nextInt();
		if (Connection_Type=='C')
		{
			Unit1=2;
			Unit2=4.5;
			Unit3=6;
			Unit4=7;
		}
		Total_Units=Current_Month-Previous_Month;
		if (Total_Units<101)
		{
			Bill_Amount=Total_Units*Unit1;
		}
		else
		{
			Bill_Amount=100*Unit1;
			if(Total_Units<201)
			{
				Bill_Amount=Bill_Amount+(Total_Units-100)*Unit2;
			}
			else
			{
				Bill_Amount=Bill_Amount+100*Unit2;
				if(Total_Units<501)
				{
					Bill_Amount=Bill_Amount+ (Total_Units-200)*Unit3;

				}
				else
				{
					Bill_Amount=Bill_Amount+300*Unit3;
					Bill_Amount=Bill_Amount=(Total_Units-500)*Unit4;
				}
			}
		}
		System.out.println("		Bill Amount   		: "+Bill_Amount);
		System.out.println("		     	~~~~Thank You~~~~		");
		System.out.println("	    Project Done by Nithya Narayanan C VR");
	}
}
