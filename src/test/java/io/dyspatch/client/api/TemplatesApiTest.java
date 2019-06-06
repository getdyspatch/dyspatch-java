/*
 * Dyspatch API
 * # Introduction  The Dyspatch API is based on the REST paradigm, and features resource based URLs with standard HTTP response codes to indicate errors. We use standard HTTP authentication and request verbs, and all responses are JSON formatted. See our [Implementation Guide](https://docs.dyspatch.io/development/implementing_dyspatch/) for more details on how to implement Dyspatch.  ## API Client Libraries  Dyspatch provides API Clients for popular languages and web frameworks.   - [Java](https://github.com/getdyspatch/dyspatch-java) - [Javascript](https://github.com/getdyspatch/dyspatch-javascript) - [Python](https://github.com/getdyspatch/dyspatch-python) - [C#](https://github.com/getdyspatch/dyspatch-dotnet) - [Go](https://github.com/getdyspatch/dyspatch-golang) - [Ruby](https://github.com/getdyspatch/dyspatch-ruby) 
 *
 * OpenAPI spec version: 2019.03
 * Contact: support@dyspatch.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.dyspatch.client.api;

import io.dyspatch.client.ApiException;
import io.dyspatch.client.model.APIError;
import io.dyspatch.client.model.TemplateRead;
import io.dyspatch.client.model.TemplatesRead;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplatesApi
 */
@Ignore
public class TemplatesApiTest {

    private final TemplatesApi api = new TemplatesApi();

    /**
     * List Templates
     *
     * Gets a list of Template Metadata objects for all templates. Up to 25 results returned before results are paginated.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templatesGetTest() throws ApiException {
        String cursor = null;
        String accept = null;
        TemplatesRead response = api.templatesGet(cursor, accept);

        // TODO: test validations
    }
    /**
     * Get Template by ID
     *
     * Gets a template object with the matching ID. If the template has published content the \&quot;compiled\&quot; field will contain the template .
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templatesTemplateIdGetTest() throws ApiException {
        String templateId = null;
        String targetLanguage = null;
        String accept = null;
        TemplateRead response = api.templatesTemplateIdGet(templateId, targetLanguage, accept);

        // TODO: test validations
    }
}
