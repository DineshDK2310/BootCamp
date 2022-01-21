package empwages1;

public class UsingSwitchCaseUC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double empCheck=Math.floor((Math.random()*10) % 3);
		int value= (int)empCheck;
		int wagePerHour=20;
		int fullDayHour=8;
		int partTimeHour=4;

		switch (value)
		{
		case 2: 
			System.out.println("Employee is a Full Time Employee");
			System.out.println("Total wage of the day= "+(wagePerHour*fullDayHour)+" Rupees");
			break;

		case 1:
			System.out.println("Employee is a Part Time Employee");
			System.out.println("Total wage of the day= "+(wagePerHour*partTimeHour)+" Rupees");
			break;

		case 0:
			System.out.println("Employee is absent");
			System.out.println("Total wage of the day = 0 Rupees");

		}

	}

}
