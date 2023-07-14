package com.board.response.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "내부 서버 오류가 발생하였습니다."),
    INVALID_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),
    CONSTRAINT_VIOLATION(HttpStatus.CONFLICT, "제약 조건 위반"),

    ALREADY_EXISTS_EMAIL(HttpStatus.BAD_REQUEST, "이미 사용중인 이메일입니다."),
    ALREADY_EXISTS_PHONE(HttpStatus.BAD_REQUEST, "이미 사용중인 전화번호입니다."),
    ALREADY_EXISTS_NICKNAME(HttpStatus.BAD_REQUEST, "이미 사용중인 닉네임입니다."),

    INVALID_USERNAME(HttpStatus.BAD_REQUEST, "이름은 2글자 이상 3글자 이하이며 한글로만 작성되어야 합니다."),
    INVALID_NICKNAME(HttpStatus.BAD_REQUEST, "닉네임은 공백은 사용할 수 없으며, 영어와 한글, 숫자를 혼용하여 2글자 이상 12글자 이하로 작성되어야 합니다."),
    INVALID_PASSWORD(HttpStatus.BAD_REQUEST, "비밀번호는 공백은 사용할 수 없으며, 영어와 숫자를 혼용하여 최소 8글자 이상 최대 16글자 이하로 작성되어야 합니다."),
    INVALID_PHONE_FORMAT(HttpStatus.BAD_REQUEST, "전화번호 형식이 올바르지 않습니다."),

    MISMATCH_PASSWORD(HttpStatus.BAD_REQUEST, "비밀번호가 일치하지 않습니다."),
    ;

    private final HttpStatus httpStatus;
    private final String message;
}
