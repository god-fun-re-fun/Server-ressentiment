package godfunrefun.ressentiment.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class InteractionResultResponse {
    private double R;
    private double G;
    private double B;

    public InteractionResultResponse(double R, double G, double B) {
        this.R = R;
        this.G = G;
        this.B = B;
    }

    public InteractionResultResponse(String R, String G, String B) {
        this.R = Double.parseDouble(R);
        this.G = Double.parseDouble(G);
        this.B = Double.parseDouble(B);
    }
}
