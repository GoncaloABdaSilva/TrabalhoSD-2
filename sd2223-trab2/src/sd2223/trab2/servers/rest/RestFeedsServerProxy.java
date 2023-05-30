package sd2223.trab2.servers.rest;

import org.glassfish.jersey.server.ResourceConfig;
import sd2223.trab2.api.java.Feeds;
import sd2223.trab2.servers.Domain;
import utils.Args;

import java.util.logging.Logger;

public class RestFeedsServerProxy extends AbstractRestServer{
    public static final int PORT = 3839;

    private static Logger Log = Logger.getLogger(RestFeedsServerProxy.class.getName());

    RestFeedsServerProxy() {
        super( Log, Feeds.SERVICENAME, PORT);
    }

    @Override
    void registerResources(ResourceConfig config) {
        config.register( RestFeedsResourceProxy.class);
    }

    public static void main(String[] args) throws Exception {
        Args.use( args );
        Domain.set( args[0], Long.valueOf(args[1]));
        new RestFeedsServerProxy().start();
    }
}
