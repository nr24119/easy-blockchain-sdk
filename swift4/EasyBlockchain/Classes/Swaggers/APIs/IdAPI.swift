//
// IdAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class IdAPI {
    /**
     Determine chain id exists
     
     - parameter context: (path) context 
     - parameter chainId: (path) chainId 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func chainIdExists(context: String, chainId: String, completion: @escaping ((_ data: IdResponse?,_ error: Error?) -> Void)) {
        chainIdExistsWithRequestBuilder(context: context, chainId: chainId).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Determine chain id exists
     - GET /{context}/chains/id/{chainId}
     - Determine whether the Id of a chain exists in the blockchain
     - OAuth:
       - type: oauth2
       - name: oauth2schema
     - examples: [{contentType=application/json;charset=UTF-8, example={
  "exists" : "True",
  "Id" : "aeiou"
}}]
     
     - parameter context: (path) context 
     - parameter chainId: (path) chainId 

     - returns: RequestBuilder<IdResponse> 
     */
    open class func chainIdExistsWithRequestBuilder(context: String, chainId: String) -> RequestBuilder<IdResponse> {
        var path = "/{context}/chains/id/{chainId}"
        path = path.replacingOccurrences(of: "{context}", with: "\(context)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{chainId}", with: "\(chainId)", options: .literal, range: nil)
        let URLString = EasyBlockchainAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<IdResponse>.Type = EasyBlockchainAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Predetermine id of chain
     
     - parameter context: (path) context 
     - parameter chain: (body) Determine a chain hash. The entry needs at least a (combination of) globally unique external Id in the complete Blockchain network! 
     - parameter checkExistence: (query) Check whether the id exists (optional, default to false)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func determineChainId(context: String, chain: Chain, checkExistence: Bool? = nil, completion: @escaping ((_ data: IdResponse?,_ error: Error?) -> Void)) {
        determineChainIdWithRequestBuilder(context: context, chain: chain, checkExistence: checkExistence).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Predetermine id of chain
     - POST /{context}/chains/id
     - Pre determine the Id of a chain without anchoring it in the blockchain. You determine the Id that the chain would receive once it would have been anchored
     - OAuth:
       - type: oauth2
       - name: oauth2schema
     - examples: [{contentType=application/json;charset=UTF-8, example={
  "exists" : "True",
  "Id" : "aeiou"
}}]
     
     - parameter context: (path) context 
     - parameter chain: (body) Determine a chain hash. The entry needs at least a (combination of) globally unique external Id in the complete Blockchain network! 
     - parameter checkExistence: (query) Check whether the id exists (optional, default to false)

     - returns: RequestBuilder<IdResponse> 
     */
    open class func determineChainIdWithRequestBuilder(context: String, chain: Chain, checkExistence: Bool? = nil) -> RequestBuilder<IdResponse> {
        var path = "/{context}/chains/id"
        path = path.replacingOccurrences(of: "{context}", with: "\(context)", options: .literal, range: nil)
        let URLString = EasyBlockchainAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: chain)

        let url = NSURLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
            "checkExistence": checkExistence
        ])
        

        let requestBuilder: RequestBuilder<IdResponse>.Type = EasyBlockchainAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Predetermine id of an entry
     
     - parameter context: (path) context 
     - parameter chainId: (path) chainId 
     - parameter entry: (body) The entry to determine the hash for on the specified chain 
     - parameter checkExistence: (query) Check whether the id exists (optional, default to false)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func determineEntryId(context: String, chainId: String, entry: Entry, checkExistence: Bool? = nil, completion: @escaping ((_ data: IdResponse?,_ error: Error?) -> Void)) {
        determineEntryIdWithRequestBuilder(context: context, chainId: chainId, entry: entry, checkExistence: checkExistence).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Predetermine id of an entry
     - POST /{context}/chains/id/{chainId}/entries
     - Pre determine the Id of an entry request without anchoring the entry
     - OAuth:
       - type: oauth2
       - name: oauth2schema
     - examples: [{contentType=application/json;charset=UTF-8, example={
  "exists" : "True",
  "Id" : "aeiou"
}}]
     
     - parameter context: (path) context 
     - parameter chainId: (path) chainId 
     - parameter entry: (body) The entry to determine the hash for on the specified chain 
     - parameter checkExistence: (query) Check whether the id exists (optional, default to false)

     - returns: RequestBuilder<IdResponse> 
     */
    open class func determineEntryIdWithRequestBuilder(context: String, chainId: String, entry: Entry, checkExistence: Bool? = nil) -> RequestBuilder<IdResponse> {
        var path = "/{context}/chains/id/{chainId}/entries"
        path = path.replacingOccurrences(of: "{context}", with: "\(context)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{chainId}", with: "\(chainId)", options: .literal, range: nil)
        let URLString = EasyBlockchainAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: entry)

        let url = NSURLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
            "checkExistence": checkExistence
        ])
        

        let requestBuilder: RequestBuilder<IdResponse>.Type = EasyBlockchainAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Determine entry id exists
     
     - parameter context: (path) context 
     - parameter chainId: (path) chainId 
     - parameter entryId: (path) entryId 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func entryIdExists(context: String, chainId: String, entryId: String, completion: @escaping ((_ data: IdResponse?,_ error: Error?) -> Void)) {
        entryIdExistsWithRequestBuilder(context: context, chainId: chainId, entryId: entryId).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Determine entry id exists
     - GET /{context}/chains/id/{chainId}/entries/{entryId}
     - Determine whether the Id of an entry exists in the blockchain
     - OAuth:
       - type: oauth2
       - name: oauth2schema
     - examples: [{contentType=application/json;charset=UTF-8, example={
  "exists" : "True",
  "Id" : "aeiou"
}}]
     
     - parameter context: (path) context 
     - parameter chainId: (path) chainId 
     - parameter entryId: (path) entryId 

     - returns: RequestBuilder<IdResponse> 
     */
    open class func entryIdExistsWithRequestBuilder(context: String, chainId: String, entryId: String) -> RequestBuilder<IdResponse> {
        var path = "/{context}/chains/id/{chainId}/entries/{entryId}"
        path = path.replacingOccurrences(of: "{context}", with: "\(context)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{chainId}", with: "\(chainId)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{entryId}", with: "\(entryId)", options: .literal, range: nil)
        let URLString = EasyBlockchainAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<IdResponse>.Type = EasyBlockchainAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
