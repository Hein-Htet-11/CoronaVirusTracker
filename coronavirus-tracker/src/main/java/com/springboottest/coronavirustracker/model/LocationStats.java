package com.springboottest.coronavirustracker.model;

public class LocationStats {
	
	private String state;
	private String country;
	private int latestCasesReported;
	private int diffFromPrevDay;
	
	
	
	public int getDiffFromPrevDay() {
		return diffFromPrevDay;
	}
	public void setDiffFromPrevDay(int diffFromPrevDay) {
		this.diffFromPrevDay = diffFromPrevDay;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestCasesReported() {
		return latestCasesReported;
	}
	public void setLatestCasesReported(int latestCasesReported) {
		this.latestCasesReported = latestCasesReported;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestCasesReported=" + latestCasesReported
				+ "]";
	}
	
	
	

}
