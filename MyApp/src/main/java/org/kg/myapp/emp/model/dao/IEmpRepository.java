package org.kg.myapp.emp.model.dao;

import java.util.List;
import java.util.Map;

import org.kg.myapp.emp.model.vo.EmpVO;

public interface IEmpRepository {

	int getEmpCount();
	int getEmpCount(int deptId);
	List<EmpVO> getEmpList();
	EmpVO getEmpInfo(int empId);
	void updateEmp(EmpVO emp);
	void insertEmp(EmpVO emp);
	void deleteEmp(int empId);
	void deleteJobHistory(int empId);
	List<Map<String,Object>> getAllDeptId();
	List<Map<String,Object>> getAllJobId();
	List<Map<String,Object>> getAllManagerId();
	
}
