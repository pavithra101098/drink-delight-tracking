package com.sprint1.service;

import com.sprint1.util.ProductOrderNotFoundException;
import com.sprint1.util.RawMaterialOrderNotFoundException;
import com.sprint1.model.ProductDetails;
import com.sprint1.model.RawMaterialDetails;

public interface TrackOrderService {
	public RawMaterialDetails trackOrder(String OrderId) throws RawMaterialOrderNotFoundException;

	public ProductDetails ProductOrder(String ProductId) throws ProductOrderNotFoundException;
}
