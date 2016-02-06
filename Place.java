public class Place{
    String name;
    int placeID;
    String address;
    public Place(String n,int p,String a){
        name =n;
        placeID = p;
        address= a;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        name =n;
    }
    public String getplaceID(){
        return String.valueOf(placeID);
    }
    public void setplaceID(int id){
        this.placeID = id;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String a){
        this.address =a;
    }

}
