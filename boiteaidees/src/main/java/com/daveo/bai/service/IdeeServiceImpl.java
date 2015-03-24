package com.daveo.bai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daveo.bai.dao.IdeeDao;
import com.daveo.bai.model.Idee;

@Service
@Transactional
public class IdeeServiceImpl implements IdeeService {
	
	@Autowired
	private IdeeDao ideeDao;

	@Override
	public void ajouterIdee(Idee idee) {
		ideeDao.ajouterIdee(idee);

	}

	@Override
	public void mettreAJourIdee(Idee idee) {
		ideeDao.mettreAJourIdee(idee);

	}

	@Override
	public void selectionnerIdee(Idee idee) throws Exception {
		ideeDao.selectionnerIdee(idee);

	}

	@Override
	public void trouverIdee(Integer idIdee) {
		ideeDao.trouverIdee(idIdee);

	}

	/* (non-Javadoc)
	 * @see com.daveo.bai.service.IdeeService#supprimerIdee(java.lang.Integer)
	 */
	@Override
	public void supprimerIdee(Integer idIdee) {
		ideeDao.supprimerIdee(idIdee);

	}

	@Override
	public List<Idee> selectionnerIdees() {
		return ideeDao.selectionnerIdees();
	}

}
