package com.javatechie.s3.service;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface StoregeService {
	ResponseEntity<?> uploadFile(MultipartFile image) throws IOException ;

}
