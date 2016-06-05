package LHL;


import java.util.ArrayList;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		ArrayList<Employee> list= new ArrayList<Employee>();
		
		System.out.println("欢迎来到员工录入系统");
		boolean flag=true;
		
		while(flag){
		
		System.out.println("录入员工按1  删除员工按2 更新员工按3 查找员工按4");
		int userselect=s.nextInt();
		
		switch(userselect){
		
		case 1:
			  System.out.println("请输入员工号");
		      String employeeno=s.next();
		
		int index=IndexOfEmployeePosition(list,employeeno);
		
		if(index==-1){
			System.out.println("请输入员工姓名");
			String employeename=s.next();
			
			Employee employee=new Employee(employeeno,employeename);
			
			list.add(employee);
			
		}
		else{
			System.out.println("对不起员工号重复");
			
		}
		
		break;
		case 2:
			System.out.println("请输入你要删除的员工号");
			String employeeno1=s.next();
			int index1=IndexOfEmployeePosition(list,employeeno1);
			if(index1!=-1){
				
				list.remove(index1);
				
			}
			else{
				System.out.println("您输入的员工号不存在");
			}
		break;
		case 3:
			System.out.println("请输入您要更新的员工号");
			String employeeno2=s.next();
			int index2=IndexOfEmployeePosition(list,employeeno2);
			if(index2!=-1){
				Employee updateemployee=list.get(index2);
				System.out.println("请输入更新后的员工姓名");
				String newemployeenam=s.next();
			
				updateemployee.setEmployeename(newemployeenam);
			}
			else{
				System.out.println("您输入的员工号不存在");
				
			}
		
		break;
		
		case 4:
			for(Employee e:list){
				
				System.out.println("................");
			    System.out.println(e.getEmployeeno());
			    System.out.println(e.getEmpolyeename());
			    System.out.println("................");
			    
			}
		break;
		}
		
		System.out.println("继续请按1  退出按任意键");
		
		   String a=s.next();
		   if(!a.equals("1")){
			   break;
		   }
		
		
		}
		
	}

	
	
	public static int IndexOfEmployeePosition(ArrayList<Employee> list,String employeeno){
		
		int index=-1;
		
		for(int i=0;i<list.size();i++){
			
			
			
			Employee employee=list.get(i);
		
			if(employee.getEmployeeno().equals(employeeno)){
		 
		 
			index=i;
			
			break;
			
		}
			
		}
		
		return index;
	}




	
	
	
	
	
	
	
	
}
