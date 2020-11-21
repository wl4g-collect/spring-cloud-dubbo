package cn.springcloud.dubbo.demo.consumer.controller;

import cn.springcloud.dubbo.demo.provider.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private FooService fooService;

	@GetMapping("/testFoo")
	public String testFoo() {
		return "Foo " + fooService.foo();
	}
}
