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

import danta.Constants;

/**
 * Processor
 *
 * @author      dhughes
 * @version     1.0.0
 * @since       2017-09-08
 */
public interface Processor {

    /**
     * Returns the priority of this Processor.
     * The processors are executed in descending
     * order based on the property.
     * <p>
     * The priority can be any {@code int} number. The following constants are provided
     * only for convenience:
     * <ul>
     *     <li>HIGHEST_PRIORITY   = 1000
     *     <li>HIGHER_PRIORITY   = 900
     *     <li>HIGH_PRIORITY   = 800
     *     <li>MEDIUM_PRIORITY = 500
     *     <li>LOW_PRIORITY    = 0
     * </ul>
     *
     * @return the priority of this Processor
     * @see Constants
     *
     */
    int priority();

}
