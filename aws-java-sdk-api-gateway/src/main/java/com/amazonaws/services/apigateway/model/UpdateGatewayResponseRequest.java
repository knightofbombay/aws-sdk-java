/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGatewayResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPES</li>
     * </ul>
     * </p>
     * </p>
     */
    private String responseType;
    /**
     * <p>
     * A list of update operations to be applied to the specified resource and in the order specified in this list.
     * </p>
     */
    private java.util.List<PatchOperation> patchOperations;

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayResponseRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPES</li>
     * </ul>
     * </p>
     * </p>
     * 
     * @param responseType
     *        The response type of the associated <a>GatewayResponse</a>. Valid values are
     *        <ul>
     *        <li>ACCESS_DENIED</li>
     *        <li>API_CONFIGURATION_ERROR</li>
     *        <li>AUTHORIZER_FAILURE</li>
     *        <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *        <li>BAD_REQUEST_PARAMETERS</li>
     *        <li>BAD_REQUEST_BODY</li>
     *        <li>DEFAULT_4XX</li>
     *        <li>DEFAULT_5XX</li>
     *        <li>EXPIRED_TOKEN</li>
     *        <li>INVALID_SIGNATURE</li>
     *        <li>INTEGRATION_FAILURE</li>
     *        <li>INTEGRATION_TIMEOUT</li>
     *        <li>INVALID_API_KEY</li>
     *        <li>MISSING_AUTHENTICATION_TOKEN</li>
     *        <li>QUOTA_EXCEEDED</li>
     *        <li>REQUEST_TOO_LARGE</li>
     *        <li>RESOURCE_NOT_FOUND</li>
     *        <li>THROTTLED</li>
     *        <li>UNAUTHORIZED</li>
     *        <li>UNSUPPORTED_MEDIA_TYPES</li>
     *        </ul>
     * @see GatewayResponseType
     */

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    /**
     * <p>
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPES</li>
     * </ul>
     * </p>
     * </p>
     * 
     * @return The response type of the associated <a>GatewayResponse</a>. Valid values are
     *         <ul>
     *         <li>ACCESS_DENIED</li>
     *         <li>API_CONFIGURATION_ERROR</li>
     *         <li>AUTHORIZER_FAILURE</li>
     *         <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *         <li>BAD_REQUEST_PARAMETERS</li>
     *         <li>BAD_REQUEST_BODY</li>
     *         <li>DEFAULT_4XX</li>
     *         <li>DEFAULT_5XX</li>
     *         <li>EXPIRED_TOKEN</li>
     *         <li>INVALID_SIGNATURE</li>
     *         <li>INTEGRATION_FAILURE</li>
     *         <li>INTEGRATION_TIMEOUT</li>
     *         <li>INVALID_API_KEY</li>
     *         <li>MISSING_AUTHENTICATION_TOKEN</li>
     *         <li>QUOTA_EXCEEDED</li>
     *         <li>REQUEST_TOO_LARGE</li>
     *         <li>RESOURCE_NOT_FOUND</li>
     *         <li>THROTTLED</li>
     *         <li>UNAUTHORIZED</li>
     *         <li>UNSUPPORTED_MEDIA_TYPES</li>
     *         </ul>
     * @see GatewayResponseType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("responseType")
    public String getResponseType() {
        return this.responseType;
    }

    /**
     * <p>
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPES</li>
     * </ul>
     * </p>
     * </p>
     * 
     * @param responseType
     *        The response type of the associated <a>GatewayResponse</a>. Valid values are
     *        <ul>
     *        <li>ACCESS_DENIED</li>
     *        <li>API_CONFIGURATION_ERROR</li>
     *        <li>AUTHORIZER_FAILURE</li>
     *        <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *        <li>BAD_REQUEST_PARAMETERS</li>
     *        <li>BAD_REQUEST_BODY</li>
     *        <li>DEFAULT_4XX</li>
     *        <li>DEFAULT_5XX</li>
     *        <li>EXPIRED_TOKEN</li>
     *        <li>INVALID_SIGNATURE</li>
     *        <li>INTEGRATION_FAILURE</li>
     *        <li>INTEGRATION_TIMEOUT</li>
     *        <li>INVALID_API_KEY</li>
     *        <li>MISSING_AUTHENTICATION_TOKEN</li>
     *        <li>QUOTA_EXCEEDED</li>
     *        <li>REQUEST_TOO_LARGE</li>
     *        <li>RESOURCE_NOT_FOUND</li>
     *        <li>THROTTLED</li>
     *        <li>UNAUTHORIZED</li>
     *        <li>UNSUPPORTED_MEDIA_TYPES</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayResponseType
     */

    public UpdateGatewayResponseRequest withResponseType(String responseType) {
        setResponseType(responseType);
        return this;
    }

    /**
     * <p>
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPES</li>
     * </ul>
     * </p>
     * </p>
     * 
     * @param responseType
     *        The response type of the associated <a>GatewayResponse</a>. Valid values are
     *        <ul>
     *        <li>ACCESS_DENIED</li>
     *        <li>API_CONFIGURATION_ERROR</li>
     *        <li>AUTHORIZER_FAILURE</li>
     *        <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *        <li>BAD_REQUEST_PARAMETERS</li>
     *        <li>BAD_REQUEST_BODY</li>
     *        <li>DEFAULT_4XX</li>
     *        <li>DEFAULT_5XX</li>
     *        <li>EXPIRED_TOKEN</li>
     *        <li>INVALID_SIGNATURE</li>
     *        <li>INTEGRATION_FAILURE</li>
     *        <li>INTEGRATION_TIMEOUT</li>
     *        <li>INVALID_API_KEY</li>
     *        <li>MISSING_AUTHENTICATION_TOKEN</li>
     *        <li>QUOTA_EXCEEDED</li>
     *        <li>REQUEST_TOO_LARGE</li>
     *        <li>RESOURCE_NOT_FOUND</li>
     *        <li>THROTTLED</li>
     *        <li>UNAUTHORIZED</li>
     *        <li>UNSUPPORTED_MEDIA_TYPES</li>
     *        </ul>
     * @see GatewayResponseType
     */

    @com.fasterxml.jackson.annotation.JsonIgnore
    public void setResponseType(GatewayResponseType responseType) {
        withResponseType(responseType);
    }

    /**
     * <p>
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPES</li>
     * </ul>
     * </p>
     * </p>
     * 
     * @param responseType
     *        The response type of the associated <a>GatewayResponse</a>. Valid values are
     *        <ul>
     *        <li>ACCESS_DENIED</li>
     *        <li>API_CONFIGURATION_ERROR</li>
     *        <li>AUTHORIZER_FAILURE</li>
     *        <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *        <li>BAD_REQUEST_PARAMETERS</li>
     *        <li>BAD_REQUEST_BODY</li>
     *        <li>DEFAULT_4XX</li>
     *        <li>DEFAULT_5XX</li>
     *        <li>EXPIRED_TOKEN</li>
     *        <li>INVALID_SIGNATURE</li>
     *        <li>INTEGRATION_FAILURE</li>
     *        <li>INTEGRATION_TIMEOUT</li>
     *        <li>INVALID_API_KEY</li>
     *        <li>MISSING_AUTHENTICATION_TOKEN</li>
     *        <li>QUOTA_EXCEEDED</li>
     *        <li>REQUEST_TOO_LARGE</li>
     *        <li>RESOURCE_NOT_FOUND</li>
     *        <li>THROTTLED</li>
     *        <li>UNAUTHORIZED</li>
     *        <li>UNSUPPORTED_MEDIA_TYPES</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayResponseType
     */

    public UpdateGatewayResponseRequest withResponseType(GatewayResponseType responseType) {
        this.responseType = responseType.toString();
        return this;
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and in the order specified in this list.
     * </p>
     * 
     * @return A list of update operations to be applied to the specified resource and in the order specified in this
     *         list.
     */

    public java.util.List<PatchOperation> getPatchOperations() {
        return patchOperations;
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and in the order specified in this list.
     * </p>
     * 
     * @param patchOperations
     *        A list of update operations to be applied to the specified resource and in the order specified in this
     *        list.
     */

    public void setPatchOperations(java.util.Collection<PatchOperation> patchOperations) {
        if (patchOperations == null) {
            this.patchOperations = null;
            return;
        }

        this.patchOperations = new java.util.ArrayList<PatchOperation>(patchOperations);
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and in the order specified in this list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPatchOperations(java.util.Collection)} or {@link #withPatchOperations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param patchOperations
     *        A list of update operations to be applied to the specified resource and in the order specified in this
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayResponseRequest withPatchOperations(PatchOperation... patchOperations) {
        if (this.patchOperations == null) {
            setPatchOperations(new java.util.ArrayList<PatchOperation>(patchOperations.length));
        }
        for (PatchOperation ele : patchOperations) {
            this.patchOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and in the order specified in this list.
     * </p>
     * 
     * @param patchOperations
     *        A list of update operations to be applied to the specified resource and in the order specified in this
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayResponseRequest withPatchOperations(java.util.Collection<PatchOperation> patchOperations) {
        setPatchOperations(patchOperations);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getResponseType() != null)
            sb.append("ResponseType: ").append(getResponseType()).append(",");
        if (getPatchOperations() != null)
            sb.append("PatchOperations: ").append(getPatchOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGatewayResponseRequest == false)
            return false;
        UpdateGatewayResponseRequest other = (UpdateGatewayResponseRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getResponseType() == null ^ this.getResponseType() == null)
            return false;
        if (other.getResponseType() != null && other.getResponseType().equals(this.getResponseType()) == false)
            return false;
        if (other.getPatchOperations() == null ^ this.getPatchOperations() == null)
            return false;
        if (other.getPatchOperations() != null && other.getPatchOperations().equals(this.getPatchOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getResponseType() == null) ? 0 : getResponseType().hashCode());
        hashCode = prime * hashCode + ((getPatchOperations() == null) ? 0 : getPatchOperations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGatewayResponseRequest clone() {
        return (UpdateGatewayResponseRequest) super.clone();
    }

}
