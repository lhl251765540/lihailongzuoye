package LHL;

public class Employee {
	
	private String employeeno;
	private String employeename;
	
	
	public Employee(String employeeno,String employeename){
		
		this.employeeno=employeeno;
		this.employeename=employeename;	
	}

	public String getEmployeeno(){
		return employeeno;	
	}
	public void setEmployeeno(String employeeno){
		this.employeeno = employeeno;
	}
	public String getEmpolyeename(){
		return employeename;
	}
    public void setEmployeename(String employeename){
    	this.employeename = employeename;
    }
    
    
    
    @Override
   public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
	   boolean flag=false;
	   Employee e=(Employee)obj;
	   
	if (this.employeeno.equals(e.getEmployeeno())&&this.getEmpolyeename().equals(e.getEmpolyeename())){
		
		flag=true;
		
	}
	return flag;
	
   }  
    
    
    
    public int hashCode(){
    	return 1;
    	
    }


}
