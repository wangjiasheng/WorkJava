
public class DrawOval {
	static int width=5;
	static int height=5;
	public static void drawOval(int x,int y,int width,int height){
		//��Բ���ĵ�
		int centerX=x;
		int centerY=y;
		//��Բ��ߵ�
		int leftX=x-width/2;
		int leftY=y;
		//��Բ�ұߵ�
		int rightX=x+width/2;
		int rightY=y;
		//��Բ�ϱߵ�
		int topX=x;
		int topY=y-height/2;
		//��Բ�±ߵ�
		int bottomX=x;
		int bottomY=y+height/2;
		//��Բ���Ͻ�����
		int reactTopX=x-width/2;
		int reactTopY=y-height/2;
		//��Բ���½�����
		int reactBottomX=x+width/2;
		int reactBottomY=y+height/2;
		//System.out.println(reactBottomX);
		//System.out.println(reactBottomY);
		
		int start=getLocaction(reactTopX, reactTopY);
		int end=getLocaction(reactBottomX, reactBottomY);
		
	    int m=x/width;          //�����ά����ĵ�m����
        int n=x%height;         //�����λ����ĵ�n����
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
