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

package com.google.api.services.compute.model;

/**
 * A path-matching rule for a URL. If matched, will use the specified BackendService to handle the
 * traffic arriving at this URL.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PathRule extends com.google.api.client.json.GenericJson {

  /**
   * The list of path patterns to match. Each must start with / and the only place a * is allowed is
   * at the end following a /. The string fed to the path matcher does not include any text after
   * the first ? or #, and those chars are not allowed here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> paths;

  /**
   * The full or partial URL of the backend service resource to which traffic is directed if this
   * rule is matched. If routeAction is additionally specified, advanced routing actions like URL
   * Rewrites, etc. take effect prior to sending the request to the backend. However, if service is
   * specified, routeAction cannot contain any weightedBackendService s. Conversely, if routeAction
   * specifies any  weightedBackendServices, service must not be specified. Only one of urlRedirect,
   * service or routeAction.weightedBackendService must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * The list of path patterns to match. Each must start with / and the only place a * is allowed is
   * at the end following a /. The string fed to the path matcher does not include any text after
   * the first ? or #, and those chars are not allowed here.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPaths() {
    return paths;
  }

  /**
   * The list of path patterns to match. Each must start with / and the only place a * is allowed is
   * at the end following a /. The string fed to the path matcher does not include any text after
   * the first ? or #, and those chars are not allowed here.
   * @param paths paths or {@code null} for none
   */
  public PathRule setPaths(java.util.List<java.lang.String> paths) {
    this.paths = paths;
    return this;
  }

  /**
   * The full or partial URL of the backend service resource to which traffic is directed if this
   * rule is matched. If routeAction is additionally specified, advanced routing actions like URL
   * Rewrites, etc. take effect prior to sending the request to the backend. However, if service is
   * specified, routeAction cannot contain any weightedBackendService s. Conversely, if routeAction
   * specifies any  weightedBackendServices, service must not be specified. Only one of urlRedirect,
   * service or routeAction.weightedBackendService must be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * The full or partial URL of the backend service resource to which traffic is directed if this
   * rule is matched. If routeAction is additionally specified, advanced routing actions like URL
   * Rewrites, etc. take effect prior to sending the request to the backend. However, if service is
   * specified, routeAction cannot contain any weightedBackendService s. Conversely, if routeAction
   * specifies any  weightedBackendServices, service must not be specified. Only one of urlRedirect,
   * service or routeAction.weightedBackendService must be set.
   * @param service service or {@code null} for none
   */
  public PathRule setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  @Override
  public PathRule set(String fieldName, Object value) {
    return (PathRule) super.set(fieldName, value);
  }

  @Override
  public PathRule clone() {
    return (PathRule) super.clone();
  }

}