/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.com).
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.organization.management.role.management.endpoint.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.wso2.carbon.identity.organization.management.role.management.endpoint.model.RolePutResponseObjectMeta;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class RolePatchResponseObject  {
  
    private String displayName;
    private RolePutResponseObjectMeta meta;
    private String id;

    /**
    **/
    public RolePatchResponseObject displayName(String displayName) {

        this.displayName = displayName;
        return this;
    }
    
    @ApiModelProperty(example = "loginRole", value = "")
    @JsonProperty("displayName")
    @Valid
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
    **/
    public RolePatchResponseObject meta(RolePutResponseObjectMeta meta) {

        this.meta = meta;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("meta")
    @Valid
    public RolePutResponseObjectMeta getMeta() {
        return meta;
    }
    public void setMeta(RolePutResponseObjectMeta meta) {
        this.meta = meta;
    }

    /**
    **/
    public RolePatchResponseObject id(String id) {

        this.id = id;
        return this;
    }
    
    @ApiModelProperty(example = "4645709c-ea8c-4495-8590-e1fa0fe3de0", value = "")
    @JsonProperty("id")
    @Valid
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RolePatchResponseObject rolePatchResponseObject = (RolePatchResponseObject) o;
        return Objects.equals(this.displayName, rolePatchResponseObject.displayName) &&
            Objects.equals(this.meta, rolePatchResponseObject.meta) &&
            Objects.equals(this.id, rolePatchResponseObject.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, meta, id);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class RolePatchResponseObject {\n");
        
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

