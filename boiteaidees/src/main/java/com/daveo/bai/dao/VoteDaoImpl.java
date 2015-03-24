package com.daveo.bai.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daveo.bai.model.Vote;

@Repository
public class VoteDaoImpl implements VoteDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void ajouterVote(Vote vote) {
		getCurrentSession().save(vote);

	}

	@Override
	public void mettreAJourVote(Vote vote) {
		getCurrentSession().update(vote);

	}

	@Override
	public Vote selectionnerVote(Vote vote) {
		return (Vote) getCurrentSession().get(Vote.class, vote.getIdVote());

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vote> selectionnerVotes() {
		return getCurrentSession().createQuery("from Vote").list();
	}

	@Override
	public Vote trouverVote(Integer idVote) {
		return (Vote) getCurrentSession().get(Vote.class, idVote);

	}

	@Override
	public void supprimerVote(Vote vote) {
		getCurrentSession().delete(vote);

	}

	@Override
	public Vote getVoteParIdIdee(Integer idIdee) {
		@SuppressWarnings("unchecked")
		List<Vote> results = getCurrentSession().createQuery(" FROM Vote V where V.idIdee="+idIdee).list();
		return results.get(0);
	}

}
