package org.apache.dubbo.remoting.jgroups;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.remoting.ChannelHandler;
import org.apache.dubbo.remoting.Client;
import org.apache.dubbo.remoting.RemotingException;
import org.apache.dubbo.remoting.RemotingServer;
import org.apache.dubbo.remoting.Transporter;

/**
 * @datetime 2020/3/1 11:24 下午
 */
public class JGroupsTransporter implements Transporter {

	public static final String NAME = "JGroups";

    @Override
    public RemotingServer bind(URL url, ChannelHandler handler) throws RemotingException {
        return new JGroupsServer(url, handler);
    }

    @Override
    public Client connect(URL url, ChannelHandler handler) throws RemotingException {
        return new JGroupsClient(url, handler);
    }
}
