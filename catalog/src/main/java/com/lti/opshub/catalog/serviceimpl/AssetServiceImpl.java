package com.lti.opshub.catalog.serviceimpl;

import com.lti.opshub.catalog.service.AssetService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.opshub.catalog.dao.AssetsRepository;
import com.lti.opshub.catalog.entity.Assets;
import com.lti.opshub.catalog.exception.SystemException;

@Service
public class AssetServiceImpl implements AssetService {
	
	@Autowired
	AssetsRepository assetsRepository;

	@Override
	public Map<String, String> createAssets(Assets asset) throws SystemException {
		// TODO Auto-generated method stub
		
		Map<String, String> response = new HashMap<>();
		Assets asset1 = new Assets();
		if(!assetsRepository.existsByName(asset.getName()))
		{
			asset1.setName(asset.getName());
			asset1.setAvgRating(asset.getAvgRating());
			asset1.setCreatedById(asset.getCreatedById());
			asset1.setDescriptionValue(asset.getDescriptionValue());
			asset1.setDomainId(asset.getDomainId());
			asset1.setOwnerIds(asset.getOwnerIds());
			asset1.setTagName(asset.getTagName());
			asset1.setAssetTypeId(asset.getAssetTypeId());
			assetsRepository.save(asset1);
			
			response.put("message", "asset "+asset.getName()+" added successfully");
			
		}
		else
		{
			throw new SystemException("asset name already exists");
		}
		return response;
	}

}
