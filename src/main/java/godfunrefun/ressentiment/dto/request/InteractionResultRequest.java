package godfunrefun.ressentiment.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import godfunrefun.ressentiment.domain.interaction.Result;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class InteractionResultRequest {
    @JsonProperty("R")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String R;

    @JsonProperty("G")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String G;

    @JsonProperty("B")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String B;

    public Result toEntity() {
        return Result.builder()
                .R(Double.parseDouble(R))
                .G(Double.parseDouble(G))
                .B(Double.parseDouble(B))
                .build();
    }
}
