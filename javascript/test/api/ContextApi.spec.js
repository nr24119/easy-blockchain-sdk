/**
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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.EasyBlockchainApi);
  }
}(this, function(expect, EasyBlockchainApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new EasyBlockchainApi.ContextApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('ContextApi', function() {
    describe('createBackend', function() {
      it('should call createBackend successfully', function(done) {
        //uncomment below and update the code to test createBackend
        //instance.createBackend(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createContext', function() {
      it('should call createContext successfully', function(done) {
        //uncomment below and update the code to test createContext
        //instance.createContext(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteBackend', function() {
      it('should call deleteBackend successfully', function(done) {
        //uncomment below and update the code to test deleteBackend
        //instance.deleteBackend(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('findBackends', function() {
      it('should call findBackends successfully', function(done) {
        //uncomment below and update the code to test findBackends
        //instance.findBackends(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBackend', function() {
      it('should call getBackend successfully', function(done) {
        //uncomment below and update the code to test getBackend
        //instance.getBackend(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getContext', function() {
      it('should call getContext successfully', function(done) {
        //uncomment below and update the code to test getContext
        //instance.getContext(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listBackends', function() {
      it('should call listBackends successfully', function(done) {
        //uncomment below and update the code to test listBackends
        //instance.listBackends(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
