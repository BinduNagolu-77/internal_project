/**
 *
 */
package com.hybris.grocerystore.v2.controller;

import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercewebservicescommons.annotation.SiteChannelRestriction;
import de.hybris.platform.commercewebservicescommons.dto.user.UserWsDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdAndUserIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;


/**
 *
 */
@Controller
@Tag(name = "Grocery User")
@RequestMapping(value = "/{baseSiteId}/groceryuser")
public class GroceryStoreUserController extends BaseCommerceController
{
	private static final Logger LOGGER = Logger.getLogger(GroceryStoreUserController.class);

	@Resource(name = "wsCustomerFacade")
	private CustomerFacade customerFacade;

	@Secured(
	{ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	@ResponseBody
	@SiteChannelRestriction(allowedSiteChannelsProperty = API_COMPATIBILITY_B2C_CHANNELS)
	@Operation(operationId = "getUserData", summary = "Get customer profile", description = "Returns customer profile.")
	@ApiBaseSiteIdAndUserIdParam
	public ResponseEntity<UserWsDTO> getUserData(@ApiFieldsParam
	@RequestParam(defaultValue = "DEFAULT_FIELD_SET")
	final String fields, @PathVariable
	@Parameter(description = "User identifier", required = true)
	final String userId)
	{
		try
		{
			final CustomerData customerData = customerFacade.getUserForUID(userId);
			if (customerData != null)
			{
				final UserWsDTO userWsDTO = new UserWsDTO();
				userWsDTO.setUid(customerData.getUid());
				userWsDTO.setFirstName(customerData.getFirstName());
				userWsDTO.setLastName(customerData.getLastName());

				return ResponseEntity.ok(userWsDTO);
			}
			else
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
		}
		catch (final Exception e)
		{

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
