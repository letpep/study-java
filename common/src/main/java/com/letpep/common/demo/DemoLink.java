package com.letpep.common.demo;

import com.letpep.common.model.Node;

public class DemoLink {
    public static void main(String[] args) {
        Node pre= null;
        Node next = null;
        for(int i=1;i<=10;i++){
            Node node= new Node(i);
                node.setPre(pre);
                pre=node;
                if(i>1) pre.setNext(node);

        }
    }
}
