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

import org.jsoup.nodes.Document;

/**
 * DOMProcessors are intended process the resulting HTML after a request, normally taking advantage of the JSoup
 * library methods. Each DOMProcessor will process the pages once, and the process order will be defined by the priority of each
 * DOMProcessor.
 *
 *  After the entire Page's output HTML is rendered with all the content, it's then parsed a single time using
 *  the JSoup library. The result is passed into implementations of DOMParsers to be modified if necessary.
 */
public interface DOMProcessor {

    /**
     * This method returns the priority of the DOMProcessor. The priority defines the order in which the
     * DOMProcessors will be executed.
     *
     * @return  Returns the priority of the DOMProcessor
     */
    public int priority();

    /**
     * This method takes care of the HTML processing, using the JSoup library.
     *
     * @param executionContext
     * @param document    The HTML document
     * @throws Exception
     */
    public void process(final ExecutionContext executionContext, final Document document)
            throws Exception;
}
