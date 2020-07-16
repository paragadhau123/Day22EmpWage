public class empuc8{

		public static final int IS_FULL_TIME =1;
                public static final int IS_PART_TIME =2;
                private final String Company;
                private final int empRatePerHour ;
                private final int numOfWorkingDays ;
                private final int maxHoursPerMonth ;

		empuc8(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
		{

			this.Company = Company;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHoursPerMonth = maxHoursPerMonth;

		}

		private int computeEmpWage()
		{

			int empHrs =0;
			int empWage=0;
			int TotalEmpWage=0;
			int TotalWorkingHours=0;
			int day =0;

	        	while( day < numOfWorkingDays || TotalWorkingHours <= maxHoursPerMonth)

			{
				double empCheck = Math.floor(Math.random() * 10 % 3 );
				day++;
				switch ((int)empCheck)
				{
					case IS_FULL_TIME:
						empHrs=8;
						break;
					case IS_PART_TIME:
						empHrs=4;
						break;
					default:
						empHrs =0;

				}
				TotalWorkingHours+=empHrs;
				empWage = empHrs * empRatePerHour;
				TotalEmpWage+=empWage;
			}
			//System.out.println("Total Emp wage :"+ TotalEmpWage);
			return TotalEmpWage;

		}

		public static void main(String[] args)
	        {
			empuc8 dMart = new empuc8("Dmart",20,20,100);
			empuc8 Realiance = new empuc8("Realiance",30,20,80);
			System.out.println("Total Emp wage of Realiance : "+ Realiance.computeEmpWage());
			System.out.println("Total Emp wage of dMart : "+ dMart.computeEmpWage());
		}


}
