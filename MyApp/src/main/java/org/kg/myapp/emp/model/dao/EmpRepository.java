package org.kg.myapp.emp.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;



import org.kg.myapp.emp.model.vo.EmpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmpRepository implements IEmpRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private class EmpMapper implements RowMapper<EmpVO> {

		@Override
		public EmpVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmpVO emp= new EmpVO();
			emp.setEmployeeId(rs.getInt("employee_id"));
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString(3));
			emp.setEmail(rs.getString(4));
			emp.setPhoneNumber(rs.getString(5));
			emp.setHireDate(rs.getDate(6));
			emp.setJobId(rs.getString(7));
			emp.setSalary(rs.getDouble(8));
			emp.setCommissionPct(rs.getDouble(9));
			emp.setManagerId(rs.getInt(10));
			emp.setDepartmentId(rs.getInt(11));
			emp.setDepartmentId(rs.getInt(11));
			return emp;
		}
		
	}
	
	//내부
	
	RowMapper<EmpVO> empMapper = new RowMapper<EmpVO>() {

		@Override
		public EmpVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmpVO emp= new EmpVO();
			emp.setEmployeeId(rs.getInt("employee_id"));
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString(3));
			emp.setEmail(rs.getString(4));
			emp.setPhoneNumber(rs.getString(5));
			emp.setHireDate(rs.getDate(6));
			emp.setJobId(rs.getString(7));
			emp.setSalary(rs.getDouble(8));
			emp.setCommissionPct(rs.getDouble(9));
			emp.setManagerId(rs.getInt(10));
			emp.setDepartmentId(rs.getInt(11));
			emp.setDepartmentId(rs.getInt(11));
			return emp;
		}

	
		
	};
	
	//익명..익명으로 많이 씀
	@Override
	public int getEmpCount() {
		String sql ="select count(*) from employees";
		
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	@Override
	public int getEmpCount(int deptId) {
		String sql = "select count(*) from employees where department_id=?";
		return jdbcTemplate.queryForObject(sql, Integer.class, deptId);
	}

	@Override
	public List<EmpVO> getEmpList() {
		String sql="select *from employees";
		return jdbcTemplate.query(sql, empMapper);
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
