package com.example.demo.entity;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class Status {
	
	 private Long id;
	 
//	 @Digits(integer=1, fraction=5, message="現実的な数字を入力してください")
//	 @NotNull(message="必ず入力してください")
	 private double avg;
	 
//	 @Range(min=0, max=100, message="0〜100を入力してください")
//	 @NotNull(message="必ず入力してください")
	 private int steal;
	 
//	 @Range(min=0, max=80, message="0〜80を入力してください")
//	 @NotNull(message="必ず入力してください")
	 private int hr;
	 
//	 @Range(min=0, max=300, message="0〜300を入力してください")
//	 @NotNull(message="必ず入力してください")
	 private int hit;
	 
//	 @Digits(integer=1, fraction=5, message="現実的な数字を入力してください")
	 private double ops;
	 
//	 @NotNull(message="必ず入力してください")
	 private Long playerId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getSteal() {
		return steal;
	}
	public void setSteal(int steal) {
		this.steal = steal;
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		this.hr = hr;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public double getOps() {
		return ops;
	}
	public void setOps(double ops) {
		this.ops = ops;
	}
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	
}
