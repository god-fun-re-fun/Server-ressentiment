package godfunrefun.ressentiment.service;

import godfunrefun.ressentiment.dto.request.InteractionResultRequest;
import godfunrefun.ressentiment.dto.response.InteractionResultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InteractionServiceImpl implements InteractionService{
    private final InteractionResultResponse interactionResultResponse;
    public InteractionResultResponse saveInteractionResult(InteractionResultRequest request) {
        return new InteractionResultResponse(request.getR(), request.getG(), request.getB());
    }
}
