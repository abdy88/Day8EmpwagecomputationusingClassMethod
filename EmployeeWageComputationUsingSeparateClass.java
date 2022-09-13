package bl.com.day8practiceproblems;

public class EmployeeWageComputationUsingSeparateClass {
	
	
	
	public static void main(String[] args) {
		
		
		
		
		EmpWageBuilder BigBazar = new EmpWageBuilder();
		
		BigBazar.calculatewagestillconditionmet();
		
		
	}
	
	
	

}



class EmpWageBuilder
{
	


	public void calculatewagestillconditionmet() {
	
	final byte isPartTime=1;
	final byte isFulltime=2;
	int salary=0;
	int empRatePerHr=20;
	int empHrs=0;
	int totalsalary=0;
	int totalworkinghrs=0;
	
	
	
		
		for (int day=1;day<=20 && totalworkinghrs<=100 ;day++)
		
		{
			

			int partOrFulltime =  (int)Math.floor(Math.random()  *3);
			
			switch (partOrFulltime) {
    		
			case isFulltime:
				
				empHrs=10;
				
				break;
				
			case isPartTime:
				
				empHrs=8;
				
				break;
		    
		    case 0:
		    	empHrs=0;
				
				break;
		        
		    default:
		    	System.out.println("NO EMPLOYEE DATA");
		    	
		    	
			}
		    	
		    	totalworkinghrs=totalworkinghrs+empHrs;
		    	
		    	
		    	if(totalworkinghrs>100)
		    	{
		    		totalworkinghrs=totalworkinghrs-empHrs;
		    		break;
		    	}
		    	System.out.println("totalworkinghrs= "+ totalworkinghrs);
		    	
		    	salary= empHrs * empRatePerHr;

		    	totalsalary=totalsalary + salary;
		    	System.out.println("total accumulated salary salary till now = " + totalsalary );
			
		}
		
	
		System.out.println("final totalworkinghrs= "+ totalworkinghrs);
		System.out.println("total salary for the month  = " + totalsalary );
	}
		
	









}