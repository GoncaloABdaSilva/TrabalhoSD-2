package sd2223.trab2.servers.rest;

import org.glassfish.jersey.server.ResourceConfig;
import sd2223.trab2.api.java.Feeds;
import sd2223.trab2.servers.Domain;
import utils.Args;

import java.util.logging.Logger;

public class RestFeedsServerReplication extends AbstractRestServer{
    public static final int PORT = 4848;

    private static Logger Log = Logger.getLogger(RestFeedsServerReplication.class.getName());

    RestFeedsServerReplication() {
        super( Log, Feeds.SERVICENAME, PORT);
    }

    @Override
    void registerResources(ResourceConfig config) {
        config.register( RestFeedsResourceReplication.class);
    }

    public static void main(String[] args) throws Exception {
        Args.use( args );
        Domain.set( args[0], Long.valueOf(args[1]));
        new RestFeedsServerProxy().start();
    }
}
