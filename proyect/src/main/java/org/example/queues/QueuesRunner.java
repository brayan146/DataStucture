package org.example.queues;

import org.example.interfaces.IRunner;

public class QueuesRunner implements IRunner {
    @Override
    public void run() {
        QueuesMenu menu = new QueuesMenu();
        menu.menu();
    }
}
