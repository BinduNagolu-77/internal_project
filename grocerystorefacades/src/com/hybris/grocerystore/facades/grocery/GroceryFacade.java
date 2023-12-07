package com.hybris.grocerystore.facades.grocery;

import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;


/**
 *
 */
public interface GroceryFacade
{
	public List<ProductData> getProductDetails(String code);

}
