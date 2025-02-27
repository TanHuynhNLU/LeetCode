package easy;

public class DesignParkingSystem1603 {
    int big, medium, small;
    public DesignParkingSystem1603(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if(carType==3&&small>0){
            small--;
            return true;
        }
        if(carType==2&&medium>0){
            medium--;
            return true;
        }
        if(carType==1&&big>0){
            big--;
            return true;
        }
        return false;
    }

//    Best solution
//int[] count;
//    public ParkingSystem(int big, int medium, int small) {
//        count = new int[]{big, medium, small};
//    }
//
//    public boolean addCar(int carType) {
//        return count[carType-1]-- >0;
//    }
}
