package covid.vision;


import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;

import javax.swing.*;
import java.awt.*;

public class SimpleGraphView {

    private final Graph<Integer, String> graph;

    public SimpleGraphView() {
        graph = new SparseMultigraph<>();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge("Edge-A", 1, 2);
        graph.addEdge("Edge-B", 2, 3);
        graph.addEdge("Edge-C", 3, 1);

    }

    public static void main(String[] args) {
        SimpleGraphView sgv = new SimpleGraphView();
        Layout<Integer, String> layout = new CircleLayout<>(sgv.graph);
        layout.setSize(new Dimension(300, 300));
        BasicVisualizationServer<Integer, String> vv = new BasicVisualizationServer<>(layout);
        vv.setPreferredSize(new Dimension(350, 350));

        JFrame frame = new JFrame("Simple Graph View");
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);
    }

}
