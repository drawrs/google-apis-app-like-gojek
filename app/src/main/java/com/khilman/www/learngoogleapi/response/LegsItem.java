package com.khilman.www.learngoogleapi.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class LegsItem{

	@SerializedName("duration")
	private Duration duration;

	@SerializedName("start_location")
	private StartLocation startLocation;

	@SerializedName("distance")
	private Distance distance;

	@SerializedName("start_address")
	private String startAddress;

	@SerializedName("end_location")
	private EndLocation endLocation;

	@SerializedName("end_address")
	private String endAddress;

	@SerializedName("via_waypoint")
	private List<Object> viaWaypoint;

	@SerializedName("steps")
	private List<StepsItem> steps;

	@SerializedName("traffic_speed_entry")
	private List<Object> trafficSpeedEntry;

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

	public void setStartAddress(String startAddress){
		this.startAddress = startAddress;
	}

	public String getStartAddress(){
		return startAddress;
	}

	public void setEndLocation(EndLocation endLocation){
		this.endLocation = endLocation;
	}

	public EndLocation getEndLocation(){
		return endLocation;
	}

	public void setEndAddress(String endAddress){
		this.endAddress = endAddress;
	}

	public String getEndAddress(){
		return endAddress;
	}

	public void setViaWaypoint(List<Object> viaWaypoint){
		this.viaWaypoint = viaWaypoint;
	}

	public List<Object> getViaWaypoint(){
		return viaWaypoint;
	}

	public void setSteps(List<StepsItem> steps){
		this.steps = steps;
	}

	public List<StepsItem> getSteps(){
		return steps;
	}

	public void setTrafficSpeedEntry(List<Object> trafficSpeedEntry){
		this.trafficSpeedEntry = trafficSpeedEntry;
	}

	public List<Object> getTrafficSpeedEntry(){
		return trafficSpeedEntry;
	}

	@Override
 	public String toString(){
		return 
			"LegsItem{" + 
			"duration = '" + duration + '\'' + 
			",start_location = '" + startLocation + '\'' + 
			",distance = '" + distance + '\'' + 
			",start_address = '" + startAddress + '\'' + 
			",end_location = '" + endLocation + '\'' + 
			",end_address = '" + endAddress + '\'' + 
			",via_waypoint = '" + viaWaypoint + '\'' + 
			",steps = '" + steps + '\'' + 
			",traffic_speed_entry = '" + trafficSpeedEntry + '\'' + 
			"}";
		}
}