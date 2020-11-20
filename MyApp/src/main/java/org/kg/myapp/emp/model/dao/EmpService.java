package org.kg.myapp.emp.model.dao;

import java.util.List;
import java.util.Map;

import org.kg.myapp.emp.model.vo.EmpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService implements IEmpService {

	@Autowired
	IEmpRepository empRepository;
	
	@Override
	public int getEmpCount() {
		
		return empRepository.getEmpCount();
	}

	@Override
	public int getEmpCount(int deptId) {
		
		return empRepository.getEmpCount(deptId);
	}

	@Override
	public List<EmpVO> getEmpList() {
		return empRepository.getEmpList();
	}

	@Override
	public EmpVO getEmpInfo(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmp(EmpVO emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertEmp(EmpVO emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmp(int empId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteJobHistory(int empId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Map<String, Object>> getAllDeptId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getAllJobId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getAllManagerId() {
		// TODO Auto-generated method stub
		return null;
	}

}
