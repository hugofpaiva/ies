package com.hugofpaiva.demo;

public class Meal {
    private final long id;
	private final String content;

	public Meal(long id, String content) {
		this.id = id;
		this.content = content;
	}

	
	/** 
	 * @return long
	 */
	public long getId() {
		return id;
	}

	
	/** 
	 * @return String
	 */
	public String getContent() {
		return content;
	}
}
