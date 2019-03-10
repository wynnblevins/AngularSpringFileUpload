package com.wynnblevins.fileupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import com.wynnblevins.fileupload.service.*;

@SpringBootApplication
public class FileuploadApplication implements CommandLineRunner {
	  
	@Resource
	StorageService storageService;
	 
	public static void main(String[] args) {
		SpringApplication.run(FileuploadApplication.class, args);
	}
	 
    @Override
	public void run(String... arg) throws Exception {
	    storageService.deleteAll();
	    storageService.init();
	}
}