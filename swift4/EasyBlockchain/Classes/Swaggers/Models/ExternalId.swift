//
// ExternalId.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** External Id: Allows you to store metadata. External Id bytes are included during Chain Id and Entry Id calculation */
open class ExternalId: Codable {

    /** Metadata value */
    public var value: Data?

    public init() {}

}