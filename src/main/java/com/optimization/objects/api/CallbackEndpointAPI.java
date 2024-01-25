package com.optimization.objects.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface CallbackEndpointAPI {
	
	public ResponseEntity<String> callbackEndpoint(@RequestBody String callbackObject);

}
