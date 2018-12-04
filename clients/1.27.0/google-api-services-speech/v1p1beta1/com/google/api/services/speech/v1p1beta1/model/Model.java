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

package com.google.api.services.speech.v1p1beta1.model;

/**
 * Specifies the model parameters needed for training a model. In addition this is also the message
 * returned to the client by the `CreateModel` method. It is included in the `result.response` field
 * of the `Operation` returned by the `GetOperation` call of the `google::longrunning::Operations`
 * service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Model extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp when this model was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. Display name of the model to be trained.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Evaluation results associated with this model. A model can contain multiple sub-
   * models in which case the evaluation results for all of those are available. If there are no sub
   * models then there would be just a single EvaluateModelResponse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EvaluateModelResponse> evaluateModelResponses;

  /**
   * Output only. Resource name of the model. Format:
   * "projects/{project_id}/locations/{location_id}/models/{model_id}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Type of the training to perform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trainingType;

  /**
   * Output only. Timestamp when this model was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when this model was created.
   * @param createTime createTime or {@code null} for none
   */
  public Model setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. Display name of the model to be trained.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. Display name of the model to be trained.
   * @param displayName displayName or {@code null} for none
   */
  public Model setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Evaluation results associated with this model. A model can contain multiple sub-
   * models in which case the evaluation results for all of those are available. If there are no sub
   * models then there would be just a single EvaluateModelResponse.
   * @return value or {@code null} for none
   */
  public java.util.List<EvaluateModelResponse> getEvaluateModelResponses() {
    return evaluateModelResponses;
  }

  /**
   * Output only. Evaluation results associated with this model. A model can contain multiple sub-
   * models in which case the evaluation results for all of those are available. If there are no sub
   * models then there would be just a single EvaluateModelResponse.
   * @param evaluateModelResponses evaluateModelResponses or {@code null} for none
   */
  public Model setEvaluateModelResponses(java.util.List<EvaluateModelResponse> evaluateModelResponses) {
    this.evaluateModelResponses = evaluateModelResponses;
    return this;
  }

  /**
   * Output only. Resource name of the model. Format:
   * "projects/{project_id}/locations/{location_id}/models/{model_id}"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the model. Format:
   * "projects/{project_id}/locations/{location_id}/models/{model_id}"
   * @param name name or {@code null} for none
   */
  public Model setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Type of the training to perform.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrainingType() {
    return trainingType;
  }

  /**
   * Required. Type of the training to perform.
   * @param trainingType trainingType or {@code null} for none
   */
  public Model setTrainingType(java.lang.String trainingType) {
    this.trainingType = trainingType;
    return this;
  }

  @Override
  public Model set(String fieldName, Object value) {
    return (Model) super.set(fieldName, value);
  }

  @Override
  public Model clone() {
    return (Model) super.clone();
  }

}