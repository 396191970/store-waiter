package com.tuobuxie.entity;
// Generated 2016-11-24 15:23:31 by Hibernate Tools 4.3.4.Final

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.alibaba.fastjson.JSON;

/**
 * TGoods generated by hbm2java
 */
@Entity
@Table(name = "T_GOODS", schema = "TUOBUXIE")
public class TGoods implements java.io.Serializable {

	private Integer CId;
	private String CName;
	private String CPicturePath;
	private Date CCreatDate;
	private BigDecimal CPriority;
	private BigDecimal CPrice;

	private TGoodsDetail cTGoodsDetailId;

	private TShoppingCart tShoppingCart;

	@ManyToOne()
	public TShoppingCart gettShoppingCart() {
		return tShoppingCart;
	}

	public void settShoppingCart(TShoppingCart tShoppingCart) {
		this.tShoppingCart = tShoppingCart;
	}

	@OneToOne(optional = true, cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn()
	public synchronized TGoodsDetail getcTGoodsDetailId() {
		return cTGoodsDetailId;
	}

	public synchronized void setcTGoodsDetailId(TGoodsDetail cTGoodsDetailId) {
		this.cTGoodsDetailId = cTGoodsDetailId;
	}


	public TGoods() {
	}

	public TGoods(Integer CId) {
		this.CId = CId;
	}

	public TGoods(Integer CId, String CName, String CPicturePath, Date CCreatDate, BigDecimal CPriority,
			BigDecimal CPrice) {
		this.CId = CId;
		this.CName = CName;
		this.CPicturePath = CPicturePath;
		this.CCreatDate = CCreatDate;
		this.CPriority = CPriority;
		this.CPrice = CPrice;
	}

	@Id
	@GeneratedValue (generator = "pkGenerator")
	@GenericGenerator (
	name = "pkGenerator",
	strategy = "foreign",
	parameters = @Parameter (name = "property", value = "cTGoodsDetailId")
	)

	@Column(name = "C_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public Integer getCId() {
		return this.CId;
	}

	public void setCId(Integer CId) {
		this.CId = CId;
	}

	@Column(name = "C_NAME", length = 50)
	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

	@Column(name = "C_PICTURE_PATH", length = 100)
	public String getCPicturePath() {
		return this.CPicturePath;
	}

	public void setCPicturePath(String CPicturePath) {
		this.CPicturePath = CPicturePath;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "C_CREAT_DATE", length = 7)
	public Date getCCreatDate() {
		return this.CCreatDate;
	}

	public void setCCreatDate(Date CCreatDate) {
		this.CCreatDate = CCreatDate;
	}

	@Column(name = "C_PRIORITY", precision = 22, scale = 0)
	public BigDecimal getCPriority() {
		return this.CPriority;
	}

	public void setCPriority(BigDecimal CPriority) {
		this.CPriority = CPriority;
	}

	@Column(name = "C_PRICE", precision = 9)
	public BigDecimal getCPrice() {
		return this.CPrice;
	}

	public void setCPrice(BigDecimal CPrice) {
		this.CPrice = CPrice;
	}
	@Override
	public String toString() {
		return JSON.toJSONString(this);

	}
}