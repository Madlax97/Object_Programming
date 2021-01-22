package docComments;
/**
 * This class creates the object CellPhone that takes in 3 parameters.
 * String Brand.
 * int year.
 * Boolean screenCrack
 * @author Brandon Aspittle + <TEAM FRIEND! PUT YOUR NAME HERE PLS!>
 *
 */
public class CellPhone {
	// Fields
	String brand;
	private int year;
	private boolean screenCrack;
	private int modelID = 12345;
	private int staticCount = 1;
	
	//Constructor that takes in three parameters.
	public CellPhone(String brand, int year, boolean screenCrack) {
		super();
		this.brand = brand;
		this.year = year;
		this.screenCrack = screenCrack;
		modelID += staticCount;
		staticCount++;
	}
	
	// Getter and toString methods.
	/**
	 * Returns the phones Brand
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * Returns the phones Year
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * Returns weather or not the phones screen is broken.
	 * @return the screenCrack
	 */
	public boolean isScreenCrack() {
		return screenCrack;
	}
	/**
	 * Returns the modelID
	 * 
	 * @return the modelID
	 */
	public int getModelID() {
		return modelID;
	}
	@Override                       
	public String toString() {
		return "CellPhone [brand=" + brand + ", year=" + year + ", screenCrack=" + screenCrack + ", modelID=" + modelID
				+ "]";
	}

	
	
	

}
