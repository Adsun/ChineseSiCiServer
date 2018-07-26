package com.chinese.sici.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinese.sici.server.constant.ResultConstant;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@GetMapping("/authorInfo")
	public ResultConstant getAuthorInfo() {
		return ResultConstant.ofSuccess();
	}
	@PostMapping("/authorInfo")
	public ResultConstant addAuthorInfo() {
		return ResultConstant.ofSuccess();
	}
	@PutMapping("/authorInfo")
	public ResultConstant updateAuthorInfo() {
		return ResultConstant.ofSuccess();
	}
	@GetMapping("/article")
	public ResultConstant getArticle() {
		return ResultConstant.ofSuccess();
	}
	@PostMapping("/article")
	public ResultConstant addArticle() {
		return ResultConstant.ofSuccess();
	}
	@PutMapping("/article")
	public ResultConstant updateArticle() {
		return ResultConstant.ofSuccess();
	}
	
}
