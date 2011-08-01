package org.handwerkszeug.riak.transport.protobuf;

import org.handwerkszeug.riak.Hosts;
import org.handwerkszeug.riak.ease.Riak;
import org.handwerkszeug.riak.ease.RiakTest;
import org.junit.Ignore;
import org.junit.Test;

public class ProtoBufRiakTest extends RiakTest<ProtoBufRiakOperations> {

	@Override
	protected Riak<ProtoBufRiakOperations> newTarget() {
		return ProtoBufRiak.create(Hosts.RIAK_HOST);
	}

	@Override
	@Test
	@Ignore("Riak 0.14.2 has bug. fix that bug in the future")
	public void testPost() throws Exception {
		super.testPost();
	}
}
