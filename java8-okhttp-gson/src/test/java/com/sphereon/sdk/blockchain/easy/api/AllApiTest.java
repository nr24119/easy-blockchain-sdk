/*
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of FACTOM or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.10
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiException;
import com.sphereon.sdk.blockchain.easy.model.AnchoredEntryResponse;
import com.sphereon.sdk.blockchain.easy.model.Backend;
import com.sphereon.sdk.blockchain.easy.model.Chain;
import com.sphereon.sdk.blockchain.easy.model.CommittedChainResponse;
import com.sphereon.sdk.blockchain.easy.model.CommittedEntryResponse;
import com.sphereon.sdk.blockchain.easy.model.Context;
import com.sphereon.sdk.blockchain.easy.model.Entry;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;
import com.sphereon.sdk.blockchain.easy.model.IdResponse;
import java.time.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AllApi
 */
@Ignore
public class AllApiTest {

    private final AllApi api = new AllApi();

    
    /**
     * Determine chain id exists
     *
     * Determine whether the Id of a chain exists in the blockchain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chainIdExistsTest() throws ApiException {
        String context = null;
        String chainId = null;
        IdResponse response = api.chainIdExists(context, chainId);

        // TODO: test validations
    }
    
    /**
     * Create a new backend
     *
     * Create a new backend
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBackendTest() throws ApiException {
        Backend backend = null;
        Backend response = api.createBackend(backend);

        // TODO: test validations
    }
    
    /**
     * Create a new chain
     *
     * Create a new chain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChainTest() throws ApiException {
        String context = null;
        Chain chain = null;
        CommittedChainResponse response = api.createChain(context, chain);

        // TODO: test validations
    }
    
    /**
     * Create context
     *
     * Create a new context
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createContextTest() throws ApiException {
        Context context = null;
        Context response = api.createContext(context);

        // TODO: test validations
    }
    
    /**
     * Create a new entry in the provided chain
     *
     * Create a new entry in the provided chain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEntryTest() throws ApiException {
        String context = null;
        String chainId = null;
        Entry entry = null;
        OffsetDateTime currentAnchorTime = null;
        CommittedEntryResponse response = api.createEntry(context, chainId, entry, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Delete a backend
     *
     * Delete backend by id (not by ledgername)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBackendTest() throws ApiException {
        String backendId = null;
        Backend response = api.deleteBackend(backendId);

        // TODO: test validations
    }
    
    /**
     * Delete context
     *
     * Delete an existing context
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteContextTest() throws ApiException {
        String context = null;
        Context response = api.deleteContext(context);

        // TODO: test validations
    }
    
    /**
     * Predetermine id of chain
     *
     * Pre determine the Id of a chain request without anchoring it in the blockchain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void determineChainIdTest() throws ApiException {
        String context = null;
        Chain chain = null;
        Boolean checkExistence = null;
        IdResponse response = api.determineChainId(context, chain, checkExistence);

        // TODO: test validations
    }
    
    /**
     * Predetermine id of an entry
     *
     * Pre determine the Id of an entry request without anchoring the entry
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void determineEntryIdTest() throws ApiException {
        String context = null;
        String chainId = null;
        Entry entry = null;
        Boolean checkExistence = null;
        IdResponse response = api.determineEntryId(context, chainId, entry, checkExistence);

        // TODO: test validations
    }
    
    /**
     * Get an existing entry in the provided chain
     *
     * Get an existing entry in the provided chain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entryByIdTest() throws ApiException {
        String context = null;
        String chainId = null;
        String entryId = null;
        OffsetDateTime currentAnchorTime = null;
        AnchoredEntryResponse response = api.entryById(context, chainId, entryId, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get an existing entry in the provided chain
     *
     * Get an existing entry in the provided chain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entryByRequestTest() throws ApiException {
        String context = null;
        String chainId = null;
        Entry entry = null;
        OffsetDateTime currentAnchorTime = null;
        AnchoredEntryResponse response = api.entryByRequest(context, chainId, entry, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Determine entry id exists
     *
     * Determine whether the Id of an entry exists in the blockchain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entryIdExistsTest() throws ApiException {
        String context = null;
        String chainId = null;
        String entryId = null;
        IdResponse response = api.entryIdExists(context, chainId, entryId);

        // TODO: test validations
    }
    
    /**
     * Find backends
     *
     * Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findBackendsTest() throws ApiException {
        String backendId = null;
        Boolean includePublic = null;
        List<Backend> response = api.findBackends(backendId, includePublic);

        // TODO: test validations
    }
    
    /**
     * Get the first entry in the provided chain
     *
     * Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void firstEntryTest() throws ApiException {
        String context = null;
        String chainId = null;
        AnchoredEntryResponse response = api.firstEntry(context, chainId);

        // TODO: test validations
    }
    
    /**
     * Get backend
     *
     * Get existing backend by id (not by ledgername). Optionally including public backend of others
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBackendTest() throws ApiException {
        String backendId = null;
        Boolean includePublic = null;
        Backend response = api.getBackend(backendId, includePublic);

        // TODO: test validations
    }
    
    /**
     * Get context
     *
     * Get an existing context
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContextTest() throws ApiException {
        String context = null;
        Context response = api.getContext(context);

        // TODO: test validations
    }
    
    /**
     * Get the last entry in the provided chain.
     *
     * Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lastEntryTest() throws ApiException {
        String context = null;
        String chainId = null;
        AnchoredEntryResponse response = api.lastEntry(context, chainId);

        // TODO: test validations
    }
    
    /**
     * List backends
     *
     * List existing backends.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBackendsTest() throws ApiException {
        List<Backend> response = api.listBackends();

        // TODO: test validations
    }
    
    /**
     * Get the entry after the supplied entry Id (the next) in the provided chain
     *
     * Get the entry after the supplied entry Id (the next) in the provided chain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nextEntryByIdTest() throws ApiException {
        String context = null;
        String chainId = null;
        String entryId = null;
        OffsetDateTime currentAnchorTime = null;
        AnchoredEntryResponse response = api.nextEntryById(context, chainId, entryId, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get the entry after the supplied entry Id (the next) in the provided chain
     *
     * Get the entry after the supplied entry Id (the next) in the provided chain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nextEntryByRequestTest() throws ApiException {
        String context = null;
        String chainId = null;
        Entry entry = null;
        OffsetDateTime currentAnchorTime = null;
        AnchoredEntryResponse response = api.nextEntryByRequest(context, chainId, entry, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get the entry before the supplied entry Id (the previous) in the provided chain
     *
     * Get the entry before the supplied entry Id (the previous) in the provided chain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void previousEntryByIdTest() throws ApiException {
        String context = null;
        String chainId = null;
        String entryId = null;
        OffsetDateTime currentAnchorTime = null;
        AnchoredEntryResponse response = api.previousEntryById(context, chainId, entryId, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get the entry before the supplied entry Id (the previous) in the provided chain
     *
     * Get the entry before the supplied entry Id (the previous) in the provided chain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void previousEntryByRequestTest() throws ApiException {
        String context = null;
        String chainId = null;
        Entry entry = null;
        OffsetDateTime currentAnchorTime = null;
        AnchoredEntryResponse response = api.previousEntryByRequest(context, chainId, entry, currentAnchorTime);

        // TODO: test validations
    }
    
}
