class MinStack {
    private class Node {
        int value;
        int minValue;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this(value, null);
        }
    }

    private Node head;

    public MinStack() {
        this.head = null;
    }

    public void push(int val) {
        int minValue = this.head == null ? val : this.head.minValue;
        this.head = new Node(val, this.head);
        this.head.minValue = Math.min(val, minValue);
    }

    public void pop() {
        this.head = this.head.next;
    }

    public int top() {
        return this.head.value;
    }

    public int getMin() {
        return this.head.minValue;
    }
}