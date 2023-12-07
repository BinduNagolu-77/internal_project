/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.grocerystore.formatters.impl;

import com.hybris.grocerystore.formatters.WsDateFormatter;

import java.util.Date;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;


public class DefaultWsDateFormatter implements WsDateFormatter
{
	private final DateTimeFormatter parser = ISODateTimeFormat.dateTimeNoMillis();

	@Override
	public Date toDate(final String timestamp)
	{
		return parser.parseDateTime(timestamp).toDate();
	}

	@Override
	public String toString(final Date date)
	{
		return parser.print(date.getTime());
	}

}
