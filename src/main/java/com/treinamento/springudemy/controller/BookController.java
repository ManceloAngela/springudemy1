package com.treinamento.springudemy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
  

  @ApiOperation(value = "Return exemple hello world!!!")
  @ApiResponses(value = {
    @ApiResponse(code = 200,message = "Success method return")
  })
  @GetMapping
  public String hello(){
    return "Hello Bookstyore Manager whith PR!";
  }
  
}