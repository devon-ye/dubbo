package org.apache.dubbo.remoting.jgroups;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.remoting.Channel;
import org.apache.dubbo.remoting.ChannelHandler;
import org.apache.dubbo.remoting.RemotingException;
import org.apache.dubbo.remoting.transport.AbstractClient;
import org.jgroups.blocks.cs.Client;


/**
 *
 * @datetime 2020/3/1 11:33 下午
 *
 */
public class JGroupsClient extends AbstractClient {
    private Client client;

	public JGroupsClient(URL url, ChannelHandler handler) throws RemotingException {
		super(url, handler);
	}

	@Override
	protected void doOpen() throws Throwable {
		//client.
	}

	@Override
	protected void doClose() throws Throwable {

	}

	@Override
	protected void doConnect() throws Throwable {

	}

	@Override
	protected void doDisConnect() throws Throwable {

	}

	@Override
	protected Channel getChannel() {
		return null;
	}

	@Override
	public boolean canHandleIdle() {
		return false;
	}


}
