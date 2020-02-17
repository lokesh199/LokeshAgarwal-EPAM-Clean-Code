package com.epam.Lokesh.ConstructionCost;

import java.util.HashMap;
import java.util.Map;

public class HouseConstructionCost extends SiteDimensions
{
	int costPerSquareFeet;
	Map<String , Integer> constructionPlans;
	public HouseConstructionCost() 
	{
		constructionPlans = new HashMap<String,Integer>();
		constructionPlans.put("Standard", 1200);
		constructionPlans.put("Above Standard", 1500);
		constructionPlans.put("High Standard", 1800);
		constructionPlans.put("High Standard And Fully Automated", 2500);
	}
	
	public void selectPlan(String selectedPlan) 
	{
		this.costPerSquareFeet = constructionPlans.get(selectedPlan);
	}
	
	public void setDimensionsOfHouse(int length, int breadth) 
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public Map<String, Integer> getConstructionPlans() {
		return this.constructionPlans;
	}
	
	public int getEstimatedCost() {
		return (this.length * this.breadth * this.costPerSquareFeet);
	}
}