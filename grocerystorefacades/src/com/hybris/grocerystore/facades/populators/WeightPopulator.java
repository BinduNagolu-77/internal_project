package com.hybris.grocerystore.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.hybris.grocery.core.model.GroceryStoreProductModel;


public class WeightPopulator implements Populator<GroceryStoreProductModel, ProductData>
{


	@Override
	public void populate(final GroceryStoreProductModel source, final ProductData target) throws ConversionException
	{
		// XXX Auto-generated method stub
		target.setWeight(source.getWeight());
		target.setWeightUnit(source.getWeightUnit());
		target.setCountryOrigin(source.getCountryOrigin());
		target.setShelfLife(source.getShelfLife());
		target.setBrandName(source.getBrandName());

	}
}


