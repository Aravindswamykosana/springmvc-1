package springmvc_1.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import springmvc_1.dto.Employee;
@Repository
public class EmployeeCrud{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("arvind");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	public Employee saveEmployee(Employee employee)throws Exception{
		et.begin();
		em.persist(employee);
		et.commit();
		return employee;
	}
	public Employee findByEmail(String email)throws Exception{
		Query query = em.createQuery("select a from Employee a where a.email=?1");
		query.setParameter(1, email);
		Employee db = (Employee)query.getSingleResult();
		return db;
	}
	public List<Employee> fetchAll() throws Exception{
		Query q = em.createQuery("select a from Employee a");
		List<Employee> l =q.getResultList();
		return l;
	}
}
