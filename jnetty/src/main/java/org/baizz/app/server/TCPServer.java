package org.baizz.app.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.net.InetSocketAddress;

/**
 * Created by baizz on 2014-10-21.
 */
@Component
public class TCPServer {

    @Autowired
    @Qualifier("serverBootstrap")
    private ServerBootstrap serverBootstrap;

    @Autowired
    @Qualifier("tcpSocketAddress")
    private InetSocketAddress tcpPort;

    private Channel serverChannel;

    @PostConstruct
    public void start() throws Exception {
        System.out.println("Starting server at " + tcpPort);
        serverChannel = serverBootstrap.bind(tcpPort).sync().channel().closeFuture().sync().channel();
    }

    @PreDestroy
    public void stop() {
        serverChannel.close();
    }

    public ServerBootstrap getServerBootstrap() {
        return serverBootstrap;
    }

    public void setServerBootstrap(ServerBootstrap serverBootstrap) {
        this.serverBootstrap = serverBootstrap;
    }

    public InetSocketAddress getTcpPort() {
        return tcpPort;
    }

    public void setTcpPort(InetSocketAddress tcpPort) {
        this.tcpPort = tcpPort;
    }
}
