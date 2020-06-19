package org.apache.dubbo.remoting.jgroups;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.remoting.Channel;
import org.apache.dubbo.remoting.ChannelHandler;
import org.apache.dubbo.remoting.RemotingException;
import org.apache.dubbo.remoting.transport.AbstractServer;
import org.jgroups.JChannel;

import java.net.InetSocketAddress;
import java.util.Collection;

/**
 *
 * @datetime 2020/3/1 11:30 下午
 *
 */
public class JGroupsServer extends AbstractServer {
  private JChannel channel;
	public JGroupsServer(URL url, ChannelHandler handler) throws RemotingException {
		super(url, handler);
	}

	@Override
	protected void doOpen() throws Throwable {
		channel.connect("clusterName");
	}

	@Override
	protected void doClose() throws Throwable {
		if(channel!= null){
			channel.close();
		}
	}

	@Override
	public boolean isBound() {
		return false;
	}

	@Override
	public Collection<Channel> getChannels() {
		return null;
	}

	@Override
	public Channel getChannel(InetSocketAddress remoteAddress) {
		return null;
	}
}
