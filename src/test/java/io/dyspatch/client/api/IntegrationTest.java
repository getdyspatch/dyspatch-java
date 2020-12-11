package io.dyspatch.client.api;

import io.dyspatch.client.ApiClient;
import io.dyspatch.client.ApiException;
import io.dyspatch.client.Configuration;
import io.dyspatch.client.auth.*;
import io.dyspatch.client.api.DraftsApi;
import io.dyspatch.client.api.TemplatesApi;

import io.dyspatch.client.model.InlineObject;
import org.junit.Test;

/**
 * Integration tests.
 * THESE ARE HAND BUILT AND NOT GENERATED, DO NOT DELETE
 */
public class IntegrationTest {
    String version = "application/vnd.dyspatch.2020.11+json";
    ApiClient client;
    DraftsApi drafts;
    TemplatesApi templates;
    ApiKeyAuth auth;

    public IntegrationTest() {
        client = Configuration.getDefaultApiClient();
        String basePath = System.getenv("DYSPATCH_BASE_PATH");
        if (basePath.length() > 0) {
            client.setBasePath(basePath);
        }
        client.setApiKey(System.getenv("DYSPATCH_API_KEY"));
        client.setApiKeyPrefix("Bearer");

        templates = new TemplatesApi(client);
        drafts = new DraftsApi(client);
    }

    @Test
    public void getTemplates() throws ApiException {
        templates.getTemplates(version, "");

        String templateId = System.getenv("templateId");
        templates.getTemplateById(templateId, "handlebars", version);
    }

    @Test
    public void getDrafts() throws ApiException {
        drafts.getDrafts(version, "", "");

        String draftId = System.getenv("draftId");
        drafts.getDraftById(draftId, "handlebars", version);
    }

    @Test
    public void localizations() throws ApiException {
        String draftId = System.getenv("draftId");
        InlineObject io = new InlineObject();
        io.name("moonbeam");
        drafts.saveLocalization(draftId, "en-CA", version, io);
    }
}
