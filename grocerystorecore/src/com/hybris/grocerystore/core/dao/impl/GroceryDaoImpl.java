/**
 *
 */
package com.hybris.grocerystore.core.dao.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hybris.grocery.core.model.GroceryStoreProductModel;
import com.hybris.grocerystore.core.dao.GroceryDao;


/**
 *
 */
public class GroceryDaoImpl extends AbstractItemDao implements GroceryDao
{
	final String PRODUCT_QUERY = "SELECT {" + GroceryStoreProductModel.PK + "} FROM {" + GroceryStoreProductModel._TYPECODE
			+ "} WHERE {" + GroceryStoreProductModel.CODE + "} =?code";


	@Override
	public List<GroceryStoreProductModel> getProductDetailsByCode(final String code)
	{
		// XXX Auto-generated method stub
		validateParameterNotNull(code, "Product code must not be null!");
		final Map<String, Object> params = new HashMap<>();
		params.put("Code", code);

		final SearchResult<GroceryStoreProductModel> result = getFlexibleSearchService().search(PRODUCT_QUERY, params);
		if (result.getResult() == null)
		{
			return Collections.emptyList();
		}
		else
		{
			return result.getResult();
		}

	}


}
