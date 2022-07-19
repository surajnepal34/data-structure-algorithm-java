package com.dsa.linkedlist;

public class Node <T> {

    public T data;
    public Node next;

    public Node(T data, Node node){
        this.data = data;
        this.next = node;
    }
}