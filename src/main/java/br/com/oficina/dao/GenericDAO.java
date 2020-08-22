package br.com.oficina.dao;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.oficina.util.JPAUtil;

public abstract class GenericDAO<E> {

	private EntityManager em = JPAUtil.getEntityManger();
	private Class<E> classe;

	@SuppressWarnings("unchecked")
	public GenericDAO() {
		this.classe = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	protected EntityManager getManager() {
		return this.em;
	}

	protected void save(E entidade) {

		try {
			this.em.getTransaction().begin();
			this.em.merge(entidade);
			this.em.getTransaction().commit();

		} catch (Exception e) {
			this.em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			this.em.close();
		}

	}
	
	protected Object findById(Long id) {

		return this.em.find(this.classe, id);
		
	}
	
	protected void delete(E entidade){
		
		try {
			this.em.getTransaction().begin();
			this.em.remove(entidade);
			this.em.getTransaction().commit();

		} catch (Exception e) {
			this.em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			this.em.close();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	protected List<E> getAll() {
		List<E> listAll = new ArrayList<>();
		
		try {
			listAll = this.em.createQuery("from " + this.classe.getCanonicalName()).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listAll;
	}
}
