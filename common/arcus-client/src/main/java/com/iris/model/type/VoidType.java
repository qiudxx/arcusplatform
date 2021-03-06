/*
 * Copyright 2019 Arcus Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */
package com.iris.model.type;

import java.lang.reflect.Type;

/**
 *
 */
public enum VoidType implements PrimitiveType {
   INSTANCE;

   @Override
   public String getTypeName() {
      return "void";
   }

   @Override
   public Class<?> getJavaType() {
      return Object.class;
   }

   @Override
   public Object coerce(Object obj) {
      return null;
   }

   @Override
   public boolean isAssignableFrom(Type type) {
      // philosophical question: can void be assigned from everything or nothing?
      return true;
   }

   @Override
   public String toString() {
      return "void";
   }
}

