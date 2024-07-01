package com.wheeldeal.entity;

import jakarta.persistence.*;


@Entity

public class CarDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int score;
    private String make;
    private String model;
    private String variant;
    private String mileage;
    private String roundOffMileage;
    private String roundOffMileageNew;
    private int makeYear;
    private double price;
    private double listingPrice;
    private double roundOffListingPrice;
    private double baseListingPrice;
    private double roundOffBaseListingPrice;
    private int totalAddOns;
    private double roundOffTotalAddOnValue;
    private boolean showDiscountedPricing;
    private double listingPriceWithoutTax;
    private double originalPrice;
    private double originalPriceWithoutTax;
    private double discountPrice;
    private double discountPercent;
    private double newDiscountAmount;
    private double newDiscountPercent;
    private double originalBaseListingPrice;
    private double discountedPriceWithoutAddOnAndTax;
    private boolean isManualDiscountChange;
    private boolean isSameListingPriceUpdate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant) {
		this.variant = variant;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getRoundOffMileage() {
		return roundOffMileage;
	}
	public void setRoundOffMileage(String roundOffMileage) {
		this.roundOffMileage = roundOffMileage;
	}
	public String getRoundOffMileageNew() {
		return roundOffMileageNew;
	}
	public void setRoundOffMileageNew(String roundOffMileageNew) {
		this.roundOffMileageNew = roundOffMileageNew;
	}
	public int getMakeYear() {
		return makeYear;
	}
	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getListingPrice() {
		return listingPrice;
	}
	public void setListingPrice(double listingPrice) {
		this.listingPrice = listingPrice;
	}
	public double getRoundOffListingPrice() {
		return roundOffListingPrice;
	}
	public void setRoundOffListingPrice(double roundOffListingPrice) {
		this.roundOffListingPrice = roundOffListingPrice;
	}
	public double getBaseListingPrice() {
		return baseListingPrice;
	}
	public void setBaseListingPrice(double baseListingPrice) {
		this.baseListingPrice = baseListingPrice;
	}
	public double getRoundOffBaseListingPrice() {
		return roundOffBaseListingPrice;
	}
	public void setRoundOffBaseListingPrice(double roundOffBaseListingPrice) {
		this.roundOffBaseListingPrice = roundOffBaseListingPrice;
	}
	public int getTotalAddOns() {
		return totalAddOns;
	}
	public void setTotalAddOns(int totalAddOns) {
		this.totalAddOns = totalAddOns;
	}
	public double getRoundOffTotalAddOnValue() {
		return roundOffTotalAddOnValue;
	}
	public void setRoundOffTotalAddOnValue(double roundOffTotalAddOnValue) {
		this.roundOffTotalAddOnValue = roundOffTotalAddOnValue;
	}
	public boolean isShowDiscountedPricing() {
		return showDiscountedPricing;
	}
	public void setShowDiscountedPricing(boolean showDiscountedPricing) {
		this.showDiscountedPricing = showDiscountedPricing;
	}
	public double getListingPriceWithoutTax() {
		return listingPriceWithoutTax;
	}
	public void setListingPriceWithoutTax(double listingPriceWithoutTax) {
		this.listingPriceWithoutTax = listingPriceWithoutTax;
	}
	public double getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public double getOriginalPriceWithoutTax() {
		return originalPriceWithoutTax;
	}
	public void setOriginalPriceWithoutTax(double originalPriceWithoutTax) {
		this.originalPriceWithoutTax = originalPriceWithoutTax;
	}
	public double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public double getNewDiscountAmount() {
		return newDiscountAmount;
	}
	public void setNewDiscountAmount(double newDiscountAmount) {
		this.newDiscountAmount = newDiscountAmount;
	}
	public double getNewDiscountPercent() {
		return newDiscountPercent;
	}
	public void setNewDiscountPercent(double newDiscountPercent) {
		this.newDiscountPercent = newDiscountPercent;
	}
	public double getOriginalBaseListingPrice() {
		return originalBaseListingPrice;
	}
	public void setOriginalBaseListingPrice(double originalBaseListingPrice) {
		this.originalBaseListingPrice = originalBaseListingPrice;
	}
	public double getDiscountedPriceWithoutAddOnAndTax() {
		return discountedPriceWithoutAddOnAndTax;
	}
	public void setDiscountedPriceWithoutAddOnAndTax(double discountedPriceWithoutAddOnAndTax) {
		this.discountedPriceWithoutAddOnAndTax = discountedPriceWithoutAddOnAndTax;
	}
	public boolean isManualDiscountChange() {
		return isManualDiscountChange;
	}
	public void setManualDiscountChange(boolean isManualDiscountChange) {
		this.isManualDiscountChange = isManualDiscountChange;
	}
	public boolean isSameListingPriceUpdate() {
		return isSameListingPriceUpdate;
	}
	public void setSameListingPriceUpdate(boolean isSameListingPriceUpdate) {
		this.isSameListingPriceUpdate = isSameListingPriceUpdate;
	}
    

}
