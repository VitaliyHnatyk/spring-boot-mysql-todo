package com.spr.dao;

public class StockQuote {
	
	String open;
	String high;
	String low;
	String close;
	String volume;

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}
	
	public String getClose() {
		return close;
	}

	public void setClose(String close) {
		this.close = close;
	}
	
	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}	
	
	@Override
	public String toString() {
		return "StockQuote [open=" + open + ", high=" + high + ", low=" + low +
				", close=" + close + ", volume=" + volume + "]";
	}

}