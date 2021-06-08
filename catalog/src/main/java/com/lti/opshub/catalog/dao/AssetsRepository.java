package com.lti.opshub.catalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.opshub.catalog.entity.Assets;


@Repository
public interface AssetsRepository extends JpaRepository<Assets, String>  {

	boolean existsByName(String name);

}
