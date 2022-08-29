package com.sim.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SimOffers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int offerId;
	private int callQty;
	private int cost;
	private int dataQty;
	private int duration;
	private String  offerName;
	private int simid;
	
	
	public SimOffers(int callQty, int cost, int dataQty, int duration, String offerName, int simid) {
		super();
		
		this.callQty = callQty;
		this.cost = cost;
		this.dataQty = dataQty;
		this.duration = duration;
		this.offerName = offerName;
		this.simid = simid;
	}

	public SimOffers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public int getCallQty() {
		return callQty;
	}

	public void setCallQty(int callQty) {
		this.callQty = callQty;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDataQty() {
		return dataQty;
	}

	public void setDataQty(int dataQty) {
		this.dataQty = dataQty;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public int getSimid() {
		return simid;
	}

	public void setSimid(int simid) {
		this.simid = simid;
	}

	
	
}