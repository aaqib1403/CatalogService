package com.lti.opshub.catalog.serviceimpl;

import com.lti.opshub.catalog.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.opshub.catalog.dao.AssetsRepository;
import com.lti.opshub.catalog.entity.Assets;

@Service
public class AssetServiceImpl implements AssetService {
	
	@Autowired
	AssetsRepository assetsRepository;

	@Override
	public Object createAssets(Assets asset) {
		// TODO Auto-generated method stub
		
		Assets asset1 = new Assets();
		if(!assetsRepository.existsByName(asset.getName()))
		{
			asset1.setName(asset.getName());
			asset1.setAssetTypeId(asset.getAssetTypeId());
			asset1.setAvgRating(asset.getAvgRating());
			asset1.setCreatedById(asset.getCreatedById());
			asset1.setDescriptionValue(asset.getDescriptionValue());
			asset1.setDomainId(asset.getDomainId());
			asset1.setOwnerIds(asset.getOwnerIds());
		}
		return null;
	}

}
