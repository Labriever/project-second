package com.hello.web;
import java.util.Map;
import java.util.Objects;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 오류 발생시에 대한 컨트롤러 입니다.
@Controller
public class ExceptionHandlingController implements ErrorController   {

    @RequestMapping(value = "/error")
    public String handleNoHandlerFoundException(HttpServletResponse response, HttpServletRequest request) {
    	// 오류 상태 코드 확인
        int statusCode = response.getStatus();
        System.out.println("Error: "+statusCode);
        
        if (statusCode == HttpStatus.NOT_FOUND.value()) {// 404 오류 처리
            return "ErrorPage/404error";
        } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {// 500 오류 처리
            return "ErrorPage/500error";
        } else if (statusCode == HttpStatus.SERVICE_UNAVAILABLE.value()) {// 503 오류 처리
            return "ErrorPage/503error";
        }

        // 기타 오류 처리
        return "ErrorPage/error"; // 일반적인 오류 페이지로 연결
    }
}