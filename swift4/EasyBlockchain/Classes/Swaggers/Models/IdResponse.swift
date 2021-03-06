//
// IdResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Id response */
open class IdResponse: Codable {

    public enum Exists: String, Codable { 
        case _true = "True"
        case _false = "False"
        case unknown = "Unknown"
    }
    public var exists: Exists?
    /** The Id */
    public var id: String?

    public init() {}

}
