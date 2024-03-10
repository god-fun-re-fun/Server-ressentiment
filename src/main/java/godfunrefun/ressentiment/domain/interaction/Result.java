package godfunrefun.ressentiment.domain.interaction;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@Builder
@EntityListeners(AuditingEntityListener.class)
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    private Long resultId;

    @Column(name = "R")
    private double R;

    @Column(name = "G")
    private double G;

    @Column(name = "B")
    private double B;

    @Builder
    public Result(double R, double G, double B) {
        this.R = R;
        this.G = G;
        this.B = B;
    }

    @Builder
    public Result(Result result) {
        this.R = result.getR();
        this.G = result.getG();
        this.B = result.getB();
    }
}
