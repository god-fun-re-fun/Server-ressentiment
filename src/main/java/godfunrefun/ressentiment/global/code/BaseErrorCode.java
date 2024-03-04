package godfunrefun.ressentiment.global.code;

import godfunrefun.ressentiment.global.dto.ErrorReasonDto;

public interface BaseErrorCode {
    public ErrorReasonDto getReason();

    public ErrorReasonDto getReasonHttpStatus();
}
