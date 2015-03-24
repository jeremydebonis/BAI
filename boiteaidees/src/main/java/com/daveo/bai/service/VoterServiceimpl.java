package com.daveo.bai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daveo.bai.dao.VoteDao;
import com.daveo.bai.model.Vote;

@Service
@Transactional
public class VoterServiceimpl implements VoterService {

	@Autowired
	private VoteDao voteDao;
	
	@Override
	public void ajouterVote(Vote vote) {
		voteDao.ajouterVote(vote);

	}

	@Override
	public void mettreAJourVote(Vote vote) {
		voteDao.mettreAJourVote(vote);

	}

	@Override
	public Vote selectionnerVote(Vote vote) {
		return voteDao.selectionnerVote(vote);
	}

	@Override
	public List<Vote> selectionnerVotes() {
		return voteDao.selectionnerVotes();
	}

	@Override
	public Vote trouverVote(Integer idVote) {
		return voteDao.trouverVote(idVote);
	}

	@Override
	public void supprimerVote(Vote vote) {
		voteDao.supprimerVote(vote);
	}

	@Override
	public Integer getNbIdeeVote(Integer idIdee) {
		return voteDao.getVoteParIdIdee(idIdee).getIdVote();
	}



}
