import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.math.BigDecimal;


import com.domain.Employee;
import com.service.EmployeeService;


public class TestMyBatis {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		EmployeeService empService = new EmployeeService();
		//empList = empService.getEmpList();
		empList = empService.getEmpListBySalary(BigDecimal.valueOf(40000.00));
		for (Employee e : empList)
			System.out.println(e.getFname()+"--"+e.getLname()+"--"+e.getSsn()+"--"+e.getSalary());
		
		List<HashMap<String,Object>> deptList = new ArrayList<HashMap<String,Object>>();
		deptList = empService.getSelectAllDepts();
		for (HashMap<String,Object> d : deptList) {
			System.out.println("dname:"+d.get("DNAME"));
			System.out.println("dnumber:"+d.get("DNUMBER"));
		}
		

 

	}

}
