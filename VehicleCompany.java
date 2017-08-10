/**
 * class VehicleCompany
 * @Author: Sapana Yonjan
 * @ ID : 15043809
 * @Version Date: 12th August, 2016
 */
import java.util.ArrayList;
/**
 *  VehicleCompany is a new class with an attribute that is an arraylist of objects of class created in first part of the coursework.
 *  It enables user to enter details to the arraylist. This programme is written in java language using bluej. 
 *  The user can book multiple vehicles as required in arraylist.
 *  There are 1 attribute and 6 methods set in this programme.
 *  The attribute is set as private.
 */

public class VehicleCompany
{
    ArrayList <PrivateVehicleBooking> list=new ArrayList <PrivateVehicleBooking>();

     /**
     *  addPrivateVehicleBooking is a method in VehicleCompany class to add details of the Vehicle Booking to arraylist
     *  It is of public type and
     *  It has no return type
     *  7 parameters are passed; 6 of string type and 1 of integer type
     *  This method creates a new addPrivateVehicleBooking with these attributes and adds it to the list of Private Vehicle Booking. 
     */
    public void addPrivateVehicleBooking(String officeName,String officeAddress,String officeContact,String vehicleType,String vehicleName,String vehicleSize,int dailyRate)
    {
        PrivateVehicleBooking v=new PrivateVehicleBooking(officeName, officeAddress, officeContact, vehicleType, vehicleName, vehicleSize, dailyRate);
        list.add(v);
    }
     /**
     *  removeLuxuryTaxi is a method in VehicleCompany class to remove a vehicle from arraylist using index no
     *  It is public type and
     *  It has no return type
     *  1 parameter is passed index number which is the position in the arraylist of the vehicle to be removed.
     *  Displays error message if the index number is not valid.
     */
    public void removePrivateVehicleBooking(int indexNo)
    {
        if(indexNo<0 || indexNo>=list.size())
        {
            System.out.println("Invalid Index Number");
        }
        else
        {
            list.remove(indexNo);
        }
    }
     /**
     *  forBooking is a method to book a Vehicle after the index of the taxi is supplied
     *  It is public type
     *  It has no return type
     *  4 parameters are passed: index Number, client Name, booking Date and time duration
     *  It gets the Vehicle from thrr Vehicle list and calls the method in PrivateVehicleBooking for the client.
     *  Displays error message if the index number is not valid.
     */
    public void forBooking(int indexNo, String clientName, String bookingDate, int duration)
    {
        if(indexNo<0 || indexNo>=list.size())
        {
            System.out.println("Invalid Index Number");
        }
        else
        {
            list.get(indexNo).forBooking(clientName, bookingDate, duration);
        } 
    }
    /**
     *  forfree is a method in the VehicleCompany to free a booked Vehicle
     *  This method gets the vehicle from the VehicleCompany List and calls the method in the PrivateVehicleCompany class to make vehicle free.
     *  It is public type
     *  It has no return type
     *  1 parameter is passed which is index
     *  Displays error message if the index number is not valid.
     */

    public void forfree(int indexNo)
    {
      if(indexNo<0 || indexNo>=list.size())
      {
         System.out.println("Invalid Index Number"); 
      }
      else
      {
       list.get(indexNo).forFree();
      } 
    }
     /**
     *  vehicleDescription is a method in new class VehicleCompany for listing all of the vehicles currently available.
     *  It is public
     *  It has no return type
     *  No parameter is passed
     *  For each vehicles available, the index number should be printed and then the method in the class to print the details of the vehicles should be called.
     */
    public void vehicleDescription()
    {
        for(PrivateVehicleBooking v:list)
        {
            v.vehicleDescription();
        }
    }
     /**
     *  searchVehicleBooking is a method used to search a vehicle which is currently available and matches the search criteria
     *  It is public
     *  It has no return type
     *  7 parameters are passed
     *  Parameters which are passed is the search criteria
     */
    public void searchVehicleBooking(String officeName,String officeAddress,String officeContact,String vehicleType,String vehicleName,String vehicleSize,int dailyRate)
    {
        boolean check=false;
        for(PrivateVehicleBooking v:list)
        {
            boolean status=v.getAvailableStatus();
            String Name=v.getOfficeName();
            String Address=v.getOfficeAddress();
            String Contact=v.getOfficeContact();
            String Type=v.getVehicleType();
            String name=v.getVehicleName();
            String Size=v.getVehicleSize();
            int Rate=v.getDailyRate();
            if(Name==officeName && Address==officeAddress && Contact==officeContact && Type==vehicleType && name==vehicleName && Size==vehicleSize && Rate==dailyRate)
            {
                check=true;
                v.vehicleDescription();
                break;
            }
        }
        if(!check)
        {
            System.out.println("Invalid Input");
        }
    }
}
    