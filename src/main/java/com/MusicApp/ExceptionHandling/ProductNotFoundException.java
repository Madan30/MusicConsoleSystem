package com.MusicApp.ExceptionHandling;

@SuppressWarnings("serial")
public class ProductNotFoundException  extends Throwable{
	private long prdouctId;
	
	public ProductNotFoundException() {
		
	}

	public ProductNotFoundException(long prdouctId) {
		
		this.prdouctId = prdouctId;
	}

	@Override
	public String toString() {
		return "ProductNotFoundException [prdouctId=" + prdouctId + "]";
	}


}
