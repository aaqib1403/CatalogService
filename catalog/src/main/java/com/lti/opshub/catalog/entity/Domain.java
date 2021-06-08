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
@Table(name= "domain")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Domain {
	
	
	@Id
	@GeneratedValue
	private int id;
	
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name ="uuid",strategy = "uuid2")
	@Column(name="domainId", unique = true, nullable = false, updatable = false)
	private String domainId;
	
	@Column(name = "domainName")
	private String domainName;
	
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name ="uuid",strategy = "uuid2")
	@Column(name = "domainCommunityId",unique = true, nullable = false, updatable = false )
	private String domainCommunityId;
	
	@Column(name = "domainCommunityName")
	private String domainCommunityName;

}
