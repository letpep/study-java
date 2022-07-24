package com.letpep.demosentinel;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DemoSentinelApplication {

	public static void main(String[] args) {
//		initRules();
		SpringApplication.run(DemoSentinelApplication.class, args);
	}

	private static void   initRules(){
		List<FlowRule> rules = new ArrayList<>();
		FlowRule rule = new FlowRule();
		rule.setResource("SentinelService.lkcount");
		rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
		rule.setCount(2);
		rules.add(rule);
		FlowRuleManager.loadRules(rules);

	}
//	@Bean
//	public SentinelResourceAspect sentinelResourceAspect(){
//		return new SentinelResourceAspect();
//	}


}
