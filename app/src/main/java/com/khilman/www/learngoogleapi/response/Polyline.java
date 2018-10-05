package com.khilman.www.learngoogleapi.response;

import com.google.gson.annotations.SerializedName;

public class Polyline{

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
			"Polyline{" + 
			"points = '" + points + '\'' + 
			"}";
		}
}

//https://hacktoberfest.digitalocean.com/details
// want to add something but i dont know want to add what
// so just comment ya
