package oopQ1;

public class Book extends Item {
	
	private String publisher;
	private String category;
	private int page;

	/**
	 * @param itemNo
	 * @param description
	 * @param unitPrice
	 * @param publisher
	 * @param category
	 * @param page
	 */
	public Book(int itemNo, String description, double unitPrice, String publisher, String category, int page) {
		super(itemNo, description, unitPrice);
		this.publisher = publisher;
		this.category = category;
		this.page = page;
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		super.Display();
		System.out.println(this.publisher);
		System.out.println(this.category);
		System.out.println(this.page);
	}
	

	
	
	
	
}
