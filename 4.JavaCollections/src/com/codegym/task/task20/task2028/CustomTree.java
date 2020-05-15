package com.codegym.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

/* 
Build a tree (part 1)

*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    Entry<String> root;

    public CustomTree() {
        this.root = new Entry<>("0");
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String get(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        int size = -1;
        Queue<Entry<String>> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Entry<String> current = queue.poll();
            size +=1;
            if(!current.availableToAddLeftChildren){

                queue.add(current.leftChild);
            }if (!current.availableToAddRightChildren){


                queue.add(current.rightChild);

            }}
        return size;
    }

    @Override
    public boolean add(String s) {
        Entry<String> newNode= new Entry<>(s);
        Queue<Entry<String>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Entry<String> node = queue.poll();
            if(node.availableToAddLeftChildren){
                node.leftChild=newNode;
                node.availableToAddLeftChildren=false;
                newNode.parent=node;
                break;

            }else if(node.availableToAddRightChildren){
                node.rightChild=newNode;
                node.availableToAddRightChildren=false;
                newNode.parent=node;
                break;

            }else
            {
                queue.add(node.leftChild);
                queue.add(node.rightChild);
            }}
        return true;
    }
    /*@Override
    public boolean add(String s){

        Entry<String> newNode = new Entry<>(s);
        Queue<Entry<String>> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Entry<String> node = q.poll();
            if(node.availableToAddLeftChildren){
                node.leftChild = newNode;
                node.availableToAddLeftChildren = false;
                newNode.parent = node;
                break;
            }else if(node.availableToAddRightChildren){
                node.rightChild = newNode;
                node.availableToAddRightChildren = false;
                newNode.parent = node;
                break;
            }else{
                q.add(node.leftChild);
                q.add(node.rightChild);
            }
        }
        return true;
    }*/
/*    public String getParent(String s){
        Entry<String> node=null;
        Queue<Entry<String>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Entry<String> current = queue.poll();
            if(current.elementName.equals(s)) return current.getParent().elementName;

            else {if(!current.availableToAddLeftChildren){queue.add(current.leftChild);}
            if(!current.availableToAddRightChildren){queue.add(current.rightChild);}
              }}
        return null;
    }*/
    public String getParent(String s){
        Queue<Entry<String>> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Entry<String> node = q.poll();
            if (node.elementName.equals(s)) return node.parent.elementName;
            else{
                if(!node.availableToAddLeftChildren) q.add(node.leftChild);
                if(!node.availableToAddRightChildren) q.add(node.rightChild);
            }
        }
        return null;
    }
    static class Entry<T> implements Serializable {

        String elementName;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren() {
            return (availableToAddRightChildren || availableToAddLeftChildren);


        }

        public Entry<T> getParent(Entry<String> current) {
            return parent;
        }
    }
}
