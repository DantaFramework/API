/**
 * LayerX API Bundle
 * (layerx.api)
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

package layerx.api.configuration;

import net.minidev.json.JSONObject;
import net.minidev.json.JSONStyle;

import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;


/**
 * User: joshuaoransky
 * Date: 3/16
 * Time: 23:40
 * Purpose:
 * Location
 */
public interface Configuration {

    public Mode defaultMode();

    public Set<String> names(Mode mode)
            throws Exception;

    public Set<String> names()
            throws Exception;

    public String asString(String paramName, Mode mode)
            throws Exception;

    public Collection<String> asStrings(String paramName, Mode mode)
            throws Exception;

    public String asString(String paramName)
            throws Exception;

    public Collection<String> asStrings(String paramName)
            throws Exception;

    public Number asNumber(String paramName, Mode mode)
            throws Exception;

    public Collection<Number> asNumbers(String paramName, Mode mode)
            throws Exception;

    public Number asNumber(String paramName)
            throws Exception;

    public Collection<Number> asNumbers(String paramName)
            throws Exception;

    public Date asDate(String paramName, Mode mode)
            throws Exception;

    public Collection<Date> asDates(String paramName, Mode mode)
            throws Exception;

    public Date asDate(String paramName)
            throws Exception;

    public Collection<Date> asDates(String paramName)
            throws Exception;

    public String toJSONString()
            throws Exception;

    public String toJSONString(JSONStyle style)
            throws Exception;

    public Map<String, Object> toMap()
            throws Exception;

    public JSONObject toJSONObject()
            throws Exception;
}
