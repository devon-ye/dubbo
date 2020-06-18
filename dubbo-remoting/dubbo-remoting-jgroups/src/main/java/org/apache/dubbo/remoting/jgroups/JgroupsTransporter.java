package org.apache.dubbo.remoting.jgroups;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.remoting.ChannelHandler;
import org.apache.dubbo.remoting.Client;
import org.apache.dubbo.remoting.RemotingException;
import org.apache.dubbo.remoting.RemotingServer;
import org.apache.dubbo.remoting.Transporter;
import org.jgroups.tests.rt.transports.JGroupsTransport;

/**
 *
 * @datetime 2020/3/1 11:24 下午
 *
 */
public class JgroupsTransporter implements Transporter {

	private JGroupsTransport  transport;

	@Override
	public RemotingServer bind(URL url, ChannelHandler handler) throws RemotingException {

		transport.clusterMembers();
		return null;
	}

	@Override
	public Client connect(URL url, ChannelHandler handler) throws RemotingException {
		return null;
	}
}
