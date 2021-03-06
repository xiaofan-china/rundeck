/*
 * Copyright 2010 DTO Labs, Inc. (http://dtolabs.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/*
* QueueException.java
* 
* User: Greg Schueler <a href="mailto:greg@dtosolutions.com">greg@dtosolutions.com</a>
* Created: Feb 22, 2010 2:41:32 PM
* $Id$
*/
package com.dtolabs.rundeck.core.cli.queue;

import com.dtolabs.rundeck.core.cli.CLIToolException;

/**
 * Exception class for the QueueTool
 *
 * @author Greg Schueler <a href="mailto:greg@dtosolutions.com">greg@dtosolutions.com</a>
 * @version $Revision$
 */
public class QueueToolException extends CLIToolException {
    public QueueToolException() {
        super();
    }

    public QueueToolException(String msg) {
        super(msg);
    }

    public QueueToolException(Exception cause) {
        super(cause);
    }

    public QueueToolException(String msg, Exception cause) {
        super(msg, cause);
    }
}
