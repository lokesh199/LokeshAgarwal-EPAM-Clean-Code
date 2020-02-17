package com.epam.Lokesh.CalculateInterest;
import java.lang.Math;
public class CompoundInterest
{
	private double initialPrincipalAmount;
	private double annualRateOfInterest;
	private double timeInYears;
	private int compoundingFrequencyPerYear;
	private double compoundInterest;
	
	public CompoundInterest(double initialPrincipalAmount , double annualRateOfInterest , double timeInYears, int compoundingFrequencyPerYear)
	{
		this.initialPrincipalAmount = initialPrincipalAmount;
		this.annualRateOfInterest = annualRateOfInterest;
		this.timeInYears = timeInYears;
		this.compoundingFrequencyPerYear = compoundingFrequencyPerYear;
	}
	
	public void setValues(double initialPrincipalAmount , double annualRateOfInterest , double timeInYears , int compoundingFrequencyPerYear)
	{
		this.initialPrincipalAmount = initialPrincipalAmount;
		this.annualRateOfInterest = annualRateOfInterest;
		this.timeInYears = timeInYears;
		this.compoundingFrequencyPerYear = compoundingFrequencyPerYear;
	}
	
	public double calculateCompoundInterest()
	{
		compoundInterest = (initialPrincipalAmount * Math.pow(1 + annualRateOfInterest / (compoundingFrequencyPerYear*100) , (timeInYears * compoundingFrequencyPerYear))) - initialPrincipalAmount;
		return compoundInterest;
	}
}