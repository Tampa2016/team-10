/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeForGood;

/**
 *
 * @author Quentin Goss
 */
public class Location {
    // Can set in constructor
    private String name;
    private String utilityType;
    private int areaCode;
    private int phoneNum;
    private String webAddress;
    private String city;
    private String state;
    private String address;
    private int zipCode;
    // Cannot set in constructor
    private int ID;
    private int rating;
    private int reviewsList[];
    
    
    public Location(){
        
    }
    public Location(String pName, String pUtilityType, int pAreaCode, int pPhoneNum, String pWebAddress,
            String pCity, String pState, String pAddress, int pZipCode){
        name = pName;
        utilityType = pUtilityType;
        areaCode = pAreaCode;
        phoneNum = pPhoneNum;
        webAddress = pWebAddress;
        city = pCity;
        state = pState;
        address = pAddress;
        zipCode = pZipCode;
    }
}
