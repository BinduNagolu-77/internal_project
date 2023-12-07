/**
 *
 */
package com.hybris.grocerystore.storefront.controllers.pages.checkout.steps;

import de.hybris.platform.acceleratorstorefrontcommons.annotations.PreValidateCheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.PreValidateQuoteCheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;
import de.hybris.platform.acceleratorstorefrontcommons.checkout.steps.CheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.checkout.steps.AbstractCheckoutStepController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hybris.grocerystore.storefront.controllers.ControllerConstants;


/**
 *
 */
@Controller
@RequestMapping(value = "/checkout/multi/custom-method")
public class CustomMethodCheckoutStepController extends AbstractCheckoutStepController
{
	private static final String CUSTOM_METHOD = "custom-method";

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	@Override
	@RequireHardLogIn
	@PreValidateQuoteCheckoutStep
	@PreValidateCheckoutStep(checkoutStep = CUSTOM_METHOD)
	public String enterStep(final Model model, final RedirectAttributes redirectAttributes)
			throws CMSItemNotFoundException, CommerceCartModificationException
	{
		// XXX Auto-generated method stub
		final CartData cartData = getCheckoutFacade().getCheckoutCart();
		model.addAttribute("cartData", cartData);
		this.prepareDataForPage(model);

		final ContentPageModel multiCheckoutSummaryPage = getContentPageForLabelOrId(MULTI_CHECKOUT_SUMMARY_CMS_PAGE_LABEL);
		storeCmsPageInModel(model, multiCheckoutSummaryPage);
		setUpMetaDataForContentPage(model, multiCheckoutSummaryPage);
		model.addAttribute(WebConstants.BREADCRUMBS_KEY,
				getResourceBreadcrumbBuilder().getBreadcrumbs("checkout.multi.customMethod.breadcrumb"));
		model.addAttribute("metaRobots", "noindex,nofollow");
		setCheckoutStepLinksForModel(model, getCheckoutStep());

		return ControllerConstants.Views.Pages.MultiStepCheckout.ViewCustomMethodPage;
	}

	@RequestMapping(value = "/back", method = RequestMethod.GET)
	@RequireHardLogIn
	@Override
	public String back(final RedirectAttributes redirectAttributes)
	{
		return getCheckoutStep().previousStep();
	}

	@RequestMapping(value = "/next", method = RequestMethod.GET)
	@RequireHardLogIn
	@Override
	public String next(final RedirectAttributes redirectAttributes)
	{
		return getCheckoutStep().nextStep();
	}

	protected CheckoutStep getCheckoutStep()
	{
		return getCheckoutStep(CUSTOM_METHOD);
	}



}
