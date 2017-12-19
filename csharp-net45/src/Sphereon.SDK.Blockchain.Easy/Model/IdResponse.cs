/* 
 * Easy Blockchain API
 *
 * The Easy Blockchain API is an easy to use API to store related entries within chains. Currently it stores entries using a Factom, Ethereum or Multichain blockchain.   For full API documentation please visit: https://docs.sphereon.com/api/easy-blockchain/0.10/html   Interactive testing: A web based test console is available in the Sphereon API store at: https://store.sphereon.com
 *
 * OpenAPI spec version: 0.10
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = Sphereon.SDK.Blockchain.Easy.Client.SwaggerDateConverter;

namespace Sphereon.SDK.Blockchain.Easy.Model
{
    /// <summary>
    /// Id response
    /// </summary>
    [DataContract]
    public partial class IdResponse :  IEquatable<IdResponse>, IValidatableObject
    {
        /// <summary>
        /// Gets or Sets Exists
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ExistsEnum
        {
            
            /// <summary>
            /// Enum True for "True"
            /// </summary>
            [EnumMember(Value = "True")]
            True,
            
            /// <summary>
            /// Enum False for "False"
            /// </summary>
            [EnumMember(Value = "False")]
            False,
            
            /// <summary>
            /// Enum Unknown for "Unknown"
            /// </summary>
            [EnumMember(Value = "Unknown")]
            Unknown
        }

        /// <summary>
        /// Gets or Sets Exists
        /// </summary>
        [DataMember(Name="exists", EmitDefaultValue=false)]
        public ExistsEnum? Exists { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="IdResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected IdResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="IdResponse" /> class.
        /// </summary>
        /// <param name="Exists">Exists (required).</param>
        /// <param name="Id">The Id.</param>
        public IdResponse(ExistsEnum? Exists = default(ExistsEnum?), string Id = default(string))
        {
            // to ensure "Exists" is required (not null)
            if (Exists == null)
            {
                throw new InvalidDataException("Exists is a required property for IdResponse and cannot be null");
            }
            else
            {
                this.Exists = Exists;
            }
            this.Id = Id;
        }
        

        /// <summary>
        /// The Id
        /// </summary>
        /// <value>The Id</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IdResponse {\n");
            sb.Append("  Exists: ").Append(Exists).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as IdResponse);
        }

        /// <summary>
        /// Returns true if IdResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of IdResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IdResponse other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Exists == other.Exists ||
                    this.Exists != null &&
                    this.Exists.Equals(other.Exists)
                ) && 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.Exists != null)
                    hash = hash * 59 + this.Exists.GetHashCode();
                if (this.Id != null)
                    hash = hash * 59 + this.Id.GetHashCode();
                return hash;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
