package com.lti.opshub.catalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.opshub.catalog.entity.AssetType;

@Repository
public interface AssetTypeRepository extends JpaRepository<AssetType, String>{

}