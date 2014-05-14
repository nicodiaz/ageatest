package main.java.ar.com.nicodp.ageatest.dao;

import java.util.List;

import main.java.ar.com.nicodp.ageatest.model.TSistema;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/** 
 * Service DAO Implementation 
 * 
 * Access the data integrated with hibernate
 * 
 * @author  Nicolás Díaz País <nico@diazpais.com.ar>
 * @package main.java.ar.com.nicodp.ageatest.dao
 * @license https://raw.githubusercontent.com/nicodiaz/ageatest/master/LICENSE
 */
@Transactional
@Repository
public class SystemDAO {

	private SessionFactory sessionFactory;

	/**
	 * Return an TSistema model by specific id
	 * 
	 * @param systemId
	 * @return
	 */
	public TSistema findById(int systemId) {

		TSistema result = (TSistema) sessionFactory.getCurrentSession().get(
				TSistema.class, systemId);

		return result;
	}

	@SuppressWarnings("unchecked")
	public List<TSistema> getAll() {
		List<TSistema> result = sessionFactory.getCurrentSession()
				.createCriteria(TSistema.class).list();

		return result;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
