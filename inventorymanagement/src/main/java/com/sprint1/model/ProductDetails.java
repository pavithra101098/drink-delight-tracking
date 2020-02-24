package com.sprint1.model;
import java.util.Date;
public class ProductDetails {
String orderId;
String name;
double pricePerUnit;
double quantityValue;
double quantityUnit;
double price;
String wareouseId;
Date deliveryDate;
Date manufacturinDate;
Date expiryDate;
String qualityCeck;
Date processDate;

public ProductDetails() {
super();
}

public ProductDetails(String orderId,String name, double pricePerUnit, double quantityValue, double quantityUnit, double price,
String wareouseId, Date deliveryDate,Date manufacturingDate,Date expiryDate, Date processDate,String qualityCeck) {
super();
this.orderId =orderId;
this.name = name;
this.pricePerUnit = pricePerUnit;
this.quantityValue = quantityValue;
this.quantityUnit = quantityUnit;
this.price = price;
this.wareouseId = wareouseId;
this.deliveryDate = deliveryDate;
this.manufacturinDate = manufacturinDate;
this.expiryDate = expiryDate;
this.qualityCeck = qualityCeck;
this.processDate = processDate;
}

public String getOrderId() {
return orderId;
}

public void setOrderId(String orderId) {
this.orderId = orderId;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public double getPricePerUnit() {
return pricePerUnit;
}

public void setPricePerUnit(double pricePerUnit) {
this.pricePerUnit = pricePerUnit;
}

public double getQuantityValue() {
return quantityValue;
}

public void setQuantityValue(double quantityValue) {
this.quantityValue = quantityValue;
}

public double getQuantityUnit() {
return quantityUnit;
}

public void setQuantityUnit(double quantityUnit) {
this.quantityUnit = quantityUnit;
}

public double getPrice() {
return price;
}

public void setPrice(double price) {
this.price = price;
}

public String getWareouseId() {
return wareouseId;
}

public void setWareouseId(String wareouseId) {
this.wareouseId = wareouseId;
}


 public Date getDeliveryDate() { return deliveryDate; }
 
 public void setDeliveryDate(Date deliveryDate) { this.deliveryDate =
 deliveryDate; }



 public Date getManufacturinDate() { return manufacturinDate; }
 
 public void setManufacturinDate(Date manufacturinDate) {
 this.manufacturinDate = manufacturinDate; }



 public Date getExpiryDate() { return expiryDate; }
 
 public void setExpiryDate(Date expiryDate) { this.expiryDate = expiryDate; }


public String getQualityCeck() {
return qualityCeck;
}

public void setQualityCeck(String qualityCeck) {
this.qualityCeck = qualityCeck;
}


 public Date getProcessDate() { return processDate; }
 
 public void setProcessDate(Date processDate) { this.processDate =
 processDate; }


@Override
public String toString() {
return "ProductOrder orderId=" + orderId + "\n"+" name=" + name + "\n"+" pricePerUnit=" + pricePerUnit
+ "\n"+" quantityValue=" + quantityValue + "\n"+" quantityUnit=" + quantityUnit + "\n"+" price=" + price
+ "\n"+" wareouseId=" + wareouseId + "\n"+" deliveryDate=" + deliveryDate + "\n"+" manufacturinDate="
+ manufacturinDate + "\n"+"  qualityCeck=" + qualityCeck + "\n"+" processDate="
+ processDate ;
}



}



