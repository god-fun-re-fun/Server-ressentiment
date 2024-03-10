package godfunrefun.ressentiment.controller;

import godfunrefun.ressentiment.dto.request.InteractionResultRequest;
import godfunrefun.ressentiment.dto.response.InteractionResultResponse;
import godfunrefun.ressentiment.global.apipayload.ApiResponse;
import godfunrefun.ressentiment.service.InteractionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/interaction")
@RequiredArgsConstructor
public class InteractionController {
    private final InteractionService interactionService;
    @PostMapping("/result")
    public ApiResponse<InteractionResultResponse> saveInteractionResult(@RequestBody InteractionResultRequest request) {
        return ApiResponse.onSuccess(interactionService.saveInteractionResult(request));
    }

    //추후 수정사항. 30초정도 텀을 두고 호출. 최신 id를 호출하고 삭제까지.
    @GetMapping("/result")
    public ApiResponse<InteractionResultResponse> getInteractionResult() {
        return ApiResponse.onSuccess(interactionService.getInteractionResult());
    }
}
