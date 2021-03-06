package com.shopme.admin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.shopme.common.entity", "com.shopme.admin.user"})
public class ShopmeBackendApplication  implements CommandLineRunner{

	public static void main(Strin