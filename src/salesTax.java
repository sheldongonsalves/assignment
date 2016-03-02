import java.util.*;
public class salesTax {
	public static void main(String[] args) {
		String fname, lname, taxCode;
		double salesAmt , total;
		int customerNum;


		Scanner keyboard = new Scanner(System.in);

		System.out.print( "First Name? " );
		fname = keyboard.next();

		System.out.print( "Last Name? " );
		lname = keyboard.next();

		System.out.print( "Sales Amount? " );
		salesAmt = keyboard.nextDouble();

		System.out.print( "Customer Number ? " );
		customerNum = keyboard.nextInt();
		
		System.out.println("Sales Tax Code?");
		taxCode = keyboard.next();
		
		if(taxCode.equalsIgnoreCase("NRM"))
		{
		total = salesAmt + (0.06*salesAmt);
		}
		else if(taxCode.equalsIgnoreCase("NPF"))
		{
			total = salesAmt + (0.0*salesAmt);
		}
		else if(taxCode.equalsIgnoreCase("biz"))
		{
			total = salesAmt + (0.045*salesAmt);
		}
		else
		{
			System.out.println("No Such Tax Code Kindly reenter");
		    return;
	    }
		
		System.out.println("Name :"+fname +lname+"\nCustomer Number:"+customerNum +"\nTotal :"+total);
	}
}
