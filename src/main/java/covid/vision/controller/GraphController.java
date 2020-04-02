package covid.vision.controller;

import covid.vision.dto.EdgeDto;
import covid.vision.dto.GraphDto;
import covid.vision.dto.VertexDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/graphs")
public class GraphController {

    @GetMapping
    public List<GraphDto> getGraphs() {

        List<GraphDto> graphDtos = new ArrayList<>();
        List<VertexDto> vertexDtos = new ArrayList<>();
        List<EdgeDto> edgeDtos = new ArrayList<>();

        VertexDto a = new VertexDto("A");
        VertexDto b = new VertexDto("B");
        VertexDto c = new VertexDto("C");

        vertexDtos.add(a);
        vertexDtos.add(b);
        vertexDtos.add(c);
        edgeDtos.add(new EdgeDto(a, b, "route a -> b"));
        edgeDtos.add(new EdgeDto(b, c, "route b -> c"));
        edgeDtos.add(new EdgeDto(c, a, "route c -> a"));

        graphDtos.add(new GraphDto(vertexDtos, edgeDtos));

        return graphDtos;
        }

}

