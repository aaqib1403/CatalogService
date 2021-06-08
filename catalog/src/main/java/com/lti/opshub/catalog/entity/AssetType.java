package com.lti.opshub.catalog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name= "assetTypes")
@Data
@EntityListeners(AuditingEntityListener.class)
public class AssetType {

	@Id
	@GeneratedValue
	private int id;
	
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name ="uuid",strategy = "uuid2")
	@Column(name="assetTypeId", unique = true, nullable = false, updatable = false)
	private String assetTypeId;
	
	@Column(name = "assetTypeName")
	private String assetTypeName;

}
