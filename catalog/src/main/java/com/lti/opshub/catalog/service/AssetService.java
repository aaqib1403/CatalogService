package com.lti.opshub.catalog.service;

import com.lti.opshub.catalog.entity.Assets;
import com.lti.opshub.catalog.exception.SystemException;


public interface AssetService {

	Object createAssets(Assets asset) throws SystemException;

}
