package com.xupt.config;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

public class NettyConfig {

    public final static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

}
