package com.multi.mvc01;

public class foodVO {
	private String like;
	private String dislike;
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public String getDislike() {
		return dislike;
	}
	public void setDislike(String dislike) {
		this.dislike = dislike;
	}
	@Override
	public String toString() {
		return "foodVO [like=" + like + ", dislike=" + dislike + "]";
	}
	
}
