package stu15.homework;

class Node {
	Object value;
	Node next;
}

class Link {
	
	private Node head;
	private Node tail;
	private int size = 0;
	
	public void add(Object val) {
		Node newNode = new Node();
		newNode.value = val;
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void travel() {
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.next;
		}
	}
	
	public int size() {
		return size;
	}
	
	public void remove(Object val) {
		if (head.value.equals(val)) {
			head = head.next; // ɾ��ͷ
		} else {
			Node prev = head;
			while (prev != tail) {
				while (prev.next != null) {
					if (prev.next.value.equals(val)) {
						break;
					}
					prev = prev.next; // �����ƶ�ָ��
				}
				if (prev.next == null) {
					break;
				}
				prev.next = prev.next.next; // prev.next��Ҫɾ����Ŀ��, ��������һ����ַд��ǰһ������next
				size--;
			}
			if (prev.next == null) { // �����βɾ����
				tail = prev; // ˢ��β
			}
		}
	}
}

public class LinkTest {
	
	public static void main(String[] args) {
		Link link = new Link();
		link.add("yyy");
		link.add("aaa");
		link.add("ccc");
		link.add("bbb");
		link.add("ddd");
		link.add("qqq");
		link.add("eee");
		link.add("bbb");
		link.add("bbb");
		link.add("bbb");
		link.add("bbb");
		
		link.travel();
		
		System.out.println(link.size());
		
		System.out.println("********************");
		link.remove("bbb");
		
		link.travel();
	}
}
