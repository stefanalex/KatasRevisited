package com.warpit.urlseo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;

import com.warpit.arraystack.StackIsEmptyException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


class URLSeoTest {

	@Test
	void testFirstCase() throws Exception {
		final URLSeo  urlSeo = new URLSeo(new URL("http://looooong.com/somepath"),"MY-NEW-WS");
		assertThat(urlSeo.getOutput()).isEqualTo("http://short.com/MY-NEW-WS");
	}
	
	

	@Test
	void testSEOLengt() throws Exception {
		final URLSeo  urlSeo = new URLSeo();
		assertThatExceptionOfType(SeoValidationException.class)
              .isThrownBy(()-> urlSeo.setSeoKey("MY-NEW-WSxxxxxxxxxxxx"));
	}
	
}
