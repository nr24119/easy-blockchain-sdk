/*
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9.1
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.blockchain.easy.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sphereon.sdk.blockchain.easy.model.CommittedEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Anchored Entry response
 */
@ApiModel(description = "Anchored Entry response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-30T16:07:37.862+02:00")
public class AnchoredEntryResponse {
  @JsonProperty("anchoredEntry")
  private CommittedEntry anchoredEntry = null;

  @JsonProperty("anchorTimes")
  private List<OffsetDateTime> anchorTimes = new ArrayList<OffsetDateTime>();

  /**
   * Gets or Sets anchorState
   */
  public enum AnchorStateEnum {
    REQUESTED("REQUESTED"),
    
    COMMITTED("COMMITTED"),
    
    NOT_FOUND("NOT_FOUND");

    private String value;

    AnchorStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AnchorStateEnum fromValue(String text) {
      for (AnchorStateEnum b : AnchorStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("anchorState")
  private AnchorStateEnum anchorState = null;

  public AnchoredEntryResponse anchoredEntry(CommittedEntry anchoredEntry) {
    this.anchoredEntry = anchoredEntry;
    return this;
  }

   /**
   * Get anchoredEntry
   * @return anchoredEntry
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CommittedEntry getAnchoredEntry() {
    return anchoredEntry;
  }

  public void setAnchoredEntry(CommittedEntry anchoredEntry) {
    this.anchoredEntry = anchoredEntry;
  }

  public AnchoredEntryResponse anchorTimes(List<OffsetDateTime> anchorTimes) {
    this.anchorTimes = anchorTimes;
    return this;
  }

  public AnchoredEntryResponse addAnchorTimesItem(OffsetDateTime anchorTimesItem) {
    this.anchorTimes.add(anchorTimesItem);
    return this;
  }

   /**
   * The times at which the anchoredEntry was anchored in the blockchain in ISO 8601 format
   * @return anchorTimes
  **/
  @ApiModelProperty(example = "null", value = "The times at which the anchoredEntry was anchored in the blockchain in ISO 8601 format")
  public List<OffsetDateTime> getAnchorTimes() {
    return anchorTimes;
  }

  public void setAnchorTimes(List<OffsetDateTime> anchorTimes) {
    this.anchorTimes = anchorTimes;
  }

   /**
   * Get anchorState
   * @return anchorState
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AnchorStateEnum getAnchorState() {
    return anchorState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnchoredEntryResponse anchoredEntryResponse = (AnchoredEntryResponse) o;
    return Objects.equals(this.anchoredEntry, anchoredEntryResponse.anchoredEntry) &&
        Objects.equals(this.anchorTimes, anchoredEntryResponse.anchorTimes) &&
        Objects.equals(this.anchorState, anchoredEntryResponse.anchorState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchoredEntry, anchorTimes, anchorState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnchoredEntryResponse {\n");
    
    sb.append("    anchoredEntry: ").append(toIndentedString(anchoredEntry)).append("\n");
    sb.append("    anchorTimes: ").append(toIndentedString(anchorTimes)).append("\n");
    sb.append("    anchorState: ").append(toIndentedString(anchorState)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }
  
}

