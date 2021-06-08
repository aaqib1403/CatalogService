package com.lti.opshub.catalog.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lti.opshub.catalog.constants.Constants.ResourceURL;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api("controller is used for console backend rest calls")
@RequestMapping(ResourceURL.ROOT)
public class AssetController {

	private static final Logger logger = LoggerFactory.getLogger(AssetController.class);
//
//	@Autowired
//	AssetService assetService;
//
//	@PostMapping(ResourceURL.CREATEASSETS)
//	@ApiOperation(value = "create new assets ", notes = "This is used for creating new assets", response = Object.class)
//	@ApiResponses({ @ApiResponse(code = 200, message = RestConstants.SUCCESS, response = Object.class),
//			@ApiResponse(code = 404, message = RestConstants.NOT_FOUND, response = ErrorResponse.class) })
//	public ResponseEntity<Object> handleRecentlyViewedRequest(
//			@RequestBody Assets asset)
//			throws SystemException, CollibraIntegartionException {
//		//logger.info("handleRecentlyViewedRequest method -> access token {} ", token);
//		/*limit = null != limit ? limit : 20;
//		offset = null != offset ? offset : 1;*/
//		return new ResponseEntity<>(
//				assetService.createAssets(asset), HttpStatus.OK);
//	}



	@GetMapping("/hello")
	@ApiOperation(value = "get all Users")
	public ResponseEntity<Object> getAllUsers() {
		return new ResponseEntity<>("Hello", HttpStatus.OK);
	}
}
