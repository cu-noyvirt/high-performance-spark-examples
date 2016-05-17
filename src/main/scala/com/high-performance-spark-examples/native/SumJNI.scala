package com.highperformancespark.examples.ffi

import ch.jodersky.jni.nativeLoader

@nativeLoader("high-performance-spark0")
class SumJNI {
  @native def sum(n: Array[Int]): Int
}
