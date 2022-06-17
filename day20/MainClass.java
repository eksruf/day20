package day20;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	CompanyServiceImpl company = new CompanyServiceImpl();
	
	boolean bool = true;
	
	while(bool) {
	System.out.println("1.특정 사원 등록");
	System.out.println("2.모든 사원 출력");
	System.out.println("3.특정 사원 수정");
	System.out.println("4.특정 사원 검색");
	System.out.println("5.종료");
	System.out.println(">>>>");
	int num = input.nextInt();
	
	
	switch(num) {
	case 1://특정 사원 등록 메소드
		CompanyDTO dto = new CompanyDTO();
		String name="",grade="";
		
		
		System.out.println("이름입력");
		name=input.next();
		System.out.println("직급입력");
		grade=input.next();
	
			dto.setName(name);
			dto.setGrade(grade);
			
			
		if(grade.equals("인턴")) {
			
			dto.setSalary(300);
			dto.setTariff(0.01);
			
		}else if(grade.equals("팀장")) {
			
			dto.setSalary(400);
			dto.setTariff(0.02);
		}else if(grade.equals("책임")) {
			
			dto.setSalary(600);
			dto.setTariff(0.03);
		}
		
		
		company.saveWorker(dto);
		
		break;
		
	case 2:
		company.output();
		break;
	case 3:
		company.modify(null);
		break;
	case 4: 
		
		System.out.println("이름입력: ");
		name=input.next();
	    company.search(name);
	    
		break;
	case 5:
		bool=false;
		break;
	}
	}
}
}
