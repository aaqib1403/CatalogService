package com.lti.opshub.catalog.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name= "assets")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Assets {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name ="uuid",strategy = "uuid2")
	@Column(name="assetId", unique = true, nullable = false, updatable = false)
	private String assetid;
	
	@Column(name="name")
	private String name;
	
	@Column(name = "createdOn")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createdOn;
	
	@Column(name = "lastModifiedOn")
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date lastModifiedOn;
	
	@Column(name = "domainId")
	private String domainId;
	
	@Column(name = "assetTypeId")
	private String assetTypeId;
	
	@Column(name = "createdById")
	private String createdById;
	
	@Column(name = "descriptionValue")
	private String descriptionValue;	
	
	@Column(name = "tagName")
	private String tagName;
	
	@Column(name = "avgRating")
	private float avgRating;
	
	@ElementCollection
	@Column(name = "ownerId")
	private List<String> ownerIds;

}
