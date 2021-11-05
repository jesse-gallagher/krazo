/*
 * Copyright (c) 2014-2015 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2018, 2019 Eclipse Krazo committers and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.eclipse.krazo.event;

import jakarta.enterprise.context.Dependent;
import jakarta.mvc.engine.ViewEngine;
import jakarta.mvc.event.AfterProcessViewEvent;

/**
 * An implementation of {@link jakarta.mvc.event.AfterProcessViewEvent}.
 *
 * @author Santiago Pericas-Geertsen
 */
@Dependent
public class AfterProcessViewEventImpl implements AfterProcessViewEvent {

    private String view;

    private Class<? extends ViewEngine> engine;

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public Class<? extends ViewEngine> getEngine() {
        return engine;
    }

    public void setEngine(Class<? extends ViewEngine> engine) {
        this.engine = engine;
    }
}