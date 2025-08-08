package com.webage.domain.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.webage.domain.Money;

public class MoneyTest {

	@Test
	public void testCompareTo() {
		Money ten = new Money(10, 0, "USD");
		Money hundred = new Money(100, 0, "USD");
		assertTrue(ten.compareTo(hundred) < 0);
	}

	@Test
	public void testEqualsObject() {
		Money money = new Money(100, 0, "CAD");
		Money other = new Money(100, 0, "CAD");
		assertTrue("The objects should be equal", money.equals(other));
	}

	@Test
	public void testToString() {
		assertEquals("CAD 7.32", new Money(7, 32, "CAD").toString());
	}

	@Test
	public void testToString_SingleDigitCents() {
		assertEquals("CAD 7.02", new Money(7, 2, "CAD").toString());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCompareTo_DifferentCurrencies() {
		Money american = new Money(100, 0, "USD");
		Money euros = new Money(100, 0, "EUR");
		american.compareTo(euros);
	}
}
