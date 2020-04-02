package covid.vision.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class GraphDto {

    private List<VertexDto> vertexDto;
    private List<EdgeDto> edgeDto;
}
