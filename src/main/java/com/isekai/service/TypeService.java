package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.collection.internal.PersistentBag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.TypeDetail;
import com.isekai.models.Type;
import com.isekai.repos.TypeRepository;

@Service
@Transactional
public class TypeService {
	@Autowired
	TypeRepository repo;
	
	public List<Type> listAll(){
		return (List<Type>) repo.findAll();
	}
	
	public Type get(int id) {
		Optional<Type> result = repo.findById(id);
		return result.get();
	}
	public void save(Type type) {
		repo.save(type);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<TypeDetail> getListTypeDetailByTypeId(Type type) {
		if (type.getTypeDetails() instanceof PersistentBag || type.getTypeDetails() == null) {

			List<TypeDetail> listTypeDetails = entityManager
					.createQuery("SELECT detail FROM TypeDetail detail WHERE type_id = :type_id", TypeDetail.class)
					.setParameter("type_id", type.getId()).getResultList();
			entityManager.close();
			type.setTypeDetails(listTypeDetails);
			return listTypeDetails;
		} else {
			return type.getTypeDetails();
		}
	}
}
