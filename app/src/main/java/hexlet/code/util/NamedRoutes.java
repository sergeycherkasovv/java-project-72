package hexlet.code.util;

public class NamedRoutes {
    public static String rootPath() {
        return "/";
    }

    public static String urlsPath() {
        return "/urls";
    }

    public static String urlPath(Long id) {
        return urlPath(String.valueOf(id));
    }

    public static String urlPath(String id) {
        return "/urls/" + id;
    }

    public static String urlPathChecks(Long id) {
        return urlPathChecks(String.valueOf(id));
    }

    public static String urlPathChecks(String id) {
        return "/urls/" + id + "/checks";
    }
}
