package org.kin.controller;

import java.util.List;

import org.kin.domain.chartVO;
import org.kin.domain.searchVO;
import org.kin.proxy.timeAdvice;
import org.kin.service.chartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests for the application home page.
 */

@RequestMapping("/search")
@RestController
public class SearchController {
	
	@Autowired
	chartService chart_service;
	
	/*
	 * @Autowired timeAdvice ta;
	 */
	
	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);
	
	@PostMapping(value = "/aj")
	public ResponseEntity<List> searchAjax(@RequestBody searchVO vo) {
		System.out.println("search/aj In");
		System.out.println("searchVO tostring() : " + vo.toString() );
		System.out.println("cdnm : " + vo.getCDNM());
		System.out.println("rollUp : " + vo.getRollUp());
		
		
		List search = chart_service.searchList(vo);
		/*
		 * search.add(ta.getProxyTime()); System.out.println("proxyTime check : " +
		 * ta.getProxyTime());
		 */
		
		
		return new ResponseEntity<>(search, HttpStatus.OK);
	}
	
	@PostMapping(value = "/test")
	public ResponseEntity<String> test(@RequestParam("rollUp") String abc) {
		System.out.println("search/test In");
		System.out.println(abc);
		
		return new ResponseEntity<>("1", HttpStatus.OK);
	}
	
}
