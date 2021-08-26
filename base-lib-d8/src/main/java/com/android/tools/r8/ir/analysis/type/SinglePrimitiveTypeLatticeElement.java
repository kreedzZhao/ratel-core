// Copyright (c) 2018, the R8 project authors. Please see the AUTHORS file
// for details. All rights reserved. Use of this source code is governed by a
// BSD-style license that can be found in the LICENSE file.
package com.android.tools.r8.ir.analysis.type;

/** A {@link TypeLatticeElement} that abstracts primitive types, which fit in 32 bits. */
public class SinglePrimitiveTypeLatticeElement extends PrimitiveTypeLatticeElement {

  private static final SinglePrimitiveTypeLatticeElement INSTANCE =
      new SinglePrimitiveTypeLatticeElement();

  SinglePrimitiveTypeLatticeElement() {
    super();
  }

  static SinglePrimitiveTypeLatticeElement getInstance() {
    return INSTANCE;
  }

  @Override
  public boolean isSinglePrimitive() {
    return true;
  }

  @Override
  public String toString() {
    return "SINGLE";
  }

  @Override
  public boolean equals(Object o) {
    return this == o;
  }

  @Override
  public int hashCode() {
    return System.identityHashCode(INSTANCE);
  }
}
