/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.grocerystore.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.hybris.grocerystore.fulfilmentprocess.constants.GrocerystoreFulfilmentProcessConstants;

public class GrocerystoreFulfilmentProcessManager extends GeneratedGrocerystoreFulfilmentProcessManager
{
	public static final GrocerystoreFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (GrocerystoreFulfilmentProcessManager) em.getExtension(GrocerystoreFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
