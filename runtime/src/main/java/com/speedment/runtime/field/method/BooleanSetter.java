/**
 *
 * Copyright (c) 2006-2016, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.runtime.field.method;

import com.speedment.runtime.annotation.Api;
import javax.annotation.Generated;

/**
 * A short-cut functional reference to the {@code setXXX(value)} method for a
 * particular field in an entity. The referenced method should return a
 * reference to itself.
 * <p>
 * A {@code BooleanSetter<ENTITY>} has the following signature:
 * {@code
 *     interface ENTITY {
 *         ENTITY setXXX(boolean value);
 *     }
 * }
 * 
 * @param <ENTITY> the entity
 * 
 * @author Emil Forslund
 * @since  3.0.0
 */
@Api(version = "3.0")
@Generated
@FunctionalInterface
public interface BooleanSetter<ENTITY> extends Setter<ENTITY> {
    
    /**
     * Sets the member represented by this setter in the specified instance to
     * the specified value, returning a reference to the same instance as
     * result.
     * 
     * @param instance the instance to set it in
     * @param value    the new value
     * @return         a reference to that instance
     */
    ENTITY setAsBoolean(ENTITY instance, boolean value);
}