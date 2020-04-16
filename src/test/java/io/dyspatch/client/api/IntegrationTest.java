package io.dyspatch.client.api;

import io.dyspatch.client.ApiClient;
import io.dyspatch.client.ApiException;
import io.dyspatch.client.Configuration;
import io.dyspatch.client.auth.*;
import io.dyspatch.client.api.DraftsApi;
import io.dyspatch.client.api.TemplatesApi;

import org.junit.Test;

/**
 * Integration tests.
 * THESE ARE HAND BUILT AND NOT GENERATED, DO NOT DELETE
 */
public class IntegrationTest {
    String version = "application/vnd.dyspatch.2020.04+json";
    ApiClient client;
    DraftsApi drafts;
    TemplatesApi templates;
    ApiKeyAuth auth;

    public IntegrationTest() {
        client = Configuration.getDefaultApiClient();
        client.setApiKey(System.getenv("DYSPATCH_API_KEY"));
        client.setApiKeyPrefix("Bearer");

        templates = new TemplatesApi(client);
        drafts = new DraftsApi(client);
    }

    @Test
    public void getTemplates() throws ApiException {
        templates.getTemplates(version, "");

        String templateId = "tem_01de5teh6k59kya8q92mb01qzq";
        templates.getTemplateById(templateId, "handlebars", version);
    }

    @Test
    public void getDrafts() throws ApiException {
        drafts.getDrafts(version, "", "");

        String draftId = "tdft_01dxkwr0nevs5h2baa3n3dgktp";
        drafts.getDraftById(draftId, "handlebars", version);
    }
}
