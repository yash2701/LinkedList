
public class MainLinkList {

	public static void main(String[] args) {
		
		LinkListed list = new LinkListed();
		list.insert(5);
		list.insert(3);
		list.insert(4);
		
		list.show();
		list.delete();
		System.out.println("\n");
		list.show();

	}

}
