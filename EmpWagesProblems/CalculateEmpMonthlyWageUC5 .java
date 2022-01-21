package empwages1;

public class CalculateEmpMonthlyWageUC5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wagePerHour=20;
		int fullDayHour=8;
		int partTimeHour=4;
		int workingDaysInMonth=20;
		int totalWage=0;
		int wagePerDay;

		for(int i=1;i<=workingDaysInMonth;i++)
		{
			double empCheck=Math.floor((Math.random()*10) % 3);

			if(empCheck==2)
			{
				wagePerDay=(wagePerHour*fullDayHour);
				totalWage=totalWage+wagePerDay;
			}

			else if (empCheck==1) 
			{

				wagePerDay=(wagePerHour*partTimeHour);
				totalWage=totalWage+wagePerDay;
			}
			else
			{
				wagePerDay=0;
				totalWage=totalWage+wagePerDay;
			}

		}

		System.out.println("Total wage of the month= "+totalWage);


	}

}
