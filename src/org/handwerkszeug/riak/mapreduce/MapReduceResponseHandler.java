package org.handwerkszeug.riak.mapreduce;

import org.handwerkszeug.riak.op.RiakResponse;
import org.handwerkszeug.riak.op.RiakResponseHandler;

/**
 * @author taichi
 */
public interface MapReduceResponseHandler extends
		RiakResponseHandler<MapReduceResponse> {

	void handleDone(RiakResponse<MapReduceResponse> response);
}
