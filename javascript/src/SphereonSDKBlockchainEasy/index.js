/**
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a chain has been created using the /chain POST endpoint. Normaly you only need one or a handfull of chains. This is an expensive operation.  2. Store entries on the chain from step 1. The entries will contain the content and metadata you want to store forever on the specified chain.  3. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.1.0
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

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['SphereonSDKBlockchainEasy/ApiClient', 'SphereonSDKBlockchainEasy/model/AnchoredEntryResponse', 'SphereonSDKBlockchainEasy/model/Chain', 'SphereonSDKBlockchainEasy/model/CommittedChain', 'SphereonSDKBlockchainEasy/model/CommittedChainResponse', 'SphereonSDKBlockchainEasy/model/CommittedEntry', 'SphereonSDKBlockchainEasy/model/CommittedEntryResponse', 'SphereonSDKBlockchainEasy/model/Entry', 'SphereonSDKBlockchainEasy/model/EntryData', 'SphereonSDKBlockchainEasy/model/ExternalId', 'SphereonSDKBlockchainEasy/model/IdResponse', 'SphereonSDKBlockchainEasy/model/Link', 'SphereonSDKBlockchainEasy/model/VndError', 'SphereonSDKBlockchainEasy/model/VndErrors', 'SphereonSDKBlockchainEasy/api/AllApi', 'SphereonSDKBlockchainEasy/api/ChainApi', 'SphereonSDKBlockchainEasy/api/EntryDataApi', 'SphereonSDKBlockchainEasy/api/IdApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/AnchoredEntryResponse'), require('./model/Chain'), require('./model/CommittedChain'), require('./model/CommittedChainResponse'), require('./model/CommittedEntry'), require('./model/CommittedEntryResponse'), require('./model/Entry'), require('./model/EntryData'), require('./model/ExternalId'), require('./model/IdResponse'), require('./model/Link'), require('./model/VndError'), require('./model/VndErrors'), require('./api/AllApi'), require('./api/ChainApi'), require('./api/EntryDataApi'), require('./api/IdApi'));
  }
}(function(ApiClient, AnchoredEntryResponse, Chain, CommittedChain, CommittedChainResponse, CommittedEntry, CommittedEntryResponse, Entry, EntryData, ExternalId, IdResponse, Link, VndError, VndErrors, AllApi, ChainApi, EntryDataApi, IdApi) {
  'use strict';

  /**
   * bThe_Easy_Blockchain_API_is_an_easy_to_use_API_to_store_entries_within_chains__Currently_it_stores_entries_using_the_bitcoin_blockchain_by_means_of_Factom__In_the_future_other_solutions_will_be_made_availablebThe_flow_is_generally_as_follows1__Make_sure_a_chain_has_been_created_using_the_chain_POST_endpoint__Normaly_you_only_need_one_or_a_handfull_of_chains__This_is_an_expensive_operation_2__Store_entries_on_the_chain_from_step_1__The_entries_will_contain_the_content_and_metadata_you_want_to_store_forever_on_the_specified_chain_3__Retrieve_an_existing_entry_from_the_chain_to_verify_or_retrieve_databInteractive_testing_bA_web_based_test_console_is_available_in_the_a_hrefhttpsstore_sphereon_comSphereon_API_Storea.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var EasyBlockchainApi = require('SphereonSDKBlockchainEasy/index'); // See note below*.
   * var xxxSvc = new EasyBlockchainApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new EasyBlockchainApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['SphereonSDKBlockchainEasy/index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new EasyBlockchainApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new EasyBlockchainApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module SphereonSDKBlockchainEasy/index
   * @version 0.1.0
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:SphereonSDKBlockchainEasy/ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The AnchoredEntryResponse model constructor.
     * @property {module:SphereonSDKBlockchainEasy/model/AnchoredEntryResponse}
     */
    AnchoredEntryResponse: AnchoredEntryResponse,
    /**
     * The Chain model constructor.
     * @property {module:SphereonSDKBlockchainEasy/model/Chain}
     */
    Chain: Chain,
    /**
     * The CommittedChain model constructor.
     * @property {module:SphereonSDKBlockchainEasy/model/CommittedChain}
     */
    CommittedChain: CommittedChain,
    /**
     * The CommittedChainResponse model constructor.
     * @property {module:SphereonSDKBlockchainEasy/model/CommittedChainResponse}
     */
    CommittedChainResponse: CommittedChainResponse,
    /**
     * The CommittedEntry model constructor.
     * @property {module:SphereonSDKBlockchainEasy/model/CommittedEntry}
     */
    CommittedEntry: CommittedEntry,
    /**
     * The CommittedEntryResponse model constructor.
     * @property {module:SphereonSDKBlockchainEasy/model/CommittedEntryResponse}
     */
    CommittedEntryResponse: CommittedEntryResponse,
    /**
     * The Entry model constructor.
     * @property {module:SphereonSDKBlockchainEasy/model/Entry}
     */
    Entry: Entry,
    /**
     * The EntryData model constructor.
     * @property {module:SphereonSDKBlockchainEasy/model/EntryData}
     */
    EntryData: EntryData,
    /**
     * The ExternalId model constructor.
     * @property {module:SphereonSDKBlockchainEasy/model/ExternalId}
     */
    ExternalId: ExternalId,
    /**
     * The IdResponse model constructor.
     * @property {module:SphereonSDKBlockchainEasy/model/IdResponse}
     */
    IdResponse: IdResponse,
    /**
     * The Link model constructor.
     * @property {module:SphereonSDKBlockchainEasy/model/Link}
     */
    Link: Link,
    /**
     * The VndError model constructor.
     * @property {module:SphereonSDKBlockchainEasy/model/VndError}
     */
    VndError: VndError,
    /**
     * The VndErrors model constructor.
     * @property {module:SphereonSDKBlockchainEasy/model/VndErrors}
     */
    VndErrors: VndErrors,
    /**
     * The AllApi service constructor.
     * @property {module:SphereonSDKBlockchainEasy/api/AllApi}
     */
    AllApi: AllApi,
    /**
     * The ChainApi service constructor.
     * @property {module:SphereonSDKBlockchainEasy/api/ChainApi}
     */
    ChainApi: ChainApi,
    /**
     * The EntryDataApi service constructor.
     * @property {module:SphereonSDKBlockchainEasy/api/EntryDataApi}
     */
    EntryDataApi: EntryDataApi,
    /**
     * The IdApi service constructor.
     * @property {module:SphereonSDKBlockchainEasy/api/IdApi}
     */
    IdApi: IdApi
  };

  return exports;
}));