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

package layerx.api;

import layerx.Constants;
import layerx.api.exceptions.AcceptsException;
import layerx.api.exceptions.ProcessException;

/**
 * User: joshuaoransky
 * Date: 10/30/13
 * Time: 4:49 PM
 * Purpose:
 * Location:
 */
public interface ContextProcessor<C extends ContentModel> {

    /**
     * Determines if this Processor should handle this Request and add to the Context.
     *
     * @param executionContext
     *
     * @return
     *
     * @throws AcceptsException
     */
    public boolean accepts(final ExecutionContext executionContext)
            throws AcceptsException;

    /**
     * Returns the priority of this ContextProcessor.
     * The processors are executed by the TemplatingSupportFilter in descending
     * order based on the property.
     * <p>
     * The priority can be any int number. The following constants are provided
     * only for convenience:
     * <ul>
     *     <li>HIGHEST_PRIORITY   = 1000
     *     <li>MEDIUM_PRIORITY = 500
     *     <li>LOW_PRIORITY    = 0
     * </ul>
     *
     * @return the priority of this ContextProcessor
     * @see Constants
     *
     */
    public int priority();

    /**
     * This method is where any business logic resides, and the various results are added to the Context.
     *
     * @param executionContext
     * @param contentModel
     *
     * @throws Exception
     */
    public void process(final ExecutionContext executionContext, final C contentModel)
            throws ProcessException;

}
