package com.tracebucket.asset;

import com.tracebucket.vault.EnableVault;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController
@EnableVault
public class VaultTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaultTestApplication.class, args);
	}

	@RequestMapping(value = "/test")
	public ResponseEntity<String> test(){
		return new ResponseEntity<String>("test", HttpStatus.OK);
	}
}
