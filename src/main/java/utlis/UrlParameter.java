package utlis;

public enum UrlParameter {
    LOGIN("http://automationpractice.com/index.php"),
    SEARCH("http://automationpractice.com/index.php?controller=contact");

    public String getUrl() {
        return url;
    }

    String url;

    UrlParameter(String s) {
        this.url = s;
    }

}
