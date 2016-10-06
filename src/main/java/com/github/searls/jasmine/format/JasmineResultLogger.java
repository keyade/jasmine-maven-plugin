/*-
 * #%L
 * jasmine-maven-plugin
 * %%
 * Copyright (C) 2010 - 2017 Justin Searls
 * %%
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
 * #L%
 */
package com.github.searls.jasmine.format;

import com.github.searls.jasmine.model.JasmineResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JasmineResultLogger {

  private static final Logger LOGGER = LoggerFactory.getLogger(JasmineResultLogger.class);

  protected static final String HEADER = "\n" +
    "-------------------------------------------------------\n" +
    " J A S M I N E   S P E C S\n" +
    "-------------------------------------------------------";

  public void log(JasmineResult result) {
    LOGGER.info(HEADER);
    if (result != null && result.getDetails() != null) {
      LOGGER.info(result.getDetails());
    }
  }

}
