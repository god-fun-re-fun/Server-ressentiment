package godfunrefun.ressentiment.service;

import godfunrefun.ressentiment.domain.interaction.Result;
import godfunrefun.ressentiment.dto.request.InteractionResultRequest;
import godfunrefun.ressentiment.dto.response.InteractionResultResponse;
import godfunrefun.ressentiment.repository.InteractionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InteractionServiceImpl implements InteractionService{
    private final InteractionRepository interactionRepository;
    public InteractionResultResponse saveInteractionResult(InteractionResultRequest request) {
        System.out.println(request.getR() + " " + request.getG() + " " + request.getB());
        interactionRepository.save(request.toEntity());
        return new InteractionResultResponse(request.getR(), request.getG(), request.getB());
    }

    public InteractionResultResponse getInteractionResult() {
        Result result = interactionRepository.findNewest();
        return new InteractionResultResponse(result.getR(), result.getG(), result.getB());
    }
}
