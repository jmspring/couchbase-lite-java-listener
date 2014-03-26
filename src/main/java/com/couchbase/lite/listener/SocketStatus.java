package com.couchbase.lite.listener;

import java.net.InetAddress;
import java.net.ServerSocket;

/**
 * Provides read only status on a socket.
 * https://github.com/couchbase/couchbase-lite-java-listener/issues/25
 */
public class SocketStatus {
    protected ServerSocket serverSocket;

    public SocketStatus(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    /**
     * Returns the port the acceptor has bound to.
     * @return
     */
    public int getPort() {
        return serverSocket.getLocalPort();
    }

    /**
     * Returns the local IP address of the server socket or null if not bound.
     * @return
     */
    public InetAddress getInetAddress() {
        return serverSocket.getInetAddress();
    }

    /**
     * Returns if the server is bound to a local address and port
     * @return
     */
    public boolean isBound() {
        return serverSocket.isBound();
    }

    /**
     * Returns if the socket the server is listening on is closed
     * @return
     */
    public boolean isClosed() {
        return serverSocket.isClosed();
    }
}
