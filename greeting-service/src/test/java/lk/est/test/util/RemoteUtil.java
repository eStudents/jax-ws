package lk.est.test.util;

import java.io.IOException;
import java.net.ServerSocket;


/**
 * The class RemoteUtil provide the available free port.
 * @author rangalal.g
 *
 */
public class RemoteUtil {

     /**
     * @return available free port number.
     * @throws IOException
     */
    public static int getFreePort() throws IOException {
        ServerSocket server = new ServerSocket(0);
        int port = server.getLocalPort();
        server.close();
        return port;
    }
}