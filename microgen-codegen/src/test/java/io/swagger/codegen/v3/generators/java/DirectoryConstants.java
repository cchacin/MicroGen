package io.swagger.codegen.v3.generators.java;

class DirectoryConstants {
    private static final String MAIN_FOLDER     = "src/main/";
    private static final String JAVA_FOLDER     = DirectoryConstants.MAIN_FOLDER + "java/";
    static final         String CLIENT_FOLDER   = DirectoryConstants.JAVA_FOLDER + "io/swagger/client/";
    private static final String SERVER_FOLDER   = DirectoryConstants.JAVA_FOLDER + "io/swagger/server/";
    private static final String MODEL_FOLDER    = "model/";
    private static final String API_FOLDER      = "api/";
    private static final String AUTH_FOLDER     = "auth/";
    private static final String RESOURCE_FOLDER = DirectoryConstants.MAIN_FOLDER + "resources/";

    static final String CLIENT_API_FOLDER      = DirectoryConstants.CLIENT_FOLDER + DirectoryConstants.API_FOLDER;
    static final String CLIENT_AUTH_FOLDER     = DirectoryConstants.CLIENT_FOLDER + DirectoryConstants.AUTH_FOLDER;
    static final String CLIENT_MODEL_FOLDER    = DirectoryConstants.CLIENT_FOLDER + DirectoryConstants.MODEL_FOLDER;
    static final String CLIENT_RESOURCE_FOLDER = DirectoryConstants.RESOURCE_FOLDER;

    static final String SERVER_API_FOLDER      = DirectoryConstants.SERVER_FOLDER + DirectoryConstants.API_FOLDER;
    static final String SERVER_MODEL_FOLDER    = DirectoryConstants.SERVER_FOLDER + DirectoryConstants.MODEL_FOLDER;
    static final String SERVER_RESOURCE_FOLDER = DirectoryConstants.RESOURCE_FOLDER;
}
