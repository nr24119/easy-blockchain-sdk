//
// CommittedEntryResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Committed EntryData response */
open class CommittedEntryResponse: Codable {

    public var entry: CommittedEntry?
    /** The time at which the entry creation was first requested in ISO 8601 format */
    public var commitTime: Date?
    /** The time at which the entry creation was first requested in ISO 8601 format */
    public var creationRequestTime: Date?

    public init() {}

}