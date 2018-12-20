package com.cwt.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Pane_Data")
public class Pane  implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private  Long id;
	@Column(name="Pane_ID")
	
	private String paneId;
	
	@Column(name="region")
	private String region;
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="Pane_ID")

	private  Set<PaneDetails> details;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPaneId() {
		return paneId;
	}
	public void setPaneId(String paneId) {
		this.paneId = paneId;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Set<PaneDetails> getDetails() {
		return details;
	}
	public void setDetails(Set<PaneDetails> details) {
		this.details = details;
	}
	

	
}
