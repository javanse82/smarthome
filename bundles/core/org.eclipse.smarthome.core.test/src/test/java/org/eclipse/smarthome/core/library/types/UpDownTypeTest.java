/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.library.types;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Simon Kaufmann - Initial contribution and API
 * @author Stefan Triller - more tests for type conversions
 */
public class UpDownTypeTest {

    @Test
    public void testConversionToPercentType() {
        assertEquals(PercentType.ZERO, UpDownType.UP.as(PercentType.class));
        assertEquals(PercentType.HUNDRED, UpDownType.DOWN.as(PercentType.class));
    }

    @Test
    public void testConversionToDecimalType() {
        assertEquals(DecimalType.ZERO, UpDownType.UP.as(DecimalType.class));
        assertEquals(new DecimalType(1), UpDownType.DOWN.as(DecimalType.class));
    }

    @Test
    public void testConversionToPointType() {
        // should not be possible => null
        assertEquals(null, UpDownType.UP.as(PointType.class));
        assertEquals(null, UpDownType.DOWN.as(PointType.class));
    }
}
