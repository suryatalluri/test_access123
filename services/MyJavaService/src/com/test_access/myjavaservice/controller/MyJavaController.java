/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

package com.test_access.myjavaservice.controller;
import com.test_access.myjavaservice.MyJavaService;
import java.lang.String;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

@RestController	
@RequestMapping(value = "/myJava")
public class MyJavaController{

	@Autowired	
	private MyJavaService myJavaService;

	@RequestMapping(value = "/sampleJavaOperation", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET )
	public String sampleJavaOperation(@RequestParam(value="name", required=false)String name )   {
        
            return myJavaService.sampleJavaOperation(name);
	}
} 