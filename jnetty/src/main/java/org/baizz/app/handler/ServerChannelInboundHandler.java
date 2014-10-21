package org.baizz.app.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by baizz on 2014-10-21.
 */
@Component
@Qualifier("serverChannelInboundHandler")
@ChannelHandler.Sharable
public class ServerChannelInboundHandler extends SimpleChannelInboundHandler<String> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        ctx.channel().write(msg);
    }
}
