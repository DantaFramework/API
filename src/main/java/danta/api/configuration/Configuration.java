/**
 * Danta API Bundle
 * (danta.api)
 *
 * Copyright (C) 2017 Tikal Technologies, Inc. All rights reserved.
 *
 * Licensed under GNU Affero General Public License, Version v3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.gnu.org/licenses/agpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied;
 * without even the implied warranty of MERCHANTABILITY.
 * See the License for more details.
 */

package danta.api.configuration;

import net.minidev.json.JSONObject;
import net.minidev.json.JSONStyle;

import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;


/**
 * Configuration
 *
 * @author      joshuaoransky
 * @version     1.0.0
 * @since       2016-03-16
 */
public interface Configuration {

    Mode defaultMode();

    Set<String> names(Mode mode)
            throws Exception;

    Set<String> names()
            throws Exception;

    String asString(String paramName, Mode mode)
            throws Exception;

    Collection<String> asStrings(String paramName, Mode mode)
            throws Exception;

    String asString(String paramName)
            throws Exception;

    Collection<String> asStrings(String paramName)
            throws Exception;

    Number asNumber(String paramName, Mode mode)
            throws Exception;

    Collection<Number> asNumbers(String paramName, Mode mode)
            throws Exception;

    Number asNumber(String paramName)
            throws Exception;

    Collection<Number> asNumbers(String paramName)
            throws Exception;

    Date asDate(String paramName, Mode mode)
            throws Exception;

    Collection<Date> asDates(String paramName, Mode mode)
            throws Exception;

    Date asDate(String paramName)
            throws Exception;

    Collection<Date> asDates(String paramName)
            throws Exception;

    String toJSONString()
            throws Exception;

    String toJSONString(JSONStyle style)
            throws Exception;

    Map<String, Object> toMap()
            throws Exception;

    JSONObject toJSONObject()
            throws Exception;
}
