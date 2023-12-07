/**
 *
 */
package com.hybris.grocerystore.core.service;

import java.util.List;

import javax.annotation.Resource;

import com.hybris.grocery.core.model.GroceryStoreProductModel;
import com.hybris.grocerystore.core.dao.GroceryDao;


/**
 *
 */
public class GroceryService
{
	@Resource
	private GroceryDao groceryDao;

	public List<GroceryStoreProductModel> getProductDetails(final String code)
	{
		final List<GroceryStoreProductModel> productModels = groceryDao.getProductDetailsByCode(code);
		return productModels;
	}

}
