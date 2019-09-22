package org.openapitools.codegen.languages;

public enum TemplateType {

    CLIENT_API(DirectoryConstants.CLIENT_API_FOLDER),
    CLIENT_APICLIENT(DirectoryConstants.CLIENT_FOLDER),
    CLIENT_AUTH(DirectoryConstants.CLIENT_AUTH_FOLDER),
    CLIENT_MODEL(DirectoryConstants.CLIENT_MODEL_FOLDER),
    CLIENT_RESOURCE(DirectoryConstants.CLIENT_RESOURCE_FOLDER),
    SERVER_API(DirectoryConstants.SERVER_API_FOLDER),
    SERVER_MODEL_TEST(DirectoryConstants.MODEL_TEST_FOLDER),
    SERVER_MODEL(DirectoryConstants.SERVER_MODEL_FOLDER),
    SERVER_RESOURCE(DirectoryConstants.SERVER_RESOURCE_FOLDER);

    final String folder;

    TemplateType(final String folder) {
        this.folder = folder;
    }

    public String getFolder() {
        return this.folder;
    }

    @Override
    public String toString() {
        return this.folder;
    }
}
