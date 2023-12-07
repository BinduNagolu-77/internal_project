/**
 *
 */
package com.hybris.grocerystore.v2.controller;

import de.hybris.platform.commercewebservicescommons.dto.product.GroceryProductDataListWsDTO;
import de.hybris.platform.webservicescommons.cache.CacheControl;
import de.hybris.platform.webservicescommons.cache.CacheControlDirective;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hybris.grocerystore.facades.grocery.GroceryFacade;
import com.hybris.grocerystore.product.data.ProductDataList;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;


/**
*
*/
@Controller
@Tag(name = "Grocery Product")
@RequestMapping(value = "/{baseSiteId}/groceryproduct")
public class GroceryProductController extends BaseController
{
	private static final Logger LOGGER = Logger.getLogger(GroceryProductController.class);

	@Resource(name = "groceryFacade")
	private GroceryFacade groceryFacade;

	@RequestMapping(value = "/{productCode}", method = RequestMethod.GET)
	@CacheControl(directive = CacheControlDirective.PRIVATE, maxAge = 120)
	@Cacheable(value = "productCache", key = "T(de.hybris.platform.commercewebservicescommons.cache.CommerceCacheKeyGenerator).generateKey(true,true,#productCode,#fields)")
	@ResponseBody
	@Operation(operationId = "getGroceryDetails", summary = "Get product details.", description = "Returns details of a single product according to a product code.")
	@ApiBaseSiteIdParam
	public GroceryProductDataListWsDTO getGroceryDeatils(@Parameter(description = "grocery product code", required = true)
	@PathVariable
	final String productCode, @ApiFieldsParam
	@RequestParam(defaultValue = DEFAULT_FIELD_SET)
	final String fields)
	{
		LOGGER.info("Grocery Product Code ==" + productCode);
		final ProductDataList productDataList = new ProductDataList();
		productDataList.setProduct(groceryFacade.getProductDetails(productCode));
		return getDataMapper().map(productDataList, GroceryProductDataListWsDTO.class, fields);


	}
}


