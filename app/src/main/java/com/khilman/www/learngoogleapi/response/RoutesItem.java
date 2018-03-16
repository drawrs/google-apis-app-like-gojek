package com.khilman.www.learngoogleapi.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class RoutesItem{

	@SerializedName("summary")
	private String summary;

	@SerializedName("copyrights")
	private String copyrights;

	@SerializedName("legs")
	private List<LegsItem> legs;

	@SerializedName("warnings")
	private List<Object> warnings;

	@SerializedName("bounds")
	private Bounds bounds;

	@SerializedName("overview_polyline")
	private OverviewPolyline overviewPolyline;

	@SerializedName("waypoint_order")
	private List<Object> waypointOrder;

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setCopyrights(String copyrights){
		this.copyrights = copyrights;
	}

	public String getCopyrights(){
		return copyrights;
	}

	public void setLegs(List<LegsItem> legs){
		this.legs = legs;
	}

	public List<LegsItem> getLegs(){
		return legs;
	}

	public void setWarnings(List<Object> warnings){
		this.warnings = warnings;
	}

	public List<Object> getWarnings(){
		return warnings;
	}

	public void setBounds(Bounds bounds){
		this.bounds = bounds;
	}

	public Bounds getBounds(){
		return bounds;
	}

	public void setOverviewPolyline(OverviewPolyline overviewPolyline){
		this.overviewPolyline = overviewPolyline;
	}

	public OverviewPolyline getOverviewPolyline(){
		return overviewPolyline;
	}

	public void setWaypointOrder(List<Object> waypointOrder){
		this.waypointOrder = waypointOrder;
	}

	public List<Object> getWaypointOrder(){
		return waypointOrder;
	}

	@Override
 	public String toString(){
		return 
			"RoutesItem{" + 
			"summary = '" + summary + '\'' + 
			",copyrights = '" + copyrights + '\'' + 
			",legs = '" + legs + '\'' + 
			",warnings = '" + warnings + '\'' + 
			",bounds = '" + bounds + '\'' + 
			",overview_polyline = '" + overviewPolyline + '\'' + 
			",waypoint_order = '" + waypointOrder + '\'' + 
			"}";
		}
}