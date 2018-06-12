//
// CommittedEntry.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Committed Entry */
open class CommittedEntry: Codable {

    public var entry: Entry?
    /** Chain ID */
    public var chainId: String?
    /** Raw data structures of backend */
    public var rawBackendStructure: String?
    /** Entry ID */
    public var entryId: String?

    public init() {}

}