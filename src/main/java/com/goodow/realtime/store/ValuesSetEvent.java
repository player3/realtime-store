/*
 * Copyright 2014 Goodow.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.goodow.realtime.store;

import com.google.gwt.core.client.js.JsType;

import com.goodow.realtime.json.JsonArray;

@JsType
/**
 * Event fired when items in a collaborative list are changed in place.
 */
public interface ValuesSetEvent extends BaseModelEvent {
  /* The index of the first value that was replaced. */
  int index();

  /* The new values. */
  JsonArray newValues();

  /* The old values. */
  JsonArray oldValues();
}
