package day20;

import java.util.ArrayList;
import java.util.Scanner;

class CompanyDTO {

	String name;
	String grade;
	int salary;
	double tariff;
	
	public double getTariff() {return tariff;}
	public void setTariff(double tariff) {this.tariff = tariff;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getGrade() {return grade;}
	public void setGrade(String grade) {this.grade = grade;}
	
	public int getSalary() {return salary;}
	public void setSalary(int salary) {this.salary = salary;}
}

public class CompanyServiceImpl implements CompanyService{
	ArrayList<CompanyDTO> arr = new ArrayList<CompanyDTO>();
	Scanner input= new Scanner(System.in);
	@Override
	
	
	public void saveWorker(CompanyDTO dto) {
		

		arr.add(dto);

	}
	
	
	@Override
	public void modify(CompanyDTO dto) {
		//특정 사원의 직급,기본급,수당 수정 메소드
		
		
	}
	@Override
	public CompanyDTO search(String name) {
		//특정 사원 검색. 이름 값 으로 해당 값을 가진 직원 찾기은 결과 값을 main에서 출력한다.
		
		
//		System.out.println("검색 이름 입력");
//		name=input.next();
		int i=0;
		boolean bool= true;
		while(bool) {
		for(;i<arr.size(); i++) {
			if(arr.get(i).getName() .equals(name) ) {
				System.out.println("---정보---");
				System.out.println("직급: "+arr.get(i).getGrade());
				System.out.println("이름: "+arr.get(i).getName());
				System.out.println("월급: "+arr.get(i).getSalary());
				System.out.println("세율: "+arr.get(i).getTariff());
				
		}
			}

		bool = false;		
			}
		
	    
		return null;
	}
	@Override
	public void output() {
		//모든 사원 출력
		for(CompanyDTO c: arr) {
			System.out.println("이름: "+c.getName());
			System.out.println("직급: "+c.getGrade());
			System.out.println("월급: "+c.getSalary());
			System.out.println("세율: "+c.getTariff());
		}
		
	}
	
}


