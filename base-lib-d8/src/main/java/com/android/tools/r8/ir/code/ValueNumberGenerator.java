// Copyright (c) 2016, the R8 project authors. Please see the AUTHORS file
// for details. All rights reserved. Use of this source code is governed by a
// BSD-style license that can be found in the LICENSE file.
package com.android.tools.r8.ir.code;

public class ValueNumberGenerator {
  private int nextValueNumber = 0;

  public int next() {
    return nextValueNumber++;
  }
}
