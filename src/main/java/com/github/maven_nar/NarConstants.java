/*
 * #%L
 * Native ARchive plugin for Maven
 * %%
 * Copyright (C) 2002 - 2014 NAR Maven Plugin developers.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.github.maven_nar;

/**
 * @author Mark Donszelmann
 */
public interface NarConstants {
  String NAR = "nar";

  String NAR_EXTENSION = NAR;

  String NAR_NO_ARCH = "noarch";

  String NAR_AOL = "aol";

  String NAR_ROLE_HINT = NAR;

  String NAR_TYPE = NAR;

  int LOG_LEVEL_ERROR = 0;

  int LOG_LEVEL_WARNING = 1;

  int LOG_LEVEL_INFO = 2;

  int LOG_LEVEL_VERBOSE = 3;

  int LOG_LEVEL_DEBUG = 4;

  String REPLAY_COMPILE_NAME = "compile-commands";
  String REPLAY_LINK_NAME = "link-commands";
  String REPLAY_TEST_COMPILE_NAME = "test-compile-commands";
  String REPLAY_TEST_LINK_NAME = "test-link-commands";
}
