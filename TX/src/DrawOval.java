
public class DrawOval {
	static int width=5;
	static int height=5;
	public static void drawOval(int x,int y,int width,int height){
		//椭圆中心点
		int centerX=x;
		int centerY=y;
		//椭圆左边点
		int leftX=x-width/2;
		int leftY=y;
		//椭圆右边点
		int rightX=x+width/2;
		int rightY=y;
		//椭圆上边点
		int topX=x;
		int topY=y-height/2;
		//椭圆下边点
		int bottomX=x;
		int bottomY=y+height/2;
		//椭圆左上角坐标
		int reactTopX=x-width/2;
		int reactTopY=y-height/2;
		//椭圆右下角坐标
		int reactBottomX=x+width/2;
		int reactBottomY=y+height/2;
		//System.out.println(reactBottomX);
		//System.out.println(reactBottomY);
		
		int start=getLocaction(reactTopX, reactTopY);
		int end=getLocaction(reactBottomX, reactBottomY);
		
	    int m=x/width;          //算出二维数组的第m行数
        int n=x%height;         //算出二位数组的第n个数
		for(int i=start;i<=end;i++){
			if((x*x)/(width*width)+(y*y)/(height*height)==1){
				System.out.println(i);
			}
			else{
				System.out.println("__________________________");
			}
		}
	}
	public static int getLocaction(int x,int y){
		int value=width*y+x;
		return value;
	}
	public static void main(String[] args) {
		drawOval(2, 2, 4, 2);
	}
}
