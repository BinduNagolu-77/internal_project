/**
 *
 */
package com.hybris.grocerystore.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

/**
 *
 */
public class WeightPlp implements Populator<SearchResultValueData, ProductData>
{

	@Override
	public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException
	{
		// XXX Auto-generated method stub
		final Double weight = (Double) source.getValues().get("weight");
		target.setWeight(weight);

		final String weightUnit = (String) source.getValues().get("weightUnit");
		target.setWeightUnit(weightUnit);

		final String shelfLife = (String) source.getValues().get("shelfLife");
		target.setShelfLife(shelfLife);

		final String brandName = (String) source.getValues().get("brandName");
		target.setBrandName(brandName);

	}

}
