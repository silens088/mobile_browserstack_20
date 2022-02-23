package config.browserstack;

import org.aeonbits.owner.Config;

//@Config.Sources({"classpath:config/browserstack/app-example.properties"})

@Config.Sources({"classpath:config/browserstack/app.properties"})
public interface BrowserStackConfig extends Config {

    @Key("browserstack.user")
    String user();

    @Key("browserstack.key")
    String key();

    @Key("browserstack.app")
    String app();

    @Key("browserstack.url")
    String url();

    @Key("browserstack.url.statSession")
    String urlStatSession();
}