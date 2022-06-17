package day20;

public interface CompanyService {
    public void saveWorker(CompanyDTO dto); //특정 사원 등록 메소드
    public void modify(CompanyDTO dto); //특정 사원의 직급,기본급,수당 수정 메소드
    public CompanyDTO search(String name); //특정 사원 검색. 이름 값 으로 해당 값을 가진 직원 찾기은 결과 값을 main에서 출력한다.
    
    //출력
    public void output(); //모든 사원 출력
}
