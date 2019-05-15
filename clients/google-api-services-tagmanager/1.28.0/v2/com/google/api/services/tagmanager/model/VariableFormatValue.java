/*
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
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.tagmanager.model;

/**
 * Model definition for VariableFormatValue.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VariableFormatValue extends com.google.api.client.json.GenericJson {

  /**
   * The option to convert a string-type variable value to either lowercase or uppercase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String caseConversionType;

  /**
   * The value to convert if a variable value is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter convertFalseToValue;

  /**
   * The value to convert if a variable value is null.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter convertNullToValue;

  /**
   * The value to convert if a variable value is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter convertTrueToValue;

  /**
   * The value to convert if a variable value is undefined.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter convertUndefinedToValue;

  /**
   * The option to convert a string-type variable value to either lowercase or uppercase.
   * @return value or {@code null} for none
   */
  public java.lang.String getCaseConversionType() {
    return caseConversionType;
  }

  /**
   * The option to convert a string-type variable value to either lowercase or uppercase.
   * @param caseConversionType caseConversionType or {@code null} for none
   */
  public VariableFormatValue setCaseConversionType(java.lang.String caseConversionType) {
    this.caseConversionType = caseConversionType;
    return this;
  }

  /**
   * The value to convert if a variable value is false.
   * @return value or {@code null} for none
   */
  public Parameter getConvertFalseToValue() {
    return convertFalseToValue;
  }

  /**
   * The value to convert if a variable value is false.
   * @param convertFalseToValue convertFalseToValue or {@code null} for none
   */
  public VariableFormatValue setConvertFalseToValue(Parameter convertFalseToValue) {
    this.convertFalseToValue = convertFalseToValue;
    return this;
  }

  /**
   * The value to convert if a variable value is null.
   * @return value or {@code null} for none
   */
  public Parameter getConvertNullToValue() {
    return convertNullToValue;
  }

  /**
   * The value to convert if a variable value is null.
   * @param convertNullToValue convertNullToValue or {@code null} for none
   */
  public VariableFormatValue setConvertNullToValue(Parameter convertNullToValue) {
    this.convertNullToValue = convertNullToValue;
    return this;
  }

  /**
   * The value to convert if a variable value is true.
   * @return value or {@code null} for none
   */
  public Parameter getConvertTrueToValue() {
    return convertTrueToValue;
  }

  /**
   * The value to convert if a variable value is true.
   * @param convertTrueToValue convertTrueToValue or {@code null} for none
   */
  public VariableFormatValue setConvertTrueToValue(Parameter convertTrueToValue) {
    this.convertTrueToValue = convertTrueToValue;
    return this;
  }

  /**
   * The value to convert if a variable value is undefined.
   * @return value or {@code null} for none
   */
  public Parameter getConvertUndefinedToValue() {
    return convertUndefinedToValue;
  }

  /**
   * The value to convert if a variable value is undefined.
   * @param convertUndefinedToValue convertUndefinedToValue or {@code null} for none
   */
  public VariableFormatValue setConvertUndefinedToValue(Parameter convertUndefinedToValue) {
    this.convertUndefinedToValue = convertUndefinedToValue;
    return this;
  }

  @Override
  public VariableFormatValue set(String fieldName, Object value) {
    return (VariableFormatValue) super.set(fieldName, value);
  }

  @Override
  public VariableFormatValue clone() {
    return (VariableFormatValue) super.clone();
  }

}