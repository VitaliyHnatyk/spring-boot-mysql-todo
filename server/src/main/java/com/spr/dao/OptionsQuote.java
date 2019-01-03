package com.spr.dao;

public class OptionsQuote {
	
	String strike;
	String bid;
	String ask;
	String openInterest;
	String volume;

	public String getStrike() {
		return strike;
	}

	public void setStrike(String strike) {
		this.strike = strike;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getAsk() {
		return ask;
	}

	public void setAsk(String ask) {
		this.ask = ask;
	}
	
	public String getOpenInterest() {
		return openInterest;
	}

	public void setOpenInterest(String openInterest) {
		this.openInterest = openInterest;
	}
	
	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}	
	@Override
	public String toString() {
		return "OptionsQuote [strike=" + strike + ", bid=" + bid + ", ask=" + ask +
				", openInterest=" + openInterest + ", volume=" + volume + "]";
	}

}
