package com.anshuman.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "automobile")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"recordCreateDate","recordLastModified"},allowGetters = true)
public class Automobile {
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private int autoId;
	private String autoName;
	private String color;
	private String parent;
	private String country;
	private String continent;
	@CreatedDate
	private Date recordCreateDate;
	@LastModifiedDate
	private Date recordLastModified;
	public int getAutoId() {
		return autoId;
	}
	public void setAutoId(int autoId) {
		this.autoId = autoId;
	}
	public String getAutoName() {
		return autoName;
	}
	public void setAutoName(String autoName) {
		this.autoName = autoName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public Date getRecordCreateDate() {
		return recordCreateDate;
	}
	public void setRecordCreateDate(Date recordCreateDate) {
		this.recordCreateDate = recordCreateDate;
	}
	public Date getRecordLastModified() {
		return recordLastModified;
	}
	public void setRecordLastModified(Date recordLastModified) {
		this.recordLastModified = recordLastModified;
	}
	

}
