package me.Iretemi.capsuleapi;

public class Capsule {
    private static CapsuleAPI api;

    private Capsule() {}

    public static CapsuleAPI getAPI() {
        if (api == null) {
            throw new IllegalStateException("CapsuleAPI not loaded");
        }
        return api;
    }

    public static void setAPI(CapsuleAPI apiInstance) {
        api = apiInstance;
    }

    public static boolean isLoaded() {
        return api != null;
    }
}
