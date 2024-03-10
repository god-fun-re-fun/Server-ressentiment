package godfunrefun.ressentiment.service;

import godfunrefun.ressentiment.dto.request.InteractionResultRequest;
import godfunrefun.ressentiment.dto.response.InteractionResultResponse;

public interface InteractionService {
    public InteractionResultResponse saveInteractionResult(InteractionResultRequest request);

    public InteractionResultResponse getInteractionResult();
}
