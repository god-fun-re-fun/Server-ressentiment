package godfunrefun.ressentiment.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class InteractionResultResponse {
    private float R;
    private float G;
    private float B;

    public InteractionResultResponse(float R, float G, float B) {
        this.R = R;
        this.G = G;
        this.B = B;
    }
}
