package covid.vision.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EdgeDto {

    private VertexDto vertex1;
    private VertexDto vertex2;
    private String description;
}
