
/**
 * @Author: Sapana Yonjan
 * @LondonMetID: 15043809
 * this is the class section with class name PrivateVehicleBooking which contains Eight different attributes of String datatype, two attributes of integer datatype and one attribute of logical datatype.
 */
/**
 * Question number - 1
 * Giving the attributes
 * Giving 11 attributes
 */
public class PrivateVehicleBooking
{
   private String officeName;
   private String officeAddress;
   private String officeContact;
   private String clientName;
   private String vehicleName;
   private String vehicleType;
   private String vehicleSize;
   private String bookingDate;
   private int duration;
   private int dailyRate;
   private boolean availableStatus;
    /**
     * Question number - 2
     * supplying parameters
     * Here, only key attributes whose values are constant, are initialized through parameters. 
     * These parameters are supplied to the constructor and their values are assigned to their corresponding attributes.
     */
    public PrivateVehicleBooking(String officeName,String officeAddress,String officeContact,String vehicleType,String vehicleName,String vehicleSize,int dailyRate)
    {
      this.officeName=officeName; 
      this.officeAddress=officeAddress ;
      this.officeContact=officeContact;
      this.vehicleName=vehicleName;
      this.vehicleType=vehicleType;
      this.vehicleSize=vehicleSize;
      this.dailyRate=dailyRate;
      this.duration=0;
      this.availableStatus=true;
      this.clientName="";
      this.bookingDate="";
    }
     /**
     * Question number - 3
     * it is a getter Method
     * it returns String value
     */
    public String getOfficeName()
    {
        return officeName;
    }
     /**
     * 
     * it is a getter Method
     * it returns String value
     */
    public String getOfficeAddress()
    {
        return officeAddress;
    }
     /**
     * 
     * it is a getter Method
     * it returns String value
     */
    public String getOfficeContact()
    {
        return officeContact;
    }
     /**
     * 
     * it is a getter Method
     * it returns String value
     */
    public String getClientName()
    {
        return clientName;
    }
     /**
     *
     * it is a getter Method
     * it returns String value
     */
    public String getVehicleName()
    {
        return vehicleName;
    }
     /**
     *
     * it is a getter Method
     * it returns String value
     */
    public String getVehicleType()
    {
        return vehicleType;
    }
     /**
     * 
     * it is a getter Method
     * it returns String value
     */public String getVehicleSize()
    {
        return vehicleSize;
    }
     /**
     * 
     * it is a getter Method
     * it returns String value
     */
    public String getBookingDate()
    {
        return bookingDate;
    }
     /**
     * 
     * it is a getter Method
     * it returns integer value
     */
    public int getDuration()
    {
        return duration;
    }
     /**
     *
     * it is a getter Method
     * it returns integer value
     */
    public int getDailyRate()
    {
        return dailyRate;
    }
     /**
     *
     * it is a getter Method
     * it returns boolean value
     */
    public boolean getAvailableStatus()
    {
        return availableStatus;
    }
     /**
     * Question number - 4
     * It's setter method
     * It's a new method by setting new value
     */
    public void setOfficeName(String officeName)
    {
        this.officeName=officeName;
    }
    /**
    *
    * It's setter method
    * It's a method for setting office address, parameter is assigned to its corresponding attribute.
    */
    public void setOfficeAddress(String officeAddress)
    {
        this.officeAddress=officeAddress;
    }
    /**
    *
    * It's setter method
    * It's a method of setting new vehicle type, parameter is assigned to its corresponding attribute.
    */
    public void setVehicleType(String vehicleType)
    {
        this.vehicleType=vehicleType;
    }
    /**
    * Question number - 5
    * 
    * New method that allows the clients to create a booking for any vehicle.
    * it has all the non-key attributes initialized through parameters and their values are assigned to their corresponding attributes.
    */ 
    public void forBooking(String clientName,String bookingDate,int duration)
    {
        if (availableStatus==false)
        {
            System.out.print("The vehicle you have picked has already been booked from date " + bookingDate + ". It will be available after " + duration + " days of its booking date.");
        }
        else
        {
            this.clientName=clientName;
            this.bookingDate=bookingDate;
            this.duration=duration;
            availableStatus=false;
        }
    
    }
    /**
    * Question number - 6
    * 
    * this is a new Method to make booking of vehicles available.
    */
    public void forFree()
    {
        if (availableStatus==true)
        {
            System.out.print("The vehicle you want to free is already available.");
        }
        else
        {
            this.clientName="";
            this.bookingDate="";
            this.duration=0;
            availableStatus=true;
        }
    
    }
    /**
    * Question number - 7
    * 
    * last method to display the description of the choosen vehicle.
    * This is the last method to display the description of the vehicle availabile. It is of void type.
    */
    public void vehicleDescription()
    {
        System.out.print("The vehicle you have choosen is " + vehicleName + " and it is of " + vehicleSize + " size and of " + vehicleType + " type.");
    }
}

