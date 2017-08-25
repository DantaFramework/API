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

/**
 * The interface danta.api.configuration
 * determines how to handle multiple levels of Configuration values.
 * <p/>
 * For example, take these sample configurations:
 * <p/>
 * {
 * firstName: "John",
 * lastName: "Doe",
 * <p/>
 * }
 * <p/>
 * This enum is used by that interface.
 */
public enum Mode {
    /**
     * All Properties on all members of the configuration hierarchy will be present, and their value will be set to
     * the same as the Property on the closest configuration member. This means that if a Property exists on more
     * than one member of the hierarchy, the final value returned will be the form found on the closest member and
     * could be either the single value or a Collection if a Property has multiple values.
     */
    INHERIT,

    /**
     * All Properties on all members of the configuration hierarchy will be present, and each will be set as a
     * Collection of values that correspond to the Property of the same name found on any of configuration members.
     * Regardless of whether a Property exists on more than one member of the hierarchy, or contains only one
     * value,
     * the final value set on the config Property will be a Collection having values in ascending order with the
     * closest member first.
     * <p/>
     * Note that a Property's collection of values will not contain duplicates.
     */
    MERGE,

    /**
     * All Properties on all members of the configuration hierarchy will be present, and each will be set as a
     * Collection of values that correspond to the Property of the same name found on any of configuration members.
     * Regardless of whether a Property exists on more than one member of the hierarchy, or contains only one
     * value,
     * the final value set on the config Property will be a Collection having values in ascending order with the
     * closest member first.
     * <p/>
     * Note that a Property's collection of values may contain duplicates.
     */
    COMBINE,

    /**
     * Only Properties on the closest member of the configuration hierarchy will be present, and its values will be
     * set to the same as the Property on that member. It can be either the single value or a Collection if the
     * Property has multiple values.
     * <p/>
     * Properties and their Values on parent members of the hierarchy will be ignored, and will not be provided in
     * the returned config.
     */
    SHALLOW
}
