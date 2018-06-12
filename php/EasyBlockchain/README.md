# EasyBlockchain
The Easy Blockchain API is an easy to use API to store related entries within chains. Currently it stores entries using a Factom, Ethereum or Multichain blockchain.   For full API documentation please visit: https://docs.sphereon.com/api/easy-blockchain/0.10/html   Interactive testing: A web based test console is available in the Sphereon API store at: https://store.sphereon.com

This PHP package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 0.10
- Package version: 0.10.3-SNAPSHOT
- Build package: io.swagger.codegen.languages.PhpClientCodegen
For more information, please visit [https://sphereon.com](https://sphereon.com)

## Requirements

PHP 5.4.0 and later

## Installation & Usage
### Composer

To install the bindings via [Composer](http://getcomposer.org/), add the following to `composer.json`:

```
{
  "repositories": [
    {
      "type": "git",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
    require_once('/path/to/EasyBlockchain/autoload.php');
```

## Tests

To run the unit tests:

```
composer install
./vendor/bin/phpunit
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\AllApi();
$context = "context_example"; // string | context
$chain_id = "chain_id_example"; // string | chainId

try {
    $result = $api_instance->chainIdExists($context, $chain_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->chainIdExists: ', $e->getMessage(), PHP_EOL;
}

?>
```

## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/easy/0.10*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AllApi* | [**chainIdExists**](docs/Api/AllApi.md#chainidexists) | **GET** /{context}/chains/id/{chainId} | Determine chain id exists
*AllApi* | [**createBackend**](docs/Api/AllApi.md#createbackend) | **POST** /backends | Create a new backend
*AllApi* | [**createChain**](docs/Api/AllApi.md#createchain) | **POST** /{context}/chains | Create a new chain
*AllApi* | [**createContext**](docs/Api/AllApi.md#createcontext) | **POST** /contexts | Create context
*AllApi* | [**createEntry**](docs/Api/AllApi.md#createentry) | **POST** /{context}/chains/{chainId}/entries | Create a new entry in the provided chain
*AllApi* | [**deleteBackend**](docs/Api/AllApi.md#deletebackend) | **DELETE** /backends/{backendId} | Delete a backend
*AllApi* | [**deleteContext**](docs/Api/AllApi.md#deletecontext) | **DELETE** /contexts/{context} | Delete context
*AllApi* | [**determineChainId**](docs/Api/AllApi.md#determinechainid) | **POST** /{context}/chains/id | Predetermine id of chain
*AllApi* | [**determineEntryId**](docs/Api/AllApi.md#determineentryid) | **POST** /{context}/chains/id/{chainId}/entries | Predetermine id of an entry
*AllApi* | [**entryById**](docs/Api/AllApi.md#entrybyid) | **GET** /{context}/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
*AllApi* | [**entryByRequest**](docs/Api/AllApi.md#entrybyrequest) | **POST** /{context}/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
*AllApi* | [**entryIdExists**](docs/Api/AllApi.md#entryidexists) | **GET** /{context}/chains/id/{chainId}/entries/{entryId} | Determine entry id exists
*AllApi* | [**findBackends**](docs/Api/AllApi.md#findbackends) | **GET** /backends/{backendId}/find | Find backends
*AllApi* | [**firstEntry**](docs/Api/AllApi.md#firstentry) | **GET** /{context}/chains/{chainId}/entries/first | Get the first entry in the provided chain
*AllApi* | [**getBackend**](docs/Api/AllApi.md#getbackend) | **GET** /backends/{backendId} | Get backend by id
*AllApi* | [**getContext**](docs/Api/AllApi.md#getcontext) | **GET** /contexts/{context} | Get context
*AllApi* | [**lastEntry**](docs/Api/AllApi.md#lastentry) | **GET** /{context}/chains/{chainId}/entries/last | Get the last entry in the provided chain.
*AllApi* | [**listBackends**](docs/Api/AllApi.md#listbackends) | **GET** /backends | List backends
*AllApi* | [**nextEntryById**](docs/Api/AllApi.md#nextentrybyid) | **GET** /{context}/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
*AllApi* | [**nextEntryByRequest**](docs/Api/AllApi.md#nextentrybyrequest) | **POST** /{context}/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
*AllApi* | [**previousEntryById**](docs/Api/AllApi.md#previousentrybyid) | **GET** /{context}/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
*AllApi* | [**previousEntryByRequest**](docs/Api/AllApi.md#previousentrybyrequest) | **POST** /{context}/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
*BackendApi* | [**createBackend**](docs/Api/BackendApi.md#createbackend) | **POST** /backends | Create a new backend
*BackendApi* | [**deleteBackend**](docs/Api/BackendApi.md#deletebackend) | **DELETE** /backends/{backendId} | Delete a backend
*BackendApi* | [**findBackends**](docs/Api/BackendApi.md#findbackends) | **GET** /backends/{backendId}/find | Find backends
*BackendApi* | [**getBackend**](docs/Api/BackendApi.md#getbackend) | **GET** /backends/{backendId} | Get backend by id
*BackendApi* | [**listBackends**](docs/Api/BackendApi.md#listbackends) | **GET** /backends | List backends
*ChainApi* | [**createChain**](docs/Api/ChainApi.md#createchain) | **POST** /{context}/chains | Create a new chain
*ContextApi* | [**createContext**](docs/Api/ContextApi.md#createcontext) | **POST** /contexts | Create context
*ContextApi* | [**deleteContext**](docs/Api/ContextApi.md#deletecontext) | **DELETE** /contexts/{context} | Delete context
*ContextApi* | [**getContext**](docs/Api/ContextApi.md#getcontext) | **GET** /contexts/{context} | Get context
*EntryApi* | [**createEntry**](docs/Api/EntryApi.md#createentry) | **POST** /{context}/chains/{chainId}/entries | Create a new entry in the provided chain
*EntryApi* | [**entryById**](docs/Api/EntryApi.md#entrybyid) | **GET** /{context}/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
*EntryApi* | [**entryByRequest**](docs/Api/EntryApi.md#entrybyrequest) | **POST** /{context}/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
*EntryApi* | [**firstEntry**](docs/Api/EntryApi.md#firstentry) | **GET** /{context}/chains/{chainId}/entries/first | Get the first entry in the provided chain
*EntryApi* | [**lastEntry**](docs/Api/EntryApi.md#lastentry) | **GET** /{context}/chains/{chainId}/entries/last | Get the last entry in the provided chain.
*EntryApi* | [**nextEntryById**](docs/Api/EntryApi.md#nextentrybyid) | **GET** /{context}/chains/{chainId}/entries/{entryId}/next | Get the entry after the supplied entry Id (the next) in the provided chain
*EntryApi* | [**nextEntryByRequest**](docs/Api/EntryApi.md#nextentrybyrequest) | **POST** /{context}/chains/{chainId}/entries/entry/next | Get the entry after the supplied entry Id (the next) in the provided chain
*EntryApi* | [**previousEntryById**](docs/Api/EntryApi.md#previousentrybyid) | **GET** /{context}/chains/{chainId}/entries/{entryId}/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
*EntryApi* | [**previousEntryByRequest**](docs/Api/EntryApi.md#previousentrybyrequest) | **POST** /{context}/chains/{chainId}/entries/entry/previous | Get the entry before the supplied entry Id (the previous) in the provided chain
*IdApi* | [**chainIdExists**](docs/Api/IdApi.md#chainidexists) | **GET** /{context}/chains/id/{chainId} | Determine chain id exists
*IdApi* | [**determineChainId**](docs/Api/IdApi.md#determinechainid) | **POST** /{context}/chains/id | Predetermine id of chain
*IdApi* | [**determineEntryId**](docs/Api/IdApi.md#determineentryid) | **POST** /{context}/chains/id/{chainId}/entries | Predetermine id of an entry
*IdApi* | [**entryIdExists**](docs/Api/IdApi.md#entryidexists) | **GET** /{context}/chains/id/{chainId}/entries/{entryId} | Determine entry id exists


## Documentation For Models

 - [Access](docs/Model/Access.md)
 - [AnchoredEntryResponse](docs/Model/AnchoredEntryResponse.md)
 - [Backend](docs/Model/Backend.md)
 - [Chain](docs/Model/Chain.md)
 - [CommittedChain](docs/Model/CommittedChain.md)
 - [CommittedChainResponse](docs/Model/CommittedChainResponse.md)
 - [CommittedEntry](docs/Model/CommittedEntry.md)
 - [CommittedEntryResponse](docs/Model/CommittedEntryResponse.md)
 - [Context](docs/Model/Context.md)
 - [Entry](docs/Model/Entry.md)
 - [EntryData](docs/Model/EntryData.md)
 - [Error](docs/Model/Error.md)
 - [ErrorResponse](docs/Model/ErrorResponse.md)
 - [ExternalId](docs/Model/ExternalId.md)
 - [IdResponse](docs/Model/IdResponse.md)
 - [RpcProvider](docs/Model/RpcProvider.md)


## Documentation For Authorization


## oauth2schema

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
 - **global**: accessEverything


## Author

dev@sphereon.com

