package com.cwt.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Pane_Details")
public class PaneDetails  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Details_ID")
	private Long detailId;
	@Column(name="Region_Y")
	private String region;
	@Column(name="Axis")
	private String axis;
	@Column(name="Section")
	private String section;
	@ManyToOne
	private Pane panes;
	public Long getDetailId() {
		return detailId;
	}
	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAxis() {
		return axis;
	}
	public void setAxis(String axis) {
		this.axis = axis;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Pane getPanes() {
		return panes;
	}
	public void setPanes(Pane panes) {
		this.panes = panes;
	}

}
