package com.warpit.urlseo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class URLSeoRandom extends URLSeo {

	public URLSeoRandom() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//SEO = "XXXXXYYY";
	//SEO
	
	public void setSeoKey(String seoKey) throws SeoValidationException {
			seoKey = generate4LetterRandom(4);
		}


	private String generate4LetterRandom(int length) {
		// 1234 a b c s 
		
		HashMap mapOfValues= new HashMap<Integer, String>();
		
	//	Random randomGen = new Random();
		
	//	1-9
	//	1-a
	//	2-b
	//	3-c
	//	stream.
		
		
	//	Random.nextInt
		
		return "XXCCXCC";
		
	}
	
}
