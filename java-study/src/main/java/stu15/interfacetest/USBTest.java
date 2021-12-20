package stu15.interfacetest;

public class USBTest {

	public static void main(String[] args) {
		USB usb = new Mouse("罗技G5");
		usb.connect();
		usb.work();
		usb.disconncet();

		if (usb instanceof Device) {
			Device dev = (Device)usb;
			dev.startup();
			dev.shutdown();
		}
	}

	public static void main1(String[] args) {
		USB usb = new UDisk();
		usb.connect();
		usb.work();
		usb.disconncet();
	}
}