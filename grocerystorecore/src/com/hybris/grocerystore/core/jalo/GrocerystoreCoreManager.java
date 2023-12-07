/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.grocerystore.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.hybris.grocerystore.core.constants.GrocerystoreCoreConstants;
import com.hybris.grocerystore.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class GrocerystoreCoreManager extends GeneratedGrocerystoreCoreManager
{
	public static final GrocerystoreCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (GrocerystoreCoreManager) em.getExtension(GrocerystoreCoreConstants.EXTENSIONNAME);
	}
}
