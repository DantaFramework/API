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

package danta.api;

import danta.api.exceptions.AcceptsException;
import danta.api.exceptions.ProcessException;

/**
 * Context Processor
 *
 * @author      joshuaoransky
 * @version     1.0.0
 * @since       2013-10-30
 */
public interface ContextProcessor<C extends ContentModel>
        extends Processor {

    /**
     * Determines if this Processor should handle this Request and add to the Context.
     *
     * @param executionContext
     *
     * @return
     *
     * @throws AcceptsException
     */
    boolean accepts(final ExecutionContext executionContext)
            throws AcceptsException;

    /**
     * This method is where any business logic resides, and the various results are added to the Context.
     *
     * @param executionContext
     * @param contentModel
     *
     * @throws Exception
     */
    void process(final ExecutionContext executionContext, final C contentModel)
            throws ProcessException;

}
