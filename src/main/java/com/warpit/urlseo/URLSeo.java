package com.warpit.urlseo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.function.IntPredicate;

public class URLSeo {
	
	private URL url;
	private String seoKey;

	private URL shortURL;
	
	
	
	public URLSeo() throws Exception {
		super();
		shortURL = new URL("http://short.com/");
		
	}

	public URLSeo(URL url, String seoKey) throws Exception {
		this.url = url;
		if(seoKey.length()>20) throw new SeoValidationException();

		this.seoKey = seoKey;
		shortURL = new URL("http://short.com/");
	}

	public String getOutput() throws Exception {
		URL newUrl = new URL(shortURL+seoKey);
		return newUrl.toString();
		
	}

	public String getSeoKey() {
		return seoKey;
	}

	public void setSeoKey(String seoKey) throws SeoValidationException {
	//encode to UTF-8
		if(seoKey.length()>20) throw new SeoValidationException();
		this.seoKey = seoKey;
	}

	
	
	
}
