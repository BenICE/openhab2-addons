/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.regoheatpump.internal.rego6xx;

/**
 * The {@link AbstractLongResponseParser} is responsible for parsing long form responses.
 *
 * @author Boris Krivonog - Initial contribution
 */
abstract class AbstractLongResponseParser<T> extends AbstractResponseParser<T> {
    @Override
    public int responseLength() {
        return 42;
    }
}
