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
    /// Backend
    /// </summary>
    [DataContract]
    public partial class Backend :  IEquatable<Backend>, IValidatableObject
    {
        /// <summary>
        /// Gets or Sets DataStructure
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DataStructureEnum
        {
            
            /// <summary>
            /// Enum FACTOM for "FACTOM"
            /// </summary>
            [EnumMember(Value = "FACTOM")]
            FACTOM,
            
            /// <summary>
            /// Enum MULTICHAIN for "MULTICHAIN"
            /// </summary>
            [EnumMember(Value = "MULTICHAIN")]
            MULTICHAIN,
            
            /// <summary>
            /// Enum ETHEREUM for "ETHEREUM"
            /// </summary>
            [EnumMember(Value = "ETHEREUM")]
            ETHEREUM
        }

        /// <summary>
        /// Gets or Sets DataStructure
        /// </summary>
        [DataMember(Name="dataStructure", EmitDefaultValue=false)]
        public DataStructureEnum? DataStructure { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Backend" /> class.
        /// </summary>
        /// <param name="RpcProviders">RpcProviders.</param>
        /// <param name="ApiVersion">ApiVersion.</param>
        /// <param name="Name">Name.</param>
        /// <param name="Start">Start.</param>
        /// <param name="End">End.</param>
        /// <param name="DataStructure">DataStructure.</param>
        /// <param name="ExternalAccess">ExternalAccess.</param>
        public Backend(List<RpcProvider> RpcProviders = default(List<RpcProvider>), int? ApiVersion = default(int?), string Name = default(string), DateTime? Start = default(DateTime?), DateTime? End = default(DateTime?), DataStructureEnum? DataStructure = default(DataStructureEnum?), Access ExternalAccess = default(Access))
        {
            this.RpcProviders = RpcProviders;
            this.ApiVersion = ApiVersion;
            this.Name = Name;
            this.Start = Start;
            this.End = End;
            this.DataStructure = DataStructure;
            this.ExternalAccess = ExternalAccess;
        }
        
        /// <summary>
        /// Gets or Sets RpcProviders
        /// </summary>
        [DataMember(Name="rpcProviders", EmitDefaultValue=false)]
        public List<RpcProvider> RpcProviders { get; set; }

        /// <summary>
        /// Gets or Sets ApiVersion
        /// </summary>
        [DataMember(Name="apiVersion", EmitDefaultValue=false)]
        public int? ApiVersion { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Start
        /// </summary>
        [DataMember(Name="start", EmitDefaultValue=false)]
        public DateTime? Start { get; set; }

        /// <summary>
        /// Gets or Sets End
        /// </summary>
        [DataMember(Name="end", EmitDefaultValue=false)]
        public DateTime? End { get; set; }


        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; private set; }

        /// <summary>
        /// Gets or Sets ExternalAccess
        /// </summary>
        [DataMember(Name="externalAccess", EmitDefaultValue=false)]
        public Access ExternalAccess { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Backend {\n");
            sb.Append("  RpcProviders: ").Append(RpcProviders).Append("\n");
            sb.Append("  ApiVersion: ").Append(ApiVersion).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
            sb.Append("  DataStructure: ").Append(DataStructure).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ExternalAccess: ").Append(ExternalAccess).Append("\n");
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
            return this.Equals(obj as Backend);
        }

        /// <summary>
        /// Returns true if Backend instances are equal
        /// </summary>
        /// <param name="other">Instance of Backend to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Backend other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.RpcProviders == other.RpcProviders ||
                    this.RpcProviders != null &&
                    this.RpcProviders.SequenceEqual(other.RpcProviders)
                ) && 
                (
                    this.ApiVersion == other.ApiVersion ||
                    this.ApiVersion != null &&
                    this.ApiVersion.Equals(other.ApiVersion)
                ) && 
                (
                    this.Name == other.Name ||
                    this.Name != null &&
                    this.Name.Equals(other.Name)
                ) && 
                (
                    this.Start == other.Start ||
                    this.Start != null &&
                    this.Start.Equals(other.Start)
                ) && 
                (
                    this.End == other.End ||
                    this.End != null &&
                    this.End.Equals(other.End)
                ) && 
                (
                    this.DataStructure == other.DataStructure ||
                    this.DataStructure != null &&
                    this.DataStructure.Equals(other.DataStructure)
                ) && 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                ) && 
                (
                    this.ExternalAccess == other.ExternalAccess ||
                    this.ExternalAccess != null &&
                    this.ExternalAccess.Equals(other.ExternalAccess)
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
                if (this.RpcProviders != null)
                    hash = hash * 59 + this.RpcProviders.GetHashCode();
                if (this.ApiVersion != null)
                    hash = hash * 59 + this.ApiVersion.GetHashCode();
                if (this.Name != null)
                    hash = hash * 59 + this.Name.GetHashCode();
                if (this.Start != null)
                    hash = hash * 59 + this.Start.GetHashCode();
                if (this.End != null)
                    hash = hash * 59 + this.End.GetHashCode();
                if (this.DataStructure != null)
                    hash = hash * 59 + this.DataStructure.GetHashCode();
                if (this.Id != null)
                    hash = hash * 59 + this.Id.GetHashCode();
                if (this.ExternalAccess != null)
                    hash = hash * 59 + this.ExternalAccess.GetHashCode();
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
