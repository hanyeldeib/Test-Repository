
public class Square {
	static int count = 0;

	double side;
	double LeftBottomx;
	double RightBottomx;
	double LeftTopx;
	double RightTopx;
	double LeftBottomy;
	double RightBottomy;
	double LeftTopy;
	double RightTopy;

	
	Double LeftBottomxy (double theSide, double LBx, double LBy){	
		side = theSide;
		LeftBottomx =  LBx;
		LeftBottomy= LBy;
		return LeftBottomx;
		
	}
	Double RightBottomxy (double theSide, double LBx, double LBy){	
		side = theSide;
		RightBottomx =  LBx+side;
		RightBottomy= LBy;
		return RightBottomx;
		
	}
	
	Double LeftTopxy (double theSide, double LBx, double LBy){	
		side = theSide;
		LeftTopx =  LBx;
		LeftTopy= LBy+side;
		return LeftTopx;
		
	}
	
	Double RightTopxy (double theSide, double LBx, double LBy){	
		side = theSide;
		RightTopx =  LBx+side;
		RightTopy= LBy+side;
		return RightBottomx;
		
	}
	
	
	
	
	
	static int getCount () {
		return count;
	}
	     double area() {
			return side*side;
		}
	}
