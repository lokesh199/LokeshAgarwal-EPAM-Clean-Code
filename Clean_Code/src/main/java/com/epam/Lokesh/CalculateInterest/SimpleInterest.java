package com.epam.Lokesh.CalculateInterest;

public class SimpleInterest
{
	private double initialPrincipalAmount;
	private double annualRateOfInterest;
	private double timeInYears;
	private double simpleInterest;
	
	public SimpleInterest(double initialPrincipalAmount , double annualRateOfInterest , double timeInYears)
	{
		this.initialPrincipalAmount = initialPrincipalAmount;
		this.annualRateOfInterest = annualRateOfInterest;
		this.timeInYears = timeInYears;
	}
	
	public void setValues(double initialPrincipalAmount , double annualRateOfInterest , double timeInYears)
	{
		this.initialPrincipalAmount = initialPrincipalAmount;
		this.annualRateOfInterest = annualRateOfInterest;
		this.timeInYears = timeInYears;
	}
	
	public double calculateSimpleInterest()
	{
		simpleInterest = (initialPrincipalAmount * timeInYears * annualRateOfInterest)/100;
		return simpleInterest;
	}
}