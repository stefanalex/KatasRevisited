package com.warpit.urlseo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;

import javax.management.DescriptorKey;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.warpit.arraystack.StackIsEmptyException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


class URLShortnerTest {
	
	
	
	URLShortner urlShortner;

	@BeforeEach
	void setUp() {
		urlShortner = new URLShortner();
	}


	@Test
	void testURLShortenerOk() throws Exception {
		
		assertThat(urlShortner.shortenURL(new URL("http://looooong.com/somepath"), "MY-NEW-WS")).isEqualTo("http://short.com/MY-NEW-WS");
	}
	
	@Test
	void testURLShortenerNullURL() throws Exception {
		
		assertThat(urlShortner.shortenURL(null, "MY-NEW-WS")).isEqualTo("http://short.com/MY-NEW-WS");
	}
	
	@Test
	void testURLShortenerNullKey() throws Exception {
		
		assertThat(urlShortner.shortenURL(null, "MY-NEW-WS")).isEqualTo("http://short.com/MY-NEW-WS");
	}

	

	@Test
	void testSEOLengt() throws Exception {
		final URLSeo  urlSeo = new URLSeo();
		assertThatExceptionOfType(SeoValidationException.class)
              .isThrownBy(()-> urlSeo.setSeoKey("MY-NEW-WSxxxxxxxxxxxx"));
	}
	
}
