package godfunrefun.ressentiment.controller;

import godfunrefun.ressentiment.dto.request.InteractionResultRequest;
import godfunrefun.ressentiment.global.apipayload.ApiResponse;
import godfunrefun.ressentiment.service.InteractionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interaction")
@RequiredArgsConstructor
public class InteractionController {
    private final InteractionService interactionService;
    @PostMapping("/result")
    public ApiResponse<String> saveInteractionResult(@RequestBody InteractionResultRequest request) {
        interactionService.saveInteractionResult(request);
        return ApiResponse.onSuccess("result");
    }
}
