package data.structure;

import java.util.Objects;

/**
 * @function: 单链表
 * @Author: itlgcml
 * @Date: 2022-06-19 20:58:24
 */
public class SingleLinkedList<T> {


    //记录头结点
    private Node head;
    // 记录链表的长度
    private int length;


    /**
     * 数据node
     */
    private class Node {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * 创建链表
     */
    public SingleLinkedList() {
        head = new Node(null, null);
        length = 0;
    }

    /**
     * 置空链表
     */
    public void clear() {
        head.next = null;
        length = 0;
    }

    /**
     * 获得链表长度
     *
     * @return
     */
    public int length() {
        int length = 0;
        while (head.next != null) {
            head = head.next;
            length++;
        }
        return length;
    }

    /**
     * 获得链表第index的元素
     *
     * @param index
     * @return
     */
    public T get(int index) {
        if (index <= 0 || index > length) {
            return null;
        }
        Node head = this.head;
        for (int i = 0; i < index; i++) {
            head = head.next;
        }
        return head.data;
    }

    /**
     * 插入数据，头插法
     *
     * @param data
     */
    public void insertHead(T data) {
        Node newNode = new Node(data, null);
        Node lastNode = head.next;
        if (lastNode == null) {
            head.next = newNode;
        } else {
            head.next = newNode;
            newNode.next = lastNode;
        }
        length++;
    }

    /**
     * 插入数据，尾插法
     *
     * @param data
     */
    public void insertTail(T data) {
        Node lastNode = head.next;
        Node newNode = new Node(data, null);
        if (lastNode == null) {
            head.next = newNode;
        } else {
//            while与for任选一个
//            for (int index = 0; index < length - 1; index++) {
//                lastNode = lastNode.next;
//            }
            while (true) {
                if (lastNode.next == null) {
                    break;
                }
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        length++;
    }

    /**
     * 将数据t插入到第i个地址后面
     *
     * @param index
     * @param data
     */
    public void insert(int index, T data) {
        if (index > length) {
            return;
        }
        Node lastNode = head.next;
        Node newNode = new Node(data, null);
        if (lastNode == null) {
            head.next = newNode;
        } else {
            Node temp = this.head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            Node next = temp.next;
            temp.next = newNode;
            newNode.next = next;
        }
        length++;
    }

    /**
     * 移除第i个元素
     *
     * @param index
     * @return
     */
    public T remove(int index) {
        Node cruNode = this.head;
        if (index > this.length || index <= 0 || length == 0) {
            System.out.println("");
            return null;
        }
        for (int i = 1; i < index; i++) {
            cruNode = cruNode.next;
        }
        cruNode.next = cruNode.next.next;
        return cruNode.data;
    }

    /**
     * 获得t元素的下标
     *
     * @param data
     * @return
     */
    public int indexOf(T data) {
        Node cruNode = this.head;
        for (int i = 1; i <= this.length; i++) {
            cruNode = cruNode.next;
            if (Objects.equals(data, cruNode.data)) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        Node temp = head.next;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insert(0, 1);
        singleLinkedList.insert(1, 2);
        singleLinkedList.insert(2, 3);
        singleLinkedList.insert(3, 4);
        singleLinkedList.insert(4, 5);
        System.out.println(singleLinkedList.indexOf(5));
    }
}
