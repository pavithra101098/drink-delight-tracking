package com.sprint1.service;

import java.util.*;
import java.util.Map;
import com.sprint1.util.ProductOrderNotFoundException;
import com.sprint1.util.RawMaterialOrderNotFoundException;
import com.sprint1.dao.TrackOrderDaoImpl;
import com.sprint1.model.ProductDetails;
import com.sprint1.model.RawMaterialDetails;

public class TrackOrderServiceImpl implements TrackOrderService {// 4
	TrackOrderDaoImpl trackDaoImplObj = new TrackOrderDaoImpl();// 5

	public RawMaterialDetails trackOrder(String OrderId) throws RawMaterialOrderNotFoundException {
		RawMaterialDetails rawmaterialdetails = trackDaoImplObj.trackOrder(OrderId);
		if (rawmaterialdetails == null) {
			throw new RawMaterialOrderNotFoundException(" OrderId must lies in Between 0 and 1. Hence no order exists with order Id : " + OrderId);
		}
		return rawmaterialdetails;
	}

	public ProductDetails ProductOrder(String ProductId) throws ProductOrderNotFoundException {
		ProductDetails productdetails = trackDaoImplObj.trackProductOrder(ProductId);
		if (productdetails == null) {
			throw new ProductOrderNotFoundException("  OrderId must lies in Between 0 and 1. Hence No Order Exists with Order Id : " + ProductId);
		}
		return productdetails;
	}

}
