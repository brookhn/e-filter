package com.pp.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@SpringBootApplication
public class EFilterApplication {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder)
	{
//		ZonedDateTime dateTime  = LocalDateTime.now().plusDays(1).atZone(ZoneId.systemDefault());
		/********************************befor 	route*********************/
//		return builder.routes()
//				.route("before_route", r->r.before(dateTime)
//				.uri("https://www.baidu.com"))
//				.build();
		/*******************************after route*************************/
//		ZonedDateTime dateTime  = LocalDateTime.now().minusHours(1).atZone(ZoneId.systemDefault());
//		return builder.routes()
//				.route("after_route", r->r.after(dateTime)
//				.uri("https://www.baidu.com"))
//				.build();
		/*******************************between route*************************/
//		ZonedDateTime beginTime  = LocalDateTime.now().minusDays(1).atZone(ZoneId.systemDefault());
//		ZonedDateTime endTime  = LocalDateTime.now().plusDays(1).atZone(ZoneId.systemDefault());
//		return builder.routes()
//				.route("between_route", r->r.between(beginTime, endTime)
//				.uri("https://www.baidu.com"))
//				.build();
		/*******************************
		 * cookie route
		 * key value
		 *
		 * *************************/
//		return builder.routes()
//				.route("cookie_route", r->r.cookie("key", "value")
//				.uri("https://www.baidu.com"))
//				.build();
		/**********************************************
		 * head route
		 *
		 *********************************************/
//		return builder.routes()
//				.route("header_route", r->r.header("x-Request-Id", "xinji")
//				.uri("https://www.baidu.com"))
//				.build();
		/**********************************************
		 * host route
		 *
		 *********************************************/
//		return builder.routes()
//				.route("host_route", r->r.host("**.baidu.com:8080")
//				.uri("https://www.baidu.com"))
//				.build();
		/**********************************************
		 * method route
		 *
		 *********************************************/
//		return builder.routes()
//				.route("method_route", r->r.method("GET")
//				.uri("https://www.baidu.com"))
//				.build();
		/**********************************************
		 * query route
		 *
		 *********************************************/
//		return builder.routes()
//				.route("query_route", r->r.query("foo","baz")
//				.uri("https://www.baidu.com"))
//				.build();
		/**********************************************
		 * RemoteAddr route
		 *
		 *********************************************/
//		return builder.routes()
//				.route("remoteaddr_route", r->r.remoteAddr("127.0.0.1")
//				.uri("https://www.baidu.com"))
//				.build();
		/**********************************************
		 * AddRequestHeader Filter
		 *
		 *********************************************/
//		return builder.routes()
//				.route("add_request_header_route", r->r.path("/test")
//						.filters(f->f.addRequestHeader("x-Request-Acme", "ValueB"))
//						.uri("https://www.baidu.com"))
//				.build();

		/**********************************************
		 * AddRequestParameter Filter
		 *
		 *********************************************/
//		return builder.routes()
//				.route("add_request_parameter_route", r->r.path("/addRequestParameter")
//						.filters(f->f.addRequestParameter("example", "ValueB"))
//						.uri("https://www.baidu.com"))
//				.build();
		/**********************************************
		 * RewritePath Filter
		 *
		 *********************************************/
//		return builder.routes()
//				.route("rewritepath_route", r->r.path("/foo/**")
//						.filters(f->f.rewritePath("/foo/(?<segment>.*)",
//								"/$\\{segment}"))
//						.uri("https://www.baidu.com"))
//				.build();
		/**********************************************
		 * RewritePath Filter
		 *
		 *********************************************/
		return builder.routes()
				.route("rewritepath_route", r->r.path("/foo/**")
						.filters(f->f.rewritePath("/foo/(?<segment>.*)",
								"/$\\{segment}"))
						.uri("https://www.baidu.com"))
				.build();
//		return builder.routes()
//				.route("after_route", r->r.before(dateTime)
//				.uri("https://www.baidu.com"))
//				.build();
//		return builder.routes()
//				.route(r->r.path("/jd").uri("http://jd.com:80/")
//						.id("jd_route")).build();
	}

	public static void main(String[] args) {
		SpringApplication.run(EFilterApplication.class, args);
	}
}

