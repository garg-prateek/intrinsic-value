package model;

public class IntrinsicValueOutput {
	double intrinsicValueHigh;
	double intrinsicValueLow;
	double intrinsicValue;
	double conservativeIntrinsicValue;
	public double getIntrinsicValueHigh() {
		return intrinsicValueHigh;
	}
	public void setIntrinsicValueHigh(double intrinsicValueHigh) {
		this.intrinsicValueHigh = intrinsicValueHigh;
	}
	public double getIntrinsicValueLow() {
		return intrinsicValueLow;
	}
	public void setIntrinsicValueLow(double intrinsicValueLow) {
		this.intrinsicValueLow = intrinsicValueLow;
	}
	public double getIntrinsicValue() {
		return intrinsicValue;
	}
	public void setIntrinsicValue(double intrinsicValue) {
		this.intrinsicValue = intrinsicValue;
	}
	public double getConservativeIntrinsicValue() {
		return conservativeIntrinsicValue;
	}
	public void setConservativeIntrinsicValue(double conservativeIntrinsicValue) {
		this.conservativeIntrinsicValue = conservativeIntrinsicValue;
	}
	@Override
	public String toString() {
		return "IntrinsicValueOutput [intrinsicValueHigh=" + intrinsicValueHigh + ", intrinsicValueLow="
				+ intrinsicValueLow + ", intrinsicValue=" + intrinsicValue + ", conservativeIntrinsicValue="
				+ conservativeIntrinsicValue + "]";
	}
}
