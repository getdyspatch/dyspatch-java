package io.dyspatch.client.api;

import io.dyspatch.client.ApiClient;
import io.dyspatch.client.ApiException;
import io.dyspatch.client.Configuration;
import io.dyspatch.client.auth.ApiKeyAuth;
import io.dyspatch.client.model.InlineObject;
import io.dyspatch.client.model.LocalizationKeyRead;
import io.dyspatch.client.model.LocalizationMetaRead;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.List;

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
        if (basePath != null && basePath.length() > 0) {
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

        String templateId = System.getenv("DYSPATCH_TEMPLATE_ID");
        templates.getTemplateById(templateId, "handlebars", version);
    }

    @Test
    public void getDrafts() throws ApiException {
        drafts.getDrafts(version, "", "");

        String draftId = System.getenv("DYSPATCH_DRAFT_ID");
        drafts.getDraftById(draftId, "handlebars", version);
    }

    @Test
    public void localizations() throws ApiException {
        String draftId = System.getenv("DYSPATCH_DRAFT_ID");
        InlineObject io = new InlineObject();
        io.name("moonbeam");
        drafts.saveLocalization(draftId, "en-CA", version, io);
        List<LocalizationMetaRead> localizations = drafts.getLocalizationForDraft(draftId, version);
        assertThat(localizations, hasSize(1));
        assertThat(localizations.get(0).getName(), equalTo("moonbeam"));

        HashMap<String, String> values = new HashMap<>();
        values.put("test", "value");
        drafts.setTranslation(draftId, "en-CA", version, values);

        List<LocalizationKeyRead> keys = drafts.getDraftLocalizationKeys(draftId, version);
        assertThat(keys, hasSize(0));

        drafts.deleteLocalization(draftId, "en-CA", version);
        localizations = drafts.getLocalizationForDraft(draftId, version);
        assertThat(localizations, hasSize(0));

        drafts.submitDraftForApproval(draftId, version);
    }
}
