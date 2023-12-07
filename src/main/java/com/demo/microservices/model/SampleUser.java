package com.demo.microservices.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SampleUser {
	private String userId; // 사용자 아이
	private String userNm; // 사용자 이
	private String addr; // 주
	private String cellPhone; // 핸드
	private String agreeInform; // 고객정보 동의 여 
	private String birthDt; // 생년월일

}
