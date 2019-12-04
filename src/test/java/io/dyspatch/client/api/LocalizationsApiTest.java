/*
 * Dyspatch API
 * # Introduction  The Dyspatch API is based on the REST paradigm and features resource based URLs with standard HTTP response codes to indicate errors. We use standard HTTP authentication and request verbs and all responses are JSON formatted. See our [Implementation Guide](https://docs.dyspatch.io/development/implementing_dyspatch/) for more details on how to implement Dyspatch.  ## API Client Libraries  Dyspatch provides API Clients for the following languages and web frameworks:  - [Java](https://github.com/getdyspatch/dyspatch-java) - [Javascript](https://github.com/getdyspatch/dyspatch-javascript) - [Python](https://github.com/getdyspatch/dyspatch-python) - [C#](https://github.com/getdyspatch/dyspatch-dotnet) - [Go](https://github.com/getdyspatch/dyspatch-golang) - [Ruby](https://github.com/getdyspatch/dyspatch-ruby) 
 *
 * OpenAPI spec version: 2019.10
 * Contact: support@dyspatch.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.dyspatch.client.api;

import io.dyspatch.client.ApiException;
import io.dyspatch.client.model.APIError;
import io.dyspatch.client.model.LocalizationRead;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocalizationsApi
 */
@Ignore
public class LocalizationsApiTest {

    private final LocalizationsApi api = new LocalizationsApi();

    
    /**
     * Get Localization Object by ID
     *
     * Returns a specific localization object with a matching ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void localizationsLocalizationIdGetTest() throws ApiException {
        String localizationId = null;
        String targetLanguage = null;
        LocalizationRead response = api.localizationsLocalizationIdGet(localizationId, targetLanguage);

        // TODO: test validations
    }
    
}
