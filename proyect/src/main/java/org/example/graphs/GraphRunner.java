package org.example.graphs;

import org.example.interfaces.IRunner;

public class GraphRunner implements IRunner {

    @Override
    public void run() {
        GraphMenu menu = new GraphMenu();
        menu.Menu();
    }
}
