// Copyright 2020 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.engine.shared.core.operational.logs;

public enum LoggingEventType
{
    SERVER_START,

    CATCH_ALL,
    JSON_PARSING_ERROR,

    CODE_GENERATION_ERROR,
    SCHEMA_GENERATION_ERROR,

    EXTERNAL_FORMAT_ERROR,
    GENERATE_EXTERNAL_FORMAT_SCHEMA_START,
    GENERATE_EXTERNAL_FORMAT_SCHEMA_STOP,
    GENERATE_EXTERNAL_FORMAT_SCHEMA_ERROR,
    GENERATE_EXTERNAL_FORMAT_SCHEMA_INTERACTIVE_START,
    GENERATE_EXTERNAL_FORMAT_SCHEMA_INTERACTIVE_STOP,
    GENERATE_EXTERNAL_FORMAT_SCHEMA_INTERACTIVE_ERROR,
    GENERATE_EXTERNAL_FORMAT_MODEL_START,
    GENERATE_EXTERNAL_FORMAT_MODEL_STOP,
    GENERATE_EXTERNAL_FORMAT_MODEL_ERROR,
    GENERATE_EXTERNAL_FORMAT_MODEL_INTERACTIVE_START,
    GENERATE_EXTERNAL_FORMAT_MODEL_INTERACTIVE_STOP,
    GENERATE_EXTERNAL_FORMAT_MODEL_INTERACTIVE_ERROR,

    GENERATE_JAVA_START,
    GENERATE_JAVA_STOP,
    GENERATE_JAVA_ERROR,
    GENERATE_JAVA_INTERACTIVE_START,
    GENERATE_JAVA_INTERACTIVE_STOP,
    GENERATE_JAVA_INTERACTIVE_ERROR,

    GENERATE_ROSETTA_START,
    GENERATE_ROSETTA_STOP,
    GENERATE_ROSETTA_ERROR,
    GENERATE_ROSETTA_INTERACTIVE_START,
    GENERATE_ROSETTA_INTERACTIVE_STOP,
    GENERATE_ROSETTA_INTERACTIVE_ERROR,

    GENERATE_MORPHIR_START,
    GENERATE_MORPHIR_STOP,
    GENERATE_MORPHIR_ERROR,
    GENERATE_MORPHIR_INTERACTIVE_START,
    GENERATE_MORPHIR_INTERACTIVE_STOP,
    GENERATE_MORPHIR_INTERACTIVE_ERROR,

    GENERATE_AVRO_CODE_START,
    GENERATE_AVRO_CODE_STOP,
    GENERATE_AVRO_CODE_ERROR,
    GENERATE_AVRO_CODE_INTERACTIVE_START,
    GENERATE_AVRO_CODE_INTERACTIVE_STOP,
    GENERATE_AVRO_CODE_INTERACTIVE_ERROR,

    GENERATE_GRAPHQL_CODE_START,
    GENERATE_GRAPHQL_CODE_STOP,
    GENERATE_GRAPHQL_CODE_ERROR,
    GENERATE_GRAPHQL_CODE_INTERACTIVE_START,
    GENERATE_GRAPHQL_CODE_INTERACTIVE_STOP,
    GENERATE_GRAPHQL_CODE_INTERACTIVE_ERROR,

    GENERATE_DAML_CODE_START,
    GENERATE_DAML_CODE_STOP,
    GENERATE_DAML_CODE_ERROR,

    GENERATE_PROTOBUF_CODE_START,
    GENERATE_PROTOBUF_CODE_STOP,
    GENERATE_PROTOBUF_CODE_ERROR,
    GENERATE_PROTOBUF_CODE_INTERACTIVE_START,
    GENERATE_PROTOBUF_CODE_INTERACTIVE_STOP,
    GENERATE_PROTOBUF_CODE_INTERACTIVE_ERROR,

    GENERATE_VERSION_START,
    GENERATE_VERSION_STOP,
    GENERATE_VERSION_ERROR,
    GENERATE_VERSION_INTERACTIVE_START,
    GENERATE_VERSION_INTERACTIVE_STOP,
    GENERATE_VERSION_INTERACTIVE_ERROR,

    GENERATE_FROM_SCHEMA_START,
    GENERATE_FROM_SCHEMA_STOP,
    GENERATE_FROM_SCHEMA_ERROR,
    GENERATE_FROM_SCHEMA_INTERACTIVE_START,
    GENERATE_FROM_SCHEMA_INTERACTIVE_STOP,
    GENERATE_FROM_SCHEMA_INTERACTIVE_ERROR,

    GRAMMAR_PARSING_ERROR,
    TRANSFORM_GRAMMAR_TO_JSON_ERROR,
    TRANSFORM_JSON_TO_GRAMMAR_ERROR,
    TRANSFORM_GRAMMAR_TO_JSON_STOP,
    TRANSFORM_JSON_TO_GRAMMAR_STOP,
    TRANSFORM_RELATIONAL_OPERATION_ELEMENT_GRAMMAR_TO_JSON_ERROR,
    TRANSFORM_RELATIONAL_OPERATION_ELEMENT_JSON_TO_GRAMMAR_ERROR,

    TRANSFORM_XSD_TO_PROTOCOL_ERROR,

    EXECUTE_INTERACTIVE_START,
    EXECUTE_INTERACTIVE_STOP,
    EXECUTE_INTERACTIVE_ERROR,
    EXECUTE_DYNAMIC_COMPILATION_STOP,
    EXECUTE_CONSTANT_RESPONSE_ERROR,

    TDS_PROTOCOL_START,
    TDS_PROTOCOL_STOP,
    TDS_PROTOCOL_ERROR,
    TDS_EXECUTE_ERROR,
    TDS_GENERATE_CODE_ERROR,
    TDS_SCHEMA_ERROR,
    TDS_LAMBDA_ERROR,
    TDS_METADATA_ERROR,
    TDS_INPUTS_ERROR,

    EXECUTION_RELATIONAL_START,
    EXECUTION_RELATIONAL_REPROCESS_SQL,
    EXECUTION_RELATIONAL_STOP,
    EXECUTION_RELATIONAL_COMMIT,
    EXECUTION_RELATIONAL_ROLLBACK,

    METADATA_LOAD_FROM_URL,
    METADATA_REQUEST_PACKAGE_START,
    METADATA_REQUEST_PACKAGE_STOP,
    METADATA_REQUEST_MAPPING_START,
    METADATA_REQUEST_MAPPING_STOP,
    METADATA_REQUEST_SERVICE_START,
    METADATA_REQUEST_SERVICE_STOP,
    METADATA_REQUEST_STORE_START,
    METADATA_REQUEST_STORE_STOP,
    METADATA_REQUEST_ALLOY_PROJECT_START,
    METADATA_REQUEST_ALLOY_PROJECT_STOP,

    COMPILE_ERROR,
    PARSE_ERROR,

    GRAPH_START,
    GRAPH_INITIALIZED,
    GRAPH_POST_VALIDATION_COMPLETED,
    GRAPH_PARSED,
    GRAPH_EXPRESSION_ERROR,
    GRAPH_MISSING_FUNCTION,
    GRAPH_WRONG_FUNCTION_MATCHING_WARN,
    GRAPH_DOMAIN_BUILT,
    GRAPH_STORES_BUILT,
    GRAPH_MAPPINGS_BUILT,
    GRAPH_CONNECTIONS_AND_RUNTIMES_BUILT,
    GRAPH_SERVICES_BUILT,
    GRAPH_CACHEABLES_BUILT,
    GRAPH_CACHES_BUILT,
    GRAPH_PIPELINES_BUILT,
    GRAPH_FLATTENSPECIFICATIONS_BUILT,
    GRAPH_GENERATION_TREES_BUILT,
    GRAPH_SERIALIZABLE_MODEL_SPECIFICATIONS_BUILT,
    GRAPH_DATASTORESPECIFICATIONS_BUILT,
    GRAPH_DIAGRAMS_BUILT,
    GRAPH_OTHER_ELEMENTS_BUILT_PRE_STORES,
    GRAPH_OTHER_ELEMENTS_BUILT_POST_CONNECTIONS_AND_RUNTIMES,
    GRAPH_STOP,
    GRAPH_ERROR,

    PLAN_GENERATED,

    DSB_EXECUTE_START,
    DSB_EXECUTE_STOP,
    DSB_EXECUTE_ERROR,

    TEMP_FILE_CREATED,
    TEMP_FILE_DELETED,
    TEMP_FILE_DELETE_ERROR,

    SERVICE_FACADE_W_UPDATE_ACTIVE_FOR_PATTERN,
    SERVICE_FACADE_W_UPDATE_ACTIVE_FOR_PATTERN_SUCCESS,
    SERVICE_FACADE_W_UPDATE_ACTIVE_FOR_PATTERN_ERROR,
    SERVICE_FACADE_W_DELETE_ACTIVE_FOR_PATTERN,
    SERVICE_FACADE_W_DELETE_ACTIVE_FOR_PATTERN_SUCCESS,
    SERVICE_FACADE_W_DELETE_ACTIVE_FOR_PATTERN_ERROR,
    SERVICE_FACADE_R_GET_SERVER_UPDATE_INFO,
    SERVICE_FACADE_R_GET_SERVER_UPDATE_INFO_ERROR,
    SERVICE_BROADCAST_UPDATE,
    SERVICE_BROADCAST_UPDATE_ERROR,
    SERVICE_BROADCAST_DELETE,
    SERVICE_BROADCAST_DELETE_ERROR,
    SERVICE_FACADE_R_GET_CLUSTER_UPDATE_INFO,
    SERVICE_FACADE_R_GET_CLUSTER_UPDATE_INFO_ERROR,

    SERVICE_FACADE_W_REGISTER_SERVICE,
    SERVICE_FACADE_W_REGISTER_SERVICE_SEMI_INTERACTIVE,
    SERVICE_FACADE_W_REGISTER_SERVICE_FULL_INTERACTIVE,
    SERVICE_FACADE_W_UPDATE_SERVICE_VERSION_USING_SDLC,
    SERVICE_FACADE_W_GENERATE_ASSET_FOR_SERVICE_VERSION,
    SERVICE_FACADE_W_SET_GENERATION_AS_ACTIVE,
    SERVICE_FACADE_W_DELETE_SERVICE,
    SERVICE_FACADE_W_WRITE_GENERATION_INFO_ERROR,
    SERVICE_FACADE_W_WRITE_MODEL_DATA_ERROR,
    SERVICE_FACADE_R_LIST_ALL_SERVICES,
    SERVICE_FACADE_R_GET_SERVICE_BY_URI_TEMPLATE,
    SERVICE_FACADE_R_GET_SERVICE_VERSION_BY_ID,
    SERVICE_FACADE_R_GET_CACHED_MODEL_BY_ID,
    SERVICE_FACADE_R_GET_ACTIVE_GENERATION_FOR_URI_TEMPLATE,
    SERVICE_FACADE_R_GET_ACTIVE_GENERATION_INFO_FOR_URI_TEMPLATE,
    SERVICE_FACADE_R_GET_GENERATION_BY_ID,
    SERVICE_FACADE_R_GET_GENERATIONS_FOR_SERVICE_VERSION,
    SERVICE_FACADE_R_GET_GENERATIONS_BY_URI_TEMPLATE,
    SERVICE_FACADE_R_GET_ACTIVE_GENERATIONS_NEEDING_UPDATE,
    SERVICE_FACADE_R_GET_STATS_FOR_URI_TEMPLATE,
    SERVICE_FACADE_R_TEST_SERVICE,
    SERVICE_FACADE_R_TEST_SERVICE_SEMI_INTERACTIVE,
    SERVICE_FACADE_R_TEST_SERVICE_FULL_INTERACTIVE,
    SERVICE_FACADE_R_HEALTH_REFERENTIAL_INTEGRITY,
    SERVICE_FACADE_R_HEALTH_DELINQUENT_SERVICES,
    SERVICE_STATE_INIT,
    SERVICE_SET_ACTIVE,
    SERVICE_UPDATE,
    SERVICE_WRITE,
    SERVICE_ERROR,
    SERVICE_EXECUTE_ERROR,
    SERVICE_TEST_EXECUTE_ERROR,
    SERVICE_REFRESH_ACTIVE_SERVICES_START,
    SERVICE_REFRESHING_SERVICE,
    SERVICE_REFRESHING_SERVICE_ERROR,
    SERVICE_REFRESH_ACTIVE_SERVICES_STOP,
    SERVICE_UPDATE_ACTIVE_SERVICES_START,
    SERVICE_UPDATING_SERVICE,
    SERVICE_UPDATING_SERVICE_NOT_NEEDED,
    SERVICE_UPDATING_SERVICE_ERROR,
    SERVICE_UPDATE_ACTIVE_SERVICES_STOP,
    SERVICE_CLEANUP_UNUSED_MODELS,
    SERVICE_ENSURE_GENERATIONS_RECORDED_START,
    SERVICE_ENSURE_GENERATIONS_RECORDED_STOP,

    SERVICE_CREATE_METRIC_ERROR,

    USER_EXECUTION_START,
    USER_EXECUTION_END,
    USER_EXECUTION_ERROR,

    SANITY_JIRA_REQUEST,
    SANITY_JIRA_ERROR,

    GENERATE_PLAN_AND_MORE_START,
    GENERATE_PLAN_AND_MORE_FOUND_EXISTING_PLAN,
    GENERATE_PLAN_START,
    GENERATE_PLAN_STOP,
    GENERATE_PLAN_ERROR,
    GENERATE_RUN_TEST_START,
    GENERATE_RUN_TEST_STOP,
    GENERATE_LINEAGE_START,
    GENERATE_LINEAGE_STOP,

    LIGHT_SCHEDULER_REGISTER,
    LIGHT_SCHEDULER_FORCE_START,
    LIGHT_SCHEDULER_EXECUTE_START,
    LIGHT_SCHEDULER_EXECUTE_STOP,
    LIGHT_SCHEDULER_EXECUTE_ERROR,

    URL_FACTORY_REGISTERED,
    URL_FACTORY_REGISTER_FAILED,

    MODEL_COMPARE_START,
    MODEL_COMPARE_ERROR,
    MODEL_COMPARE_STOP,
    MODEL_BACKWARD_COMPATIBLE_START,
    MODEL_BACKWARD_COMPATIBLE_ERROR,
    MODEL_BACKWARD_COMPATIBLE_STOP,
    MODEL_RESOLVE_ERROR,

    GENERATE_SEED_DATA_START,
    GENERATE_SEED_DATA_STOP,
    GENERATE_SEED_DATA_ERROR,
    GENERATE_TEST_DATA_START,
    GENERATE_TEST_DATA_STOP,
    GENERATE_TEST_DATA_ERROR,

    GENERATE_SLANG_START,
    GENERATE_SLANG_STOP,
    GENERATE_SLANG_ERROR,
    GENERATE_SLANG_INTERACTIVE_START,
    GENERATE_SLANG_INTERACTIVE_STOP,
    GENERATE_SLANG_INTERACTIVE_ERROR,

    GENERATE_JSONSCHEMA_START,
    GENERATE_JSONSCHEMA_STOP,
    GENERATE_JSONSCHEMA_ERROR,
    GENERATE_JSONSCHEMA_INTERACTIVE_START,
    GENERATE_JSONSCHEMA_INTERACTIVE_STOP,
    GENERATE_JSONSCHEMA_INTERACTIVE_ERROR,

    GENERATE_MODEL_CACHE_FETCH_EXECUTION_STATS_ERROR,
    GENERATE_MODEL_CACHE_GENERATE_CACHING_PLAN_ERROR,
    GENERATE_MODEL_CACHE_ALLOCATE_CACHE_RUNTIME_ERROR,
    GENERATE_MODEL_CACHE_GENERATE_CACHE_DEF_ERROR,
    GENERATE_MODEL_CACHE_GENERATE_PIPELINE_PLAN_ERROR,
    GENERATE_MODEL_CACHE_REGISTER_PIPELINE_PLAN_ERROR,

    TRANSFORM_FLATTEN,
    TRANSFORM_EXECUTE_ERROR,
    TRANSFORM_FLATTEN_ERROR,
    TRANSFORM_EXECUTE,

    LINEAGE_FUNCTION_TREE_START,
    LINEAGE_FUNCTION_TREE_STOP,
    LINEAGE_FUNCTION_TREE_ERROR,
    LINEAGE_CLASS_LINEAGE_START,
    LINEAGE_CLASS_LINEAGE_STOP,
    LINEAGE_CLASS_LINEAGE_ERROR,
    LINEAGE_RELATION_TREE_START,
    LINEAGE_RELATION_TREE_STOP,
    LINEAGE_RELATION_TREE_ERROR,
    LINEAGE_DATABASE_LINEAGE_START,
    LINEAGE_DATABASE_LINEAGE_STOP,
    LINEAGE_DATABASE_LINEAGE_ERROR,
    LINEAGE_REPORT_LINEAGE_START,
    LINEAGE_REPORT_LINEAGE_STOP,
    LINEAGE_REPORT_LINEAGE_ERROR,

    EXECUTION_PLAN_GENERATION_START,
    EXECUTION_PLAN_GENERATION_STOP,
    EXECUTION_PLAN_GENERATION_ERROR,

    EXECUTION_PLAN_GENERATION_DEBUG_START,
    EXECUTION_PLAN_GENERATION_DEBUG_STOP,
    EXECUTION_PLAN_GENERATION_DEBUG_ERROR,

    EXECUTION_PLAN_EXEC_START,
    EXECUTION_PLAN_EXEC_STOP,
    EXECUTION_PLAN_EXEC_ERROR,

    JAVA_COMPILATION_START,
    JAVA_COMPILATION_STOP,
    JAVA_COMPILATION_ERROR,

    URL_ENCRYPTION_INVALID_KEY_EXCEPTION,
    URL_ENCRYPTION_NO_SUCH_ALGORITHM,
    URL_ENCRYPTION_INVALID_KEY_SPEC_EXCEPTION,
    URL_ENCRYPTION_NO_SUCH_PADDING,
    URL_ENCRYPTION_INVALID_ALGORITHM_PARAMETER_EXCEPTION,

    GET_QUERY_EVENTS_ERROR,
    GET_QUERIES_ERROR,
    GET_QUERY_ERROR,
    CREATE_QUERY_ERROR,
    UPDATE_QUERY_ERROR,
    DELETE_QUERY_ERROR,
    PURE_QUERY_EXECUTE_ERROR,

    TESTABLE_DO_TESTS_START,
    TESTABLE_DO_TESTS_STOP,
    TESTABLE_DO_TESTS_ERROR,

    ANALYTICS_ERROR,
    ERROR_MANAGEMENT_ERROR,

    LAMBDA_RETURN_TYPE_ERROR,
    COMPILE_MODEL_ERROR,

    MIDDLETIER_SERVICE_REGISTRATION,
    MIDDLETIER_SERVICE_REGISTRATION_ERROR,
    MIDDLETIER_INTERACTIVE_EXECUTION,
    MIDDLETIER_INTERACTIVE_EXECUTION_ERROR,
    MIDDLETIER_INTERACTIVE_EXECUTION_AUTHORIZATION_ERROR,
    MIDDLETIER_SERVICE_EXECUTION,
    MIDDLETIER_SERVICE_EXECUTION_ERROR,
    MIDDLETIER_SERVICE_EXECUTION_AUTHORIZATION_ERROR,
    MIDDLETIER_AUTHORIZATION_MAC_VERIFICATION,
    MIDDLETIER_AUTHORIZATION_MAC_VERIFICATION_ERROR,
    MIDDLETIER_CREDENTIAL_ACQUISITION,

    EXPLAIN_SERVICE_EXECUTION_ERROR,
    EXPLAIN_INTERACTIVE_EXECUTION_ERROR,
}
