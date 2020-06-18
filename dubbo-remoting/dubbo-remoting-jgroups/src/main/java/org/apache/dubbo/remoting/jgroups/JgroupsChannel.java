package org.apache.dubbo.remoting.jgroups;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.remoting.ChannelHandler;
import org.apache.dubbo.remoting.transport.AbstractChannel;
import org.jgroups.JChannel;

import java.net.InetSocketAddress;

/**
 *
 * @datetime 2020/3/1 11:27 下午
 *
 */
public class JgroupsChannel extends AbstractChannel {

    private JChannel jChannel;

	public JgroupsChannel(JChannel jChannel, URL url, ChannelHandler handler) {
		super(url, handler);
		this.jChannel = jChannel;

	}

	@Override
	public InetSocketAddress getRemoteAddress() {

		//return ((IpAddress) jChannel.address()).getIpAddress();
		return null;
	}

	@Override
	public boolean isConnected() {
		return jChannel.isConnected();
	}

	@Override
	public boolean hasAttribute(String key) {
		return false;
	}

	@Override
	public Object getAttribute(String key) {
		return null;
	}

	@Override
	public void setAttribute(String key, Object value) {

	}

	@Override
	public void removeAttribute(String key) {

	}

	@Override
	public InetSocketAddress getLocalAddress() {
		return null;
	}
}
