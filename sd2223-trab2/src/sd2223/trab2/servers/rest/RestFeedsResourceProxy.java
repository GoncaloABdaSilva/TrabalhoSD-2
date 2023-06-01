package sd2223.trab2.servers.rest;

import jakarta.inject.Singleton;
import sd2223.trab2.api.java.Feeds;
import sd2223.trab2.mastodon.Mastodon;


@Singleton
public class RestFeedsResourceProxy extends RestFeedsResource<Feeds>{
    
    public RestFeedsResourceProxy() {
        super(Mastodon.getInstance());
    }
}
