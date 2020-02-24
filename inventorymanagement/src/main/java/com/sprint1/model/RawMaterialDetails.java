package com.sprint1.model;
import java.util.Date;

//import com.capg.sprint1.model.RawMaterialOrder;
public class RawMaterialDetails {
String orderId;
String name;
//String supplierId;
double quantityValue;
String quantityUnit;
Date dateOfOrder;
Date dateOfDelivery;
double pricePerUnit;
double totalPrice;
//String deliveryStatus;
String wareouseId;

public RawMaterialDetails() {

}

public RawMaterialDetails(String orderId, String name, double quantityValue, String quantityUnit,
Date dateOfOrder, Date dateOfDelivery, double pricePerUnit, double totalPrice,String wareouseId) {
super();
this.orderId = orderId;
this.name = name;
//this.supplierId = supplierId;
this.quantityValue = quantityValue;
this.quantityUnit = quantityUnit;
this.dateOfOrder = dateOfOrder;
this.dateOfDelivery = dateOfDelivery;
this.pricePerUnit = pricePerUnit;
this.totalPrice = totalPrice;
//this.deliveryStatus = deliveryStatus;
this.wareouseId = wareouseId;
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

/*
* public String getSupplierId() { return supplierId; }
*
* public void setSupplierId(String supplierId) { this.supplierId = supplierId;
* }
*/

public double getQuantityValue() {
return quantityValue;
}

public void setQuantityValue(double quantityValue) {
this.quantityValue = quantityValue;
}

public String getQuantityUnit() {
return quantityUnit;
}

public void setQuantityUnit(String quantityUnit) {
this.quantityUnit = quantityUnit;
}

public Date getDateOfOrder() {
return dateOfOrder;
}

public void setDateOfOrder(Date dateOfOrder) {
this.dateOfOrder = dateOfOrder;
}

public Date getDateOfDelivery() {
return dateOfDelivery;
}

public void setDateOfDelivery(Date dateOfDelivery) {
this.dateOfDelivery = dateOfDelivery;
}

public double getPricePerUnit() {
return pricePerUnit;
}

public void setPricePerUnit(double pricePerUnit) {
this.pricePerUnit = pricePerUnit;
}

public double getTotalPrice() {
return totalPrice;
}

public void setTotalPrice(double totalPrice) {
this.totalPrice = totalPrice;
}

/*
* public String getDeliveryStatus() { return deliveryStatus; }
*
* public void setDeliveryStatus(String deliveryStatus) { this.deliveryStatus =
* deliveryStatus; }
*/

public String getWareouseId() {
return wareouseId;
}

public void setWareouseId(String wareouseId) {
this.wareouseId = wareouseId;
}


@Override
public int hashCode() {
final int prime = 31;
int result = 1;
result = prime * result + ((dateOfDelivery == null) ? 0 : dateOfDelivery.hashCode());
result = prime * result + ((dateOfOrder == null) ? 0 : dateOfOrder.hashCode());
//result = prime * result + ((deliveryStatus == null) ? 0 : deliveryStatus.hashCode());
result = prime * result + ((name == null) ? 0 : name.hashCode());
result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
long temp;
temp = Double.doubleToLongBits(pricePerUnit);
result = prime * result + (int) (temp ^ (temp >>> 32));
result = prime * result + ((quantityUnit == null) ? 0 : quantityUnit.hashCode());
temp = Double.doubleToLongBits(quantityValue);
result = prime * result + (int) (temp ^ (temp >>> 32));
//result = prime * result + ((supplierId == null) ? 0 : supplierId.hashCode());
temp = Double.doubleToLongBits(totalPrice);
result = prime * result + (int) (temp ^ (temp >>> 32));
result = prime * result + ((wareouseId == null) ? 0 : wareouseId.hashCode());
return result;
}

@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
RawMaterialDetails other = (RawMaterialDetails) obj;
if (dateOfDelivery == null) {
if (other.dateOfDelivery != null)
return false;
} else if (!dateOfDelivery.equals(other.dateOfDelivery))
return false;
if (dateOfOrder == null) {
if (other.dateOfOrder != null)
return false;
} else if (!dateOfOrder.equals(other.dateOfOrder))
return false;
/*
* if (deliveryStatus == null) { if (other.deliveryStatus != null)
*/
/*
* return false; } else if (!deliveryStatus.equals(other.deliveryStatus)) return
* false;
*/
if (name == null) {
if (other.name != null)
return false;
} else if (!name.equals(other.name))
return false;
if (orderId == null) {
if (other.orderId != null)
return false;
} else if (!orderId.equals(other.orderId))
return false;
if (Double.doubleToLongBits(pricePerUnit) != Double.doubleToLongBits(other.pricePerUnit))
return false;
if (quantityUnit == null) {
if (other.quantityUnit != null)
return false;
} else if (!quantityUnit.equals(other.quantityUnit))
return false;
if (Double.doubleToLongBits(quantityValue) != Double.doubleToLongBits(other.quantityValue))
return false;
/*
* if (supplierId == null) { if (other.supplierId != null) return false; } else
* if (!supplierId.equals(other.supplierId)) return false;
*/
if (Double.doubleToLongBits(totalPrice) != Double.doubleToLongBits(other.totalPrice))
return false;
if (wareouseId == null) {
if (other.wareouseId != null)
return false;
} else if (!wareouseId.equals(other.wareouseId))
return false;
return true;
}

@Override
public String toString() {
return "RawMaterialOrder OrderId=" + orderId + "\n" + " Name=" + name+"\n" +
"QuantityValue=" + quantityValue + "\n" +
" QuantityUnit=" + quantityUnit + "\n"+""+ "DateOfOrder=" + dateOfOrder+"\n"+
" DateOfDelivery=" + dateOfDelivery + "\n" +""
+ " PricePerUnit=" + pricePerUnit + "\n"+"TotalPrice=" + totalPrice
+ "\n"+" WareouseId=" + wareouseId ;
}
}


