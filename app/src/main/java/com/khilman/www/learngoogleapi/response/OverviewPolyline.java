package com.khilman.www.learngoogleapi.response;

import com.google.gson.annotations.SerializedName;

public class OverviewPolyline{

	@SerializedName("points")
	private String points;

	public void setPoints(String points){
		this.points = points;
	}

	public String getPoints(){
		return points;
	}

	@Override
 	public String toString(){
		return 
			"OverviewPolyline{" + 
			"points = '" + points + '\'' + 
			"}";
		}
}

//https://hacktoberfest.digitalocean.com/details
//add this comment for contribute even hacktoberfest, not just add code but can add comment
