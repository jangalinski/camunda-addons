package io.holunda.camunda.addons.data.variable

/**
 * A varibale is identified by its key.
 *
 * Can be used if enum/string setup for variables is used.
 */
interface VariableKey {
  val key : String
}