package LHL;


import java.util.ArrayList;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		ArrayList<Employee> list= new ArrayList<Employee>();
		
		System.out.println("��ӭ����Ա��¼��ϵͳ");
		boolean flag=true;
		
		while(flag){
		
		System.out.println("¼��Ա����1  ɾ��Ա����2 ����Ա����3 ����Ա����4");
		int userselect=s.nextInt();
		
		switch(userselect){
		
		case 1:
			  System.out.println("������Ա����");
		      String employeeno=s.next();
		
		int index=IndexOfEmployeePosition(list,employeeno);
		
		if(index==-1){
			System.out.println("������Ա������");
			String employeename=s.next();
			
			Employee employee=new Employee(employeeno,employeename);
			
			list.add(employee);
			
		}
		else{
			System.out.println("�Բ���Ա�����ظ�");
			
		}
		
		break;
		case 2:
			System.out.println("��������Ҫɾ����Ա����");
			String employeeno1=s.next();
			int index1=IndexOfEmployeePosition(list,employeeno1);
			if(index1!=-1){
				
				list.remove(index1);
				
			}
			else{
				System.out.println("�������Ա���Ų�����");
			}
		break;
		case 3:
			System.out.println("��������Ҫ���µ�Ա����");
			String employeeno2=s.next();
			int index2=IndexOfEmployeePosition(list,employeeno2);
			if(index2!=-1){
				Employee updateemployee=list.get(index2);
				System.out.println("��������º��Ա������");
				String newemployeenam=s.next();
			
				updateemployee.setEmployeename(newemployeenam);
			}
			else{
				System.out.println("�������Ա���Ų�����");
				
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
		
		System.out.println("�����밴1  �˳��������");
		
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
