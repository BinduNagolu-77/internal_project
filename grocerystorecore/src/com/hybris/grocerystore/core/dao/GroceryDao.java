/**
 *
 */
package com.hybris.grocerystore.core.dao;

import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;

import com.hybris.grocery.core.model.GroceryStoreProductModel;


/**
 *
 */
public interface GroceryDao extends Dao
{
	List<GroceryStoreProductModel> getProductDetailsByCode(String code);

}
