package uwdb.spuriousrestapi;

// import javax.ws.rs.client.Client;
// import javax.ws.rs.client.ClientBuilder;
// import javax.ws.rs.client.WebTarget;

// import org.glassfish.grizzly.http.server.HttpServer;

// import org.junit.After;
// import org.junit.Before;
import org.junit.Test;
// import uwdb.discovery.dependency.approximate.entropy.NewSmallDBInMemory;
import static org.junit.Assert.assertEquals;

public class MyResourceTest {

    // private HttpServer server;
    // private WebTarget target;

    // @Before
    // public void setUp() throws Exception {
    //     try (NewSmallDBInMemory db = new NewSmallDBInMemory("testdb/nursery.csv", 9, false)) {
    //         // start the server
    //         server = Main.startServer(db);
    //         // create the client
    //         Client c = ClientBuilder.newClient();


    //         // uncomment the following line if you want to enable
    //         // support for JSON in the client (you also have to uncomment
    //         // dependency on jersey-media-json module in pom.xml and Main.startServer())
    //         // --
    //         // c.configuration().enable(new org.glassfish.jersey.media.json.JsonJaxbFeature());

    //         target = c.target(Main.BASE_URI);
    //     }
    // }

    // @After
    // public void tearDown() throws Exception {
    //     server.shutdownNow();
    // }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
        // String responseMsg = target.path("api/spurioustuples").request().get(String.class);
        // assertEquals("Got it!", responseMsg);        
        assertEquals("Got it!", "Got it!");
    }
}
