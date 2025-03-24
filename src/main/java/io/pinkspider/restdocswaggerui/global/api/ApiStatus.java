package io.pinkspider.restdocswaggerui.global.api;

import lombok.Getter;

/*
    exception code 발급체계
    서비스 일련번호 00 	exception 대분류00	exception 소분류 00 6자리 숫자로 표시

        global	              시스템 에러대로 3자리
        api gateway	                11	00	00
        auth service	            12	00	00
        admin api gateway	        13	00	00
        admin auth service	        14	00	00
        logger service	            15	00	00
        meta service	            16	00	00
        member service	            17	00	00
        certification service	    18	00	00
        ai loan evaluation service	19	00	00
        loan service	            20	00	00
        loan comparison service	    21	00	00
        investment service	        22	00	00
        market service	            23	00	00
        contract service	        24	00	00
        nice service	            25	00	00
        nonghyup service	        26	00	00
        platform batch service 	    27	00	00
        nice batch service      	28	00	00
        p2p center service	        29	00	00
        alim talk service	        30	00	00
        email service           	31	00	00
        app push service        	32	00	00
        admin service	            33	00	00
        stats service	            34	00	00
        event service	            35	00	00
        moneymofe bff	            36	00	00

외부 통신 에러시
    nice	    90	00	00
	aml	        91	00	00
	nonghyup	92	00	00
	alim talk	93	00	00

* 	mydata-service	mydata 규격대로
 */

public enum ApiStatus {
    OK(0, "Success", "정상처리"),

    SYSTEM_ERROR(500, "System Error", "시스템 내 오류"),

    CLIENT_ERROR(600, "Client Error", "사용자 오류"),

    KAFKA_MESSAGE_ERROR(601, "Client Error", "사용자 오류"),
    EXTERNAL_API_ERROR(610, "External Api Error", "외부 API 오류"),
    FEIGN_CLIENT_CALL_ERROR(611, "External Api Error", "외부 API 오류"),
    FEIGN_EXCEPTION(612, "Feign Exception", "외부 API 오류"),

    INVALID_INPUT(710, "Invalid Input Error", "유효하지 않은 입력"),

    INVALID_ACCESS(720, "Invalid Access Error", "유효하지 않은 접근"),

    EXCEEDED_FILE_SIZE(800, "File Size Exceeded", "제한 파일 사이즈 초과"),
    FILE_ALREADY_EXIST(801, "File Already Exist", "해당 경로에 같은 파일명이 이미 존재"),
    FILE_UPLOAD_PROCESS_ERROR(802, "File Upload Process Error", "파일 업로드중 오류가 발생"),
    FILE_NOT_EXIST(803, "File Not Exist", "파일이 존재하지 않음"),
    FILE_UNKNOWN_ERROR(804, "File Unknown Error", "파일 알수 없는 오류"),
    FILE_IO_EXCEPTION(805, "File IO EXCEPTION", "파일 읽기 오류"),

    CRYPTO_ENCRYPT_ERROR(810, "Crypto Encrypt Error", "암호화 오류"),
    CRYPTO_DECRYPT_ERROR(811, "Crypto Decrypt Error", "암호화 오류"),

    JSON_PARSE_ERROR(820, "JSON PARSE ERROR", "JSON PARSE ERROR"),

    NOT_EXIST_PLATFORM_CRYPTO_META_DATA(4100, "not exist platform crypto meta data", "부적합한 토큰입니다."),
    NOT_EXIST_COMMON_CODE(4101, "Not Exist Common Code", "해당 공통코드가 존재하지 않습니다."),

    MALFORMED_JWT(2101, "Malformed Jwt Exception", "JWT가 변조되었습니다."),
    EXPIRED_JWT_TOKEN(2102, "Expired Jwt Token", "JWT가 만료되었습니다."),
    UNSUPPORTED_JWT_TOKEN(2103, "Unsupported Jwt Token", "지원되지 않는 JWT 입니다."),
    JWT_CLAIMS_STRING_EMPTY(2104, "Jwt Claims String Empty", "JWT Claim에 값이 없습니다.");

    @Getter
    private final int resultCode;

    @Getter
    private final String resultMessage;

    @Getter
    private final String description;

    ApiStatus(int resultCode, String resultMessage, String description) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.description = description;
    }
}
