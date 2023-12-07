package com.hybris.grocerystore.facades.grocery.impl;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import com.hybris.grocery.core.model.GroceryStoreProductModel;
import com.hybris.grocerystore.core.service.GroceryService;
import com.hybris.grocerystore.facades.grocery.GroceryFacade;


/**
 *
 */
public class GroceryFacadeImpl implements GroceryFacade
{

	private GroceryService groceryService;
	private Converter<GroceryStoreProductModel, ProductData> productConverter;

	@Override
	public List<ProductData> getProductDetails(final String code)
	{
		// XXX Auto-generated method stub
		final List<GroceryStoreProductModel> groceryModels = groceryService.getProductDetails(code);

		return Converters.convertAll(groceryModels, getProductConverter());
	}

	/**
	 * @return the groceryService
	 */
	public GroceryService getGroceryService()
	{
		return groceryService;
	}

	/**
	 * @param groceryService
	 *                          the groceryService to set
	 */
	public void setGroceryService(final GroceryService groceryService)
	{
		this.groceryService = groceryService;
	}

	/**
	 * @return the productConverter
	 */
	public Converter<GroceryStoreProductModel, ProductData> getProductConverter()
	{
		return productConverter;
	}

	/**
	 * @param productConverter
	 *                            the productConverter to set
	 */
	public void setProductConverter(final Converter<GroceryStoreProductModel, ProductData> productConverter)
	{
		this.productConverter = productConverter;
	}




}
