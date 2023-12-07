/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 17-Nov-2023, 11:34:49 am                    ---
 * ----------------------------------------------------------------
 */
package com.hybris.grocery.core.jalo;

import com.hybris.grocerystore.core.constants.GrocerystoreCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.hybris.grocery.core.jalo.GroceryStoreProduct GroceryStoreProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedGroceryStoreProduct extends Product
{
	/** Qualifier of the <code>GroceryStoreProduct.countryOrigin</code> attribute **/
	public static final String COUNTRYORIGIN = "countryOrigin";
	/** Qualifier of the <code>GroceryStoreProduct.weight</code> attribute **/
	public static final String WEIGHT = "weight";
	/** Qualifier of the <code>GroceryStoreProduct.weightUnit</code> attribute **/
	public static final String WEIGHTUNIT = "weightUnit";
	/** Qualifier of the <code>GroceryStoreProduct.shelfLife</code> attribute **/
	public static final String SHELFLIFE = "shelfLife";
	/** Qualifier of the <code>GroceryStoreProduct.brandName</code> attribute **/
	public static final String BRANDNAME = "brandName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COUNTRYORIGIN, AttributeMode.INITIAL);
		tmp.put(WEIGHT, AttributeMode.INITIAL);
		tmp.put(WEIGHTUNIT, AttributeMode.INITIAL);
		tmp.put(SHELFLIFE, AttributeMode.INITIAL);
		tmp.put(BRANDNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.brandName</code> attribute.
	 * @return the brandName - Brand Name for Grocery Products
	 */
	public String getBrandName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGroceryStoreProduct.getBrandName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, BRANDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.brandName</code> attribute.
	 * @return the brandName - Brand Name for Grocery Products
	 */
	public String getBrandName()
	{
		return getBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.brandName</code> attribute. 
	 * @return the localized brandName - Brand Name for Grocery Products
	 */
	public Map<Language,String> getAllBrandName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,BRANDNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.brandName</code> attribute. 
	 * @return the localized brandName - Brand Name for Grocery Products
	 */
	public Map<Language,String> getAllBrandName()
	{
		return getAllBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.brandName</code> attribute. 
	 * @param value the brandName - Brand Name for Grocery Products
	 */
	public void setBrandName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGroceryStoreProduct.setBrandName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, BRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.brandName</code> attribute. 
	 * @param value the brandName - Brand Name for Grocery Products
	 */
	public void setBrandName(final String value)
	{
		setBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.brandName</code> attribute. 
	 * @param value the brandName - Brand Name for Grocery Products
	 */
	public void setAllBrandName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,BRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.brandName</code> attribute. 
	 * @param value the brandName - Brand Name for Grocery Products
	 */
	public void setAllBrandName(final Map<Language,String> value)
	{
		setAllBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.countryOrigin</code> attribute.
	 * @return the countryOrigin - Country of Origin for Grocery Products
	 */
	public String getCountryOrigin(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGroceryStoreProduct.getCountryOrigin requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, COUNTRYORIGIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.countryOrigin</code> attribute.
	 * @return the countryOrigin - Country of Origin for Grocery Products
	 */
	public String getCountryOrigin()
	{
		return getCountryOrigin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.countryOrigin</code> attribute. 
	 * @return the localized countryOrigin - Country of Origin for Grocery Products
	 */
	public Map<Language,String> getAllCountryOrigin(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,COUNTRYORIGIN,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.countryOrigin</code> attribute. 
	 * @return the localized countryOrigin - Country of Origin for Grocery Products
	 */
	public Map<Language,String> getAllCountryOrigin()
	{
		return getAllCountryOrigin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.countryOrigin</code> attribute. 
	 * @param value the countryOrigin - Country of Origin for Grocery Products
	 */
	public void setCountryOrigin(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGroceryStoreProduct.setCountryOrigin requires a session language", 0 );
		}
		setLocalizedProperty(ctx, COUNTRYORIGIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.countryOrigin</code> attribute. 
	 * @param value the countryOrigin - Country of Origin for Grocery Products
	 */
	public void setCountryOrigin(final String value)
	{
		setCountryOrigin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.countryOrigin</code> attribute. 
	 * @param value the countryOrigin - Country of Origin for Grocery Products
	 */
	public void setAllCountryOrigin(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,COUNTRYORIGIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.countryOrigin</code> attribute. 
	 * @param value the countryOrigin - Country of Origin for Grocery Products
	 */
	public void setAllCountryOrigin(final Map<Language,String> value)
	{
		setAllCountryOrigin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.shelfLife</code> attribute.
	 * @return the shelfLife - Calories for Grocery Products
	 */
	public String getShelfLife(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGroceryStoreProduct.getShelfLife requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SHELFLIFE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.shelfLife</code> attribute.
	 * @return the shelfLife - Calories for Grocery Products
	 */
	public String getShelfLife()
	{
		return getShelfLife( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.shelfLife</code> attribute. 
	 * @return the localized shelfLife - Calories for Grocery Products
	 */
	public Map<Language,String> getAllShelfLife(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SHELFLIFE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.shelfLife</code> attribute. 
	 * @return the localized shelfLife - Calories for Grocery Products
	 */
	public Map<Language,String> getAllShelfLife()
	{
		return getAllShelfLife( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.shelfLife</code> attribute. 
	 * @param value the shelfLife - Calories for Grocery Products
	 */
	public void setShelfLife(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGroceryStoreProduct.setShelfLife requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SHELFLIFE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.shelfLife</code> attribute. 
	 * @param value the shelfLife - Calories for Grocery Products
	 */
	public void setShelfLife(final String value)
	{
		setShelfLife( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.shelfLife</code> attribute. 
	 * @param value the shelfLife - Calories for Grocery Products
	 */
	public void setAllShelfLife(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SHELFLIFE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.shelfLife</code> attribute. 
	 * @param value the shelfLife - Calories for Grocery Products
	 */
	public void setAllShelfLife(final Map<Language,String> value)
	{
		setAllShelfLife( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.weight</code> attribute.
	 * @return the weight - Weight for Grocery Products
	 */
	public Double getWeight(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGroceryStoreProduct.getWeight requires a session language", 0 );
		}
		return (Double)getLocalizedProperty( ctx, WEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.weight</code> attribute.
	 * @return the weight - Weight for Grocery Products
	 */
	public Double getWeight()
	{
		return getWeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.weight</code> attribute. 
	 * @return the weight - Weight for Grocery Products
	 */
	public double getWeightAsPrimitive(final SessionContext ctx)
	{
		Double value = getWeight( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.weight</code> attribute. 
	 * @return the weight - Weight for Grocery Products
	 */
	public double getWeightAsPrimitive()
	{
		return getWeightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.weight</code> attribute. 
	 * @return the localized weight - Weight for Grocery Products
	 */
	public Map<Language,Double> getAllWeight(final SessionContext ctx)
	{
		return (Map<Language,Double>)getAllLocalizedProperties(ctx,WEIGHT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.weight</code> attribute. 
	 * @return the localized weight - Weight for Grocery Products
	 */
	public Map<Language,Double> getAllWeight()
	{
		return getAllWeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.weight</code> attribute. 
	 * @param value the weight - Weight for Grocery Products
	 */
	public void setWeight(final SessionContext ctx, final Double value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGroceryStoreProduct.setWeight requires a session language", 0 );
		}
		setLocalizedProperty(ctx, WEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.weight</code> attribute. 
	 * @param value the weight - Weight for Grocery Products
	 */
	public void setWeight(final Double value)
	{
		setWeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.weight</code> attribute. 
	 * @param value the weight - Weight for Grocery Products
	 */
	public void setWeight(final SessionContext ctx, final double value)
	{
		setWeight( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.weight</code> attribute. 
	 * @param value the weight - Weight for Grocery Products
	 */
	public void setWeight(final double value)
	{
		setWeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.weight</code> attribute. 
	 * @param value the weight - Weight for Grocery Products
	 */
	public void setAllWeight(final SessionContext ctx, final Map<Language,Double> value)
	{
		setAllLocalizedProperties(ctx,WEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.weight</code> attribute. 
	 * @param value the weight - Weight for Grocery Products
	 */
	public void setAllWeight(final Map<Language,Double> value)
	{
		setAllWeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.weightUnit</code> attribute.
	 * @return the weightUnit - Weight for Grocery Products
	 */
	public String getWeightUnit(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGroceryStoreProduct.getWeightUnit requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, WEIGHTUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.weightUnit</code> attribute.
	 * @return the weightUnit - Weight for Grocery Products
	 */
	public String getWeightUnit()
	{
		return getWeightUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.weightUnit</code> attribute. 
	 * @return the localized weightUnit - Weight for Grocery Products
	 */
	public Map<Language,String> getAllWeightUnit(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,WEIGHTUNIT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroceryStoreProduct.weightUnit</code> attribute. 
	 * @return the localized weightUnit - Weight for Grocery Products
	 */
	public Map<Language,String> getAllWeightUnit()
	{
		return getAllWeightUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.weightUnit</code> attribute. 
	 * @param value the weightUnit - Weight for Grocery Products
	 */
	public void setWeightUnit(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGroceryStoreProduct.setWeightUnit requires a session language", 0 );
		}
		setLocalizedProperty(ctx, WEIGHTUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.weightUnit</code> attribute. 
	 * @param value the weightUnit - Weight for Grocery Products
	 */
	public void setWeightUnit(final String value)
	{
		setWeightUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.weightUnit</code> attribute. 
	 * @param value the weightUnit - Weight for Grocery Products
	 */
	public void setAllWeightUnit(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,WEIGHTUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroceryStoreProduct.weightUnit</code> attribute. 
	 * @param value the weightUnit - Weight for Grocery Products
	 */
	public void setAllWeightUnit(final Map<Language,String> value)
	{
		setAllWeightUnit( getSession().getSessionContext(), value );
	}
	
}
