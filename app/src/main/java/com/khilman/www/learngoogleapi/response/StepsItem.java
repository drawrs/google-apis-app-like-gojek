package com.khilman.www.learngoogleapi.response;

import com.google.gson.annotations.SerializedName;

public class StepsItem{

	@SerializedName("duration")
	private Duration duration;

	@SerializedName("start_location")
	private StartLocation startLocation;

	@SerializedName("distance")
	private Distance distance;

	@SerializedName("travel_mode")
	private String travelMode;

	@SerializedName("html_instructions")
	private String htmlInstructions;

	@SerializedName("end_location")
	private EndLocation endLocation;

	@SerializedName("polyline")
	private Polyline polyline;

	public void setDuration(Duration duration){
		this.duration = duration;
	}

	public Duration getDuration(){
		return duration;
	}

	public void setStartLocation(StartLocation startLocation){
		this.startLocation = startLocation;
	}

	public StartLocation getStartLocation(){
		return startLocation;
	}

	public void setDistance(Distance distance){
		this.distance = distance;
	}

	public Distance getDistance(){
		return distance;
	}

	public void setTravelMode(String travelMode){
		this.travelMode = travelMode;
	}

	public String getTravelMode(){
		return travelMode;
	}

	public void setHtmlInstructions(String htmlInstructions){
		this.htmlInstructions = htmlInstructions;
	}

	public String getHtmlInstructions(){
		return htmlInstructions;
	}

	public void setEndLocation(EndLocation endLocation){
		this.endLocation = endLocation;
	}

	public EndLocation getEndLocation(){
		return endLocation;
	}

	public void setPolyline(Polyline polyline){
		this.polyline = polyline;
	}

	public Polyline getPolyline(){
		return polyline;
	}

	@Override
 	public String toString(){
		return 
			"StepsItem{" + 
			"duration = '" + duration + '\'' + 
			",start_location = '" + startLocation + '\'' + 
			",distance = '" + distance + '\'' + 
			",travel_mode = '" + travelMode + '\'' + 
			",html_instructions = '" + htmlInstructions + '\'' + 
			",end_location = '" + endLocation + '\'' + 
			",polyline = '" + polyline + '\'' + 
			"}";
		}
}