// Databricks notebook source
package x.y.z

object Utils {
  val aNumber = 5 // works!
  def functionThatWillWork(a: Int): Int = a + 1
}

// COMMAND ----------

import x.y.z.Utils

Utils.functionThatWillWork(Utils.aNumber)
