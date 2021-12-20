package stu14.statictest;

class Node {
	int value;
	Node next;
}

class Link {

	private Node head;
	private Node tail;

	public void add(int val) {
		// 把数据封到节点对象中
		Node newNode = new Node();
		newNode.value = val;
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void travel() {
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.next;
		}
	}

	/*public void remove(int val) {
		Node prev; // 删除目标对象的前一个结点引用

		prev.next = prev.next.next;
	}

	public int size() {

	}*/
}

public class FunnyTest {

	public static void main(String[] args) {
		Link link = new Link();
		link.add(10);
		link.add(2);
		link.add(5);
		link.add(8);
		link.add(4);
		link.add(7);

		link.travel();
	}
}
