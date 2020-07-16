//emp present absent code 
public class empPresentAbsent
{
        public static void main(String[] args)
        {
                int isPresent=1;
                double empCheck=Math.floor(Math.random() * 10) % 2;
                //System.out.println("randome value: "+Math.random());
                if (empCheck == isPresent)
                {
                        System.out.println("Employee is present");
                }
                else
                {
                        System.out.println("EMployee is Absent");
                }
        }
}




//Daily empWage code added
public class dailyEmpWage
{
        public static void main(String[] args)
        {
                //CONSTANTS
                int IS_FULL_TIME=1;
                int EMP_RATE_PER_HOUR=20;

                //vARIABLES
                int empHrs=0;
                int empWage=0;

                //computation
                double empCheck=Math.floor(Math.random() * 10 ) % 2;
                if(empCheck==IS_FULL_TIME)
                {
                        empHrs=8;
                }
                else
                {
                        empHrs=0;
                }
        empWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("empWage: " +empWage);
        }
}




//Add part time emp wage code added
public class partTimeEMpWage
{
        public static void main(String[] args)
        {
                //CONSTANTS
                int IS_PART_TIME=1;
                int IS_FULL_TIME=2;
                int EMP_RATE_PER_HOUR=20;

                //vARIABLES
                int empHrs=0;
                int empWage=0;

                //computation
                double empCheck=Math.floor(Math.random() * 10 ) % 3;
                if(empCheck==IS_PART_TIME)
                {
                        empHrs=4;
                }
                else if(empCheck==IS_FULL_TIME)
                {
                        empHrs=8;
                }
		else
		{
			empHrs=0;
		}
        empWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("empWage: " +empWage);
        }
}





//part time using Switch case
public class partFullTimeSwitch
{
//CONSTANTS
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static final int EMP_RATE_PER_HOUR=20;

        public static void main(String[] args)
        {
                //vARIABLES
                int empHrs=0;
                int empWage=0;

                //computation
                int empCheck=(int) Math.floor(Math.random() * 10 ) % 3;
                switch (empCheck)
                {
                   case IS_PART_TIME:
                        empHrs=4;
			break;
		   case IS_FULL_TIME:
			empHrs=8;
			break;
		   default:
			empHrs=0;
                }
        	empWage=empHrs*EMP_RATE_PER_HOUR;
        	System.out.println("empWage: " +empWage);
        }
}




//emp wages for a manth code added
public class empWageForMonthSalary
{
       public static final int IS_PART_TIME=1;
       public static final int IS_FULL_TIME=2;
       public static final int empRatePerHours=20;
       public static final int numberOfDays=20;

	public static void main(String[] args)
	{
	   int totalSalary=0;
	   int empHrs=0;
	   int salary=0;

	   for(int day=1;day<=numberOfDays;day++)
	   {
	       double empCheck=Math.floor(Math.random()*10)%3;
	       switch((int)empCheck)
	       {
		  case IS_PART_TIME:
		  empHrs=8;
		  break;

		  case IS_FULL_TIME:
		  empHrs=4;
		  break;

		  default:
		  empHrs=0;
	       }
	   salary=empHrs*empRatePerHours;
	   totalSalary=totalSalary+salary;
	   }
      System.out.println("Total Salary: "+totalSalary);
     }
}


