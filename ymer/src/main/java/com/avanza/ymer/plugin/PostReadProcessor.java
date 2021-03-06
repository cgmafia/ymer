/*
 * Copyright 2015 Avanza Bank AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.avanza.ymer.plugin;

import com.mongodb.DBObject;

/**
 * Applied just after an object has been read from Mongo
 */
@FunctionalInterface
public interface PostReadProcessor {
	/**
	 * This method is required to be thread safe
	 * @param postRead Object after it has been read from persistent storage. This object may be modified
	 * @return processed object, may be different from postRead
	 */
	DBObject postRead(DBObject postRead);
}
